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
</head>
<body>
<s:include value="include/menu.jsp"/>
<!-- Inicio cabezera de escritorio -->

<!-- Fin cabezera de escritorio -->
<!-- INICIO CONTENIDO -->
<div class="container">
    <div class="row">
        <h1 class="text-center">Generar Obligación de Pago</h1>
    </div>
</div>
<%--Inicio Cabezera de formulario--%>
<div class="container">
    <div class="row">
        <form action="cargarCuotasObligacion.action" class="form-horizontal" name="" method="post">
            <div class="form-group col-sm-6">
                <label class="col-sm-4 control-label" for="selectSocio">Socio</label>
                <div class="col-sm-8">
                    <select class="form-control" id="selectSocio" name="socioBean.idSocio">
                        <s:iterator value="listaSocio">
                            <option
                                    <s:if test="socioBean.idSocio == idSocio">
                                        selected
                                    </s:if>

                                    value="<s:property value="idSocio"/>"><s:property value="apellidoSocio"/>,
                                <s:property value="nombreSocio"/></option>
                        </s:iterator>
                    </select>
                </div>
            </div>
            <div class="form-group col-sm-6">
                <label class="col-sm-4 control-label" for="selectProducto">Producto</label>
                <div class="col-sm-8">
                    <select class="form-control" id="selectProducto" name="productoBean.idProducto">
                        <s:iterator value="listaProducto">
                            <option
                                    <s:if test="productoBean.idProducto == idProducto">
                                        selected
                                    </s:if>

                                    value="<s:property value="idProducto"/>"><s:property
                                    value="nombreProducto"/></option>
                        </s:iterator>
                    </select>
                </div>
            </div>
            <div class="form-group col-sm-6">
                <label class="col-sm-4 control-label" for="selectCuotas">Cuotas Mensuales</label>
                <div class="col-sm-8">
                    <select class="form-control" id="selectCuotas" name="obligacionBean.numeroCuotasObligacion">
                        <option value="12">12 Meses</option>
                        <option
                                <s:if test="obligacionBean.numeroCuotasObligacion == 18">
                                    selected
                                </s:if>

                                value="18">18 Meses
                        </option>
                    </select>
                </div>
            </div>
            <div class="form-group text-center">
                <div class="col-sm-offset-3 col-sm-6">
                    <button type="submit" class="btn btn-default btn-lg btn-block btn-success">Ver Cuotas</button>
                </div>
            </div>

            <hr class="divider"/>

            <div class="text-center">
                <div class="col-sm-offset-3 col-sm-6">
                    <p><s:property value="tasaProducto"/></p>
                </div>
            </div>
            <table id="tabla" class="table table-bordered table-hover">
                <thead>
                <tr>
                    <th>Número</th>
                    <th>Monto</th>
                    <th>Fecha de Pago</th>
                </tr>
                </thead>
                <s:iterator value="listaCuota">
                    <tr>
                        <td><s:property value="idCuota"/></td>
                        <td>$ <s:property value="montoCuota"/></td>
                        <td><s:property value="fechaPagoCuota"/></td>
                    </tr>
                </s:iterator>
            </table>
        </form>
    </div>
</div>
<!-- FIN CONTENIDO -->
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.min.js"></script>
</body>
</html>

