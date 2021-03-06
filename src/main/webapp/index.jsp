<!DOCTYPE html>
<html lang="en">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<head>
    <meta charset="UTF-8">
    <title>Revature Inventory Management - Login Screen</title>

</head>
<body>
<div class="sidenav">
    <div class="login-main-text">
        <h2>Application<br> Login Page</h2>
        <p>Login or register from here to access.</p>
    </div>
</div>
<div class="main">
    <div class="col-md-6 col-sm-12">
        <div class="login-form">

            <form method="POST" action="Login" id="logform">
                <div class="form-group">
                    <label>User Email</label>
                    <input type="email" id="email" class="form-control" placeholder="User Email">
                </div>
                <div class="form-group">

                    <label>Password</label>
                    <input type="password" id="password" type="password" class="form-control" placeholder="Password">
                </div>
                <button type="submit" class="btn btn-black" value="login">Login</button>
                <button type="submit" class="btn btn-secondary">Register</button>
            </form>
        </div>
    </div>
</div>

<script src="functionality.js"></script>
</body>
</html>