<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="utf-8">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">


<title>Contacto</title>

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

</head>
<body>

	<div class="site-wrap">

		<div class="site-mobile-menu site-navbar-target">
			<div class="site-mobile-menu-header">
				<div class="site-mobile-menu-close mt-3">
					<span class="icon-close2 js-menu-toggle"></span>
				</div>
			</div>
			<div class="site-mobile-menu-body"></div>
		</div>

		<header class="site-navbar js-sticky-header site-navbar-target"
			role="banner">

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
								<li><a href="Login?option=logout" class="registrarse">log
										out</a></li>
								<li class="active"><a href="#" class="nav-link">contacto</a></li>
								<li><a href="sobreNosotrosUsu.jsp" class="nav-link">nosotros</a></li>
								<li><a href="eneagramasUsu.jsp" class="nav-link">eneagramas</a></li>
								<li><a href="GestionAnuncios?option=anuncios"
									class="nav-link">empleo</a></li>
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


		<main id="main">
		<div class="hero-section inner-page">
			<div class="wave">

				<svg width="1920px" height="265px" viewBox="0 0 1920 265"
					version="1.1" xmlns="http://www.w3.org/2000/svg"
					xmlns:xlink="http://www.w3.org/1999/xlink">
              <g id="Page-1" stroke="none" stroke-width="1" fill="none"
						fill-rule="evenodd">
                  <g id="Apple-TV"
						transform="translate(0.000000, -402.000000)" fill="#FFFFFF">
                      <path
						d="M0,439.134243 C175.04074,464.89273 327.944386,477.771974 458.710937,477.771974 C654.860765,477.771974 870.645295,442.632362 1205.9828,410.192501 C1429.54114,388.565926 1667.54687,411.092417 1920,477.771974 L1920,667 L1017.15166,667 L0,667 L0,439.134243 Z"
						id="Path"></path>
                  </g>
              </g>
          </svg>

			</div>

			<div class="container">
				<div class="row align-items-center">
					<div class="col-12">
						<div class="row justify-content-center">
							<div class="col-md-7 text-center hero-text">
								<h1 data-aos="fade-up" data-aos-delay="">Contáctanos</h1>
								<p class="mb-5" data-aos="fade-up" data-aos-delay="100">
									Si quieres saber más sobre RecApp, o si quieres preguntarnos
									algo, <br>estamos a tu completa disposición
								</p>
							</div>
						</div>
					</div>
				</div>
			</div>

		</div>

		<div class="site-section">
			<div class="container">
				<div class="row mb-5 align-items-end">
					<div class="col-md-6" data-aos="fade-up">

						<h2>Formulario de contacto</h2>
						<p class="mb-0">Introduce tus datos de contacto, escribenos y
							te responderemos lo antes posible.</p>
					</div>

				</div>

				<div class="row">
					<div class="col-md-4 ml-auto order-2" data-aos="fade-up">
						<ul class="list-unstyled">
							<li class="mb-3"><strong class="d-block mb-1">Dirección</strong>
								<span>Julián Camarillo 45, 28029 Madrid España</span></li>
							<li class="mb-3"><strong class="d-block mb-1">Telefono
									de contacto</strong> <span>654577850</span></li>
							<li class="mb-3"><strong class="d-block mb-1">Nuesto
									email</strong> <span>recappjs@gmail.com</span></li>
						</ul>
					</div>

					<div class="col-md-6 mb-5 mb-md-0" data-aos="fade-up">
						<form action="forms/contact.php" method="post" role="form"
							class="php-email-form">

							<div class="row">
								<div class="col-md-6 form-group">
									<label for="name">Nombre</label> <input type="text" name="name"
										class="form-control" id="name" data-rule="minlen:4"
										data-msg="Por favor introduzca al menos 4 caracteres" />
									<div class="validate"></div>
								</div>
								<div class="col-md-6 form-group">
									<label for="name">Email</label> <input type="email"
										class="form-control" name="email" id="email" data-rule="email"
										data-msg="Por favor introduzca un email valido" />
									<div class="validate"></div>
								</div>
								<div class="col-md-12 form-group">
									<label for="name">Asunto</label> <input type="text"
										class="form-control" name="subject" id="subject"
										data-rule="minlen:4"
										data-msg="Por favor escriba al menos 8 caracteres" />
									<div class="validate"></div>
								</div>
								<div class="col-md-12 form-group">
									<label for="name">Mensaje</label>
									<textarea class="form-control" name="message" cols="30"
										rows="10" data-rule="required"
										data-msg="Por favor escriba su mensaje"></textarea>
									<div class="validate"></div>
								</div>


								<div class="col-md-12 mb-3">
									<div class="loading">Cargando</div>
									<div class="error-message"></div>
									<div class="sent-message">¡Su mensaje ha sido enviado!
										Gracias por contactar con RecApp</div>
								</div>

								<div class="col-md-6 form-group">
									<input type="submit" class="btn btn-primary d-block w-100"
										value="Enviar Mensaje">
								</div>
							</div>

						</form>
					</div>

				</div>
			</div>
		</div>
		<div class="container">
			<div class="row justify-content-center text-center mb-5">
				<div class="col-md-4">
					<h2 class="section-heading">Anímate y realiza el test!</h2>
					<p style="margin-top: 50px;">
						<a class="test btn btn-outline-blue"
							href="GestionTest?option=validar">test</a>
					</p>
				</div>
			</div>
		</div>
		<br>
		<br>
		<div class="site-section cta-section">
			<div class="container">
				<div class="row align-items-center">
					<div class="col-md-6 mr-auto text-center text-md-left mb-5 mb-md-0">
						<h2>RecApp está disponible en</h2>
					</div>
					<div class="col-md-5 text-center">
						<p>
							<a href="https://www.apple.com/ios/app-store/" class=""
								target="_blank"> <img style="max-width: 200px;"
								src="img/Apple_Store.png" alt="apple"></img>
							</a>
						</p>
						<p>
							<a href="https://play.google.com/store?hl=es" target="_blank"
								class=""> <img style="max-width: 200px;"
								src="img/Google_Play_badge.png" alt="google"></img></a>
						</p>
					</div>
				</div>
			</div>
		</div>


		<div class="site-section border-top border-bottom">
			<div class="container">
				<div class="row justify-content-center text-center mb-5">
					<div class="col-md-4">
						<h2 class="section-heading">Otras formas de contacto</h2>
					</div>
				</div>
				<div class="row justify-content-center text-center">
					<div class="col-md-7">
						<div class="owl-carousel testimonial-carousel">
							<div class="review text-center">
								<h3>Nuestras redes sociales</h3>
								<blockquote>
									<p>Instagram</p>
								</blockquote>



								<p class="review-user">
									<img src="img/person_1.jpg" alt="Image"
										class="img-fluid rounded-circle mb-3"> <span
										class="d-block"> <span class="text-black">@RecApp</span>
									</span>
								</p>

							</div>

							<div class="review text-center">
								<h3>Nuestras redes sociales</h3>
								<blockquote>
									<p>Twitter</p>
								</blockquote>



								<p class="review-user">
									<img src="img/person_2.jpg" alt="Image"
										class="img-fluid rounded-circle mb-3"> <span
										class="d-block"> <span class="text-black">@RecAppOficial</span>
									</span>
								</p>

							</div>


							<div class="review text-center">
								<h3>Nuestras redes sociales</h3>
								<blockquote>
									<p>Fake Uber</p>
								</blockquote>



								<p class="review-user">
									<img src="img/person_3.jpg" alt="Image"
										class="img-fluid rounded-circle mb-3"> <span
										class="d-block"> <span class="text-black">RecApp</span>
									</span>
								</p>

							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		</main>
		<footer class="footer" role="contentinfo">
			<div class="container">
				<div class="row">
					<div class="col-md-4 mb-4 mb-md-0">
						<h3>Sobre RecApp</h3>
						<p>Herramienta digital para encontrar trabajo en otra área
							profesional para gente que quiere reinventarse y/o cambiar. Está
							app valorara las Soft Skills personales previas importantes para
							el nuevo puesto de trabajo.</p>
						<p class="social">
							<a href="#"><span class="icofont-twitter"></span></a> <a href="#"><span
								class="icofont-facebook"></span></a>
						</p>
					</div>
					<div class="col-md-7 ml-auto">
						<div class="row site-section pt-0">
							<div class="col-md-4 mb-4 mb-md-0"></div>
							<div class="col-md-4 mb-4 mb-md-0">
								<h3>Servicios</h3>
								<ul class="list-unstyled">
									<li><a href="sobreNosotrosUsu.jsp">Equipo</a></li>
									<li><a href="eneagramasUsu.jsp">Eneagramas</a></li>
									<li><a href="GestionTest?option=validar">Test</a></li>
									<li><a href="GestionAnuncios?option=anuncios"
									class="nav-link">Empleo</a></li>
								</ul>
							</div>
							<div class="col-md-4 mb-4 mb-md-0">
								<h3>Descarga RecApp</h3>
								<ul class="list-unstyled">
									<li><a href="https://www.apple.com/ios/app-store/"
										class="" target="_blank">App Store</a></li>
									<li><a href="https://play.google.com/store?hl=es"
										target="_blank" class="">Play Store</a></li>
								</ul>
							</div>
						</div>
					</div>
				</div>

				<div class="row justify-content-center text-center">
					<div class="col-md-7">
						<div class="credits">Designed by Diego / Oriana / Jesus</div>
					</div>
				</div>

			</div>
		</footer>
	</div>
	<!-- .site-wrap -->

	<a href="#" class="back-to-top"><i class="icofont-simple-up"></i></a>

	<!-- Vendor JS Files -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/jquery/jquery-migrate.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
	<script src="vendor/easing/easing.min.js"></script>
	<script src="vendor/sticky/sticky.js"></script>
	<script src="vendor/aos/aos.js"></script>
	<script src="vendor/owlcarousel/owl.carousel.min.js"></script>

	<!-- Template Main JS File -->
	<script src="js/main.js"></script>

</body>



</html>