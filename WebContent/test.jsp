<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta http-equiv='Content-Type' content='text/html; charset=iso-8859-1'>
<meta charset="UTF-8">

<link rel="stylesheet" href="style.css">

<title>Test Completo</title>

<meta content="width=device-width, initial-scale=1.0" name="viewport">
<meta content="" name="keywords">
<meta content="" name="description">

<!-- Favicons -->
<link href="img/_miniLogo.png" rel="icon">
<link href="img/apple-touch-icon.png" rel="apple-touch-icon">

<!-- Google Fonts -->
<link
	href="https://fonts.googleapis.com/css?family=Poppins:300,400,700|Roboto:300,400,700&display=swap"
	rel="stylesheet">

<!-- Bootstrap CSS File -->
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Vendor CSS Files -->
<link href="vendor/icofont/icofont.min.css" rel="stylesheet">
<link href="vendor/line-awesome/css/line-awesome.min.css"
	rel="stylesheet">
<link href="vendor/aos/aos.css" rel="stylesheet">
<link href="vendor/owlcarousel/assets/owl.carousel.min.css"
	rel="stylesheet">

<script type="text/javascript">
	function preback() {
		window.history.forward();
	}
	setTimeout("preback()", 0);
	window.onunload = function() {
		null;
	}
</script>



</head>
<body>
	<div class="site-wrap">

		<div class="site-mobile-menu site-navbar-target">
			<div class="site-mobile-menu-header">
				<div class="site-mobile-menu-close mt-3">
					<span class="icofont-close js-menu-toggle"></span>
				</div>
			</div>
			<div class="site-mobile-menu-body"></div>
		</div>

		<main id="viewPort"> <header
			class="site-navbar js-sticky-header site-navbar-target" role="banner">
			<div class="container">
				<div class="row align-items-center">

					<div class="col-6 col-lg-2">
						<h1 class="mb-0 site-logo">
							<a href="indexUsu.jsp" class="mb-0">RecApp</a>
						</h1>
					</div>

					<div class="col-12 col-md-10 d-none d-lg-block">
						<nav class="site-navigation position-relative text-right"
							role="navigation">

							<ul
								class="site-menu main-menu js-clone-nav mr-auto d-none d-lg-block">
								<li></li>
								<li></li>
								<li></li>
								<li><a href="Login?option=cerrar-test" class="registrarse"
									onclick="cerrarTest()">cerrar test</a></li>
							</ul>
						</nav>
					</div>

					<div class="col-6 d-inline-block d-lg-none ml-md-0 py-3"
						style="position: relative; top: 3px;">

						<a href="#" class="burger site-menu-toggle js-menu-toggle"
							data-toggle="collapse" data-target="#main-navbar"> <span></span>
						</a>
					</div>

				</div>
			</div>
		</header>


		<div class="site-section pb-0">
			<div class="container">
				<div class="row align-items-center ">

					<div class="mr-auto"
						style="max-width: 400px; position: relative; left: 10px;">
						<h2 class="mb-4" style="color: white;">¿Cómo realizar el test
							completo?</h2>
						<p class="mb-4" style="color: white;">Hay nueve tipos de
							eneagramas. El Reformador, el Ayudador, el Triunfador, el
							Individualista, el Investigador, el Leal, el Entusiasta, el
							Desafiador y el Pacificador</p>
						<p class="mb-4" style="color: white;">Por cada eneagrama se
							realizaran cinco preguntas.</p>
						<p class="mb-4" style="color: white;">Cada pregunta tiene que
							ser evaluada con puntos del 1 al 5 segun sean verdaderas o
							aplicables a ti.</p>
						<p class="mb-4" style="color: white;">No se puede dejar
							ninguna pregunta sin responder.</p>
						<p class="mb-4" style="color: white;">Puedes encontrar el
							sistema de puntuación en la tabla de la derecha.</p>
					</div>

					<div
						style="padding: 40px 80px 40px 80px; max-width: 400px; position: absolute; left: 720px; bottom: 50px; background-color: rgba(255, 255, 255); border-radius: 20px; box-shadow: 10px -2px 22px -4px rgba(0, 0, 0, 0.2);">
						<h6 class="mb-4" style="color: grey; text-align: center;">Pon puntos, de 1 a 5, a
							cada una de las afirmaciones siguientes, según sean verdaderas o
							aplicables a ti.</h6>
						<ul style="list-style-type: none; margin-left: -35px;">
							<li style="text-align: center;"><span
								style="color: steelblue; font-size: 25px; font-weight: 500;">...
									1 ...</span>
								<p style="color: steelblue; font-size: 12px;">nunca</p></li>
							<li style="text-align: center;"><span
								style="color: steelblue; font-size: 25px; font-weight: 500;">...
									2 ...</span>
								<p style="color: steelblue; font-size: 12px;">rara vez</p></li>
							<li style="text-align: center;"><span
								style="color: steelblue; font-size: 25px; font-weight: 500;">...
									3 ...</span>
								<p style="color: steelblue; font-size: 12px;">quizas</p></li>
							<li style="text-align: center;"><span
								style="color: steelblue; font-size: 25px; font-weight: 500;">
									... 4 ...</span>
								<p style="color: steelblue; font-size: 12px;">normalmente</p></li>
							<li style="text-align: center;"><span
								style="color: steelblue; font-size: 25px; font-weight: 500;">...
									5 ...</span>
								<p style="color: steelblue; font-size: 12px;">siempre</p></li>
						</ul>

					</div>

				</div>
				<p style="margin-left: -10px; margin-top: 15px;">
					<a class="registro btn btn-outline-white"
						href="GestionPreguntas?option=question">test</a>
				</p>
			</div>

		</div>
		</main>
	</div>




</body>
</html>