<%-- 
    Document   : stati.jsp
    Created on : 19 janv. 2022, 19:09:25
    Author     : Imane
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
        <title>Formulaire Gestion Place</title>
        <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />
        <link rel="stylesheet" href="template/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i">
        <link rel="stylesheet" href="template/css/ready.css">
        <link rel="stylesheet" href="template/css/demo.css">
        <script src="template/js/core/jquery.3.2.1.min.js"></script>
        <script src="script/Place.js" type="text/javascript"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/3.7.0/chart.min.js" integrity="sha512-TW5s0IT/IppJtu76UbysrBH9Hy/5X41OTAbQuffZFU6lQ1rdcLHzpU5BzVvr/YFykoiMYZVWlr/PX1mDcfM9Qg==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
        
    </head>
    <body>
        <div class="wrapper">
            <%@include file="template/header.jsp" %>
            <%@include  file="template/menu.jsp" %>
            <div class="main-panel">
                <canvas style="background-color:white;max-width: 500px;position: relative;left: 280px;max-height: 500px;margin-top: 100px" id="myChart" ></canvas>
                <%@include file="template/footer.jsp" %>
            </div>
        </div>
            <script src="script/stati.js"></script>
    </body>
    
    <script src="template/js/plugin/jquery-ui-1.12.1.custom/jquery-ui.min.js"></script>
    <script src="template/js/core/popper.min.js"></script>
    <script src="template/js/core/bootstrap.min.js"></script>
    <script src="template/js/plugin/chartist/chartist.min.js"></script>
    <script src="template/js/plugin/chartist/plugin/chartist-plugin-tooltip.min.js"></script>
    <script src="template/js/plugin/bootstrap-notify/bootstrap-notify.min.js"></script>
    <script src="template/js/plugin/bootstrap-toggle/bootstrap-toggle.min.js"></script>
    <script src="template/js/plugin/jquery-mapael/jquery.mapael.min.js"></script>
    <script src="template/js/plugin/jquery-mapael/maps/world_countries.min.js"></script>
    <script src="template/js/plugin/chart-circle/circles.min.js"></script>
    <script src="template/js/plugin/jquery-scrollbar/jquery.scrollbar.min.js"></script>
    <script src="template/js/ready.min.js"></script>
</html>

