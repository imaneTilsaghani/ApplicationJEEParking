<%-- 
    Document   : Place
    Created on : 23 déc. 2021, 09:20:54
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
    </head>
    <body>
        <div class="wrapper">
            <%@include file="template/header.jsp" %>
            <%@include  file="template/menu.jsp" %>
            <div class="main-panel">
                <div class="content">
                    <div class="container-fluid">
                        <h4 class="page-title">Gestion Place</h4>
                        <div class="row">
                            <div class="card">
                                <div class="card-body">
                                    <legend>Liste des Places</legend>
                                    <fieldset>
                                        <table class="table">
                                            <thead>
                                                <tr>
                                                    <th scope="col">Id</th>
                                                    <th scope="col">Numero</th>
                                                    <th scope="col">Etat</th>
                                                    <th scope="col">Type</th>
                                                    <th scope="col">Reference </th>
                                                    <th scope="col">Liberer</th>
                                                    <th scope="col">Occuper</th>
                                                </tr>
                                            </thead>
                                            <tbody id="content">

                                            </tbody>
                                        </table>
                                    </fieldset>
                                </div>
                            </div>
                    </div>
                        </div>
                          
                </div>
                <%@include file="template/footer.jsp" %>
            </div>
        </div>
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
