
package lab6p2_hazielpavon;



public class Estacionaria extends Consolas {
    private int controles; 
    private double almacenamiento; 
    private String tipodeconex; 

    public Estacionaria(int controles, int uso, int jdisp, String tipodeconex, String fab, String tip, double almacenamiento, int numcon, String conex, double space) {
        this.controles = controles;
        this.almacenamiento = almacenamiento;
        this.tipodeconex = tipodeconex;
    }

    public Estacionaria(int controles, double almacenamiento, String tipodeconex, int identificacion, String fabricante, int anosuso, double precio, String modelo) {
        super(identificacion, fabricante, anosuso, precio, modelo);
        this.controles = controles;
        this.almacenamiento = almacenamiento;
        this.tipodeconex = tipodeconex;
    }

    public Estacionaria(int controles, double almacenamiento, String tipodeconex) {
        this.controles = controles;
        this.almacenamiento = almacenamiento;
        this.tipodeconex = tipodeconex;
    }

  

    public int getControles() {
        return controles;
    }

    public void setControles(int controles) {
        this.controles = controles;
    }

    public double getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(double almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getTipodeconex() {
        return tipodeconex;
    }

    public void setTipodeconex(String tipodeconex) {
        this.tipodeconex = tipodeconex;
    }
    
    
    
}
