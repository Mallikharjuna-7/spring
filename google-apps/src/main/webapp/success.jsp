<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>success page</title>
</head>
<body>

	<div align="center">
	<h2> Google Apps Details </h2>
		<table border="2">

			<tr>
				<th>Application Name</th>
				<th>Description</th>
				<th>App Size</th>
				<th>App Offered By</th>
				<th>Rating</th>
				<th>Downloads</th>
			</tr>
			<tr>
				<td>${appName}</td>
				<td>${description}</td>
				<td>${appSize}</td>
				<td>${appOfferedBy}</td>
				<td>${appRating}</td>
				<td>${downloads}</td>
			</tr>


		</table>

	</div>

</body>
</html>