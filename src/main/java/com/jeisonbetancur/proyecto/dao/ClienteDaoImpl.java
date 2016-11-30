/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jeisonbetancur.proyecto.dao;

import com.jeisonbetancur.proyecto.dao.ClienteDao;
import com.jeisonbetancur.proyecto.dto.Cliente;
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
public class ClienteDaoImpl implements ClienteDao {
    public Cliente create(Cliente cliente) {
        // Sample code
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/trabajo" + "user=postgres&password=postgres");
            // 3. Creates the cliente in the database
            stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO cliente VALUES('" + cliente.getCodigo()+ "','" + cliente.getIdentificacion()+ "','" + cliente.getUsuario()+ "','" + cliente.getClave()+ "', '" + cliente.getNombres()+ "','" + cliente.getApellidos()+ "','" + cliente.getCorreoElectronico()+ "', '" + cliente.getDireccion()+ "','" + cliente.getCelular()+ "','" + cliente.getTelefonoLocal()+ "')");
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return cliente;
    }
    
    public Cliente update(Cliente cliente) {
        // Sample code
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/trabajo" + "user=postgres&password=postgres");
            // 3. Creates the cliente in the database
            stmt = conn.createStatement();
            stmt.executeUpdate("UPDATE cliente set codigo='" + cliente.getCodigo()+ "', identificacion='" + cliente.getIdentificacion()+ "', usuario='" + cliente.getUsuario()+ "', clave='" + cliente.getClave()+ "', nombres='" + cliente.getNombres()+ "', apellidos'" + cliente.getApellidos()+ "', correo_electronico'" + cliente.getCorreoElectronico()+ "', direccion='" + cliente.getDireccion()+ "', celular='" + cliente.getCelular()+ "', telefono_local='" + cliente.getTelefonoLocal()+ "' ");
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return cliente;

    }
    
    public void delete(Cliente cliente) {
        // Sample code
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/trabajo" + "user=postgres&password=postgres");
            // 3. Creates the cliente in the database
            stmt = conn.createStatement();
            stmt.executeUpdate("DELETE FROM cliente WHERE codigo ='" + cliente.getCodigo()+ "'");
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
               
    }
    
    public Cliente findById(String clienteId) {
        // Sample code
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        Cliente cliente = new Cliente();
        
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/trabajo" + "user=postgres&password=postgres");
            // 3. Creates the cliente in the database
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM cliente WHERE codigo='" + clienteId+ "' ");
            rs.next();
            cliente.setApellidos(rs.getString("apellidos"));
            cliente.setCelular(rs.getString("celular"));
            cliente.setClave(rs.getString("clave"));
            cliente.setCodigo(rs.getString("codigo"));
            cliente.setCorreoElectronico(rs.getString("correoelectronico"));
            cliente.setDireccion(rs.getString("direccion"));
            cliente.setIdentificacion(rs.getString("indentificacion"));
            cliente.setNombres(rs.getString("nombres"));
            cliente.setTelefonoLocal(rs.getString("telefonolocal"));
            cliente.setUsuario(rs.getString("usuario"));
                        
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return cliente;

    }
    
    public List<Cliente> findAll() {
        // Sample code
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        Cliente cliente = new Cliente();
        List<Cliente> listcliente = new ArrayList<Cliente>();
        
        try{
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/trabajo" + "user=postgres&password=postgres");
            // 3. Creates the cliente in the database
            stmt = conn.createStatement();
            rs=stmt.executeQuery("SELECT * FROM cliente ");
            rs.next();
            
            while(rs.next()){
                cliente.setApellidos(rs.getString("apellidos"));
                cliente.setCelular(rs.getString("celular"));
                cliente.setClave(rs.getString("clave"));
                cliente.setCodigo(rs.getString("codigo"));
                cliente.setCorreoElectronico(rs.getString("correoelectronico"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setIdentificacion(rs.getString("indentificacion"));
                cliente.setNombres(rs.getString("nombres"));
                cliente.setTelefonoLocal(rs.getString("telefonolocal"));
                cliente.setUsuario(rs.getString("usuario"));
                listcliente.add(cliente);
            }
        
        }catch (SQLException ex) {
            Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listcliente;
    }
}






