package lab6p2_hazielpavon;

public class Portatil extends Consolas {

    private String tampantalla;
    private int bateria;
    private boolean estuche;

    public Portatil(String tampantalla, int bateria, boolean estuche, int identificacion, String fabricante, int anosuso, double precio, String modelo) {
        super(identificacion, fabricante, anosuso, precio, modelo);
        this.tampantalla = tampantalla;
        this.bateria = bateria;
        this.estuche = estuche;
    }

    public Portatil(String tampantalla, int bateria, boolean estuche) {
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

    public boolean isEstuche() {
        return estuche;
    }

    public void setEstuche(boolean estuche) {
        this.estuche = estuche;
    }
}