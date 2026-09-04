class Car {
    String brand;
    int year;

    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void drive() {
        System.out.println(brand + " is driving!");
    }
}

public class OOPDemo {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2020);
        Car car2 = new Car("Honda", 2022);

        car1.drive();
        car2.drive();
    }
}
