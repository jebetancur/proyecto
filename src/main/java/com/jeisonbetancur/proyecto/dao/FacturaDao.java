/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jeisonbetancur.proyecto.dao;

import com.jeisonbetancur.proyecto.dto.Factura;
import com.jeisonbetancur.proyecto.dto.Factura;
import java.util.List;

/**
 *
 * @author FAMILIA
 */
public interface FacturaDao {
     /**
     * Creates a new factura. 
     * @param factura
     * @return 
     */
    
    Factura create(Factura factura);

    /**
     * Updates an existing factura. Factura id can't be modified.
     * @param factura
     * @return 
     */
    Factura update(Factura factura);

    /**
     * Deletes an existing factura
     * @param factura 
     */
    void delete(Factura factura);

    /**
     * Find a factura by id
     * @param facturaId
     * @return 
     */
    Factura findById(Integer facturaId);

    /**
     * Returns all the facturas in the database
     * @return 
     */
    List<Factura> findAll();
    
}


