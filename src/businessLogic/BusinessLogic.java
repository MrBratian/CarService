package businessLogic;

public class BusinessLogic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CarsReader cr = new CarsReader("Cars.csv");
        cr.readingData();
        cr.showCars();
    }
    
}