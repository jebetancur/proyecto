/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jeisonbetancur.proyecto.dao;

import com.jeisonbetancur.proyecto.dto.Producto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FAMILIA
 */

    public class ProductoDaoImpl implements ProductoDao {
    
        public Producto create(Producto producto) {
        // Sample code
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/trabajo" + "user=postgres&password=postgres");
            // 3. Creates the producto in the database
            stmt = conn.createStatement();
            //stmt.executeUpdate("INSERT INTO productos VALUES('" + producto.getCodigo()+ "','" + producto.getIdentificacion()+ "','" + producto.getUsuario()+ "','" + producto.getClave()+ "', '" + producto.getNombres()+ "','" + producto.getApellidos()+ "','" + producto.getCorreoElectronico()+ "', '" + producto.getDireccion()+ "','" + producto.getCelular()+ "','" + producto.getTelefonoLocal()+ "')");
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return producto;
    }
    
    public Producto update(Producto producto) {
        // Sample code
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/trabajo" + "user=postgres&password=postgres");
            // 3. Creates the producto in the database
            stmt = conn.createStatement();
            //stmt.executeUpdate("UPDATE INTO productos VALUES('" + producto.getCodigo()+ "','" + producto.getIdentificacion()+ "','" + producto.getUsuario()+ "','" + producto.getClave()+ "', '" + producto.getNombres()+ "','" + producto.getApellidos()+ "','" + producto.getCorreoElectronico()+ "', '" + producto.getDireccion()+ "','" + producto.getCelular()+ "','" + producto.getTelefonoLocal()+ "')");
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return producto;

    }
    
    public void delete(Producto producto) {
        // Sample code
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/trabajo" + "user=postgres&password=postgres");
            // 3. Creates the producto in the database
            stmt = conn.createStatement();
            //stmt.executeUpdate("DELETE INTO productos VALUES('" + producto.getCodigo()+ "','" + producto.getIdentificacion()+ "','" + producto.getUsuario()+ "','" + producto.getClave()+ "', '" + producto.getNombres()+ "','" + producto.getApellidos()+ "','" + producto.getCorreoElectronico()+ "', '" + producto.getDireccion()+ "','" + producto.getCelular()+ "','" + producto.getTelefonoLocal()+ "')");
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
               
    }
    
    public Producto findById(Integer productoId) {
        // Sample code
        Connection conn = null;
        Statement stmt = null;
        Producto producto = new Producto();
        
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/trabajo" + "user=postgres&password=postgres");
            // 3. Creates the producto in the database
            stmt = conn.createStatement();
            //stmt.executeUpdate("findById INTO productos VALUES('" + producto.getCodigo()+ "','" + producto.getIdentificacion()+ "','" + producto.getUsuario()+ "','" + producto.getClave()+ "', '" + producto.getNombres()+ "','" + producto.getApellidos()+ "','" + producto.getCorreoElectronico()+ "', '" + producto.getDireccion()+ "','" + producto.getCelular()+ "','" + producto.getTelefonoLocal()+ "')");
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return producto;

    }
    
    public List<Producto> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
        
    }
}


