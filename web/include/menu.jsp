<%@ taglib prefix="s" uri="/struts-tags" %>
<!-- Inicio Barra de navegación -->
<div class="container-fluid">
    <div class="row">
        <nav class="navbar navbar-default" role="navigation">
            <!-- El logotipo y el icono que despliega el menú se agrupan
                 para mostrarlos mejor en los dispositivos móviles -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse"
                        data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Desplegar navegación</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">Escritorio</a>
            </div>
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            SOCIOS<b class="caret"></b>
                        </a>
                        <ul class="dropdown-menu">
                            <li><a href="#">Ver/Buscar</a></li>
                            <li><a href="registrarSocio.jsp">Registrar</a></li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            OBLIGACIONES DE PAGO<b class="caret"></b>
                        </a>
                        <ul class="dropdown-menu">
                            <li><a href="#">Ver/Buscar</a></li>
                            <li><a href="#">Generar</a></li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            PAGO<b class="caret"></b>
                        </a>
                        <ul class="dropdown-menu">
                            <li><a href="#">Ver/Buscar</a></li>
                            <li><a href="#">Registrar</a></li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            USUARIOS <b class="caret"></b>
                        </a>
                        <ul class="dropdown-menu">
                            <li><a href="<s:url action="listarUsuario"></s:url>">Ver/Buscar</a></li>
                            <li><a href="<s:url action="cargarRegistroUsuario"></s:url>">Registrar</a></li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            PERFILES <b class="caret"></b>
                        </a>
                        <ul class="dropdown-menu">
                            <li><a href="<s:url action="listarPerfil"></s:url>">Ver/Buscar</a></li>
                            <li><a href="registrarPerfil.jsp">Registrar</a></li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            OTROS<b class="caret"></b>
                        </a>
                        <ul class="dropdown-menu">
                            <li><a href="#">Reportes</a></li>
                        </ul>
                    </li>
                </ul>
                <ul class="nav navbar-nav navbar-right" role="navigation">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            ${sessionScope.usuario.nombreUsuario} <b class="caret"></b>
                        </a>
                        <ul class="dropdown-menu">
                            <li><a href="perfil.jsp">Ver Perfil</a></li>
                            <li><a href="#">Editar Perfil</a></li>
                        </ul>
                    </li>
                    <li><a href="<s:url action="logoutUsuario"></s:url>">SALIR</a></li>
                </ul>
            </div>
        </nav>
    </div>
</div>
<!-- Fin Barra de Navegación -->
