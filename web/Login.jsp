<%-- 
    Document   : Login
    Created on : 19 janv. 2022, 10:04:26
    Author     : Imane
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
        <title>Authentification</title>
        <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />
        <link rel="stylesheet" href="template/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i">
        <link rel="stylesheet" href="template/css/ready.css">
        <link rel="stylesheet" href="template/css/demo.css">
    </head>
    <body>
        <script>
                 $(document).ready(function () {
     $("#log").click(function () {
        var username = $("#username").val();
        var password= $("#password").val();
        alert(username);
        $.ajax({
            url: "LoginController",
            data: {username:username,password:password},
            type: 'POST',
            success: function (data, textStatus, jqXHR) {
                remplir(data);
                console.log(data);
            },
            error: function (jqXHR, textStatus, errorThrown) {
                console.log(textStatus);
            }
        });
    });
    
    })
        </script>
            
   
        <div class="container" style="margin-left:500px">
            <div class="row-card-no-pd" >
                <div  style="margin-right:700px" class="card-body" >
                   <form  action="LoginController?op=log"method="POST"style="border:2px solid" >
                        <fieldset>
                            <div class="form-group">
                                <h2>Authentification</h2>
                            </div>
                            <div class="form-group">
                                <label>UserName</label>
                                <input type="text" name="username" id="username"clas="form-control">

                            </div>
                            <div class="form-group">
                                <label>Password</label>
                                <input type="password" name="password" id="password"clas="form-control">
                                <input type="hidden" name="op"  value="log">

                            </div>
                            <div class="form-group">
                                <button type="submit" id="log" class="btn btn-success">Login in</button>
                            </div></fieldset>
                       
                    </form>
                 
                </div>
            </div>
        </div>

    </body>
</html>
