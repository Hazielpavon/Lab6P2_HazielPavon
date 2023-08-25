
package lab6p2_hazielpavon;

import java.util.Date;


public class Juegos {
 
    private String nombre; 
    private String descripcion; 
    private Date date; 
    private double precio; 
    private String estado; 
    private boolean rentable; 
    private boolean agregado; 
    private int cantdisp; 

    public Juegos(String nombre, String descripcion, Date date, double precio, String estado, boolean rentable, boolean agregado, int cantdisp) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.date = date;
        this.precio = precio;
        this.estado = estado;
        this.rentable = rentable;
        this.agregado = agregado;
        this.cantdisp = cantdisp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isRentable() {
        return rentable;
    }

    public void setRentable(boolean rentable) {
        this.rentable = rentable;
    }

    public boolean isAgregado() {
        return agregado;
    }

    public void setAgregado(boolean agregado) {
        this.agregado = agregado;
    }

    public int getCantdisp() {
        return cantdisp;
    }

    public void setCantdisp(int cantdisp) {
        this.cantdisp = cantdisp;
    }
    
    
    
}
