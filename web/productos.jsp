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

<!-- Fin cabezera de escritorio -->
<!-- INICIO CONTENIDO -->
<!-- Inicio cabezera -->
<div class="container">
    <div class="row">
        <h1 class="text-center">Productos</h1>
    </div>
</div>
<!-- Fin cabezera-->
<div class="container">
    <div class="row">
        <table id="tabla" class="table table-bordered table-hover">
            <thead>
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>Precio</th>
                <th>Descripción</th>
                <th>Tasa</th>
                <th>Operación</th>
            </tr>
            </thead>
            <s:iterator value="listaProducto">
                <tr>
                    <td><s:property value="idProducto"/></td>
                    <td><s:property value="nombreProducto"/></td>
                    <td><s:property value="precioProducto"/></td>
                    <td><s:property value="descripcionProducto"/></td>
                    <td><s:property value="tasaProducto"/></td>
                    <td>
                        <s:url action="buscarProductoPorID" id="buscarPorID">
                            <s:param name="productoBean.idProducto">
                                <s:property value="idProducto"/>
                            </s:param>
                        </s:url>
                        <s:a href="%{buscarPorID}">
                            <button class="btn btn-primary">
                                <span class="glyphicon glyphicon-edit"></span>
                                Actualizar
                            </button>
                        </s:a>
                        <s:url action="eliminarProducto" id="eliminar">
                            <s:param name="productoBean.idProducto">
                                <s:property value="idProducto"/>
                            </s:param>
                        </s:url>
                        <s:a href="%{eliminar}">
                            <button class="btn btn-danger">
                                <span class="glyphicon glyphicon-remove"></span>
                                Eliminar
                            </button>
                        </s:a>
                    </td>
                </tr>
            </s:iterator>
        </table>
    </div>
</div>
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

