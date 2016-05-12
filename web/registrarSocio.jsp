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
    <script>

    </script>
</head>
<body>
<s:include value="include/menu.jsp"/>
<!-- Inicio cabezera de escritorio -->
<!-- Fin cabezera de escritorio -->
<!-- INICIO CONTENIDO -->
<!-- Inicio cabezera -->
<div class="container">
    <div class="row">
        <h1 class="text-center">Registrar Nuevo Socio</h1>
        <p class="text-center">Completar el siguiente formulario para registrar un nuevo Socio en el Sistema</p>
    </div>
</div>
<!-- Fin cabezera-->
<!-- Inicio Formulario de Registro-->
<div class="container">
    <div class="row">
        <%--Imagen de Socio--%>
        <form action="registrarSocio.action" class="form-horizontal" method="POST">
            <div class="form-group">
                <div class="col-sm-offset-4 col-sm-4">
                    <video id="video" src="images/bg.jpg" class="img-responsive"></video>
                </div>
                <div class="col-sm-4">
                    <canvas id="canvas" class="img-responsive">
                    </canvas>
                    <s:hidden id="photo" name="imagen" value=""/>
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-4 col-sm-4">
                    <button id="startbutton" type="button" class="btn btn-default btn-lg btn-block btn-success">
                        Capturar
                    </button>
                </div>
            </div>
            <%--Nombre de Socio--%>
            <div class="form-group">
                <label for="inputNombreSocio" class="col-sm-4 control-label">Nombre de Socio</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="inputNombreSocio" placeholder="Nombre Socio"
                           name="socioBean.nombreSocio" required>
                </div>
            </div>
            <%--Apellido Socio--%>
            <div class="form-group">
                <label for="inputApellidoSocio" class="col-sm-4 control-label">Apellidos de Socio</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="inputApellidoSocio" placeholder="Apellidos Socio"
                           name="socioBean.apellidoSocio" required>
                </div>
            </div>
            <%--DNI Socio--%>
            <div class="form-group">
                <label for="inputDNISocio" class="col-sm-4 control-label">DNI de Socio</label>
                <div class="col-sm-4">
                    <input maxlength="6" type="text" class="form-control" id="inputDNISocio" placeholder="DNI Socio"
                           name="socioBean.DNISocio" required>
                </div>
            </div>
            <%--Fecha Nacimiento Socio--%>
            <div class="form-group"> <!-- Date input -->
                <label class="col-sm-4 control-label" for="date">Fecha de Nacimiento</label>
                <div class="col-sm-4">
                    <div class="input-group">
                        <input class="form-control" min="1916-01-01" id="date" name="socioBean.fechaNacimientoSocio"
                               type="date"/>
                        <div class="input-group-addon">
                            <span class="glyphicon glyphicon-calendar"></span>
                        </div>
                    </div>
                </div>
            </div>
            <%--Sexo Socio--%>
            <div class="form-group">
                <label class="col-sm-4 control-label" for="selectSexoSocio">Sexo de Socio</label>
                <div class="col-sm-4">
                    <select class="form-control" id="selectSexoSocio" name="socioBean.sexoSocio">
                        <option value="Masculino">Masculino</option>
                        <option value="Femenino">Femenino</option>
                    </select>
                </div>
            </div>
            <%--Estado Civil Socio--%>
            <div class="form-group">
                <label class="col-sm-4 control-label" for="selectEstadoCivilSocio">Estado Civil de Socio</label>
                <div class="col-sm-4">
                    <select class="form-control" id="selectEstadoCivilSocio" name="socioBean.estadoCivilSocio">
                        <option value="Masculino">Soltero</option>
                        <option value="Femenino">Casado</option>
                    </select>
                </div>
            </div>
            <%--Nombre Conyuge Socio--%>
            <div class="form-group">
                <label for="inputNombreConyugeSocio" class="col-sm-4 control-label">Nombre Conyuge</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="inputNombreConyugeSocio" placeholder="Nombre Conyuge"
                           name="socioBean.nombreConyugeSocio" required>
                </div>
            </div>
            <%--Apellido Conyuge Socio--%>
            <div class="form-group">
                <label for="inputApellidoConyugeSocio" class="col-sm-4 control-label">Apellidos Conyuge</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="inputApellidoConyugeSocio"
                           placeholder="Apellidos Conyuge"
                           name="socioBean.apellidoConyugeSocio" required>
                </div>
            </div>
            <%--Departamento Nacimiento Socio--%>
            <div class="form-group">
                <label for="inputDepartamentoNacimientoSocio" class="col-sm-4 control-label">Departamento Nacimiento
                    Socio</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="inputDepartamentoNacimientoSocio"
                           placeholder="Departamento Nacimiento Socio"
                           name="socioBean.departamentoNacimientoSocio" required>
                </div>
            </div>
            <%--Provincia Nacimiento Socio--%>
            <div class="form-group">
                <label for="inputProvinciaNacimientoSocio" class="col-sm-4 control-label">Provincia Nacimiento
                    Socio</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="inputProvinciaNacimientoSocio"
                           placeholder="Provincia Nacimiento Socio"
                           name="socioBean.provinciaNacimientoSocio" required>
                </div>
            </div>
            <%--Distrito Nacimiento Socio--%>
            <div class="form-group">
                <label for="inputDistritoNacimientoSocio" class="col-sm-4 control-label">Distrito Nacimiento
                    Socio</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="inputDistritoNacimientoSocio"
                           placeholder="Distrito Nacimiento Socio"
                           name="socioBean.distritoNacimientoSocio" required>
                </div>
            </div>
            <%--Departamento Residencia Socio--%>
            <div class="form-group">
                <label for="inputDepartamentoResidenciaSocio" class="col-sm-4 control-label">Departamento Residencia
                    Socio</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="inputDepartamentoResidenciaSocio"
                           placeholder="Departamento Residencia Socio"
                           name="socioBean.departamentoResidenciaSocio" required>
                </div>
            </div>
            <%--Provincia Residencia Socio--%>
            <div class="form-group">
                <label for="inputProvinciaResidenciaSocio" class="col-sm-4 control-label">Provincia Residencia
                    Socio</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="inputProvinciaResidenciaSocio"
                           placeholder="Provincia Residencia Socio"
                           name="socioBean.provinciaResidenciaSocio" required>
                </div>
            </div>
            <%--Distrito Residencia Socio--%>
            <div class="form-group">
                <label for="inputDistritoResidenciaSocio" class="col-sm-4 control-label">Distrito Residencia
                    Socio</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="inputDistritoResidenciaSocio"
                           placeholder="Distrito Residencia Socio"
                           name="socioBean.distritoResidenciaSocio" required>
                </div>
            </div>
            <%--Direccion Residencia Socio--%>
            <div class="form-group">
                <label for="inputDireccionResidenciaSocio" class="col-sm-4 control-label">Dirección Residencia
                    Socio</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="inputDireccionResidenciaSocio"
                           placeholder="Dirección Residencia Socio"
                           name="socioBean.direccionResidenciaSocio" required>
                </div>
            </div>
            <%--Telefono Fijo Socio--%>
            <div class="form-group">
                <label for="inputTelefonoFijoSocio" class="col-sm-4 control-label">Teléfono Fijo Socio</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="inputTelefonoFijoSocio"
                           placeholder="Teléfono Fijo Socio"
                           name="socioBean.telefonoFijoSocio" required>
                </div>
            </div>
            <%--Telefono Movil Socio--%>
            <div class="form-group">
                <label for="inputTelefonoMovilSocio" class="col-sm-4 control-label">Teléfono Móvil Socio</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="inputTelefonoMovilSocio"
                           placeholder="Teléfono Móvil Socio"
                           name="socioBean.telefonoMovilSocio" required>
                </div>
            </div>
            <%--Email Socio--%>
            <div class="form-group">
                <label for="inputEmailSocio" class="col-sm-4 control-label">Email Socio</label>
                <div class="col-sm-4">
                    <input type="email" class="form-control" id="inputEmailSocio" placeholder="Email Socio"
                           name="socioBean.emailSocio" required>
                </div>
            </div>
            <%--ID de Secretaria--%>
            <input type="hidden" name="socioBean.secretaria.idUsuario" value="${sessionScope.usuario.idUsuario}"/>
            <div class="form-group">
                <div class="col-sm-offset-4 col-sm-4">
                    <button type="submit" class="btn btn-default btn-lg btn-block btn-primary">Registrar</button>
                    <button type="reset" class="btn btn-default btn-lg btn-block btn-default">Limpiar</button>
                </div>
            </div>
        </form>
    </div>
</div>

<!-- Fin Formulario de Registro -->
<!-- FIN CONTENIDO -->
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery-1.12.3.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.min.js"></script>
<%--Canvas WebCam--%>
<script src="js/capture.js"></script>

</body>
</html>

