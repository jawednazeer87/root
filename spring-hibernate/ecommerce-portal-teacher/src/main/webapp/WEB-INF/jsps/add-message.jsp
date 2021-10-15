<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<%@ page language="java" contentType="text/html;" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
            body {
                font-family: Arial, Helvetica, sans-serif;
            }
            
            form {
                border: 3px solid #f1f1f1;
            }
            
            input[type=text],
            input[type=date] {
                width: 40%;
                padding: 12px 20px;
                margin: 8px 0;
                display: inline-block;
                border: 1px solid #ccc;
                box-sizing: border-box;
            }
            
            button {
                background-color: #4CAF50;
                color: white;
                padding: 14px 20px;
                margin: 8px 0;
                border: none;
                cursor: pointer;
                width: auto;
            }
            
            button:hover {
                opacity: 0.8;
            }
            
            .imgcontainer {
                text-align: center;
                margin: 24px 0 12px 0;
            }
            
            img.pic {
                width: 80px;
                height: 80px;
                border-radius: 50%;
            }
            
            .container {
                display: block;
                padding: 16px;
                text-align: center;
            }
            
            span.psw {
                float: right;
                padding-top: 16px;
            }
            /* Change styles for span and cancel button on extra small screens */
            
            @media screen and (max-width: 300px) {
                span.psw {
                    display: block;
                    float: none;
                }
            }
        </style>
    </head>
    <body>
        <h2>Add A Message</h2>
        <form action="/add" modelAttribute="messageDto" method="post">
            <div class="imgcontainer">
                <img src="img/login2.png" alt="login" class="pic">
            </div>
            <div class="container">
                <label id="message">Message</label><br>
				<input type="text" name="message" placeholder="Enter message"><br>
				
				<label id="date">Date Created</label><br>
				<input type="date" name="date" placeholder="date"><br>
				
				<label id="sender">Sender</label><br>
				<input type="text" name="sender" placeholder="sender name"><br>
				
				<input type="submit" name="submit" class="container">
					${message}
				<br>
            </div>
        </form>
        <a href="/messages">Go back</a>	
    </body>
</html>