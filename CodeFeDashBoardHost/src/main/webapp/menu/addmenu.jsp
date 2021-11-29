<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="../style/menustyle.css">
<link rel="icon" type="image/x-icon" href="../image/logo2.png" />
<link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css'
	rel='stylesheet'>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta charset="UTF-8">
<title>CodeFe Admin</title>
</head>
<body>
	<div class="sidebar">
		<div class="logo-details">
			<div class="logo_name">CodeFe</div>
			<i class='bx bx-menu' id="btn"></i>
		</div>
		<li><a href="${pageContext.request.contextPath}/NumberController"
			method="post"> <i class='bx bx-grid-alt'></i> <span
				class="links_name">Dashboard</span>
		</a> <span class="tooltip">Dashboard</span></li>
		<li><a
			href="${pageContext.request.contextPath}/CustomerController"
			method="post"> <i class='bx bx-group'></i> <span
				class="links_name">Customer</span>
		</a> <span class="tooltip">Customer</span></li>
		<li><a
			href="${pageContext.request.contextPath}/MessageController"> <i
				class='bx bx-chat'></i> <span class="links_name">Messages</span>
		</a> <span class="tooltip">Messages</span></li>
		<li><a href="analytic/analytic.jsp"> <i
				class='bx bx-pie-chart-alt-2'></i> <span class="links_name">Analytics</span>
		</a> <span class="tooltip">Analytics</span></li>
		<li><a
			href="${pageContext.request.contextPath}/FoodDrinkController"> <i
				class='bx bx-cart-alt'></i> <span class="links_name">Menu</span>
		</a> <span class="tooltip">Menu</span></li>

		<li><a href="login/login.jsp"> <i class='bx bx-log-out'></i>
				<span class="links_name">Log out</span>
		</a> <span class="tooltip">Log out</span></li>
		</ul>
	</div>
	<!-- noi dung-->
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<section class="home-section">
		<form action="<%=request.getContextPath()%>/addmenu" method="post">
			<div class="container">
				<div class="pannel">
					<h1>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;Attributes</h1>
					<br>
					<p>&ensp;Name</p>
					<input class="input-item" type="text" id="name" name="name" value=""><br>
					<br>
					<p>&ensp;Price</p>
					<input class="input-item" type="text" id ="price" name="price" value=""><br>
					<br>
					<p>&ensp;Type</p>
					<input class="input-item" type="text" id ="type "name="type" value=""><br>
					<br>
					<p>&ensp;Status</p>
					<input class="input-item" type="text" id="status" name="status" value=""><br>
					<br>
					<p>&ensp;Code</p>
					<input class="input-item" type="text" id="code" name="code" value=""><br>
					<br>
					<p>&ensp;Description</p>
					<input class="input-item" type="text" id="description"name="description" value=""><br>
					<br>
				</div>
				<div class="pannel">
					<h1>Thêm hình(Coming Soon)</h1>
					<input type="submit" value="  Add to Menu  " id="submit">
				</div>
			</div>
		</form>
	</section>

	<script>
        let sidebar = document.querySelector(".sidebar");
        let closeBtn = document.querySelector("#btn");
        let searchBtn = document.querySelector(".bx-search");

        closeBtn.addEventListener("click", () => {
            sidebar.classList.toggle("open");
            menuBtnChange();//calling the function(optional)
        });

        searchBtn.addEventListener("click", () => { // Sidebar open when you click on the search iocn
            sidebar.classList.toggle("open");
            menuBtnChange(); //calling the function(optional)
        });

        // following are the code to change sidebar button(optional)
        function menuBtnChange() {
            if (sidebar.classList.contains("open")) {
                closeBtn.classList.replace("bx-menu", "bx-menu-alt-right");//replacing the iocns class
            } else {
                closeBtn.classList.replace("bx-menu-alt-right", "bx-menu");//replacing the iocns class
            }
        }
    </script>
</body>
</html>