<%--
  Created by IntelliJ IDEA.
  User: RUBITO
  Date: 03/05/2016
  Time: 08:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Inserta perfil</title>
  </head>
  <body>
    <form method="post" action="registrarPerfil.action">
      nombre Perfil<input type="text" name="perfilBean.nombrePerfil"><br>
      descripción Perfil<input type="text" name="perfilBean.descripcionPerfil">
      <input type="submit"  value="REGISTRAR">
    </form>
  </body>
</html>
