<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>user signin</title>

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
	background-color: #824b03; /* Dark Blue Background */
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
header p {
    font-size: 12px;
    font-weight: 600;
    margin: 0;
    flex-grow: 1;
    text-align: center;
   	font-style: italic;
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
	text-align: center;
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
	color: #666;
	margin-bottom: 6px;
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
		<h1>M Spares <p>automotive spare parts</p></h1>
	</header>

	<!-- Sign In Form Container -->
	<div class="signin-container">
		<h2>Sign In</h2>

		<!-- Display Error Message if Login Fails -->
		<c:if test="${not empty fail}">
			<div class="error-message">${fail}</div>
		</c:if>

		<form action="userSignin">
			<div class="input-group">
				<label for="email">E-mail</label> <input type="email" id="email"
					name="email" required>
			</div>
			<div class="input-group">
				<label for="password">Password</label> <input type="password"
					id="password" name="password" required>
			</div>

		<!-- Display Error Message if Login Fails -->
		<c:if test="${not empty attempt}">
			<div class="error-message">${attempt}</div>
		</c:if>


			<!-- Buttons Section: Sign In and Reset -->
			<div class="form-buttons">
				<input class="signin-btn" type="submit" value="Sign In"> 
				<input
					class="reset-btn" type="reset" value="Reset">
			</div>

			<div class="form-footer">
				<p>
					Don't have an account? <a href="userSignup.jsp">Sign up</a>
				</p>
			</div>
			<div class="form-footer">
				<p>
					<a href="forgetPassword.jsp">Forgot password?</a>
				</p>
			</div>
		</form>
	</div>

	
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