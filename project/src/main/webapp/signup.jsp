<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Sign Up</title>
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
		<h1>WELCOME</h1>
	</header>

	<!-- Main Content: Sign Up Form -->
	<div class="signup-container">

		<h2>Sign Up</h2>
		<form action="signup">
			<div class="form-row">
				<!-- First Row: Username, Email -->
				<div class="input-group">
					<label for="username">Username</label> <input type="text"
						id="username" name="username" onchange="checkUserName()" required>
					<br> <span id="out_username"></span>
				</div>
				<div class="input-group">
					<label for="email">E-mail</label> <input type="email" id="email"
						name="email" onchange="checkEmail(); " required> <br>
						<span id="out_email" ></span>
						<span id="mailResponse" ></span>
				</div>
			</div>

			<div class="form-row">
				<!-- Second Row: Contact Number, Password -->
				<div class="input-group">
					<label for="contact">Contact Number</label> <input type="tel"
						id="contact" name="contact" onchange="checkContactNumber()"
						required> <br> 
						<span id="out_contact"></span>
						<span id="contactResponse"></span>
				</div>
				<div class="input-group">
					<label for="password">Password</label> <input type="password"
						id="password" name="password" required><br> <span
						id=""></span>
				</div>
			</div>

			<div class="form-row">
				<!-- Third Row: Aadhar, Date of Birth -->
				<div class="input-group">
					<label for="aadhar">Aadhar Number</label> <input type="tel"
						id="aadhar" name="aadhar" onchange="checkAadharNumber()" required><br>
					<span id="out_aadhar"></span>
					<span id="aadharResponse"></span>
				</div>
				<div class="input-group">
					<label for="dob">Date Of Birth</label> <input type="date" id="dob"
						name="dob" required>
				</div>
			</div>

			<div class="form-row">
				<!-- Fourth Row: Alternative Contact, Country -->
				<div class="input-group">
					<label for="alternativeContact">Alternative Contact Number</label>
					<input type="tel" id="alternativeContact" name="alternativeContact"
						required>
				</div>
				<div class="input-group">
					<label for="country">Country</label> <input type="text"
						id="country" name="country" value="India" required>
				</div>
			</div>

			<div class="form-row">
				<!-- Fifth Row: State, City -->
				<div class="input-group">
					<label for="state">State</label> <input type="text" id="state"
						name="state" onchange="checkState()" required><br> <span
						id="out_state"></span>
				</div>
				<div class="input-group">
					<label for="city">City</label> <input type="text" id="city"
						name="city" onchange="checkCity()" required><br> <span
						id="out_city"></span>
				</div>
			</div>

			<div class="form-row">
				<!-- Sixth Row: Pincode, Address -->
				<div class="input-group">
					<label for="pincode">Pincode</label> <input type="number"
						id="pincode" name="pincode" onchange="checkPincode()" required><br>
					<span id="out_pincode"></span>
				</div>
				<div class="input-group">
					<label for="address">Address</label> <input type="text"
						id="address" name="address" onchange="checkAddress()" required><br>
					<span id="out_address"></span>
				</div>
			</div>

			<div class="form-buttons">
				<input class="signup-btn" type="submit" value="Sign Up"> <input
					class="reset-btn" type="reset" value="Reset">
			</div>

			<div class="form-footer">
				<p>
					Already have an account? <a href="signin.jsp">Sign in</a>
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
		//username
		function checkUserName() {
			const name = document.getElementById('username').value;
			const namespan = document.getElementById('out_username');
			if (name.length > 2) {
				namespan.innerHTML = 'Username: ' + name;
				namespan.className = 'valid';
				
			} else {
				namespan.innerHTML = 'Username must be greater than 2 letters';
				namespan.className = 'invalid';
			}
		}
		//contact number
		function checkContactNumber() {
			const contact = document.getElementById('contact').value;
			const contactspan = document.getElementById('out_contact');
			if (contact.length == 10) {
				checkContactDuplicate();
				contactspan.innerHTML = '';
				contactspan.className = 'valid';
			} else {
				checkContactDuplicate();
				contactspan.innerHTML = 'Enter valid Contact Number';
				contactspan.className = 'invalid';
			}
		}
		//email
		function checkEmail() {
			const mail = document.getElementById('email').value;
			const mailspan = document.getElementById('out_email');
			const emailRegex = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/
			if (emailRegex.test(mail)) {		
				//ajax
				checkEmailDuplicate();
				mailspan.innerHTML = '';
				mailspan.className = 'valid';
			} else {
				//ajax
				checkEmailDuplicate();
				mailspan.innerHTML = 'Enter valid E-mail'
				mailspan.className = 'invalid';
				
			}

		}
		//aadhar number
		function checkAadharNumber() {
			const aadhar = document.getElementById('aadhar').value;
			const aadharspan = document.getElementById('out_aadhar');
			if (aadhar.length == 12) {
				checkAadharDuplicate();
				aadharspan.innerHTML = '';
				aadharspan.className = 'valid';
			} else {
				checkAadharDuplicate();
				aadharspan.innerHTML = 'Enter valid Aadhar Number';
				aadharspan.className = 'invalid';
			}
		}
		//state
		function checkState() {
			const state = document.getElementById('state').value;
			const statespan = document.getElementById('out_state');
			if (state.length > 2) {
				statespan.innerHTML = 'State: ' + state;
				statespan.className = 'valid';
			} else {
				statespan.innerHTML = 'Enter valid State Name';
				statespan.className = 'invalid';
			}
		}
		//pincode
		function checkPincode() {
			const pincode = document.getElementById('pincode').value;
			const pincodespan = document.getElementById('out_pincode');
			if (pincode.length == 6) {
				pincodespan.innerHTML = 'Pincode: ' + pincode;
				pincodespan.className = 'valid';
			} else {
				pincodespan.innerHTML = 'Enter valid Pincode';
				pincodespan.className = 'invalid';
			}
		}
		//city
		function checkCity() {
			const city = document.getElementById('city').value;
			const cityspan = document.getElementById('out_city');
			if (city.length > 2) {
				cityspan.innerHTML = 'City: ' + city;
				cityspan.className = 'valid';
			} else {
				cityspan.innerHTML = 'Enter valid City Name';
				cityspan.className = 'invalid';
			}
		}
		//address
		function checkAddress() {
			const address = document.getElementById('address').value;
			const addressspan = document.getElementById('out_address');
			if (address.length > 3) {
				addressspan.innerHTML = 'Address: ' + address;
				addressspan.className = 'valid';
			} else {
				addressspan.innerHTML = 'Enter valid Address Name';
				addressspan.className = 'invalid';
			}mail
		}

		//for time
		function updateDateTime() {

			const now = new Date();

			const currentDateTime = now.toLocaleString();

			document.querySelector('#dateTime').textContent = currentDateTime;
		}
		setInterval(updateDateTime, 1000);

		//for email duplicate check
		function checkEmailDuplicate() {
			var userEmail = document.getElementById("email").value;
			console.log(userEmail);
			const req = new XMLHttpRequest();
			console.log(req);
			req.open("GET", "http://localhost:8080/project/getMail?email="+userEmail);
			req.send();
			req.onload = function() {
				console.log(req.responseText);
				let mailResponse = req.responseText;
				console.log(mailResponse);
				document.getElementById("mailResponse").innerHTML = mailResponse;
				document.getElementById("mailResponse").className = 'invalid';
			}

		}
		//for aadhar duplicate check
		function checkAadharDuplicate(){
			var userAadhar = document.getElementById("aadhar").value;
			console.log(userAadhar);
			const req = new XMLHttpRequest();
			console.log(req);
			req.open("GET", "http://localhost:8080/project/getAadhar?aadhar="+userAadhar);
			req.send();
			req.onload = function() {
				console.log(req.responseText);
				let aadharResponse = req.responseText;
				console.log(aadharResponse);
				document.getElementById("aadharResponse").innerHTML = aadharResponse;
				document.getElementById("aadharResponse").className = 'invalid';
			}
		}
		
		//for contact duplicate check
		function checkContactDuplicate(){
			var userContact = document.getElementById("contact").value;
			console.log(userContact);
			const req = new XMLHttpRequest();
			console.log(req);
			req.open("GET", "http://localhost:8080/project/getContact?contact="+userContact);
			req.send();
			req.onload = function() {
				console.log(req.responseText);
				let contactResponse = req.responseText;
				console.log(contactResponse);
				document.getElementById("contactResponse").innerHTML = contactResponse;
				document.getElementById("contactResponse").className = 'invalid';
			}
		}
		
	</script>

</body>
</html>
