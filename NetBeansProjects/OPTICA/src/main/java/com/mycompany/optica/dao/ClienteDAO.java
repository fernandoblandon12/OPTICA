package com.mycompany.optica.dao;
import com.mycompany.optica.Modelo.Cliente;
import Config.db_Connection;
import java.sql.*;

public class ClienteDAO {

    public boolean insertar(Cliente cliente){
        String sql = "INSERT INTO Clientes (Nombre, Dni, Telefono, Correo) VALUES (?, ?, ?, ?)";
        try(Connection con = db_Connection.conectar();
            PreparedStatement ps = con.prepareStatement(sql)){
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getDni());
            ps.setString(3, cliente.getTelefono());
            ps.setString(4, cliente.getCorreo());
            ps.executeUpdate();
            return true;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
}
