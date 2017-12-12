<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<title>Banana GEST | Login</title>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
		<link rel="stylesheet" type="text/css" href="login.css">
	</head>
	<body>
		<header class="container-fluid">			
			<div class="row">
				<div class="register col-xs-4 col-sm-4 col-md-4 col-lg-4"><span><img src="bananas.png"> Welcome to BananaGEST!</span></div>
				<div class="col-xs-4 col-sm-4 col-md-4 col-lg-4"><h1>Banana GEST</h1></div>
				<div class="register col-xs-4 col-sm-4 col-md-4 col-lg-4"><h4><a href="#">Registrarse</a></h4></div>
			</div>		
		</header>
		<main class="container-fluid">
			<div class="row">
				<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
					<img id= "bananas" src="bananas_grande.png"/>
					<form action="home_usuario.html" method="get" id="formulario">
						<p id="error"></p>
						<div class="intro_user">
							<img class="alinear" src="user.png"/>
							<input type="text" placeholder="User" maxlength="8" required="true" autofocus/>
						</div>
						<div class="intro_user">
							<img class="alinear" src="lock.png"/>
							<input type="password" placeholder="Password" maxlength="12" minlength="6" required="true"/>
						</div>
						<div class="intro_user">
						<a class="password" href="#">He olvidado mi contraseña</a>
						</div>	
						<div class="intro_user">
							<button onclick="validar()">Log In</button>
						</div>
					</form>										
					<div class="intro_user">
						<a href="https://twitter.com/?lang=es">
						<img src="twitter.png"/>
						</a>
						<a href="https://es-es.facebook.com/">
						<img src="facebook.png"/>
						</a>
						<a href="https://es.linkedin.com/">
						<img src="linkedin.png"/>	
						</a>
						<a href="https://www.instagram.com/?hl=es">
						<img src="instagram.png"/>
						</a>
						<img src="share.png"/>
					</div>
				</div>
			</div>
		</main>
		<footer class="container-fluid">
			<div class="row">
				<span class="col-xs-12 col-sm-12 col-md-12 col-lg-12">Banana GEST - Todos los derechos reservados</span>
			</div>
		</footer>
		<script>
			function validar(){
				var inpObj = document.getElementById("formulario");
				if (inpObj.checkValidity() == false) {
					document.getElementById("error").innerHTML = "Usuario o contraseña incorrectos. Por favor, vuelve a introducirlos";
					document.getElementById("error").style.backgroundColor = "gainsboro";
					document.getElementById("error").style.color = "red";
					document.getElementById("error").style.textSize = "1.5em";
					document.getElementById("error").style.borderRadius = "5px";
					document.getElementById("error").style.borderStyle = "solid";
					document.getElementById("error").style.borderColor = "goldenrod";
					document.getElementById("error").style.marginLeft= "20%";
					document.getElementById("error").style.marginRight= "20%";
				}
			}
		</script>
	</body>
</html>