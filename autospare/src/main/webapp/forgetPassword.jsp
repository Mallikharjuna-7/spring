<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forget password</title>
</head>

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
	margin-top: 10px;
	margin-bottom: 20px;
}

.signin-btn, .reset-btn {
	padding: 10px 20px;
	font-size: 16px;
	cursor: pointer;
	width: 38%; /* Ensures buttons are not too wide */
	border-radius: 4px;
	border: none;
	margin-bottom: 5px;
}

/* Sign In Button */
.signin-btn {
	background-color: #007bff; /* Blue for Signin */
	color: white;
}

.signin-btn:hover {
	background-color: #0056b3; /* Darker blue on hover */
}

/* Disabled Button Styling */
.signin-btn:disabled, .reset-btn:disabled {
    background-color: #cccccc; /* Light gray background for disabled state */
    color: #666666; /* Darker gray text for better contrast */
    cursor: not-allowed; /* Change cursor to indicate the button can't be clicked */
    border: 1px solid #cccccc; /* Gray border */
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

.valid {
	color: green;
}

.invalid {
	color: red;
}

span {
	font-size: 14px;
}

.time {
	font-size: 14px;
	text-align: right;
}
</style>

<body>

	<header>
		<img class="logo"
			src="https://images.yourstory.com/cs/images/companies/Molitics-1648544588952.png?fm=auto&ar=1%3A1&mode=fill&fill=solid&fill-color=fff&format=auto&w=384&q=75"
			alt="Logo">
		<h1>M Spares <p>automotive spare parts</p></h1>
		
	</header>


	<div class="signin-container">
		<h2>Find Your Account</h2>

		

		<form >
			<div class="input-group">
				<label for="email">Please enter your email address to search for your account.</label> <input type="text" id="email"
					name="email" placeholder="Email" onchange="checkEmail()" required> <br>
					<span id="out_email" ></span>
					<span id="mailResponse" ></span>
			</div>

		<!-- Display Error Message if Login Fails -->
		<c:if test="${not empty attempt}">
			<div class="error-message">${attempt}</div>
		</c:if>


			<!-- Buttons Section: Sign In and Reset -->
			<div class="form-buttons">
				<button class="signin-btn" onclick="sendOtp()" id="sendOtpBtn" disabled> Send OTP</button>
			</div>
			<span id="otpResponse" ></span>
			
			<div class="input-group">
				<label for="otp"></label> <input type="tel" id="otp"
					name="otp" placeholder="Enter OTP" disabled>
			</div>
			<div class="form-buttons">
				<button class="reset-btn" type="submit" id="verify" disabled>Verify</button>
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
		
		
		//email
		function checkEmail() {
			const mail = document.getElementById('email').value;
			const mailspan = document.getElementById('out_email');
			const emailRegex = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/
			if (emailRegex.test(mail)) {		
				//ajax
				checkEmailisPresent();
				mailspan.innerHTML = '';
				mailspan.className = 'valid';
			} else {
				//ajax
				checkEmailisPresent();
				mailspan.innerHTML = 'Enter valid E-mail'
				mailspan.className = 'invalid';
				
			}

		}
		
		
		//for email duplicate check
		function checkEmailisPresent() {
			var userEmail = document.getElementById("email").value;
			var button = document.getElementById('sendOtpBtn');
			console.log(userEmail);
			const req = new XMLHttpRequest();
			console.log(req);
			req.open("GET", "http://localhost:8080/autospare/isEmailPresent?email="+userEmail);
			req.send();
			req.onload = function() {
				console.log(req.responseText);
				let mailResponse = req.responseText;
				console.log(mailResponse);
				document.getElementById("mailResponse").innerHTML = mailResponse;
				document.getElementById("mailResponse").className = 'invalid';
				if (mailResponse === "") {
	                button.disabled = false; // Disable button if email is not found
	            } else {
	                button.disabled = true; // Enable button if email is found
	            }
			}

		}
		
		//for otp
		function sendOtp(){
			var userEmail = document.getElementById("email").value;
			var verifyBtn = document.getElementById('verify');
			var otpField = document.getElementById('otp');
			console.log(userEmail);
			const req = new XMLHttpRequest();
			console.log(req);
			req.open("GET", "http://localhost:8080/autospare/forOtp?email="+userEmail);
			req.send();
			req.onload = function() {
				console.log(req.responseText);
				let otpResponse = req.responseText;
				console.log(otpResponse);
				document.getElementById("otpResponse").innerHTML = otpResponse;
				document.getElementById("otpResponse").className = 'invalid';
				if (otpResponse === "") {
					verifyBtn.disabled = false; // Disable button if email is not found
	                otpField.disabled = false;
	            } else {
	            	verifyBtn.disabled = true; // Enable button if email is found
	                otpField.disabled = true;
	            }
			}	
		}
		
		
	</script>

</body>
</html>