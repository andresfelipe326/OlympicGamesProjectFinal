<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>DEPORTISTAS</title>
    <link href="resources/css/styles.css" rel="stylesheet" />
</head>
<body>

    <header>
        <div class="logotipo">
            <img src="resources/images/olimpicos3.jpg" width="675" HEIGHT="200" />
        </div>
        <nav>
            <ul>
                <li><a href="index">Inicio</a></li>
                <li><a href="news">Noticias</a></li>
                <li><a href="deportes">Deportes</a></li>
                <li><a href="deportistas">Deportistas</a></li>
                <li><a href="medallero.jsp">Medalleria</a></li>
                <li><a href="paises">Paises</a></li>
                <li><a href="arenas">Arenas</a></li>
            </ul>
        </nav>
    </header>

    <section class="main">
        <section class="articles">
            <article>
                <h2>DEPORTISTAS</h2> 
				 <c:forEach var="dto" items="${command}">
					<h2 class="title">${dto.nomdeportista}</h2>	
					<h3 class="title">${dto.pais}</h3>			
					<img class="imgl" src="${dto.imagedeportista}" width="130" height="130"
						alt="">
					<p>${dto.edad}</p>
					<p>${dto.deporte}</p>
					
				</c:forEach>
				<p></p>
				<p></p>             
            </article>
            <article>
                <h3></h3>
                <p></p>
            </article>
        </section>
        <aside>
            <h3>Recuerda</h3>
            <p>En nuestra pagina vas a encontrar las noticias mas actualizadas y la mejor galeria de fotos, no olvides visitar nuestros links</p>
        </aside>
    </section>
    <footer>
        <p>Creado por Andres Felipe Obando</p>
    </footer>
</body>
</html>