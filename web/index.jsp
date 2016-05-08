<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="viewport" content="width=1,initial-scale=1,user-scalable=1"/>
    <title>Insert title here</title>

    <link href="http://fonts.googleapis.com/css?family=Lato:100italic,100,300italic,300,400italic,400,700italic,700,900italic,900"
          rel="stylesheet" type="text/css">
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="css/styles.css"/>

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>

<section class="container">
    <section class="login-form">
        <form method="post" action="loginUsuario.action" role="login">
            <section>
                <h2>Please sign in</h2>
                <div class="form-group">
                    <div class="input-group">
                        <div class="input-group-addon"><span class="text-primary glyphicon glyphicon-envelope"></span>
                        </div>
                        <input type="email" name="email" placeholder="Email" required class="form-control"/>
                    </div>
                </div>
                <div class="form-group">
                    <div class="input-group">
                        <div class="input-group-addon"><span class="text-primary glyphicon glyphicon-lock"></span></div>
                        <input type="password" name="password" placeholder="Password" required class="form-control"/>
                    </div>
                </div>

                <div class="form-group">
                    <input type="checkbox"/> <!--name="remember" value="1"-->  Remember me
                </div>
                <s:actionerror class="alert alert-danger text-center" id="alert-message"/>
                <button type="submit" class="btn btn-block btn-success">Sign in</button>
            </section>
            <div>
                <a href="#">Forgot password ?</a>
            </div>
        </form>

    </section>
</section>

<script src="js/jquery-1.12.3.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/misFunciones.js"></script>
</body>
</html>
