/*
 * Taller 2 – Parte 2
 */

/*
 * @authors
 * Julian David Gomez Sequeda
 * Brayan Sebastian Vanegas Acero
 */
package businessLogic;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CarsReader {
    private String fileName;        // Nombre del archivo CSV
    private CarInfo[] cars;         // Arreglo de objetos CarInfo
    private int numberOfCars;       // Número de carros cargados

    // Constructor
    public CarsReader(String fileName) {
        this.fileName = fileName;
        this.cars = new CarInfo[100]; // Suponiendo un límite de 100 carros
        this.numberOfCars = 0;        // Inicialmente no hay carros cargados
    }

    // Método principal para leer datos
    public void readingData() {
        
        Scanner scanner = null;
        
        try{
            File file= new File (fileName);
            
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] fields = line.split(",");
                
            if(fields.length == 4) {
                String brand = fields[0].trim();
                String id = fields[1].trim();
                int model = Integer.parseInt(fields[2].trim());
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate lastVisit = LocalDate.parse(fields[3].trim());
                
                CarInfo car = new CarInfo(brand,id,model,lastVisit);
                addCar(car);
            } else {
            System.err.println("Linea Inválida: "+ line);}
            }
           } catch (IOException e) {
               System.err.println("Error leyendo el archivo" + e.getMessage());
           } finally {
                if (scanner != null){
                scanner.close();
                }
        }
        }
    
    
    private void addCar(CarInfo car) {
        if(numberOfCars < cars.length) {
            cars[numberOfCars++] = car;
        } else {
            System.err.println("No se pueden agregar más carros.");
        }
    }

    public void showCars() {
        for (int i = 0; i < numberOfCars; i++) {
            CarInfo car = cars[i];
            System.out.println("CarInfo [brand=" + car.getBrand() + ", id=" + car.getId() + ", model=" + 
                    car.getModel() + ", lastVisit=" + car.getLastVisit() +"]"+ ", Placa válida: " +  car.validid());     
        }
    }
}