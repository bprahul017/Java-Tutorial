package package1;

import package2.C;

public class A {
    protected  String protectedString ="This String is protected, only access on subclass or within this package";
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.publicMessage);
    }
}
