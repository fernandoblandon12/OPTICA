/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.optica.Modelo;

/**
 *
 * @author freddy
 */

//Generacion del constructor 
public class Usuarios {

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) { //
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getPassword_hash() {
        return password_hash;
    }

    public void setPassword_hash(String password_hash) {
        this.password_hash = password_hash;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }
    
    private int id_usuario;  
    private String Nombre;
   private String Usuario;
   private String password_hash;
   private int id_rol;
}
