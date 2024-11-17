<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Delete Book</title>
</head>
<body>
    <h2>Delete a Book</h2>
    <form action="delete" method="POST">
        <label for="BookId">Book ID:</label><br>
        <input type="number" id="BookId" name="BookId" required><br><br>
        <input type="submit" value="Delete Book">
    </form>
    <br>
    <a href="index.html">Back to Home</a>
</body>
</html>
