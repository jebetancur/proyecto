/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jeisonbetancur.proyecto.dao;

import com.jeisonbetancur.proyecto.dto.FacturaDetallada;
import java.util.List;

/**
 *
 * @author FAMILIA
 */
public interface FacturaDetalladaDao {
     /**
     * Creates a new facturadet. 
     * @param facturadet
     * @return 
     */
    FacturaDetallada create(FacturaDetallada facturadet);

    /**
     * Updates an existing facturadet. facturadet id can't be modified.
     * @param facturadet
     * @return 
     */
    FacturaDetallada update(FacturaDetallada facturadet);

    /**
     * Deletes an existing facturadet
     * @param facturadet 
     */
    void delete(FacturaDetallada facturadet);

    /**
     * Find a facturadet by id
     * @param facturaId
     * @return 
     */
    FacturaDetallada findById(String facturaId);

    /**
     * Returns all the facturas in the database
     * @return 
     */
    List<FacturaDetallada> findAll();
}
