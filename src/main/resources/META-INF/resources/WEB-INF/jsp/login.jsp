<html>
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
    <head>
        <title>login title</title>
    </head>
    <body>
        <div class="container">
        Login
        <pre>${errorMessage}</pre>
        <form method="post">
            Name : <input type="Text" name="name"/>
            Password : <input type="password" name="password"/>
            <input type="submit"/>

        </form>
        </div>
    </body>
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</html>