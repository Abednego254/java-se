package ExamTopics;
class A {
    int x = 10;
//    public A(int x) {
//        this.x = x;
//    }
}
class B extends A {
    int x = 20;
    public B(int x) {
        this.x = x;
    }
    public B() {}
}

public class TestOne {
    public static void main(String[] args) {
        A obj = new B(20);
        System.out.println(obj.x);
    }
}