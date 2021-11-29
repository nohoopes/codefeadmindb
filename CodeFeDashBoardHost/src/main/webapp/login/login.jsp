<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="icon" type="image/x-icon" href="../image/logo2.png" />
<link rel="stylesheet" href="../style/loginstyle.css">
<title>CodeFe Admin Login</title>
</head>
<body>

	<div class="card">
		<h1>CodeFe Admin Login</h1>
		<form action="<%=request.getContextPath()%>/login" method="post">

			<label for="uname">&ensp;&nbsp;User Name:</label> 
			<input type="text" class="form-control" id="username" 
			    placeholder="User Name" name="username" required><br> 
			<label for="uname">&ensp;&nbsp;Password:&ensp;</label>
			<input type="password" class="form-control" id="password"
				placeholder="Password" name="password" required><br>
				<button type="submit" class="btn" id="submit">Submit</button>
			</form>
			
			
	</div>
</body>
</html>