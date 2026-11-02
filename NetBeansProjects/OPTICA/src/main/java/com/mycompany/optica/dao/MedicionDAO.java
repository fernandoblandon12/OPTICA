package com.mycompany.optica.dao;
import com.mycompany.optica.Modelo.Medicion;
import java.sql.*;
import java.util.ArrayList;
import Config.db_Connection;

public class MedicionDAO {

    public ArrayList<Medicion> listarPorCliente(int idCliente){
        ArrayList<Medicion> lista = new ArrayList<>();
        String sql = "SELECT IdMedicion, IdCliente, Esfera, Cilindro, Eje, Adicion FROM Mediciones WHERE IdCliente = ?";
          try(Connection con = db_Connection.conectar();
            PreparedStatement ps = con.prepareStatement(sql)){
            ps.setInt(1, idCliente);
            try(ResultSet rs = ps.executeQuery()){
                while(rs.next()){
                    Medicion med = new Medicion();
                    med.setIdMedicion(rs.getInt("IdMedicion"));
                    med.setIdCliente(rs.getInt("IdCliente"));
                    med.setEsfera(rs.getDouble("Esfera"));
                    med.setCilindro(rs.getDouble("Cilindro"));
                    med.setEje(rs.getInt("Eje"));
                    med.setAdicion(rs.getDouble("Adicion"));
                    lista.add(med);
                }
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<Medicion> listarTodas(){
        ArrayList<Medicion> lista = new ArrayList<>();
        String sql = "SELECT IdMedicion, IdCliente, Esfera, Cilindro, Eje, Adicion FROM Mediciones";
         try(Connection con = db_Connection.conectar();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()){
            while(rs.next()){
                Medicion med = new Medicion();
                med.setIdMedicion(rs.getInt("IdMedicion"));
                med.setIdCliente(rs.getInt("IdCliente"));
                med.setEsfera(rs.getDouble("Esfera"));
                med.setCilindro(rs.getDouble("Cilindro"));
                med.setEje(rs.getInt("Eje"));
                med.setAdicion(rs.getDouble("Adicion"));
                lista.add(med);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return lista;
    }
}
