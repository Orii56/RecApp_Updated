<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="utf-8">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">


<title>Test Rapido</title>

<meta content="width=device-width, initial-scale=1.0" name="viewport">
<meta content="" name="keywords">
<meta content="" name="description">

<!-- ICONO DE LA PESTANA DEL NAVEGADOR -->
<link href="img/_miniLogo.png" rel="icon">

<!-- Favicons -->
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

<!-- Template Main CSS File -->
<link href="style.css" rel="stylesheet">

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
						style="max-width: 420px; position: relative; left: 10px;">
						<h2 class="mb-4" style="color: white;">
							¿Cómo realizar el <br>test rápido?
						</h2>
						<p class="mb-4" style="color: white;">Para obtener del TRIE un
							resultado correcto es importante que leas y sigas estas sencillas
							instrucciones:</p>
						<p class="mb-4" style="color: white;">En cada uno de los dos
							grupos elige el parrafo que refleje mejor tus actitudes y tu
							comportamiento en general segun tu forma de ser la mayor parte de
							tu vida.</p>
						<p class="mb-4" style="color: white;">No es necesario que
							estes totalmente de acuerdo con cada palabra del parrafo. Pero si
							deberias identificarte con el tono en general.</p>

						<p class="mb-4" style="color: white;">La idea general y el
							sentimiento del parrafo en su conjunto es mas importante que sus
							elementos individuales.</p>
					</div>

					<div
						style="text-align: center; padding: 40px 80px 40px 80px; min-width: 400px; position: absolute; left: 720px; bottom: 75px; background-color: rgba(255, 255, 255); border-radius: 20px; box-shadow: 10px -2px 22px -4px rgba(0, 0, 0, 0.2);">
						<h4 class="mb-4" style="color: grey;">Grupo 1</h4>
						<ul style="list-style-type: none; margin-left: -35px;">
							<li style="text-align: center;"><span
								style="color: steelblue; font-size: 25px; font-weight: 500;">A</span>
							</li>
							<li style="text-align: center;"><span
								style="color: steelblue; font-size: 25px; font-weight: 500;">B</span>
							</li>
							<li style="text-align: center;"><span
								style="color: steelblue; font-size: 25px; font-weight: 500;">C</span>
							</li>
						</ul>
						<br>
						<h4 class="mb-4" style="color: grey;">Grupo 2</h4>
						<ul style="list-style-type: none; margin-left: -35px;">
							<li style="text-align: center;"><span
								style="color: steelblue; font-size: 25px; font-weight: 500;">X</span>
							</li>
							<li style="text-align: center;"><span
								style="color: steelblue; font-size: 25px; font-weight: 500;">Y</span>
							</li>
							<li style="text-align: center;"><span
								style="color: steelblue; font-size: 25px; font-weight: 500;">Z</span>
							</li>
						</ul>

					</div>

				</div>
				<p style="margin-left: -10px; margin-top: 15px;">
					<a class="registro btn btn-outline-white"
						href="GestionPreguntas?option=rapido">test</a>
				</p>
			</div>

		</div>
		</main>
	</div>




</body>
</html>