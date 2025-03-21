<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>user home</title>

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
    background-color: #f8f9fa;
    height: 100vh;
    display: flex;
    flex-direction: column;
    justify-content: space-between;
}

/* Header Styles */
header {
    background-color: #824b03;
    color: white;
    padding: 15px 20px;
    display: flex;
    justify-content: space-between;
    align-items: center;
    width: 100%;
    position: relative;
}

header h1 {
    font-size: 24px;
    font-weight: 600;
    margin: 0;
    position: absolute;
    left: 50%;
    transform: translateX(-50%);
    text-align: center;
}

header p {
    font-size: 12px;
    font-style: italic;
    text-align: center;
}

.logo {
    height: 40px;
    width: 40px;
    border-radius: 10px;
}

.header-right {
    display: flex;
    align-items: center;
    gap: 10px;
}

.btn {
    padding: 10px 20px;
    background-color: #6200ea;
    color: white;
    border: none;
    border-radius: 30px;
    font-size: 16px;
    cursor: pointer;
    display: flex;
    align-items: center;
    gap: 10px;
    box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
}

.btn:hover {
    background-color: #3700b3;
    transform: translateY(-3px);
    box-shadow: 0 6px 12px rgba(0, 0, 0, 0.2);
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

/* Footer Styles */
footer {
    background-color: #333;
    color: white;
    text-align: center;
    padding: 20px;
    font-size: 14px;
    width: 100%;
    position: relative;
}

footer a {
    color: #00aaff;
    text-decoration: none;
}

footer a:hover {
    text-decoration: underline;
}
</style>
</head>
<body>

<header>
    <img class="logo" src="https://images.yourstory.com/cs/images/companies/Molitics-1648544588952.png" alt="Logo">
    <h1>M Spares <p>automotive spare parts</p></h1>
    <div class="header-right">
        <h5>${ email}</h5>
        <button class="btn">
            <i class="bi bi-person-circle"></i> Profile
        </button>
    </div>
</header>



<div class="container">
    <c:forEach var="dto" items="${listOfProducts}">
        <div class="card">
            <img src="${pageContext.request.contextPath}/image/${dto.productImage}" alt="Product Image">
            <div class="card-content">
                <h3>${dto.productName}</h3>
                <p><strong>Code:</strong> ${dto.productCode}</p>
                <p><strong>Description:</strong> ${dto.productDescription}</p>
                <p><strong>Price:</strong> ${dto.price}</p>
                <p><strong>Category:</strong> ${dto.productCategory}</p>
                <p><strong>Stock:</strong> ${dto.stockQuantity}</p>
                <p><strong>Supplier:</strong> ${dto.supplierName}</p>
            </div>
        </div>
    </c:forEach>
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
