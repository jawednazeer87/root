<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <!DOCTYPE html>
        <html lang="en">

        <head>
            <title>Table</title>
            <meta charset="utf-8">
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
            <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
            <style>
                p {
                    font-size: 2 0px;
                }
                
                label {
                    margin-left: 8px;
                }
                
                input[type="text"] {
                    margin-left: 8px;
                }
            </style>
        </head>

        <body>
            <nav class="navbar navbar-default">
                <div class="container-fluid">

                    <ul class="nav navbar-nav">
                        <li class="active"><a href="/add">New Message</a></li>
                        <li>
                        	<form action="/search">
	                            <label>search messages</label><br>
	                            <input type="text" name="search" placeholder="id or sender name">
	                            <input type="submit" value="submit">
                            </form>
                        </li>
                    </ul>
                </div>
            </nav>
            <div class="container">
                <p> </p>
                <p>search</p>
            </div>
            <div class="container">
                <table class="table">
                    <thead>
                        <tr>
                            <th></th>
                            <th>Message</th>
                            <th>Date sent</th>
                            <th>Sender</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${messages}" var="message">
                            <tr>
                                <td>${message.id}</td>
                                <td>${message.message}</td>
                                <td>${message.dateCreated}</td>
                                <td>${message.sender}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </body>

        </html>