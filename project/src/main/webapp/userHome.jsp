<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<!-- Add Bootstrap Icons CDN -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons/font/bootstrap-icons.css" rel="stylesheet">
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
    background-image: url();
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
    margin-left: 200px;
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

/* Logo Styling */
.logo {
    height: 40px;
    width: 40px;
    display: inline-block;
    border-radius: 10px;
}

/* Button Container in Header */
.btn-container {
    display: flex;
    gap: 15px;
}

/* Profile button with icon and text */
.btn {
	margin-right: 20px;
    padding: 10px 20px;
    background-color: #6200ea; /* Vibrant purple */
    color: white;
    border: none;
    border-radius: 30px; /* Rounded button */
    font-size: 16px;
    cursor: pointer;
    transition: background-color 0.3s ease, transform 0.3s ease, box-shadow 0.3s ease;
    display: flex;
    align-items: center;
    gap: 10px;
    box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
}

/* Hover effect for button */
.btn:hover {
    background-color: #3700b3; /* Darker purple */
    transform: translateY(-3px); /* Slight lift effect */
    box-shadow: 0 6px 12px rgba(0, 0, 0, 0.2); /* Enhanced shadow effect */
}

/* Profile icon */
.btn i {
    font-size: 20px; /* Larger icon size */
}

/* Profile dropdown container */
.dropdown {
    position: relative;
    display: inline-block;
}

/* Profile dropdown content (hidden by default) */
.dropdown-content {
	font-size: 18px;
    display: none;
    position: absolute;
    top: 100%; /* Align the dropdown content directly below the button */
    left: 0; /* Align the dropdown content to the left side of the button */
    background-color: #ffffff;
    min-width: 120px; /* Set a smaller width */
    max-width: 200px; /* Set a max-width to ensure it doesn't overflow */
    box-shadow: 0px 12px 24px rgba(0, 0, 0, 0.15);
    z-index: 1;
    border-radius: 15px; /* Rounded corners for dropdown */
    opacity: 0;
    transform: translateY(-20px); /* Slide effect */
    transition: opacity 0.3s ease, transform 0.3s ease; /* Smooth fade and slide */
}

/* Show dropdown on hover */
.dropdown:hover .dropdown-content {
    display: block;
    opacity: 1;
    transform: translateY(0); /* Slide into position */
}

/* Dropdown links styling */
.dropdown-content a {
    color: #333;
    padding: 12px 20px;
    text-decoration: none;
    display: block;
    border-bottom: 1px solid #ddd;
    border-radius: 15px;
    transition: background-color 0.3s ease, padding-left 0.3s ease;
}

.dropdown-content a:last-child {
    border-bottom: none; /* Remove border from last link */
}

.dropdown-content a:hover {
    background-color: #f1f1f1;
    padding-left: 20px; /* Add a slight shift on hover */
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
.welcome {
	color:green;
    font-size: 24px;
    font-weight: 600;
    margin: 20px;
    flex-grow: 1;
    text-align: center;
}
</style>
</head>

<body>

    <header>
        <img class="logo"
            src="https://images.yourstory.com/cs/images/companies/Molitics-1648544588952.png?fm=auto&ar=1%3A1&mode=fill&fill=solid&fill-color=fff&format=auto&w=384&q=75"
            alt="Logo">
       
        <h1>M Spares <p>automotive spare parts</p></h1>
        
		
		<div >
		 <h4 style="margin-right: 10px;">${ email} </h4>
		</div>
		
        <div class="btn-container">
            <div class="dropdown">
                <!-- Profile button with both icon and text -->
                <button class="btn">
                    <i class="bi bi-person-circle"></i> Profile
                </button>
                <div class="dropdown-content">
                    <a href="update?email=${email}">Edit</a>
                    <a href="delete?email=${email}">Delete</a>
                    <a href="userSigninHistory.jsp">Sign in History </a>
                    <a href="signin.jsp">Sign out</a>
                </div>
            </div>
        </div>
    </header>
	
	<div class="welcome">
     	<p>** Welcome to M Spares **</p>
     	<p>${ username}</p>
	</div>
	
    <footer>
        <p>&copy; 2025 CopyRight. All rights reserved.</p>
        <p>Designed by: Mallikharjuna</p>
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
