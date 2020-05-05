<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="utf-8">

<link rel="stylesheet" href="style.css">

<title>Test</title>

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
				<span style="color: white;"><c:out
						value="${requestScope.mensaje_error}" /></span>
				<div class="row align-items-center ">
					<a href="test.jsp" style="text-decoration: none;"><div
							class="mr-auto"
							style="min-width: 400px; min-height: 400px; position: relative; padding: 40px 80px 40px 80px; left: 40px; top: 30px; background-color: rgba(255, 255, 255); border-radius: 20px; box-shadow: 10px -2px 22px -4px rgba(0, 0, 0, 0.2);">
							<h4 class="mb-4" style="color: grey; text-align: center;">TEST
								COMPLETO</h4>
							<img src="img/undraw_svg_6.svg" alt="Image" class="img-fluid"
								style="max-width: 300px; margin-top: 40px;">

						</div></a> <a href="testRapido.jsp" style="text-decoration: none;">
						<div
							style="padding: 40px 80px 40px 80px; min-width: 400px; min-height: 400px; position: relative; left: 170px; top: 30px; background-color: rgba(255, 255, 255); border-radius: 20px; box-shadow: 10px -2px 22px -4px rgba(0, 0, 0, 0.2);">
							<h4 class="mb-4" style="color: grey; text-align: center;">TEST
								RÁPIDO</h4>
							<img src="img/undraw_svg_14.svg" alt="Image" class="img-fluid"
								style="max-width: 300px;">

						</div>
					</a>

				</div>

			</div>

		</div>

		<div class="container">
			<div class="row justify-content-center text-center mb-5">
				<div class="col-md-4">

					<span
						style="font-size: 10px; position: relative; top: 25px; color: white;"><i>*Este
							test tiene un porcentaje de acierto del 70%. <br>**Información
							obtenida del libro "La Sabiduría del Eneagrama" de Don Richard
							Riso y Russ Hudson.
					</i></span>
				</div>
			</div>
		</div>
		</main>

	</div>




</body>
</html>