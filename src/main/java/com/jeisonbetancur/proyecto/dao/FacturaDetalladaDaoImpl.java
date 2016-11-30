package com.jeisonbetancur.proyecto.dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.jeisonbetancur.proyecto.dto.FacturaDetallada;
import java.sql.Connection;
import java.sql.DriverManager;
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
public class FacturaDetalladaDaoImpl {
    public class FacturaDetalladoDaoImpl implements FacturaDetalladaDao {
    public FacturaDetallada create(FacturaDetallada facturadet) {
        // Sample code
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/trabajo" + "user=postgres&password=postgres");
            // 3. Creates the facturadet in the database
            stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO facturadets VALUES('" + facturadet.getNFactura()+ "','" + facturadet.getSecuencia()+ "','" + facturadet.getProducto()+ "','" + facturadet.getCantidad()+ "', '" + facturadet.getValorUnitario()+ "','" + facturadet.getValorTotal()+ "','" + facturadet.getUnidadMedida()+ "')");
        } catch (SQLException ex) {
            Logger.getLogger(FacturaDetalladoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FacturaDetalladoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(FacturaDetalladoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(FacturaDetalladoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return facturadet;
    }
    
    public FacturaDetallada update(FacturaDetallada facturadet) {
        // Sample code
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/trabajo" + "user=postgres&password=postgres");
            // 3. Creates the facturadet in the database
            stmt = conn.createStatement();
            stmt.executeUpdate("UPDATE INTO facturadets VALUES('" + facturadet.getNFactura()+ "','" + facturadet.getSecuencia()+ "','" + facturadet.getProducto()+ "','" + facturadet.getCantidad()+ "', '" + facturadet.getValorUnitario()+ "','" + facturadet.getValorTotal()+ "','" + facturadet.getUnidadMedida()+ "')");
        } catch (SQLException ex) {
            Logger.getLogger(FacturaDetalladoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FacturaDetalladoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(FacturaDetalladoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(FacturaDetalladoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return facturadet;

    }
    
    public void delete(FacturaDetallada facturadet) {
        // Sample code
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/trabajo" + "user=postgres&password=postgres");
            // 3. Creates the facturadet in the database
            stmt = conn.createStatement();
            stmt.executeUpdate("DELETE facturadets WHERE n_dactura ='" + facturadet.getNFactura()+ "' ");
        } catch (SQLException ex) {
            Logger.getLogger(FacturaDetalladoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FacturaDetalladoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(FacturaDetalladoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(FacturaDetalladoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
               
    }
    
    public FacturaDetallada findById(String facturadetId) {
        // Sample code
        Connection conn = null;
        Statement stmt = null;
        FacturaDetallada facturadet=null;
        
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/trabajo" + "user=postgres&password=postgres");
            // 3. Creates the facturadet in the database
            stmt = conn.createStatement();
            //stmt.executeUpdate("findById INTO facturadets VALUES('" + facturadet.getCodigo()+ "','" + facturadet.getIdentificacion()+ "','" + facturadet.getUsuario()+ "','" + facturadet.getClave()+ "', '" + facturadet.getNombres()+ "','" + facturadet.getApellidos()+ "','" + facturadet.getCorreoElectronico()+ "', '" + facturadet.getDireccion()+ "','" + facturadet.getCelular()+ "','" + facturadet.getTelefonoLocal()+ "')");
        } catch (SQLException ex) {
            Logger.getLogger(FacturaDetalladoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FacturaDetalladoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(FacturaDetalladoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(FacturaDetalladoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return facturadet;

    }
    
    public List<FacturaDetallada> findAll() {
        List<FacturaDetallada> listfactdet= new ArrayList<FacturaDetallada>();
        
        Connection conn = null;
        Statement stmt = null;
        FacturaDetallada facturadet=null;
        
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/trabajo" + "user=postgres&password=postgres");
            // 3. Creates the facturadet in the database
            stmt = conn.createStatement();
            //stmt.executeUpdate("findById INTO facturadets VALUES('" + facturadet.getCodigo()+ "','" + facturadet.getIdentificacion()+ "','" + facturadet.getUsuario()+ "','" + facturadet.getClave()+ "', '" + facturadet.getNombres()+ "','" + facturadet.getApellidos()+ "','" + facturadet.getCorreoElectronico()+ "', '" + facturadet.getDireccion()+ "','" + facturadet.getCelular()+ "','" + facturadet.getTelefonoLocal()+ "')");
        } catch (SQLException ex) {
            Logger.getLogger(FacturaDetalladoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FacturaDetalladoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(FacturaDetalladoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(FacturaDetalladoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return listfactdet;
    }
}


}
