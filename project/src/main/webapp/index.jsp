<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>index</title>
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
	background-image:
		url(https://webgradients.com/public/webgradients_png/041%20Happy%20Acid.png);
	height: 100vh;
	display: flex;
	flex-direction: column;
	justify-content: space-between;
	margin: 0;
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

/* Logo Styling */
.logo {
	height: 40px;
	width: 40px;
	display: inline-block;
	border-radius: 10px;
}
.admin-btn {
	padding: 8px 15px;
	background-color: rgba(238, 12, 97, 1); /* Light Orange Button */
	border: none;
	border-radius: 6px;
	font-size: 18px;
	cursor: pointer;
	margin: 5px;
	margin-right:50px;

}

.admin-btn:hover {
	background-color: rgba(199, 10, 81, 1); /* Dark Orange on hover */
}

.admin-btn a {
	text-decoration: none;
	color: white;
}


/* Button Container in Header */
.btn-container {
	display: flex;
	gap: 15px;
}

.btn {
	padding: 10px 20px;
	background-color: #28a745; /* Green Button */
	border: none;
	border-radius: 6px;
	font-size: 16px;
	cursor: pointer;
	margin: 3px;
}

.btn:hover {
	background-color: #218838; /* Darker green on hover */
}

.btn a {
	text-decoration: none;
	color: white;
}

/* Footer Styles */
footer {
	background-color: #333;
	color: white;
	text-align: center;
	padding: 20px;
	font-size: 14px;
	position: fixed;
	bottom: 0;
	width: 100%;
}

footer a {
	color: #00aaff;
	text-decoration: none;
}

footer a:hover {
	text-decoration: underline;
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
		
		<div class="btn-container">
		
			<button class="admin-btn">
				
				<a href="adminSignin.jsp">Admin</a>
			</button>
		</div>

		<div class="btn-container">
		
			<button class="btn">
				
				<a href="signin.jsp">Sign In</a>
			</button>
			<button class="btn">
				<a href="signup.jsp">Sign Up</a>
			</button>
		</div>
	</header>


	<div>
	
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
