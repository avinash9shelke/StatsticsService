<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Statistical Home</title>
</head>
<body>
	<form action="./statsticsview.html" method="GET">
		X Value :<input type="text" name="x"> Y Value :<input
			type="text" name="y"> <input type="submit"
			value="getStatastics" />
		<p>Statstcis</p>
		<p>Average : ${average }</p>
		<p>kurtosis :${kurtosis }</p>
		<p>skewness :${skewness }</p>
		<p>Standard Deviation :${sd }</p>
		<p>sums :${sums}</p>
	</form>

</body>
</html>


