package gratis.selftestengine;

public class Person {
    String name;
    int age;

    public Person(String name) {
        this();
        setName(name);
    }

    public Person() {}

    public Person(String name, int age) {
        Person person = this;
        setName(name);
        setAge(age);
        System.out.println(person.age);
        System.out.println(person.name);
        System.out.println(this.name+ "===========");
        System.out.println(this.age + "=========");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String show() {
        return name + " " + age;
    }
}

class Test34 {
    public static void main(String[] args) {
        Person person = new Person("Jessee");
        Person person2 = new Person("Walter", 35);

        System.out.println(person.show());
        System.out.println(person2.show());
    }
}
