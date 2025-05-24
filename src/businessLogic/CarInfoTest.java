package businessLogic;

public class CarInfoTest {
    public static void main(String[] args) {
        CarsReader cr = new CarsReader("cars.csv");
        cr.readingData();
        cr.showCars();
    }
}
