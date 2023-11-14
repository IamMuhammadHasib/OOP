public class Main{
    public static void main(String[] args) {
        Car c1 = new Car();

        c1.acc();
        c1.brake();

        Engine c2 = new Car();
        c2.acc();
        // though version is car, referencing is engine. so, brake() is not accessible from engine
        // c2.brake()

        NiceCar c3 = new NiceCar();
        c3.start();
        c3.startMedia();
    }
}