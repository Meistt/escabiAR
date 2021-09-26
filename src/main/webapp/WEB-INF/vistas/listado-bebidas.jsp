<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Bebidas</title>
</head>
<body>

    <form class="form-inline my-2 my-lg-0" method="get" action="buscar-bebida">
        <input class="form-control mr-sm-2" name="search" type="search" placeholder="Buscador Bebida" aria-label="Search">
        <button class="btn btn-outline-light my-2 my-sm-0" type="submit">Search</button>
    </form>

    <c:if test="${not empty ERROR}">
        <div class="alert alert-warning" role="alert">
            <p>${ERROR}</p>
        </div>
    </c:if>


    <div class="row align-items-center d-flex justify-content-center" style="margin-top: 5rem">
        <c:forEach items="${BEBIDAS}" var="BEBIDA">
            <div class="col-sm-4 mb-4 align-self-stretch ">
                <div class="card shadow-lg  bg-white">
<%--                    <img src="${url}/${BEBIDA.imagen}" alt="imagen" class="img-fluid" style="height: 13rem">--%>

                    <div class="card-body">
                        <h3 class="card-title" style="color: #424949">Nombre: ${BEBIDA.nombre}</h3>
                        <p class="card-text" style="color:#797D7F">Precio: ${BEBIDA.precio}</p>
                        <p class="card-text" style="color: #797D7F">Capacidad: ${BEBIDA.capacidad}</p>
                        <p class="card-text" style="color: #797D7F">Stock: ${BEBIDA.stock}</p>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</body>
</html>
