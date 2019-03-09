<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center><form action="/calculator/Servlet2" method="post">
<h2>四則計算</h2>
<input type="text" name="num1" ><br>

<%--　配列の中身をプルダウン方式で出力 --%>

<select name="s1">
<c:forEach var="setArray1" items="${Culc}">
<option value="${setArray1}">
<c:out value="${setArray1}"/>
</option>
</c:forEach>
</select><br>

<input type="text" name="num2" ><br>

<%--　配列の中身をプルダウン方式で出力 --%>
<select name="s2">
<c:forEach var="setArray2" items="${Culc}">
<option value="${setArray2}">
<c:out value="${setArray2}"/>
</option>
</c:forEach>
</select><br>

<input type="text" name="num3" ><br>


<button type="submit">計算</button>
</form>
</center>
</body>
</html>