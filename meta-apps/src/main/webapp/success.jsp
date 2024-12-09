<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>meta success</title>
</head>
<body>

	<div align="center">
		<h2>Meta Apps Details</h2>
		<table border="2">

			<tr>
				<th>App Name</th>
				<th>Description</th>
				<th>App Size</th>
				<th>Required OS</th>
				<th>Rating</th>
				<th>Downloads</th>
			</tr>
			<tr>
				<td>${MetaDto.appName}</td>
				<td>${MetaDto.appDescription}</td>
				<td>${MetaDto.appSize}</td>
				<td>${MetaDto.requiredOS}</td>
				<td>${MetaDto.appRating}</td>
				<td>${MetaDto.appDownloads}</td>
			</tr>


		</table>

	</div>

</body>
</html>