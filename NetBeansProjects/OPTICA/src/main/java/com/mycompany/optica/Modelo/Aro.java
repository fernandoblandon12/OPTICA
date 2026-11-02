package com.mycompany.optica.Modelo;

public class Aro {
    private int idAro;
    private String marca, material, forma;
    private double precio;

    public Aro(){}
    public Aro(int idAro, String marca, String material, String forma, double precio){
        this.idAro = idAro;
        this.marca = marca;
        this.material = material;
        this.forma = forma;
        this.precio = precio;
    }

    public int getIdAro() {
        return idAro;
    }
    public void setIdAro(int idAro) {
        this.idAro = idAro;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getForma() {
        return forma;
    }
    public void setForma(String forma) {
        this.forma = forma;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    @Override
    public String toString(){
        return idAro + " - " + marca + " - " + forma;
    }
}
