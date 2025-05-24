package businessLogic;

public class CarInfoTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CarsReader cr = new CarsReader("cars.csv");
        cr.readingData();
        cr.showCars();
    }
    
}