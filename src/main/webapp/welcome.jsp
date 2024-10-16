<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page</title>
</head>
<body>
	<%
		boolean isCookie = false;
		String name = (String)session.getAttribute("username");
		Cookie[] cookies = request.getCookies();
		for(Cookie cookie: cookies){
			System.out.println("cookie "+cookie.getName()+" "+cookie.getValue());
			if(cookie.getName().equals("userId") && cookie.getValue().equals("12345")){
				isCookie = true;
			}
		}
		if(name!=null && !name.isBlank() && isCookie){
			out.println("<h1>Welcome to my page! "+name+" </h1>");
		}
		else{
			out.println("<h2>Unauthorised</h2>");
		}
		
	%>
</body>
</html>