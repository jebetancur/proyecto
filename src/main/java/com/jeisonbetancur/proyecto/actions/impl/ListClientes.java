package com.jeisonbetancur.proyecto.actions.impl;

import com.jeisonbetancur.proyecto.actions.CommandResult;
import com.jeisonbetancur.proyecto.actions.ICommand;
import com.jeisonbetancur.proyecto.dao.ClienteDao;
import com.jeisonbetancur.proyecto.dao.ClienteDaoImpl;
import com.jeisonbetancur.proyecto.dto.Cliente;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Sample command action to query all the available products
 * @author wjforero
 */
public class ListClientes implements ICommand {

    @Override
    public CommandResult execute(HttpServletRequest request, HttpServletResponse response) {
        
        CommandResult result = new CommandResult();
        
        try {
// 1. Get the request parameters
            String parameter1 = request.getParameter("paramater1"); // dummy parameter

        // 2. Do something with the data. usually you:
            //    a. Validate the data
            //    b. Delegate business logic
            //    c. Execute presentation logic
            ClienteDao dao = new ClienteDaoImpl();
            List<Cliente> clientes = dao.findAll();
            // store the products in the request, so them can be painted in the view
            request.setAttribute("clienteList", clientes);
            // 3. Finally, returns the command result
            result.setResult("listClientes");
        } catch (Exception e) {
            Logger.getLogger(ListClientes.class.getName()).log(Level.WARNING, null, e);
            result.setErrorCode("ERR");
            result.setErrorMessage(e.getMessage());
            result.setResult("error");
        }
        request.setAttribute("commandResult", result);
        return result;
    }
    
    
    
}
