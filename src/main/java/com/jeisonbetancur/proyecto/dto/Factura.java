/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jeisonbetancur.proyecto.dto;

import java.io.Serializable;

/**
 *
 * @author FAMILIA
 */

public class Factura implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private String numeroUnico;
    
    private String fecha;
    
    private String valorTotal;
    
    private String valorBruto;
    
    private String valorIva;
    
    private String lugarCompra;
    
    private FacturaDetallada facturaDetallada;
    
    private String cliente;

    public Factura() {
    }

    public Factura(String numeroUnico) {
        this.numeroUnico = numeroUnico;
    }

    public String getNumeroUnico() {
        return numeroUnico;
    }

    public void setNumeroUnico(String numeroUnico) {
        this.numeroUnico = numeroUnico;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getValorBruto() {
        return valorBruto;
    }

    public void setValorBruto(String valorBruto) {
        this.valorBruto = valorBruto;
    }

    public String getValorIva() {
        return valorIva;
    }

    public void setValorIva(String valorIva) {
        this.valorIva = valorIva;
    }

    public String getLugarCompra() {
        return lugarCompra;
    }

    public void setLugarCompra(String lugarCompra) {
        this.lugarCompra = lugarCompra;
    }

    public FacturaDetallada getFacturaDetallada() {
        return facturaDetallada;
    }

    public void setFacturaDetallada(FacturaDetallada facturaDetallada) {
        this.facturaDetallada = facturaDetallada;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numeroUnico != null ? numeroUnico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Factura)) {
            return false;
        }
        Factura other = (Factura) object;
        if ((this.numeroUnico == null && other.numeroUnico != null) || (this.numeroUnico != null && !this.numeroUnico.equals(other.numeroUnico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jeisonbetancur.proyecto1.dto.Factura[ numeroUnico=" + numeroUnico + " ]";
    }
    
}
