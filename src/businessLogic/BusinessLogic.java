package businessLogic;

public class BusinessLogic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CarsReader cr = new CarsReader("C:\\Users\\danie\\Documents\\NetBeansProjects\\Cars.csv");
        cr.readingData();
        cr.showCars();
    }
    
}