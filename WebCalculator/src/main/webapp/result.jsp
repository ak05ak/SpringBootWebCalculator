<%@ page language="java"%>

<html>
    <head>
        <title>Calculator Result</title>
        <link rel="stylesheet" type="text/css" href="style.css">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div class="container">
            <h2>Calculation Result</h2>

            <div class="card result-card">
                <% if(session.getAttribute("error") != null) { %>
                    <div class="error-message">
                        <p><%= session.getAttribute("error") %></p>
                    </div>
                <% } else { %>
                    <div class="calculation">
                        <p class="equation">${num1} ${operation} ${num2} = </p>
                        <p class="result">${res}</p>
                    </div>
                <% } %>

                <div class="actions">
                    <a href="/" class="button">Calculate Again</a>
                </div>
            </div>
        </div>
    </body>
</html>