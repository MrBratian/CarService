package businessLogic;
import java.time.LocalDate;

public class CarInfo {
    private String brand;
    private String id;
    private int model;
    private LocalDate lastVisit;

    public CarInfo (String brand, String id, int model, LocalDate lastVisit){
        this.brand = brand;
        this.id = id;
        this.model = model;
        this.lastVisit = lastVisit;
    }

        public String getBrand() {
            return brand;
        }

        public String getId() {
            return id;
        }

        public int getModel() {
            return model;
        }

        public LocalDate getLastVisit() {
            return lastVisit;
        }

    public boolean validid() {
        return id != null && id.matches("[A-Z]{3}-\\d{3}");
    }


    public long daysSinceLastVisit(){
        return java.time.temporal.ChronoUnit.DAYS.between(lastVisit, LocalDate.now());
    }
}