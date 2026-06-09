//package gratis.inheritance;
//
//class Vehicle {
//    String type = "4W";
//    int maxSpeed = 100;
//
//    Vehicle(String type, int maxSpeed) {
//        this.type = type;
//        this.maxSpeed = maxSpeed;
//    }
//}
//
//class Car extends Vehicle {
//    String trans;
//
//    Car(String trans) {
//        this.trans = trans;
//    }
//
//    Car(String type, int maxSpeed, String trans) {
//        super(type, maxSpeed);
//        this(trans);
//    }
//}
//
//class Test {
//    public static void main(String[] args) {
//        Car c1 = new Car("Auto ");
//    }
//}