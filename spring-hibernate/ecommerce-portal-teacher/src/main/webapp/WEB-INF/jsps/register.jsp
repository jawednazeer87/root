<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html>
    <html>

    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <style>
            body {
                font-family: Arial, Helvetica, sans-serif;
            }
            
            form {
                border: 3px solid #f1f1f1;
            }
            
            input[type=text],
            input[type=password],
            input[type=email],
            input[type=number] {
                width: 40%;
                padding: 12px 20px;
                margin: 8px 0;
                display: inline-block;
                border: 1px solid #ccc;
                box-sizing: border-box;
            }
            
            .div5 {
                align-content: center;
            }
            
            input[type=radio] {
                justify-content: space-between;
                align-content: space-around;
                margin: 0 90px 0 90px;
            }
            
            label {
                margin: 0 44px 0 72px;
            }
            
            input[type=date] {
                width: 30%;
                padding: 12px 20px;
                margin: 0 55px 0 24px;
                display: inline-block;
                border: 1px solid #ccc;
                box-sizing: border-box;
            }
            
            button {
                background-color: #4CAF50;
                color: white;
                padding: 14px 20px;
                margin: 5px 370px;
                border: none;
                cursor: pointer;
                width: 40%;
            }
            
            button:hover {
                opacity: 0.8;
            }
            
            .signup {
                width: auto;
                text-align: center;
                margin: 10px 10px 1px 100px;
                padding: 10px 18px;
                background-color: #4CAF50;
                color: white;
                border: none;
            }
            
            input[type=submit]:hover {
                opacity: 0.8;
            }
            
            .div2 {
                text-align: center;
            }
            
            .div4 {
                text-align: center;
            }
        </style>
    </head>

    <body>
        <h2 style="text-align:center;">Register Now</h2>
        <form action="/registration" method="post" modelAttribute="userDto">
            <div class="div2">
            	<input type="text" placeholder="Enter first name" name="firstName" /><br>
            	<input type="text" placeholder="Enter last name" name="lastName" /><br>
                <input type="email" placeholder="Enter email" name="email" /><br>
                <input type="password" placeholder="Enter password" name="passwordUser" /><br>
                <input type="text" placeholder="Enter membership number" name="membershipNum" /><br>
                <input type="text" placeholder="Enter contact number" name="contactNum" /><br>
                
            </div><br>
            <div class="div4 date">
                <label for="dob"><b>Dob:</b></label>
                <input type="text" value="yyyy-MM-dd" name="dobString"><br><br>
            </div>
            <div class="div2">
                <input type="radio" name="user" value="user">
                <input type="radio" name="seller" value="seller">
                <input type="radio" name="company" value="company"><br><br>
                <label for="user">user</label>
                <label for="seller">individual seller</label>
                <label for="company">company</label>
            </div><br>
            <div class="div2 ">
                <button type="submit">Register</button>
            </div>
        </form>
    </body>

    </html>