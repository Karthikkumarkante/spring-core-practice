<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
        #blink {
            font-size: 22px;
            font-weight: bold;
            font-family: inherit;
            color: red;
        }
    </style>
</head>
<body style="background-color: pink">
	<h1 style="text-align: center; color: red">LOVE CALCULATOR</h1>
	<hr style="height: 5px;
           background: black;
           margin: 20px 0;
           box-shadow: 0px 0px 4px 2px rgba(204,204,204,1);"/>
    <div>
    	<p>Your Name: ${userInfo.userName}</p>
    	<p>Crush Name: ${userInfo.crushName}</p>
    	<p>You and ${userInfo.crushName} are <i id="blink"><b/>inspirational Best Couple In The World</i></p>
    	<!--  <script type="text/javascript">
        var blink = 
            document.getElementById('blink');
  
        setInterval(function () {
            blink.style.opacity = 
            (blink.style.opacity == 0 ? 2 : 0);
        }, 100); 
    </script>-->
    </div>
</body>
</html>