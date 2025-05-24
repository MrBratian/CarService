package taller2poo;
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
    
public long daysSinceLastVisit(){
    return java.time.temporal.ChronoUnit.DAYS.between(lastVisit, LocalDate.now());
}

 public boolean validid(){
 return id != null && lastVisit != null;
    
 }

}

