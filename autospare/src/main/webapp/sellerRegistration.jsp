<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>seller registration</title>

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

/* Sign Up Container */
.signup-container {
	background-color: #fff;
	padding: 20px;
	border-radius: 8px;
	box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
	width: 100%;
	max-width: 600px; /* Smaller width for the container */
	margin: 40px auto; /* Adds space from top and bottom */
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

/* Form structure - Flexbox Layout */
.form-row {
	display: flex;
	flex-wrap: wrap;
	gap: 15px;
	margin-bottom: 15px;
}

.form-row .input-group {
	flex: 1 1 45%; /* Keeps the form fields side-by-side */
	min-width: 240px; /* Ensures the inputs don't get too small */
}

.input-group label {
	display: block;
	font-size: 14px;
	color: #666;
	margin-bottom: 6px;
}

.input-group input {
	width: 100%;
	padding: 8px;
	font-size: 14px;
	border: 1px solid #ddd;
	border-radius: 4px;
	background-color: #fafafa;
	box-sizing: border-box;
	transition: all 0.3s ease;
}

/* Input focus effect */
.input-group input:focus {
	border-color: #007bff;
	background-color: #ffffff;
	outline: none;
}

/* Button styling */
.form-buttons {
	display: flex;
	gap: 15px; /* Space between buttons */
	justify-content: center;
	margin-top: 20px;
}

.signup-btn, .reset-btn {
	padding: 10px 20px;
	font-size: 15px;
	cursor: pointer;
	width: 50%; /* Ensures buttons are not too wide */
	border-radius: 4px;
	border: none;
}

.signup-btn {
	background-color: #007bff; /* Blue for Submit */
	color: white;
}

.signup-btn:hover {
	background-color: #0056b3;
}

.reset-btn {
	background-color: #dc3545; /* Red for Reset */
	color: white;
}

.reset-btn:hover {
	background-color: #c82333;
}

/* Footer text */
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

</head>

<body>

	<header>
		<img class="logo"
			src="https://images.yourstory.com/cs/images/companies/Molitics-1648544588952.png?fm=auto&ar=1%3A1&mode=fill&fill=solid&fill-color=fff&format=auto&w=384&q=75"
			alt="Logo">
		<h1>M Spares <p>automotive spare parts</p></h1>
	</header>

	<!-- Main Content: Sign Up Form -->
	<div class="signup-container">

		<h2>Register</h2>
		<form action="sellerRegistration">
			<div class="form-row">
				<!-- First Row: SellerName, IndustryName -->
				<div class="input-group">
					<label for="sellerName">Name</label> <input type="text"
						id="sellerName" name="sellerName" onchange="" required>
					<br> <span id=""></span>
				</div>
				<div class="input-group">
					<label for="industryName">Industry Name</label> <input type="text"
						id="industryName" name="industryName" onchange=""
						required> <br> 
						<span id="out_contact"></span>
						<span id="contactResponse"></span>
				</div>
			</div>

			<div class="form-row">
				<!-- Second Row: Email, gstNumber -->
				<div class="input-group">
					<label for="sellerEmail">E-mail</label> <input type="email" id="sellerEmail"
						name="sellerEmail" onchange="" required> <br>
						<span id="out_email" ></span>
						<span id="mailResponse" ></span>
				</div>
				<div class="input-group">
					<label for="gstNumber">GST Number</label> <input type="text"
						id="gstNumber" name="gstNumber" onchange=""
						required> <br> 
						<span id="out_contact"></span>
						<span id="contactResponse"></span>
				</div>
			</div>

			<div class="form-row">
				<!-- Third Row: contact, country -->
				<div class="input-group">
					<label for="sellerContact">Contact Number</label> <input type="tel"
						id="sellerContact" name="sellerContact" onchange=""
						required> <br> 
						<span id="out_contact"></span>
						<span id="contactResponse"></span>
				</div>
				<div class="input-group">
					<label for="country">Country</label> <input type="text"
						id="country" name="country" value="India" onchange="" readonly><br>
					<span id="out_aadhar"></span>
					<span id="aadharResponse"></span>
				</div>
			</div>

			<div class="form-row">
				<!-- Fourth Row: typeOfIndustry, state -->
				<div class="input-group">
					<label for="typeOfIndustry">Type Of Industry</label>
					<input type="text" id="typeOfIndustry" name="typeOfIndustry"
						required>
				</div>
				<div class="input-group">
					<label for="state">State</label> <input type="text"
						id="state" name="state"  required>
				</div>
			</div>

			<div class="form-row">
				<!-- Fifth Row: service, City -->
				<div class="input-group">
					<label for="isOnlineServiceAvailable">Online Service (Yes/No)</label> <input type="text" id="isOnlineServiceAvailable"
						name="isOnlineServiceAvailable" onchange="" required><br> <span
						id="out_state"></span>
				</div>
				<div class="input-group">
					<label for="city">City</label> <input type="text" id="city"
						name="city" onchange="" required><br> <span
						id="out_city"></span>
				</div>
			</div>

			<div class="form-row">
				<!-- Sixth Row: Pincode, Address -->
				<div class="input-group">
					<label for="pincode">Pincode</label> <input type="number"
						id="pincode" name="pincode" onchange="" required><br>
					<span id="out_pincode"></span>
				</div>
				<div class="input-group">
					<label for="address">Address</label> <input type="text"
						id="address" name="address" onchange="" required><br>
					<span id="out_address"></span>
				</div>
			</div>

			<div class="form-buttons">
				<input class="signup-btn" type="submit" value="Sign Up"> <input
					class="reset-btn" type="reset" value="Reset">
			</div>

			<div class="form-footer">
				<p>
					Already have an account? <a href="sellerLogin.jsp">Log in</a>
				</p>
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
	
	//for time
	function updateDateTime() {

		const now = new Date();

		const currentDateTime = now.toLocaleString();

		document.querySelector('#dateTime').textContent = currentDateTime;
	}
	setInterval(updateDateTime, 1000);
	
	</script>

</body>
</html>