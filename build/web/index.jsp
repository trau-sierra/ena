<%-- 
    Document   : index
    Created on : 20-07-2020, 18:51:04
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

        <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <!--Import Google Icon Font-->
        <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Import materialize.css-->
        <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Autentificación</title>
    </head>
    <body>
    <body>


        <div class="row">
            <div class="col s6 offset-s3" >
                <div class="card-panel z-depth-5">
                    <center>     <h5>Autentificación</h5> </center> 
                    <br>
                    <form action="login" method="post">
                        <div class="input-field">
                            <input id="usuario" type="text" name="usuario" placeholder="Usuario" required="true">
                            <label for="Usuario"></label>
                        </div>

                        <div class="input-field">
                            <input id="pass" type="password" name="pass" placeholder="Contraseña" required="true">
                            <label for="Contraseña"></label>
                            <br>

                        </div>
                        <label>
                            <input class="with-gap" name="login" type="checkbox" value="recordar"  />
                            <span>Recordar</span>
                        </label>
                        <br><br>
                        <center> <button name="bt" value="1" type="submit" class="btn center-align">
                                Ingresar
                            </button></center>
                        <br>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
