
package com.mycompany.optica.dao;
// import com.mycompany.optica.*;
import com.mycompany.optica.Modelo.Venta;
import com.mycompany.optica.Modelo.DetalleVenta;
        
/**
 *
 * @author TECH EXPRESS
 */
/**
 *
 * @author TECH EXPRESS
 */

public interface VentaDAO {

    boolean registrarVenta(Venta venta);
    
    boolean registrarDetalle(DetalleVenta detalle);
     

}
