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
            input[type=text] {
                align-items: center;
                width: 20%;
                padding: 12px 20px;
                margin: 8px 0;
                margin-right: 100px;
                display: inline-block;
                border: 1px solid #ccc;
                box-sizing: border-box;
            }
            select {
                align-items: center;
                width: 20%;
                padding: 12px 20px;
                margin: 14px 0;
                margin-right: 74px;
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
                width: 8%;
            }
            button:hover {
                opacity: 0.8;
            }
            input[type=submit]:hover {
                opacity: 0.8;
            }
            .div2 {
                text-align: center;
            }
        </style>
    </head>

    <body>
        <h2 style="text-align:center">Log-in</h2>
        <form action="/upload" method="post" enctype="multipart/form-data">
            <div class="div2">
                <label for="doc">Doc Name:</label>
                <input type="text" placeholder="Enter doc name" name="docName"><br>
                <label for="doc">Doc Id:</label>
                <select name="doc" id="doc">
                    <option> select Id..</option>
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                </select><br><br>
                <label for="docs"> Upload files:</label>
                <input type="file" name="docs" id="docs" multiple required><br><br>
                <button type="submit">save</button><br>
            </div>
        </form>
        ${message}
    </body>

    </html>