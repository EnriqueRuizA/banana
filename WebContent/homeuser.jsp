<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="UTF-8">
		<title>Document</title>
		<link rel="stylesheet" type="text/css" href="homeuser.css">
	</head>
	<body method="get" action= "/homeuser">
		<header>
			<div class="head"><img src="images/profile.png" width="55" height="55"><h3>Bienvenido/a ${User}</h3>
            <a href="#">Editar perfil</a></div>
            <div class="head"><h1>Banana GEST</h1><a href="home_usuario.html"><img src="images/bananas_medio.png"/></a></div>
            <div class="head"><h4><a href="login.jsp">Logout</a></h4></div>    
		</header>
		<main>
			<section class="botones">
				<p>
					<a href="">
						<input type="submit" name="boton" value="Crear proyecto" style="width:60%">
					</a>
					<a href="#">
						<img src="images/add.png" style="width:3%"/>
					</a>
				</p>
				<p>
					<a href="createtask.jsp">
						<input type="submit" name="boton" value="Crear tarea" style="width:60%">
					</a>
					<a href="createtask.jsp">
						<img src="images/add.png" style="width:3%"/>
					</a>
				</p>	
				<p>
					<a href="#">
						<input type="submit" name="boton" value="Lista proyectos" style="width:40%">
					</a>
				</p>
			</section>
			<sidebar class="tareas">
				<nav>
					<h2>Tus tareas</h2>
					<img src="images/search.png"/>
					<input type="text" name="navegador" placeholder="Search"/>
					<p>
						<table id="tabla" border="3" cellspacing="0" cellpadding="2" bordercolor="#666633"/>
							<tr>
								<td>
									<a href="#">Tarea 1</a>
								</td>
							</tr>
							<tr>
								<td>
									<a href="#">Tarea 2</a>
								</td>
							</tr>
							<tr>
								<td>
									<a href="#">Tarea 3</a>
								</td>
							</tr>
							<tr>
								<td>
									<a href="#">Tarea 4</a>
								</td>
							</tr>
							<tr>
								<td>
									<a href="#">Tarea 5</a>
								</td>
								<td>
									<a href="#">${task}</a>
								</td>
						</table>
					</p>
				</nav>	
			</sidebar>
		</main>
		<br/>
		<footer>
			<div class="row">
				<span class="col-xs-12 col-sm-12 col-md-12 col-lg-12">Banana GEST - Todos los derechos reservados</span>
			</div>
		</footer>
	</body>
</html>