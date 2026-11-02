package com.mycompany.optica.Modelo;

import com.mycompany.optica.Modelo.Venta; //no se neecesita
import com.mycompany.optica.Modelo.DetalleVenta; //no se neecesita

import com.mycompany.optica.dao.VentaDAO; //no se neecesita
import com.mycompany.optica.dao.productoDAO; //no se neecesita

//import com.mycompany.optica.dao.VentaDAOImpl;
//import com.mycompany.optica.dao.productoDAOImpl;

import javax.swing.JOptionPane; //no se neecesita
/**
 *
 * @author RUTH FLORES
 */
public class producto {
    private int id;
    private String nombre;
    private String tipo;
    private String marca;
    private double precio;
    private int stock;
    
    public producto() {
    }
    public producto(
            int id,
            String nombre,
            String tipo,
            String marca,
            double precio,
            int stock) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.marca = marca;
        this.precio = precio;
        this.stock = stock;
    }
    // Getters y Setters
    public int getId() {
    return id;
}

    public void setId(int id) {
        this.id = id;
}
    public String getNombre() {
    return nombre;
}

    public void setNombre(String nombre) {
        this.nombre = nombre;
}

    public String getTipo() {
        return tipo;
}

    public void setTipo(String tipo) {
        this.tipo = tipo;
}

    public String getMarca() {
        return marca;
}

    public void setMarca(String marca) {
        this.marca = marca;
}

    public double getPrecio() {
        return precio;
}

public void setPrecio(double precio) {
    this.precio = precio;
}

public int getStock() {
    return stock;
}

public void setStock(int stock) {
    this.stock = stock;
}
    
}
