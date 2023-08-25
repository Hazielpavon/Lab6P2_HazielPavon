package lab6p2_hazielpavon;

import java.util.ArrayList;
import java.util.Date;

public class Consolas {

    private int identificacion;
    private String fabricante;
    private int anosuso;
    private double precio;
    private ArrayList juegos = new ArrayList();
    private String modelo;

    public Consolas(int identificacion, String fabricante, int anosuso, double precio, String modelo) {
        this.identificacion = identificacion;
        this.fabricante = fabricante;
        this.anosuso = anosuso;
        this.precio = precio;
        this.modelo = modelo;
        this.juegos = new ArrayList(); 
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

    public int getanosuso() {
        return anosuso;
    }

    public void setanosuso(int anosuso) {
        this.anosuso = anosuso;
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
