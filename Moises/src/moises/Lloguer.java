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
}