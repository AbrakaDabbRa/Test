class Car {

    String car = "";
    int tire = 2;

    Car(String car){
        this.car=car;
    }
    Car(String car, int tire){
        this.car=car;
        this.tire=tire;
    }
        void move() {
         System.out.println(car + " is moving");
    }
        void slowing() {
         System.out.println( car + " is lowing");
    }
        void stop() {
         System.out.println( car + " is stopping");
    }
}
    public class Vehicle {
        public static void main(String[] args) {
            Car Scooter = new Car("Honda", 2);
            Car Unicycle = new Car("Bean", 1);
            Car Car = new Car("Subaru", 4);

            Scooter.move();
            Unicycle.move();
            Car.move();
            Car.stop();
            Scooter.stop();

        }
    }