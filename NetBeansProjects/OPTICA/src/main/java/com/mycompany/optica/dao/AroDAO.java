package com.mycompany.optica.dao;
import com.mycompany.optica.Modelo.Aro;
import Config.db_Connection; //Llamado a mi conexion
import java.sql.*;
import java.util.ArrayList;

public class AroDAO {

    public ArrayList<Aro> listarAros(String marca, String material, String forma, double precioMaximo){
        ArrayList<Aro> lista = new ArrayList<>();
        String sql = "SELECT IdAro, Marca, Material, Forma, Precio FROM Aros "
                + "WHERE Marca LIKE ? AND Material LIKE ? AND Forma LIKE ? AND Precio <= ?";
        try(Connection con = db_Connection.conectar();
            PreparedStatement ps = con.prepareStatement(sql)){
            ps.setString(1,"%"+ marca + "%");
            ps.setString(2,"%"+ material + "%");
            ps.setString(3,"%"+ forma + "%");
            ps.setDouble(4, precioMaximo);
            try(ResultSet rs = ps.executeQuery()){
                while(rs.next()){
                    Aro aro = new Aro();
                    aro.setIdAro(rs.getInt("IdAro"));
                    aro.setMarca(rs.getString("Marca"));
                    aro.setMaterial(rs.getString("Material"));
                    aro.setForma(rs.getString("Forma"));
                    aro.setPrecio(rs.getDouble("Precio"));
                    lista.add(aro);
                }
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return lista;
    }

    public boolean apartarAro(int idCliente, int idAro){
        String sql = "INSERT INTO Apartados (IdCliente, IdAro) VALUES (?, ?)";
        try(Connection con = db_Connection.conectar();
            PreparedStatement ps = con.prepareStatement(sql)){
            ps.setInt(1, idCliente);
            ps.setInt(2, idAro);
            ps.executeUpdate();
            return true;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
}
