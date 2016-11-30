/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jeisonbetancur.proyecto.dao;

import com.jeisonbetancur.proyecto.dto.Factura;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FAMILIA
 */
public class FacturaDaoImpl implements FacturaDao {

    public Factura create(Factura factura) {
        // Sample code
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/trabajo" + "user=postgres&password=postgres");
            // 3. Creates the factura in the database
            stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO facturas VALUES('" + factura.getNumeroUnico()+ "','" + factura.getFecha()+ "','" + factura.getCliente()+ "','" + factura.getValorTotal()+ "', '" + factura.getValorBruto()+ "','" + factura.getValorIva()+ "','" + factura.getLugarCompra()+"')");
        } catch (SQLException ex) {
            Logger.getLogger(FacturaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FacturaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(FacturaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(FacturaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return factura;
    }
    
    public Factura update(Factura factura) {
        // Sample code
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/trabajo" + "user=postgres&password=postgres");
            // 3. Creates the factura in the database
            stmt = conn.createStatement();
            stmt.executeUpdate("UPDATE facturas VALUES('" + factura.getFecha()+ "','" + factura.getCliente()+ "','" + factura.getValorTotal()+ "','" + factura.getValorBruto()+ "', '" + factura.getValorIva()+ "','" + factura.getLugarCompra()+"')");
        } catch (SQLException ex) {
            Logger.getLogger(FacturaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FacturaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(FacturaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(FacturaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return factura;

    }
    
    public void delete(Factura factura) {
        // Sample code
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/trabajo" + "user=postgres&password=postgres");
            // 3. Creates the factura in the database
            stmt = conn.createStatement();
            stmt.executeUpdate("DELETE FROM facturas WHERE numero_unico='" +factura.getNumeroUnico()+"'");
        } catch (SQLException ex) {
            Logger.getLogger(FacturaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FacturaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(FacturaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(FacturaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
               
    }
    
    public Factura findById(Integer facturaId) {
        // Sample code
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        Factura factura = new Factura();
        
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/trabajo" + "user=postgres&password=postgres");
            // 3. Creates the factura in the database
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM  facturas WHERE numero_unico ='" + factura.getNumeroUnico()+"'");
            rs.next();
            factura.setCliente(rs.getString("cliente"));
            factura.setFecha(rs.getString("fecha"));
            factura.setLugarCompra(rs.getString("lugar copra"));
            factura.setNumeroUnico(rs.getString("numero unico"));
            factura.setValorBruto(rs.getString("valor bruto"));
            factura.setValorIva(rs.getString("valor iva"));
            factura.setValorTotal(rs.getString("valor total"));
            
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(FacturaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FacturaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(FacturaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(FacturaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return factura;

    }
    
    
    public List<Factura> findAll() {
        List<Factura> listafactura = new ArrayList<Factura>();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        Factura factura = new Factura();
        
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/trabajo" + "user=postgres&password=postgres");
            // 3. Creates the factura in the database
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM  facturas ");
            //rs.next();
            while(rs.next()){
                factura.setCliente(rs.getString("cliente"));
                factura.setFecha(rs.getString("fecha"));
                factura.setLugarCompra(rs.getString("lugar copra"));
                factura.setNumeroUnico(rs.getString("numero unico"));
                factura.setValorBruto(rs.getString("valor bruto"));
                factura.setValorIva(rs.getString("valor iva"));
                factura.setValorTotal(rs.getString("valor total"));
                
                listafactura.add(factura);
            }     
            
        } catch (SQLException ex) {
            Logger.getLogger(FacturaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FacturaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(FacturaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(FacturaDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listafactura;
    }
}
