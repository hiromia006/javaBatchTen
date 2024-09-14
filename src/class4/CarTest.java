package class4;

public class CarTest {
    public static void main(String[] args) {
        Car mercedes = new Car(2014, "Mercedee", 2014, 25000);
        System.out.println(mercedes.getYearModel());
        mercedes.printSpeed(60);

        Car audi = new Car(2014, "audi", 2014, 25000);
        System.out.println(audi.getYearModel());
        audi.printSpeed(65);

        Car bmw = new Car(2014, "bmw", 2014, 25000);
        System.out.println(bmw.getYearModel());
        audi.printSpeed(65);
    }
}
