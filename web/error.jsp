<%-- 
    Document   : newjsp
    Created on : 29-07-2020, 0:33:58
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
        <title>Error</title>
    </head>
    <body>
    <body>


        <div class="row">
            <div class="col s6 offset-s3" >
                <div class="card-panel z-depth-5">
                    <center>     <h5>Error</h5> </center> 
                    <br>
                    <form action="index.jsp" method="post">
                          <div class="card-panel purple lighten-5 center-align" >Error de Usuario, volver a intentar</div>

                       
                        <center> <button name="bt" value="1" type="submit" class="btn center-align">
                                Inicio
                            </button></center>
                        <br>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
