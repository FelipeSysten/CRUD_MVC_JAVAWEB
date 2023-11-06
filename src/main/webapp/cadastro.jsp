<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Explore Tour</title>
    <!--Favicton-->
    <link rel="shortcut icon" href="faciton.PNG" type="image/x-icon">
    <!--CSS file-->
    <link rel="stylesheet" href="/css/style.css">
    <!--Bootstrap 5-->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.0.1/css/bootstrap.rtl.min.css">
    <!--Icone cdn-->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.min.css">

        <!-- Google Web Fonts -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600&family=Nunito:wght@600;700;800&display=swap" rel="stylesheet">


    <link href="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.carousel.min.css" rel="stylesheet">
  
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet"
		integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
    <!-- Inclua o link para o Bootstrap via CDN -->
<link rel="icon" type="image/x-icon" href="./icon/favicon.ico">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<title>Create</title>
</head>
<body>

 <header>
<!-- =================== NAVBAR =================== -->
        <!-- Topbar Start -->
        <div class="container-fluid bg-dark px-5 d-none d-lg-block">
            <div class="row gx-0">
                <div class="col-lg-8 text-center text-lg-start mb-2 mb-lg-0">
                    <div class="d-inline-flex align-items-center" style="height: 45px;">
                        <small class="me-3 text-light"><i class="fa fa-map-marker-alt me-2"></i> Itabuna, Bahia, Brasil</small>
                        <small class="me-3 text-light"><i class="fa fa-phone-alt me-2"></i> +55 73 98843-3532</small>
                        <small class="text-light"><i class="fa fa-envelope-open me-2"></i> systen3@gmail.com</small>
                    </div>
                </div>
                <div class="col-lg-4 text-center text-lg-end">
                    <div class="d-inline-flex align-items-center" style="height: 45px;">
                        <a class="btn btn-sm btn-outline-light btn-sm-square rounded-circle me-2" href="https://www.facebook.com/profile.php?id=100090629080788"><i class="fab fa-facebook-f fw-normal"></i></a>
                        <a class="btn btn-sm btn-outline-light btn-sm-square rounded-circle me-2" href="https://www.linkedin.com/in/felipe-souza-746ab8142/"><i class="fab fa-linkedin-in fw-normal"></i></a>
                        <a class="btn btn-sm btn-outline-light btn-sm-square rounded-circle me-2" href="https://www.instagram.com/liipedesigner/"><i class="fab fa-instagram fw-normal"></i></a>
                        
                    </div>
                </div>
            </div>
        </div>
        <!-- Navbar & Hero Start -->
    <div class="container-fluid position-relative p-0">
        <nav class="navbar navbar-expand-lg navbar-light px-4 px-lg-5 py-3 py-lg-0">
            <a href="index.html" class="navbar-brand p-0">
                <h1 class="text-primary m-0"><i class="fa fa-map-marker-alt me-3"></i> Explore Tour </h1>
            </a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarCollapse">
                <span class="fa fa-bars"></span>
            </button>
            <div class="collapse navbar-collapse me-5" id="navbarCollapse">
                <div class="navbar-nav ms-auto py-0">
                    <a href="index.html" class="nav-item nav-link active">Home</a>
                    <a href="#sobre" class="nav-item nav-link">Sobre</a>
                    <a href="#servico" class="nav-item nav-link">Serviços</a>
                    <a href="#promocao" class="nav-item nav-link">Promoções</a>
                    <div class="nav-item dropdown">
                        <a href="ReadController" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">Destinos</a>
                        <div class="dropdown-menu m-0">
                            <a href="#destino" class="dropdown-item">Destino</a>
                            <a href="ReadController" class="dropdown-item">Reserva</a>
                            <a href="#guia" class="dropdown-item">Guia de Viagem</a>
                            <a href="#testemunha" class="dropdown-item">Testemunhos</a>
                           
                        </div>
                    </div>
                    <a href="#contato" class="nav-item nav-link">Contato</a>
                </div>
                <a href="./cadastro.jsp" class="btn btn-primary rounded-pill py-2 px-4">Registrar</a>
              
            </div>
        </nav>

        
    </div>
    <!-- Navbar & Hero End -->
    <!-- Cabeçalho -->
   
        
    </header>
	<div class="container">
		<div class="row justify-content-center">
			<div class="col-md-6">
				<h1 class="mt-5" >Cadastro de Cliente</h1>
				<form class="mt-5" action="CreateController" method="post">
					<div class="form-group">
						<label for="nome">Nome:</label> <input type="text"
							class="form-control" id="nome" name="nome" required>
					</div>
					<div class="form-group">
						<label for="login">Login:</label> <input type="text"
							class="form-control" id="login" name="login" required>
					</div>
					<div class="form-group">
						<label for="senha">Senha:</label> <input type="password"
							class="form-control" id="senha" name="senha" required>
					</div>
					<div class="form-group">
						<label for="dataNasc">Data de Nascimento:</label> <input
							type="date" class="form-control" id="dataNasc"
							name="dataNasc" required>
					</div>
					<button type="submit" class="btn btn-primary">Cadastrar</button>
				</form>
			</div>
		</div>
	</div>
	 <!-- Rodapé -->
    

    <!-- Rodapé -->
    <footer class="bg-dark text-light text-center py-3 fixed-bottom">
       <div class="container">
            <div class="copyright">
                <div class="row">
                    <div class="col-md-6 text-center text-md-start mb-3 mb-md-0">&copy; <a href="" class="border-bottom">Felipe Souza</a> Todos os direitos reservados</div>
                    <div class="col-md-6 text-center text-md-end">
                        <div class="footer-menu">
                            <a href="" class="">Home</a>
                            <a href="" class="">Cookies</a>
                            <a href="" class="">Ajuda</a>
                            <a href="" class="">FQAs</a>
                        </div>
                    </div>
                </div>
            </div>
          </div>

    </div>
    </footer>


	<!-- Inclua os scripts do Bootstrap via CDN -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>