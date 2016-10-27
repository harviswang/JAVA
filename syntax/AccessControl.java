/*
 keyword     class      subclass   package  out-package
---------------------------------------------------------------
 public      yes        yes        yes       yes
 default     yes        yes        yes       no
 protected   yes        yes        no        yes 
 private     yes        no         no        no
*/

package com.test.Package;

public class AccessControl {
    public int n_public = 11;
    /*default*/ int n_default = 22;
    protected int n_protected = 33;
    private int n_private = 44;
    
    public static void main(String[] args) {
        AccessControlParent ack = new AccessControlParent();
        ack.inClassTest();
        AccessControlChild acc = new AccessControlChild();
        acc.inSubClassTest();
    }
    
    public void dump() {
        System.out.println("n_public = " + n_public);
        System.out.println("n_default =" + n_default);
        System.out.println("n_protected =" + n_protected);
        System.out.println("n_private = " + n_private);   
    }
}

class AccessControlParent {
    public int n_public = 99;
    /*default*/ int n_default = 88;
    protected int n_protected = 77;
    private int n_private = 66;
    
    public void inClassTest() {
        System.out.println("n_public = " + n_public);
        System.out.println("n_default =" + n_default);
        System.out.println("n_protected =" + n_protected);
        System.out.println("n_private = " + n_private);
    }
}

class AccessControlChild extends AccessControlParent {
    public void inSubClassTest() {
        System.out.println("n_public = " + n_public);
        System.out.println("n_default =" + n_default);
        System.out.println("n_protected =" + n_protected);
        //System.out.println("n_private = " + n_private);
    }
}