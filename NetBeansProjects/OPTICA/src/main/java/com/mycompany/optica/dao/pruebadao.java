/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.optica.dao;

import com.mycompany.optica.Modelo.Usuarios;


/**
 *
 * @author freddy
 */
public class pruebadao {
    
    public static void main(String[] args) {
UsuarioDAO dao = new UsuarioDAO();
Usuarios usuario = dao.buscarUsuario("HN34972");

System.out.println(usuario.getPassword_hash());

System.out.println(
    PasswordUtilidades.verificarPassword(
        "Cosacomun1!",
        usuario.getPassword_hash()
    )
);
      
    }
}


