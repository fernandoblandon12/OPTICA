package com.mycompany.optica;

import com.mycompany.optica.dao.UsuarioDAO;
import com.mycompany.optica.Modelo.Usuarios;

public class PruebaUsuarioDao {

    public static void main(String[] args) {

        UsuarioDAO usuarioDAO = new UsuarioDAO();

        Usuarios usuarioEncontrado = usuarioDAO.buscarUsuario("HN34975");

        if (usuarioEncontrado != null) {

            System.out.println("Usuario encontrado");
            System.out.println("Nombre: " + usuarioEncontrado.getNombre());
            System.out.println("Rol: " + usuarioEncontrado.getId_rol());

        } else {
            System.out.println("Usuario no encontrado");
        }
    }
}