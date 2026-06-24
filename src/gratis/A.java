package gratis;

class A {
    public void aMethod() {
        System.out.println("A ");
    }
}
class B extends A {
    public void bMethod() {
        System.out.println("B ");
    }
}
class C extends B {
    public void cMethod() {
        System.out.println("C ");
    }

    public static void main(String[] args) {
        C c = new C();
        c.cMethod();
    }
}
