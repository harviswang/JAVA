import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ArrayTest {
	public static void main(String[] args) {
		System.out.println("ArrayTest");
		arrayDeclareTest();
		arrayToArrayListTest();
		arrayContainOfTest();
		arrayCombineTest();
		arrayListToArrayTest();
	}
	
	// Array Declaration
	public static void arrayDeclareTest() {
	    String[] sArray = new String[5]; // all are null
	    for (int i = 0; i < sArray.length; i++) {
	        sArray[i] = new String(Integer.toString(i)); // initial every element in array
	        System.out.println("sArray[" + i + "]=" + sArray[i]);
	    }
	    
	    String[] sArray2 = {"a", "b", "good", "bad", "nothing"};
	    System.out.println(Arrays.toString(sArray2));
	    
	    int[] iArray = new int[]{0,1,2,3,4,5,6,7,8,9,};
	    System.out.println(Arrays.toString(iArray));
	}
	
	// Array -> ArrayList
	//
	public static void arrayToArrayListTest() {
	    byte[] bArray = new byte[]{'a', 'b', 'c', 'd'};
	    ArrayList<byte[]> bArrayList = new ArrayList<byte[]>(Arrays.asList(bArray));
	    System.out.println(bArrayList); // not works well
	}
	
	// Array contain a value or not
	public static void arrayContainOfTest() {
	    String[] sArray = {"a", "b", "o", "u", "t"};
	    boolean b = Arrays.asList(sArray).contains("a");
	    System.out.println(b);
	}
	
	// Array combine
	public static void arrayCombineTest() {
	    int[] iArray = {1, 2, 3, 4, 5, 6};
	    int[] nArray = {6, 7, 8, 9, 10};
	    
	    //int[] combinedArray = {iArray, nArray};
	    for (int i : iArray) {
	        //System.out.println(i);
	    }
	}
	
	// ArrayList -> Array
	public static void arrayListToArrayTest() {
	    String[] sArray = {"g", "o", "o", "d", "l", "u", "c", "k"};
	    ArrayList<String> sArrayList = new ArrayList<String>(Arrays.asList(sArray));
	    System.out.println(sArrayList);
	}
	
	// Array -> HashSet
//	public static void arrayToHashSetTest() {
//	    int[] iArray = {0, 9, 8, 7, 6, 5};
//	    Set<int> set = new HashSet<>
//	}
}
