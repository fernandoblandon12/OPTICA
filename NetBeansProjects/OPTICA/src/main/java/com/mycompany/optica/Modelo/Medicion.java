package com.mycompany.optica.Modelo;

public class Medicion {
    private int idMedicion,idCliente;
    private double esfera,cilindro, adicion;
    private int eje;
 
    public Medicion(){}

    public Medicion(int idMedicion, int idCliente, double esfera, double cilindro, int eje, double adicion){
        this.idMedicion = idMedicion;
        this.idCliente = idCliente;
        this.esfera = esfera;
        this.cilindro = cilindro;
        this.eje = eje;
        this.adicion = adicion;
    }

    public int getIdMedicion() {
        return idMedicion;
    }
    public void setIdMedicion(int idMedicion) {
        this.idMedicion = idMedicion;
    }
    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public double getEsfera() {
        return esfera;
    }
    public void setEsfera(double esfera) {
        this.esfera = esfera;
    }
    public double getCilindro() {
        return cilindro;
    }
    public void setCilindro(double cilindro) {
        this.cilindro = cilindro;
    }
    public int getEje() {
        return eje;
    }
    public void setEje(int eje) {
        this.eje = eje;
    }
    public double getAdicion() {
        return adicion;
    }
    public void setAdicion(double adicion) {
        this.adicion = adicion;
    }
    @Override
    public String toString(){
        return "Medicion " + idMedicion + " - Esfera " + esfera + " - Cilindro " + cilindro;
    }
}
