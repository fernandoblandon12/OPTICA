
package com.mycompany.optica.dao;

import java.util.List;
import com.mycompany.optica.Modelo.producto;
/**
 *
 * @author TECH EXPRESS
 */

public interface productoDAO {

    boolean registrar(producto p);

    List<producto> listar();

    boolean actualizar(producto p);

    boolean eliminar(int id);

    producto buscarPorId(int id);
    
    boolean actualizarStock(int idProducto, int cantidadVendida);
}

