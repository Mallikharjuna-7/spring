<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>add details</title>
</head>
<style>
.pad {
	padding: 10px;
}
</style>

<body>

	<div align="center">

		<form action="submit">
			<div>
				<h2>Enter Google Apps Details</h2>
			</div>

			<div class="pad">
				<label> Application Name : </label> <input type="text"
					name="appName" placeholder="enter app name">
			</div>

			<div class="pad">
				<label> Description : </label> <input type="text" name="description"
					placeholder="enter app description">
			</div>

			<div class="pad">
				<label> Application Size : </label> <input type="number"
					name="appSize" placeholder="enter app size">
			</div>

			<div class="pad">
				<label> Offered by : </label> <input type="text" name="appOfferedBy"
					placeholder="enter app offered by">
			</div>

			<div class="pad">
				<label> Rating : </label> <input type="number" name="appRating"
					placeholder="enter app rating">
			</div>

			<div class="pad">
				<label> Downloads : </label> <input type="number"
					name="appDownloads" placeholder="enter app downloads">
			</div>
			<div class="pad">
				<input type="submit" value="submit">
			</div>

		</form>


	</div>

</body>
</html>