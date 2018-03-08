<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Meals</title>
    <style>
        .normal {
            color: green;
        }

        .exceed {
            color: red;
        }

        table, th, td {
            border: 1px solid black;
        }
        th, td {
            padding: 15px;
        }
    </style>
</head>
<body>
<h3><a href="index.html">Home</a></h3>
<h2>Meals</h2>

<table>
    <tr>
        <th>description</th>
        <th>date and time</th>
        <th>calories</th>
        <th>is exceed?</th>
    </tr>
    <c:forEach var="meal" items="${mealList}">
        <jsp:useBean id="meal" type="ru.javawebinar.topjava.model.MealWithExceed"/>

        <tr class="${meal.exceed ? 'exceed' : 'normal'}">
            <td>${meal.description}</td>
            <td>
                <fmt:parseDate value="${meal.dateTime}" pattern="y-M-dd'T'H:m" var="parsedDate"/>
                <fmt:formatDate value="${parsedDate}" pattern="yyyy.MM.dd HH:mm"/>
            </td>
            <td>${meal.calories}</td>
            <td>${meal.exceed}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>