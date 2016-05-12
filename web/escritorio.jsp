<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Administración</title>
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    <!-- DataTables -->
    <link rel="stylesheet" href="css/jquery.dataTables.min.css">
    <link rel="stylesheet" href="css/jquery.dataTables_themeroller.css">
</head>
<body>
<s:include value="include/menu.jsp"/>
<!-- Inicio cabezera de escritorio -->
<%--<s:actionmessage class="alert alert-success list-unstyled text-center"/>--%>
<s:if test="usuarioBean != null">
    <div class="container">
        <div class="alert alert-success">
            <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
            Bienvenido <strong>@${sessionScope.usuario.perfilUsuario.nombrePerfil} ${sessionScope.usuario.nombreUsuario},${sessionScope.usuario.apellidoUsuario}</strong>
            has ingresado correctamente al Sistema.
        </div>
    </div>
</s:if>

<!-- Fin cabezera de escritorio -->
<!-- INICIO CONTENIDO -->

<!-- FIN CONTENIDO -->
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.min.js"></script>
<!-- DataTables -->
<script src="js/jquery.dataTables.js"></script>
<script src="js/misFunciones.js"></script>
</body>
</html>

