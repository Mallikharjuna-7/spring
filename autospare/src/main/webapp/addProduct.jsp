<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Product</title>
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

        /* Logo Styling */
        .logo {
            height: 40px;
            width: 40px;
            display: inline-block;
            border-radius: 10px;
        }

        /* Add Product Container */
        .add-product-container {
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 600px; /* Smaller width for the container */
            margin: 40px auto; /* Adds space from top and bottom */
            flex-grow: 1;
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
            margin-bottom: 15px;t
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

        .input-group input, .input-group textarea, .input-group select {
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
        .input-group input:focus, .input-group textarea:focus, .input-group select:focus {
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

        .add-product-btn, .reset-btn {
            padding: 10px 20px;
            font-size: 15px;
            cursor: pointer;
            width: 50%; /* Ensures buttons are not too wide */
            border-radius: 4px;
            border: none;
        }

        .add-product-btn {
            background-color: #28a745; /* Green for Submit */
            color: white;
        }

        .add-product-btn:hover {
            background-color: #218838;
        }

        .reset-btn {
            background-color: #dc3545; /* Red for Reset */
            color: white;
        }

        .reset-btn:hover {
            background-color: #c82333;
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

        .time {
            font-size: 14px;
            text-align: right;
        }
    </style>
</head>
<body>

    <header>
        <img class="logo" src="https://images.yourstory.com/cs/images/companies/Molitics-1648544588952.png?fm=auto&ar=1%3A1&mode=fill&fill=solid&fill-color=fff&format=auto&w=384&q=75" alt="Logo">
        <h1>M Spares <p>automotive spare parts</p></h1>
    </header>

    <div class="add-product-container">
        <h2>Add Product</h2>
        <form action="addProduct" method="post"  enctype="multipart/form-data">
            <div class="form-row">
                <!-- Product Name -->
                <div class="input-group">
                    <label for="email">Email</label>
                    <input type="text" id="email" name="email" value="${sellerDto.sellerEmail }"  readonly>
                </div>
                <div class="input-group">
                    <label for="productName">Product Name</label>
                    <input type="text" id="productName" name="productName" required>
                </div>
                <!-- Product Code -->
                <div class="input-group">
                    <label for="productCode">Product Code</label>
                    <input type="text" id="productCode" name="productCode" required>
                </div>
            </div>

            <div class="form-row">
                <!-- Product Description -->
                <div class="input-group">
                    <label for="productDescription">Description</label>
                    <textarea id="productDescription" name="productDescription" rows="4" required></textarea>
                </div>
                <!-- Product Price -->
                <div class="input-group">
                    <label for="price">Price</label>
                    <input type="number" id="price" name="price" required>
                </div>
            </div>

            <div class="form-row">
                <!-- Product Category -->
                <div class="input-group">
                    <label for="productCategory">Category</label>
                    <select id="productCategory" name="productCategory" required>
                        <option value="engine">Engine Parts</option>
                        <option value="suspension">Suspension</option>
                        <option value="brake">Brakes</option>
                        <option value="electrical">Electrical</option>
                        <option value="exterior">Exterior</option>
                        <option value="interior">Interior</option>
                    </select>
                </div>
                <!-- Stock Quantity -->
                <div class="input-group">
                    <label for="stockQuantity">Stock Quantity</label>
                    <input type="number" id="stockQuantity" name="stockQuantity" required>
                </div>
            </div>

            <div class="form-row">
                <!-- Supplier Name -->
                <div class="input-group">
                    <label for="supplierName">Supplier Name</label>
                    <input type="text" id="supplierName" name="supplierName" required>
                </div>
                <!-- Product Image -->
                <div class="input-group">
                    <label for="productImage">Product Image</label>
                    <input type="file" id="productImage" name="productImage" accept="image/*" required>
                </div>
            </div>

            <div class="form-buttons">
                <input class="add-product-btn" type="submit" value="Add Product">
                <input class="reset-btn" type="reset" value="Reset">
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
