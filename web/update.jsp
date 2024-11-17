<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update Book</title>
</head>
<body>
    <h2>Update Book Details</h2>
    <form action="update" method="POST">
        <label for="BookId">Book ID:</label><br>
        <input type="number" id="BookId" name="BookId" required><br><br>

        <label for="BookName">Book Name:</label><br>
        <input type="text" id="BookName" name="BookName" required><br><br>

        <label for="AuthorName">Author Name:</label><br>
        <input type="text" id="AuthorName" name="AuthorName" required><br><br>

        <label for="Category">Category:</label><br>
        <input type="text" id="Category" name="Category" required><br><br>

        <input type="submit" value="Update Book">
    </form>
    <br>
    <a href="index.html">Back to Home</a>
</body>
</html>
