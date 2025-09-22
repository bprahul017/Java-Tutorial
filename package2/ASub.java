package package2;

import package1.A;

public class ASub extends A {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.defaultMessage);
        System.out.println(c.protectedMessage);

        ASub a= new ASub();
        System.out.println(a.protectedString);
    }
}
