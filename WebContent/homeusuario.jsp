<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="UTF-8">
		<title>Document</title>
		<link rel="stylesheet" type="text/css" href="homeusuario.css">
	</head>
	<body>
		<header>
			<div class="head"><img src="profile.png" width="55" height="55"><h3>Bienvenido/a (User)</h3>
            <a href="#">Editar perfil</a></div>
            <div class="head"><h1>Banana GEST</h1><a href="home_usuario.html"><img src="bananas_medio.png"/></a></div>
            <div class="head"><h4><a href="login.html">Logout</a></h4></div>    
		</header>
		<main>
			<section class="botones">
				<p>
					<a href="crearproyecto.html">
						<input type="submit" name="boton" value="Crear proyecto" style="width:60%">
					</a>
					<a href="#">
						<img src="add.png" style="width:3%"/>
					</a>
				</p>
				<p>
					<a href="creartarea.html">
						<input type="submit" name="boton" value="Crear tarea" style="width:60%">
					</a>
					<a href="creartarea.html">
						<img src="add.png" style="width:3%"/>
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
					<img src="search.png"/>
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
							</tr>
						</table>
					</p>
				</nav>	
			</sidebar>
			<aside class="botones">
				<a href="https://calendar.google.com/calendar?cid=bGRpaWxlaWIyaDBidm82dWJnYTk3ZmJwNTBAZ3JvdXAuY2FsZW5kYXIuZ29vZ2xlLmNvbQ">
					<iframe src="https://teamup.com/ks09175eafc7c69bf8" frameborder="0" width="100%" height="480"></iframe>
				</a>
			</aside>
		</main>
		<br/>
		<footer>
			<span>Banana GEST - Todos los derechos reservados</span>
		</footer>
	</body>
</html>