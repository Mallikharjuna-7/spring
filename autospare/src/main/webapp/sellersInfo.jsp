<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sellers info</title>

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

.view-btn {
	color:white;
	padding: 5px 15px;
	background-color: #308020; /* Light Green Button */
	border: none;
	border-radius: 6px;
	font-size: 18px;
	cursor: pointer;
	margin: 5px;
	margin-right: 50px;
}

.view-btn:hover {
	background-color: #235e18; /* Dark Green on hover */
}

.view-btn a {
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

.error-message {
	color: red;
	font-size: 40px;
	text-align: center;
	margin-bottom: 100px;
}

table {
	margin-bottom: 400px;
	font-size: 10px;
}

</style>

</head>
<body>

	<header>
        <img class="logo"
             src="https://images.yourstory.com/cs/images/companies/Molitics-1648544588952.png?fm=auto&ar=1%3A1&mode=fill&fill=solid&fill-color=fff&format=auto&w=384&q=75"
             alt="Logo">
        <h1>M Spares <p>automotive spare parts</p></h1>

        <div class="btn-container">
            <!-- Form for Selecting User Type -->
            <form id="userForm" method="get" onsubmit="changeFormAction()">
                <select id="userDropdown" name="userType" onchange="changeFormAction()">
                    <option value="allSellers">All Sellers</option>
                    <option value="pendingSellers">Pending Requests</option>
                    <option value="approvedSellers">Approved Sellers</option>
                </select>
                <!-- Submit Button to fetch user data based on selected type -->
                <button type="submit" class="view-btn">View</button>
            </form>
        </div>
    </header>
    
    <h3 style="align-self: center;"> Sellers Information </h3>

    <!-- Table for User Data -->
    <table border="2" id="userTable">
        <thead>
            <tr>
                <th>Id</th>
                <th>sellerName</th>
                <th>sellerEmail</th>
                <th>sellerContact</th>
                <th>industryName</th>
                <th>gstNumber</th>
                <th>typeOfIndustry</th>
                <th>isOnlineServiceAvailable</th>
                <th>Country</th>
                <th>State</th>
                <th>City</th>
                <th>address</th>
                <th>pincode</th>
                <th>Created By</th>
                <th>Created On</th>
                <th>Updated By</th>
                <th>Updated On</th>
                <th>activeStatus</th>
                <th>requestStatus</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <!-- Dynamically display the selected list of users -->
            <c:if test="${not empty listOfApprovedSellers}">
                <c:forEach var="user" items="${listOfApprovedSellers}">
                    <tr>
                        <td>${user.id}</td>
                        <td>${user.sellerName}</td>
                        <td>${user.sellerEmail}</td>
                        <td>${user.sellerContact}</td>
                        <td>${user.industryName}</td>
                        <td>${user.gstNumber}</td>
                        <td>${user.typeOfIndustry}</td>
                        <td>${user.isOnlineServiceAvailable}</td>
                        <td>${user.country}</td>
                        <td>${user.state}</td>
                        <td>${user.city}</td>
                        <td>${user.address}</td>
                        <td>${user.pincode}</td>
                        <td>${user.createdBy}</td>
                        <td>${user.createdOn}</td>
                        <td>${user.updatedBy}</td>
                        <td>${user.updatedOn}</td>
                        <td>${user.activeStatus}</td>
                        <td>${user.requestStatus}</td>
                    </tr>
                </c:forEach>
            </c:if>

            <c:if test="${not empty listOfPendingSellers}">
                <c:forEach var="user" items="${listOfPendingSellers}">
                    <tr>
                        <td>${user.id}</td>
                        <td>${user.sellerName}</td>
                        <td>${user.sellerEmail}</td>
                        <td>${user.sellerContact}</td>
                        <td>${user.industryName}</td>
                        <td>${user.gstNumber}</td>
                        <td>${user.typeOfIndustry}</td>
                        <td>${user.isOnlineServiceAvailable}</td>
                        <td>${user.country}</td>
                        <td>${user.state}</td>
                        <td>${user.city}</td>
                        <td>${user.address}</td>
                        <td>${user.pincode}</td>
                        <td>${user.createdBy}</td>
                        <td>${user.createdOn}</td>
                        <td>${user.updatedBy}</td>
                        <td>${user.updatedOn}</td>
                        <td>${user.activeStatus}</td>
                        <td>${user.requestStatus}</td>
                        <td> <a href="approve?id=${user.id }">Approve</a>
                        	<a href="reject?id=${user.id }">Reject</a>
                        </td>
                    </tr>
                </c:forEach>
            </c:if>

            <c:if test="${not empty listOfAllSellers}">
                <c:forEach var="user" items="${listOfAllSellers}">
                    <tr>
                        <td>${user.id}</td>
                        <td>${user.sellerName}</td>
                        <td>${user.sellerEmail}</td>
                        <td>${user.sellerContact}</td>
                        <td>${user.industryName}</td>
                        <td>${user.gstNumber}</td>
                        <td>${user.typeOfIndustry}</td>
                        <td>${user.isOnlineServiceAvailable}</td>
                        <td>${user.country}</td>
                        <td>${user.state}</td>
                        <td>${user.city}</td>
                        <td>${user.address}</td>
                        <td>${user.pincode}</td>
                        <td>${user.createdBy}</td>
                        <td>${user.createdOn}</td>
                        <td>${user.updatedBy}</td>
                        <td>${user.updatedOn}</td>
                        <td>${user.activeStatus}</td>
                        <td>${user.requestStatus}</td>
                    </tr>
                </c:forEach>
            </c:if>

            <!-- If no data found -->
            <c:if test="${empty listOfApprovedSellers and empty listOfPendingSellers and empty listOfAllSellers}">
                <tr>
                    <td colspan="20" style="text-align:center;">No users found.</td>
                </tr>
            </c:if>
            

        </tbody>
    </table>

    <!-- Footer -->
    <footer>
        <p>&copy; 2025 CopyRight. All rights reserved.</p>
        <p>Designed by: Mallikharjuna</p>
        <div class="time" id="dateTime"></div>
    </footer>

    <script type="text/javascript">
    
 		// JavaScript function to change form action based on dropdown selection
  		function changeFormAction() {
  		    var userType = document.getElementById("userDropdown").value;
  		    var form = document.getElementById("userForm");
        
  			 // Set form action dynamically based on the selected option
  	     	 if (userType === "pendingSellers") {
  		 	  form.action = "${pageContext.request.contextPath}/pendingSellers";
  			 } else if (userType === "approvedSellers") {
  			    form.action = "${pageContext.request.contextPath}/approvedSellers";
   			 } else {
  			    form.action = "${pageContext.request.contextPath}/allSellers";
   		     }
  		 }
    
    
        // Function to update the current date and time
        function updateDateTime() {
            const now = new Date();
            const currentDateTime = now.toLocaleString();
            document.querySelector('#dateTime').textContent = currentDateTime;
        }
        setInterval(updateDateTime, 1000);
    </script>

</body>
</html>