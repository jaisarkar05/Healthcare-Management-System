<html>
<body>

<h2>Add User (Admin Only)</h2>

<form action="addUser" method="post">

Name: <input type="text" name="name" required><br><br>
Email: <input type="email" name="email" required><br><br>
Password: <input type="password" name="password" required><br><br>

Role:
<select name="role">
    <option value="ADMIN">Admin</option>
    <option value="DOCTOR">Doctor</option>
    <option value="PATIENT">Patient</option>
</select>
<br><br>

<button type="submit">Add User</button>

</form>

</body>
</html>
