<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
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
</head>
<body>
<s:include value="include/menu.jsp"/>
<!-- Inicio cabezera de escritorio -->
<!-- Fin cabezera de escritorio -->
<!-- INICIO CONTENIDO -->
<!-- Inicio cabezera -->
<div class="container">
    <div class="row">
        <h1 class="text-center">Registrar Nuevo Producto</h1>
        <p class="text-center">Completar el siguiente formulario para registrar un nuevo Perfil de Usuario en el
            Sistema</p>
    </div>
</div>
<!-- Fin cabezera-->
<!-- Inicio Formulario de Registro-->
<div class="container">
    <div class="row">
        <form action="registrarProducto.action" class="form-horizontal" name="" method="POST">
            <div class="form-group">
                <label for="inputNombreProducto" class="col-sm-4 control-label">Nombre de Producto</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="inputNombreProducto" placeholder="Nombre Producto"
                           name="productoBean.nombreProducto" required>
                </div>
            </div>
            <div class="form-group">
                <label for="inputPrecioProducto" class="col-sm-4 control-label">Precio de Producto</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="inputPrecioProducto" placeholder="Precio Producto"
                           name="productoBean.precioProducto" required>
                </div>
            </div>
            <div class="form-group">
                <label for="inputDescripcionProducto" class="col-sm-4 control-label">Descripción</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="inputDescripcionProducto" placeholder="Descripcion"
                           name="productoBean.descripcionProducto" required>
                </div>
            </div>
            <div class="form-group">
                <label for="inputTasaProducto" class="col-sm-4 control-label">Tasa Anual Producto</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="inputTasaProducto" placeholder="Tasa Producto"
                           name="productoBean.tasaProducto" required>
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-4 col-sm-4">
                    <button type="submit" class="btn btn-default btn-lg btn-block btn-primary">Registrar</button>
                    <button type="reset" class="btn btn-default btn-lg btn-block btn-default">Limpiar</button>
                </div>
            </div>
        </form>
    </div>
</div>
<s:if test="%{#estadoRegistro}">
    <div class="container container-fluid">
        <div class="row">
            <div class="alert alert-success ">
                <strong>Reistro Exitoso!</strong> Producto Registrado Correctamente.
            </div>
        </div>
    </div>
</s:if>

<!-- Fin Formulario de Registro -->
<!-- FIN CONTENIDO -->
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.min.js"></script>
</body>
</html>

