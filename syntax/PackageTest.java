import com.test.Package.AccessControl;
import com.test.Package.Package;

public class PackageTest extends AccessControl {
    public static void main(String[] args) {
        System.out.println("PackageTest");
        AccessControl pt = new PackageTest();        
        pt.dump();
        Package.main(null);
    }
    
    public void dump() {
        System.out.println("n_public = " + n_public);
        //System.out.println("n_default =" + n_default);
        n_protected = 876;
        System.out.println("n_protected =" + n_protected);
        //System.out.println("n_private = " + n_private);   
    }
}