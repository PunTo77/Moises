package moises;

import javax.swing.*;
import java.util.Date;
 
public class Lloguer {
    private Date data;
    private int dies;
    private Vehicle vehicle;
    public Lloguer(Date date, int i, Vehicle vehicleBasic) {
        this.data = date;
        this.dies = i;
        this.vehicle = vehicleBasic;
    }
 
    public Date getData() {
        return data;
    }
 
    public void setDate(Date date) {
        this.data = date;
    }
 
    public int getDies() {
        return dies;
    }
 
    public void setDies(int dies) {
        this.dies = dies;
    }
 
    public Vehicle getVehicle() {
        return vehicle;
    }
 
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
    public double quantitat() {
    	double quantitat = 0;
        switch (this.getVehicle().getCategoria()) {
            case Vehicle.BASIC:
                quantitat += 3;
                if (this.getDies() > 3) {
                    quantitat += (this.getDies() - 3) * 1.5;
                }
                break;
            case Vehicle.GENERAL:
                quantitat += 4;
                if (this.getDies() > 2) {
                    quantitat += (this.getDies() - 2) * 2.5;
                }
                break;
            case Vehicle.LUXE:
                quantitat += this.getDies() * 6;
                break;
        }
        return quantitat; 
        
    	}
}