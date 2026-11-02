
package com.mycompany.optica.dao.impl;


import com.mycompany.optica.Modelo.Venta;
import com.mycompany.optica.Modelo.DetalleVenta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import com.mycompany.optica.dao.VentaDAO;
import Config.db_Connection;

/**
 *g
 * @author TECH EXPRESS
 */
public class VentaDAOImpl implements VentaDAO {

    @Override
    public boolean registrarVenta(Venta venta) {

        String sql =
        "INSERT INTO ventas(cliente_id,subtotal,impuesto,total) VALUES(?,?,?,?)";

        try { Connection con = db_Connection.conectar();

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, venta.getClienteId());
            ps.setDouble(2, venta.getSubtotal());
            ps.setDouble(3, venta.getImpuesto());
            ps.setDouble(4, venta.getTotal());

            return ps.executeUpdate() > 0;

        } catch(Exception e) {

            e.printStackTrace();

        }

        return false;
    }   

    @Override
    public boolean registrarDetalle(DetalleVenta detalle) {

        System.out.println("Entró a registrarDetalle");

        String sql =
            "INSERT INTO detalleventa "
            + "(venta_id, cliente_id, producto_id, medicion_id) "
            + "VALUES (?, ?, ?, ?)";

        try {

         Connection con = db_Connection.conectar();

        PreparedStatement ps =
                con.prepareStatement(sql);

        ps.setInt(1, detalle.getVentaId());
        ps.setInt(2, detalle.getClienteId());
        ps.setInt(3, detalle.getProductoId());
        ps.setInt(4, detalle.getMedicionId());

        System.out.println("Insertando detalle...");

        return ps.executeUpdate() > 0;

    } catch(Exception e){

        e.printStackTrace();

    }
    
    return false;
}
}
        
   
