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
public class FacturaDetallada implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private String nFactura;
    
    private String secuencia;
    
    private String cantidad;
   
    private String valorUnitario;
    
    private String valorTotal;
    
    private String unidadMedida;
    
    private Factura factura;
    
    private String producto;

    public FacturaDetallada() {
    }

    public FacturaDetallada(String nFactura) {
        this.nFactura = nFactura;
    }

    public FacturaDetallada(String nFactura, String secuencia) {
        this.nFactura = nFactura;
        this.secuencia = secuencia;
    }

    public String getNFactura() {
        return nFactura;
    }

    public void setNFactura(String nFactura) {
        this.nFactura = nFactura;
    }

    public String getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(String secuencia) {
        this.secuencia = secuencia;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(String valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public String getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nFactura != null ? nFactura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacturaDetallada)) {
            return false;
        }
        FacturaDetallada other = (FacturaDetallada) object;
        if ((this.nFactura == null && other.nFactura != null) || (this.nFactura != null && !this.nFactura.equals(other.nFactura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jeisonbetancur.proyecto1.dto.FacturaDetallada[ nFactura=" + nFactura + " ]";
    }
    
}
