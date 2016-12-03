package pkg;

public class Cls {
    /*
     * primitive argument 
     */
	native double f(int i, String s);
	
	/*
	 * java method can also be invoked by native method
	 */
	public double f(int i, String s, String t) {
	    System.out.println(i + s + t);
	    return 3.14;
	}

	/*
	 * primitive int Array argument 
	 */
	native double pa(int[] arr);

	/*
     * primitive String Array argument 
     */
    native double pStringArray(String[] args);
    
    /*
     * access another native method(or method) in native method
     */
    native double accessMethod();
    
    /*
     * static native method
     */
    static native double staticNativeMethod();

    /*
     * execption from native method
     */
    native double nativeException();

	static {
		/*
		 * use load() method with absolute library path
		 */
		System.load(System.getProperty("user.dir") + "/pkg/jni/libpkg_Cls.so");
	}
	
	public static void main(String[] args) {
		Cls cls = new Cls();
		System.out.println(cls.f(1, "java string"));
		System.out.println(cls.pa(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}));
		System.out.println(cls.pStringArray(new String[]{"This", "is", "jni", "string array"}));
		System.out.println(cls.accessMethod());
		System.out.println(staticNativeMethod());
		try {
		    System.out.println(cls.nativeException());    
		} catch (Exception e) {
		    e.printStackTrace();
		}
	}
}
