<%@ page language="java"%>

<html>
    <head>
        <title>Akarsh Calculator</title>
        <link rel="stylesheet" type="text/css" href="style.css">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div class="container">
            <h2>Calculator</h2>

            <div class="card">
                <form action="calculate">
                    <div class="form-group">
                        <label for="num1">Enter 1st Number:</label>
                        <input type="text" id="num1" name="num1" placeholder="e.g. 10.5" required>
                    </div>

                    <div class="form-group">
                        <label for="num2">Enter 2nd Number:</label>
                        <input type="text" id="num2" name="num2" placeholder="e.g. 5.5" required>
                    </div>

                    <div class="form-group operations">
                        <label>Select Operation:</label>
                        <div class="operation-buttons">
                            <button type="submit" name="operation" value="add">+</button>
                            <button type="submit" name="operation" value="subtract">-</button>
                            <button type="submit" name="operation" value="multiply">*</button>
                            <button type="submit" name="operation" value="divide">/</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>