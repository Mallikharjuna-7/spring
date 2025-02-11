<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>find account</title>
<style>
/* Reset and Box-sizing */
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

/* Body Styles */
body {
	font-family: 'Arial', sans-serif;
	background-color: #f5f5f5;
	margin: 0;
	height: 100vh;
	display: flex;
	flex-direction: column;
	justify-content: space-between;
}

/* Logo Styling */
.logo {
	height: 40px;
	width: 40px;
	display: inline-block;
	border-radius: 10px;
}

/* Header Styles */
header {
	background-color: #004085; /* Dark Blue Background */
	color: white;
	padding: 15px 20px;
	text-align: center;
	flex-shrink: 0;
	position: relative;
	display: flex;
	justify-content: space-between;
	align-items: center;
}

header h1 {
	font-size: 24px;
	font-weight: 600;
	margin: 0;
	flex-grow: 1;
	text-align: center;
}

/* Sign In Form Container */
.signin-container {
	background-color: #fff;
	padding: 20px;
	border-radius: 8px;
	box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
	width: 100%;
	max-width: 400px; /* Slightly wider for better UI */
	margin: 120px auto; /* Adds space from top and bottom */
	flex-grow: 1; /* Ensures form takes up available space */
	display: flex;
	flex-direction: column;
	justify-content: center;
}

h2 {
	font-size: 22px;
	text-align: left;
	margin-bottom: 20px;
	color: #333;
	font-weight: 600;
}

/* Input Group */
.input-group {
	margin-bottom: 15px;
}

.input-group label {
	display: block;
	font-size: 14px;
	color: black;
	margin-bottom: 10px;
}

.input-group input {
	width: 100%;
	padding: 10px;
	font-size: 14px;
	border: 1px solid #ddd;
	border-radius: 4px;
	background-color: #fafafa;
	transition: border-color 0.3s ease;
}

.input-group input:focus {
	border-color: #007bff; /* Blue border on focus */
	outline: none;
}

/* Button Layout */
.form-buttons {
	display: flex;
	gap: 15px; /* Space between buttons */
	justify-content: space-between;
	margin-top: 20px;
}

.signin-btn, .reset-btn {
	padding: 10px 20px;
	font-size: 16px;
	cursor: pointer;
	width: 48%; /* Ensures buttons are not too wide */
	border-radius: 4px;
	border: none;
}

/* Sign In Button */
.signin-btn {
	background-color: #007bff; /* Blue for Signin */
	color: white;
}

.signin-btn:hover {
	background-color: #0056b3; /* Darker blue on hover */
}

/* Reset Button */
.reset-btn {
	background-color: #dc3545; /* Red for Reset */
	color: white;
}

.reset-btn:hover {
	background-color: #c82333; /* Darker red on hover */
}

/* Footer Styles */
footer {
	background-color: #333;
	color: white;
	padding: 10px 0;
	text-align: center;
	font-size: 14px;
	flex-shrink: 0; /* Prevents footer from shrinking */
}

footer a {
	color: #00aaff;
	text-decoration: none;
}

footer a:hover {
	text-decoration: underline;
}

/* Footer Text */
.form-footer {
	font-size: 14px;
	text-align: center;
	margin-top: 20px;
}

.form-footer a {
	color: #007bff;
	text-decoration: none;
}

.form-footer a:hover {
	text-decoration: underline;
}

/* Error Message Style */
.error-message {
	color: red;
	font-size: 14px;
	text-align: center;
	margin-bottom: 10px;
}

.time {
	font-size: 14px;
	text-align: right;
}
</style>
</head>
<body>

	<header>
		<img class="logo"
			src="https://images.yourstory.com/cs/images/companies/Molitics-1648544588952.png?fm=auto&ar=1%3A1&mode=fill&fill=solid&fill-color=fff&format=auto&w=384&q=75"
			alt="Logo">
		<h1>Find Account</h1>
		
	</header>


	<div class="signin-container">
		<h2>Find Your Account</h2>

		

		<form action="signin">
			<div class="input-group">
				<label for="email">Please enter your email address to search for your account.</label> <input type="text" id="email"
					name="email" placeholder="Email" required>
			</div>

		<!-- Display Error Message if Login Fails -->
		<c:if test="${not empty attempt}">
			<div class="error-message">${attempt}</div>
		</c:if>


			<!-- Buttons Section: Sign In and Reset -->
			<div class="form-buttons">
				<input class="reset-btn" type="reset" value="Cancel">
				<input class="signin-btn" type="submit" value="Search"> 
			</div>

			
		</form>
	</div>

	<!-- Footer -->
	<footer>
		<p>&copy; 2025 CopyRight. All rights reserved.</p>
		<p>Designed by : Mallikharjuna</p>
		<div class="time" id="dateTime"></div>
	</footer>

	<script type="text/javascript">
		function updateDateTime() {

			const now = new Date();

			const currentDateTime = now.toLocaleString();

			document.querySelector('#dateTime').textContent = currentDateTime;
		}

		setInterval(updateDateTime, 1000);
	</script>

</body>
</html>
