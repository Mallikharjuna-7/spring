<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>seller home</title>

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
		url();
	height: 100vh;
	display: flex;
	flex-direction: column;
	justify-content: space-between;
	margin: 0;
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

/* Admin Button */
.admin-btn {
	padding: 8px 15px;
	background-color: rgba(238, 12, 97, 1); /* Light Orange Button */
	border: none;
	border-radius: 6px;
	font-size: 18px;
	cursor: pointer;
	margin: 5px;
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
	align-items: center;
}

/* Dropdown Styles */
.dropdown {
  position: relative;
  display: inline-block;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px rgba(0, 0, 0, 0.2);
  z-index: 1;
  border-radius: 6px;
}

.dropdown:hover .dropdown-content {
  display: block;
}

.dropdown-content a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
}

.dropdown-content a:hover {
  background-color: #ddd;
}

.dropdown-button {
  display: flex;
  align-items: center;
}

/* Dropdown Symbol */
.dropdown-symbol {
  margin-left: 5px;
  font-size: 12px;
  color: white;
}

/* Button Styles */
.btn {
	color:white;
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

/* View Products Button */
.view-products {
    padding: 10px 20px;
    background-color: #007bff;
    color: white;
    font-size: 16px;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    text-align: center;
    position: absolute;
    top: 80px;
    left: 50%;
    transform: translateX(-50%);
}

.view-products:hover {
    background-color: #0056b3;
}

/* Product Cards Container */
.container {
    display: flex;
    flex-wrap: wrap;
    justify-content: center;
    gap: 20px;
    padding: 20px;
    margin-top: 50px;
}

.card {
    width: 300px;
    border: 1px solid #ddd;
    border-radius: 10px;
    overflow: hidden;
    box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.2);
    background-color: #fff;
    transition: transform 0.3s ease;
}

.card:hover {
    transform: translateY(-5px);
}
/* View Products Button */
.view-products {
    padding: 10px 20px;
    background-color: #007bff;
    color: white;
    font-size: 16px;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    text-align: center;
    position: absolute;
    top: 80px;
    left: 50%;
    transform: translateX(-50%);
}

.view-products:hover {
    background-color: #0056b3;
}

/* Product Cards Container */
.container {
    display: flex;
    flex-wrap: wrap;
    justify-content: center;
    gap: 20px;
    padding: 20px;
    margin-top: 50px;
}

.card {
    width: 300px;
    border: 1px solid #ddd;
    border-radius: 10px;
    overflow: hidden;
    box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.2);
    background-color: #fff;
    transition: transform 0.3s ease;
}

.card:hover {
    transform: translateY(-5px);
}

.card img {
    width: 100%;
    height: 200px;
    object-fit: cover;
}

.card-content {
    padding: 15px;
}

.card-content h3 {
    margin: 10px 0;
    font-size: 20px;
    color: #333;
}

.card-content p {
    font-size: 14px;
    color: #666;
    margin: 5px 0;
}

.card img {
    width: 100%;
    height: 200px;
    object-fit: cover;
}

.card-content {
    padding: 15px;
}

.card-content h3 {
    margin: 10px 0;
    font-size: 20px;
    color: #333;
}

.card-content p {
    font-size: 14px;
    color: #666;
    margin: 5px 0;
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
.main{
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
		
		<!-- Button Container for User, Seller, and Admin -->
		<div class="btn-container">

			<!-- Admin Button -->
			<button class="admin-btn">
				<a href="addProduct?email=${dto.sellerEmail}" >+ Add Product</a>
			</button>
		</div>
		
	</header>

	<form action="viewSellerProducts" method="get">
	<input type="hidden" name="id" value="${dto.id}">
    <input type="submit" value="View Products" class="view-products">
</form>

<div class="container">
    <c:forEach var="product" items="${listOfSellerProducts}">
        <div class="card">
            <img src="${pageContext.request.contextPath}/image/${product.productImage}" alt="Product Image">
            <div class="card-content">
                <h3>${product.productName}</h3>
                <p><strong>Code:</strong> ${product.productCode}</p>
                <p><strong>Description:</strong> ${product.productDescription}</p>
                <p><strong>Price:</strong> ${product.price}</p>
                <p><strong>Category:</strong> ${product.productCategory}</p>
                <p><strong>Stock:</strong> ${product.stockQuantity}</p>
                <p><strong>Supplier:</strong> ${product.supplierName}</p>
            </div>
        </div>
    </c:forEach>
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