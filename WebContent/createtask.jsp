<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<jsp:useBean id="saveTask" class="com.generation.jwd.p1.beans.TaskBean" scope="request"></jsp:useBean>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Crear tarea | Banana GEST</title>
        <link rel="stylesheet" type="text/css" href="createtask.css">
    </head>
    <body>
        <header>
            <div class="head"><img src="images/profile.png" width="55" height="55"><h3>Bienvenido/a (User)</h3>
            <a href="#">Editar perfil</a></div>
            <div class="head"><h1>Banana GEST</h1><a href="homeuser.jsp"><img src="images/bananas_medio.png"/></a></div>
            <div class="head"><h4><a href="login.jsp">Logout</a></h4></div>
        </header>
        <h2>Registro de nueva tarea</h2>
        <hr>
        <main>
            <form method="post" action="createtask" id = "formtask">
                <p>
                    <table id="basic">
                        <tr class="contenttable">
                            <th class="namecontent">
                                Nombre de la tarea
                            </th>
                            <th class="contenttable">
                                <input style="background-color:#F5BFB2;" type="text" placeholder="Nombre de la tarea" required="true"
                                name="nameTask" autofocus/>
                            </th>
                        </tr>
                        <tr>
                            <th class="namecontent">
                                Descripci�n de la tarea
                            </th>
                            <th class="contenttable">
                                <textarea name="description" required="true" rows="15" cols="60"></textarea>
                            </th>
                        </tr>
                        <tr>
                            <th class="namecontent">
                                Notas
                            </th>
                            <th class="contenttable">
                                <textarea name="notes" required="true" rows="15" cols="60"
                                 ></textarea>
                            </th>
                        </tr>
                        <tr>
                            <th class="namecontent">
                                A�adir archivos adjuntos de la tarea
                            </th>
                            <th class="contenttable">
                                <input id="attached" type="file" placeholder="Nombre de la tarea" name="adjunto" />
                            </th>
                        </tr>
                        <tr>
                            <th class="namecontent">
                                Fecha de inicio / Fecha de fin
                            </th>
                            <th class="contenttable">
                                <input id="dateform" type="date" name="date" required="true"/>
                                 hasta 
                                <input id="dateform" type="date" name="dateFinish" required="true"/> 
                            </th>
                        </tr>
                        <tr>
                            <th class="namecontent">
                                Responsable
                            </th>
                            <th class="contenttable">
                                <select  class="selectionbuton" name="responsable" required="true">
                                    <option>---Elige una opci�n---</option>
                                    <option>Juan Maria</option>
                                    <option>Jerges Gonzalez</option>
                                    <option>Rub�n L�pez</option>
                                    <option>David Bisbal</option>
                                    <option>Chenoa</option>
                                </select>
                            </th>
                        </tr>
                        <tr>
                            <th class="namecontent">
                                Prioridad de la tarea
                            </th>
                            <th class="contenttable">
                                <select class="selectionbuton" name="priority" required="true">
                                    <option>---Elige una opci�n---</option>
                                    <option>Muy baja</option>
                                    <option>Baja</option>
                                    <option>Media</option>
                                    <option>Alta</option>
                                    <option>Muy alta</option>
                                </select>
                            </th>
                        </tr>
                        <tr>
                            <th class="namecontent">
                                Asociada al proyecto
                            </th>
                            <th class="contenttable">
                                <select class="selectionbuton" name="proyecto_asociado">
                                    <option>---Elige una opci�n---</option>
                                    <option>Proyecto 1</option>
                                    <option>Proyecto 2</option>
                                    <option>Proyecto 3</option>
                                    <option>Proyecto 4</option>
                                    <option>Proyecto 5</option>
                                </select>
                            </th>
                        </tr>
                        <tr>
                            <th class="namecontent">
                                Estado
                            </th>
                            <th class="contenttable">
                                <select  class="selectionbuton" name="status" required="true">
                                    <option value="">---Elige una opci�n---</option>
                                    <option value="1">Acabado</option>
                                    <option value="2">Sin empezar</option>
                                    <option value="3">En curso</option>
                                </select>
                            </th>
                        </tr>
                    </table>
                </p>
                <div id="boton">
                    <button onclick = "validar()" style="width:200px; height:50px;">Crear Tarea</button>
                    <button onclick = "cancelar()" name="cancel_task" value="Cancelar tarea" style="width:200px; height:50px;">Cancelar Tarea</button>
                </div>
            </form>
        </main>
        <footer>
            <span>Banana GEST - Todos los derechos reservados</span>
        </footer>
        <script>
            function validar(){
                var inpObj = document.getElementById("formtask");
                if (inpObj.checkValidity() == false) {
                    alert("Task has not created")
                } else{ 
                    alert("Task has been created")
                }            
            }
        </script>
    </body>
    </html>