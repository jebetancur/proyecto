<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina de Error</title>
    </head>
    <body>
        <h1>Lista de Clientes</h1>
        <table>
            <thead>
                <tr>
                    <th>Cliente</th>
                    <th>Nombre</th>
                </tr>
            </thead>
            <tbody>
                <!-- Here the productList variable used in items is the same name 
                used when storing the result in the ListProducts command class-->
                <c:forEach items="${clienteList}" var="cliente">
                    <tr>
                        <!-- Here we use the product variable defined in the for each loop-->
                        <td><c:out value="${cliente.identificacion}"></c:out></td>
                        <td><c:out value="${cliente.toString}"></c:out></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        
    </body>
</html>
