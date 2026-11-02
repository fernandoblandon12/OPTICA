
package com.mycompany.optica.dao;

import Config.db_Connection;
import com.mycompany.optica.Modelo.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UsuarioDAO {
    
  public Usuarios buscarUsuario(String nombreUsuario) {

    String consultaSQL = "SELECT * FROM usuarios WHERE usuario = ?";

    try {
        Connection conexion = db_Connection.conectar(); //Declaracion de variable de tipo Connection

        PreparedStatement consultaPreparada = conexion.prepareStatement(consultaSQL); //consulta conexion

        consultaPreparada.setString(1, nombreUsuario); // asigno valor texto al ?

        ResultSet resultado = consultaPreparada.executeQuery(); // guarda los resultados 

        if (resultado.next()) {

            Usuarios usuarioEncontrado = new Usuarios();

            usuarioEncontrado.setId_usuario(resultado.getInt("id_usuario"));
            usuarioEncontrado.setNombre(resultado.getString("nombre"));
            usuarioEncontrado.setUsuario(resultado.getString("usuario"));
            usuarioEncontrado.setPassword_hash(resultado.getString("password_hash"));
            usuarioEncontrado.setId_rol(resultado.getInt("id_rol"));

            return usuarioEncontrado;
        }

    } catch (SQLException error) {
        error.printStackTrace();
    }

    return null;
}

  
  
}



