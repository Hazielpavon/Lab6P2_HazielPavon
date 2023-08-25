package lab6p2_hazielpavon;

import java.util.ArrayList;
import java.util.Date;

public class Consolas {

    private int identificacion;
    private String fabricante;
    private Date date;
    private double precio;
    private ArrayList juegos = new ArrayList();
    private String modelo;

    public Consolas(int identificacion, String fabricante, Date date, double precio, String modelo) {
        this.identificacion = identificacion;
        this.fabricante = fabricante;
        this.date = date;
        this.precio = precio;
        this.modelo = modelo;

    }

    public Consolas() {
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
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

    public ArrayList getJuegos() {
        return juegos;
    }

    public void setJuegos(ArrayList juegos) {
        this.juegos = juegos;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
