
package lab6p2_hazielpavon;

public class Portatil extends Consolas{
    
    
    private String tampantalla; 
    private int bateria; 
    private String estuche; 

    public Portatil(String tampantalla, int bateria, String estuche) {
        this.tampantalla = tampantalla;
        this.bateria = bateria;
        this.estuche = estuche;
    }

    public String getTampantalla() {
        return tampantalla;
    }

    public void setTampantalla(String tampantalla) {
        this.tampantalla = tampantalla;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public String getEstuche() {
        return estuche;
    }

    public void setEstuche(String estuche) {
        this.estuche = estuche;
    }
    
    
    
    
    
    
    
    
    
    
    
}
