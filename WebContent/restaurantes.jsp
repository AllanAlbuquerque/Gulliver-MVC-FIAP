<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Restaurantes</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
<link rel="stylesheet" href="./restaurantes.css">
</head>
<body>
<header class="restaurante_header  d-flex justify-content-center align-items-center">
  <form class="d-flex justify-content-center align-items-center form">

    <input type="text" class="form-control local" placeholder="Que tipo de restaurante você gosta?*"
      aria-label="Onde você prefere comer?*" required>
      <button class="border border-0 btn_search">
        <img src="./img/icons8-busca-pelo-amor-50.png" alt="Botão para pesquisar">
      </button>
    </div>
  </form>
</header>

<h2 class="mb-4 text-center" id="carousel-heading">MELHORES RESTAURANTES DA REGIÃO</h2>


<article class="hoteis-body container-xxl m-auto">
  <aside class="hotel-image d-none d-xl-block">
    <img src="./img/comida.jpg" alt="Foto com vários pratos de comida diferentes">
  </aside>
  <section class="container-xxl">

    <div class="row">
      <c:forEach items="${restaurantes}" var="restaurante">
      	<div class="col-sm-12 col-md-6 col-lg-4 mb-4">
        	<div class="card shadow-lg">
          		<div class="card-body">
            		<img class="card-img w-100 pb-2" src="${restaurante.imgPath}" alt="${restaurante.nome}">
            		<h5 class="card-title">${restaurante.nome}</h5>
            		<h6 class="card-subtitle mb-2 text-muted">★★★★★</h6>
            		<p class="card-text">${restaurante.cidade}</p>
          		</div>
          		<div class="card-footer text-center">A partir de <f:formatNumber value="${restaurante.preco}" type="currency" currencyCode="BRL" /></div>
        	</div>
      	</div>       
    </c:forEach>
    </div>

  </section>
</article>
</body>
</html>