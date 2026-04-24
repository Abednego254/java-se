package ExamTopics.dataTypes;

public class App {
    static float height;
    public float jump(long x) {
        System.out.println("Jump1");
        return height + x;
    }
    public float jump(int x) {
        System.out.println("Jump2");
        return height + x;
    }
    public float jump(float x) {
        System.out.println("Jump3");
        return height + x;
    }

    public static void main(String[] args) {
        App app = new App();
        app.jump(10);
        app.jump(100);
        app.jump(10.01f);
    }
}
