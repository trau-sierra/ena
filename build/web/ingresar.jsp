<%-- 
    Document   : ingresar
    Created on : 20-07-2020, 19:52:47
    Author     : Usuario
--%>
<%@page import="java.util.List"%>
<%@page import="conexion.*"%>
<%@page import="modelo.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

        <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <script>bdocument.addEventListener('DOMContentLoaded', function () {
                var elems = document.querySelectorAll('select');
                var instances = M.FormSelect.init(elems);
            });</script> 
        <!--Import Google Icon Font-->
        <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Import materialize.css-->
        <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingresar Requerimiento</title>
    </head>
    <body>
    <body>


        <div class="row">
            <div class="col s6 offset-s3" >
                <div class="card-panel z-depth-5">
                    <center>     <h5>Ingresar Requerimiento</h5> </center> 
                    <br>
                    <form action="ingresar_req" method="post">
                        <div  class="input-field">
                            <label>Gerencia:</label>
                            <br><br>

                            <select name="gerencias" class="browser-default rigth" id="gerencias" >
                                <option value="" disabled selected>Seleccione gerencia</option>
                                <% List<Gerencias> consultarGerencias = (List<Gerencias>) request.getAttribute("lista");
                                 if (consultarGerencias != null)
                                     for (Gerencias c : consultarGerencias) {%>
                                <option name="gerencias" id="gerencias" value="<%=c.getNombre()%>"><%=c.getNombre()%></option>
                                <%} %>
                            </select>

                        </div>

                        <div class="input-field">
                            <label>Departamento:</label>
                            <br><br>

                            <select name="departamentos" class="browser-default rigth" id="departamentos" >
                                <option value="" disabled selected>Seleccione departamento</option>
                                <% List<Departamentos> consultarDepartamentos = (List<Departamentos>) request.getAttribute("list");
                                 if (consultarDepartamentos != null)
                                     for (Departamentos c : consultarDepartamentos) {%>
                                <option name="departamentos" id="departamentos" value="<%=c.getNombre()%>"><%=c.getNombre()%></option>
                                <%} %>
                            </select>
                        </div>
                        <div class="input-field">
                            <label>Asignar a:</label>
                            <br><br>

                            <select name="asignaciones" class="browser-default rigth" id="asignaciones" >
                                <option value="" disabled selected>Seleccione asignación</option>
                                <% List<Asignaciones> consultarAsignaciones = (List<Asignaciones>) request.getAttribute("lis");
                                 if (consultarAsignaciones != null)
                                     for (Asignaciones c : consultarAsignaciones) {%>
                                <option name="asignaciones" id="asignaciones" value="<%=c.getNombre()%>"><%=c.getNombre()%></option>
                                <%} %>
                            </select>
                        </div>
                        <div class="input-field">
                            <label>Encargado:</label>
                            <br><br>

                            <select name="encargados" class="browser-default rigth" id="encargados" >
                                <option value="" disabled selected>Seleccione encargado</option>
                                <% List<Encargados> consultarEncargados = (List<Encargados>) request.getAttribute("li");
                                 if (consultarEncargados != null)
                                     for (Encargados c : consultarEncargados) {%>
                                <option name="encargados" id="encargados"  value="<%=c.getNombre()%>"><%=c.getNombre()%></option>
                                <%}%>
                            </select>
                        </div>
                        <div class="input-field">
                            <textarea id="requerimiento" name="requerimiento" class="materialize-textarea"></textarea>
                            <label for="textarea1">Requerimiento</label>
                        </div>
                        <br><br>
                        <button name="btn" value="1" type="submit" class="btn center-align orange ">Guardar </button>
                    </form>
                       <br><br>
                    <a href="menu.jsp" class="waves-effect waves-light cyan btn">Volver al Menú</a>
                    <br>

                </div>
            </div>
        </div>
    </body>
</html>