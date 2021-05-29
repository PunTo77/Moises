package moises;

import java.util.ArrayList;

public class Client {
	
    private String nif;
    private String nom;
    private String telefon;
    private ArrayList<Lloguer> lloguers;

    public Client(String nif, String nom, String telefon) {
        this.nif = nif;
        this.nom = nom;
        this.telefon = telefon;
        this.lloguers = new ArrayList<Lloguer>();
    }

    public String getNif()     { return nif;     }
    public String getNom()     { return nom;     }
    public String getTelefon() { return telefon; }

    public void setNif(String nif) { this.nif = nif; }
    public void setNom(String nom) { this.nom = nom; }
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    public void afegeix(Lloguer llog) {
        if (! lloguers.contains(llog) ) {
            lloguers.add(llog);
        }
    }
    public void elimina(Lloguer llog) {
        if (lloguers.contains(llog) ) {
            lloguers.remove(llog);
        }
    }
    public boolean conte(Lloguer llog) {
        return lloguers.contains(llog);
    }
    
    public String informe() {
        double total = 0;
        int bonificacions = 0;
        String resultat = "Informe de lloguers del client " +
            getNom() +
            " (" + getNif() + ")\n";
        for (Lloguer lloguer: lloguers) {
            double quantitat = lloguer.quantitat();

            bonificacions ++;

            if (lloguer.getVehicle().getCategoria() == Vehicle.LUXE &&
                    lloguer.getDies()>1 ) {
                bonificacions ++;
            }

            resultat += "\t" +
                lloguer.getVehicle().getMarca() +
                " " +
                lloguer.getVehicle().getModel() + ": " +
                (quantitat * 30) + "€" + "\n";
            total += quantitat * 30;
        }

        resultat += "Import a pagar: " + total + "€\n" +
            "Punts guanyats: " + bonificacions + "\n";
        return resultat;
    }
    
    public String informe2() {
              for (Lloguer lloguer: lloguers) {

        }

        
        return composaCapsalera() +
        		composaDetall() +
        		composaPeu();
    }
    
    public double importeTotal() {
    	double total = 0;
    	for (Lloguer lloguer: lloguers) {
    		total += lloguer.quantitat() * 30;
    	}
    	return total;
    }
    
    public int bonificacionsTotal() {
    	int bonificacions = 0;
    	for (Lloguer lloguer: lloguers) {
    		bonificacions += lloguer.bonificacions();
    	}
    	return bonificacions;
	}
    
    public String composaCapsalera() {
    	String resultat = "Informe de lloguers del client " +
                getNom() +
                " (" + getNif() + ")\n";
    	return resultat;
    }
    public String composaDetall() {
    	String resultat = "";
    	for (Lloguer lloguer: lloguers) {
    		resultat += "\t" +
                lloguer.getVehicle().getMarca() +
                " " +
                lloguer.getVehicle().getModel() + ": " +
                (lloguer.quantitat() * 30) + "€" + "\n"; 
    	}
    	return resultat;
    }
    public String composaPeu() {
        String resultat = "";
        resultat = "Import a pagar: " + importeTotal() + "€\n" +
                "Punts guanyats: " + bonificacionsTotal() + "\n";
        return resultat;
    }
    
    public String composaCapceleraHTML() {
    	return "<p>Informe de lloguers de client<p>" + getNom() +
    }
}