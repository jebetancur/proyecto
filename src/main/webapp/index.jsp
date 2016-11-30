<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Proyecto Final</title>
    </head>
    <body>
        <h1>Opciones</h1>
        Cliente <form action="${pageContext.request.contextPath}/pryServlet" method="post"/><input type="submit" value="servlet"/></form>.
        Factura <form action="${pageContext.request.contextPath}/pryServlet" method="post"/><input type="submit" value="servlet"/></form>.
        Producto <form action="${pageContext.request.contextPath}/pryServlet" method="post"/><input type="submit" value="servlet"/></form>.
    </body>
</html>
