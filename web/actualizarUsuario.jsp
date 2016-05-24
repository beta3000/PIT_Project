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
        <h1 class="text-center">Actualizar Usuario</h1>
        <p class="text-center">Completar el siguiente formulario para actualizar un Usuario en el Sistema</p>
    </div>
</div>
<!-- Fin cabezera-->
<!-- Inicio Formulario de Registro-->
<div class="container">
    <div class="row">
        <form action="actualizarUsuario.action" class="form-horizontal" name="" method="POST">
            <div class="form-group">
                <label for="inputIdUsuario" class="col-sm-4 control-label">ID de Usuario</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="inputIdUsuario" placeholder="ID Usuario"
                           name="usuarioBean.idUsuario" value="<s:property value="usuarioBean.idUsuario"/>" readonly>
                </div>
            </div>
            <div class="form-group">
                <label for="inputNombreUsuario" class="col-sm-4 control-label">Nombre de Usuario</label>
                <div class="col-sm-4">
                    <input value="<s:property value="usuarioBean.nombreUsuario"/>" type="text" class="form-control"
                           id="inputNombreUsuario" placeholder="Nombre Usuario"
                           name="usuarioBean.nombreUsuario" required>
                </div>
            </div>
            <div class="form-group">
                <label for="inputApellidoUsuario" class="col-sm-4 control-label">Apellidos de Usuario</label>
                <div class="col-sm-4">
                    <input value="<s:property value="usuarioBean.apellidoUsuario"/>" type="text" class="form-control"
                           id="inputApellidoUsuario" placeholder="Apellidos Usuario"
                           name="usuarioBean.apellidoUsuario" required>
                </div>
            </div>
            <div class="form-group">
                <label for="inputEmailUsuario" class="col-sm-4 control-label">Email de Usuario</label>
                <div class="col-sm-4">
                    <input value="<s:property value="usuarioBean.emailUsuario"/>" type="email" class="form-control"
                           id="inputEmailUsuario" placeholder="Email Usuario"
                           name="usuarioBean.emailUsuario" required>
                </div>
            </div>
            <div class="form-group">
                <label for="inputPasswordUsuario" class="col-sm-4 control-label">Password de Usuario</label>
                <div class="col-sm-4">
                    <input value="<s:property value="usuarioBean.passwordUsuario"/>" type="text" class="form-control"
                           id="inputPasswordUsuario" placeholder="Password Usuario"
                           name="usuarioBean.passwordUsuario" required>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-4 control-label" for="selectPerfilUsuario">Perfil de Usuario</label>
                <div class="col-sm-4">
                    <select class="form-control" id="selectPerfilUsuario" name="usuarioBean.perfilUsuario.idPerfil">
                        <s:iterator value="listaPerfil">
                            <option
                                    <s:if test="usuarioBean.perfilUsuario.idPerfil == idPerfil">
                                        selected
                                    </s:if>
                                    value="<s:property value="idPerfil"/>"><s:property value="nombrePerfil"/></option>
                        </s:iterator>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-4 col-sm-4">
                    <button type="submit" class="btn btn-default btn-lg btn-block btn-primary">Actualizar</button>
                    <button type="reset" class="btn btn-default btn-lg btn-block btn-default">Limpiar</button>
                </div>
            </div>
        </form>
    </div>
</div>
<%--<s:if test="%{#estadoRegistro}">--%>
<%--<div class="container container-fluid">--%>
<%--<div class="row">--%>
<%--<div class="alert alert-success ">--%>
<%--<strong>Reistro Exitoso!</strong> Perfil Registrado Correctamente.--%>
<%--</div>--%>
<%--</div>--%>
<%--</div>--%>
<%--</s:if>--%>

<!-- Fin Formulario de Registro -->
<!-- FIN CONTENIDO -->
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.min.js"></script>
</body>
</html>

