package moises;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
 
public class Main {
    public static void main(String[] args) throws ParseException {
        // demostració de construcció d'un vehicle de categoria BASIC
        Vehicle vehicleBasic1 = new Vehicle("Tata", "Vista", Vehicle.BASIC);
        Vehicle vehicleBasic2 = new Vehicle("Toto", "Visto", Vehicle.BASIC);
        Vehicle vehicleBasic3 = new Vehicle("Tete", "Viste", Vehicle.BASIC);
 
        // demostració de construccuó d'un lloguer amb una data
        SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        Date date = dateFormat.parse("2/8/2013");
        Lloguer lloguerBasic1 = new Lloguer(date, 2, vehicleBasic1);
        Lloguer lloguerBasic2 = new Lloguer(date, 2, vehicleBasic2);
        Lloguer lloguerBasic3 = new Lloguer(date, 2, vehicleBasic3);
 
        Client cliente = new Client("123456R", "Bob en manetes", "666777888");
        cliente.afegeix(lloguerBasic1);
        cliente.afegeix(lloguerBasic2);
        cliente.afegeix(lloguerBasic3);
        cliente.informe();
    }
}




