<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<form action="calculate" method="get">
	<h2>Calculator</h2>
	<h3>Add</h3>
	<input type = "text" name = "num1" size="2" value="${output.num1}" /> +
	<input type = "text" name = "num2" size="2" value="${output.num2}" />  =
	<input type = "text" name = "sum" size="2" value="${output.sum}" readonly="readonly" />
	<br/>
	<h3>Multiply</h3>
	<input type = "text" name = "num3" size="2" value="${output.num3}"  /> *
	<input type = "text" name = "num4" size="2" value="${output.num4}" /> =
	<input type = "text" name = "product" size="2" value="${output.product}" readonly="readonly" />
	<br/>
	<br/>
	<input type = "submit" value = "Calculate"/>
</form>

</body>
</html>
