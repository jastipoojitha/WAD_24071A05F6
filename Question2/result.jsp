<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <title>Student Result</title>
</head>
<body>

    <h2>Student Result</h2>

    <p>
        <b>Student Name:</b>
        <%= request.getAttribute("name") %>
    </p>

    <p>
        <b>Total Marks:</b>
        <%= request.getAttribute("total") %> / 500
    </p>

    <p>
        <b>Average:</b>
        <%= request.getAttribute("average") %>
    </p>

    <p>
        <b>Rank:</b>
        <%= request.getAttribute("rank") %>
    </p>

    <br>

    <a href="index.html">Go Back</a>

    <hr>
    <footer>Jasti Poojitha (24071A05F6)</footer>

</body>
</html>