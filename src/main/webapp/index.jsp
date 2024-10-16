<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Index JSP Page</title>
    <link rel="stylesheet" href=" <%= application.getContextPath() %>/css/style.css"/>
</head>
<body>
    <div class="container">
    
    <%@include file="menu.jsp" %>
    
    <h1>This is first web project</h1>
    <p>Welcome to home page</p>
    
    <form action="<%= application.getContextPath()%>/third" method="post">
    	<input type="text" name="message" placeholder="Enter Text here">
    	<button type="submit">Submit</button>
    
    </form>
    
    </div>
    
    <script src="<%= application.getContextPath()%>/js/script.js"></script>
    
</body>
</html>
