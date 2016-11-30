/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jeisonbetancur.proyecto.dao;

import com.jeisonbetancur.proyecto.dto.Producto;
import java.util.List;

/**
 *
 * @author FAMILIA
 */
public interface ProductoDao {
     /**
     * Creates a new producto. 
     * @param producto
     * @return 
     */
    Producto create(Producto producto);

    /**
     * Updates an existing producto. Producto id can't be modified.
     * @param producto
     * @return 
     */
    Producto update(Producto producto);

    /**
     * Deletes an existing producto
     * @param producto 
     */
    void delete(Producto producto);

    /**
     * Find a producto by id
     * @param productoId
     * @return 
     */
    Producto findById(Integer productoId);

    /**
     * Returns all the productos in the database
     * @return 
     */
    List<Producto> findAll();
    
}


