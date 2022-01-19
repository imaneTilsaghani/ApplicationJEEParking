<%-- 
    Document   : index
    Created on : 22 déc. 2021, 22:59:17
    Author     : Imane
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
        <title>Gestion Parking</title>
        <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />
        <link rel="stylesheet" href="template/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i">
        <link rel="stylesheet" href="template/css/ready.css">
        <link rel="stylesheet" href="template/css/demo.css">
    </head>
    <body>
        <div class="wrapper">
            <%@include file="template/header.jsp" %>
            <%@include  file="template/menu.jsp" %>
            <div class="main-panel">
                <div class="content">
                    <h4 style="margin-left: 280px"> Bienvenue dans notre parking !</h4>
                    <div class="img-fluid"><img src="template/img/par.jpg" alt="parking"></div>
                </div>
                <%@include file="template/footer.jsp" %>
            </div>
        </div>

        <!-- Modal -->
        <div class="modal fade" id="modalUpdate" tabindex="-1" role="dialog" aria-labelledby="modalUpdatePro" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered" role="document">
                <div class="modal-content">
                    <div class="modal-header bg-primary">
                        <h6 class="modal-title"><i class="la la-frown-o"></i> Under Development</h6>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body text-center">									
                        <p>Currently the pro version of the <b>Ready Dashboard</b> Bootstrap is in progress development</p>
                        <p>
                            <b>We'll let you know when it's done</b></p>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    </div>
                </div>
            </div>
        </div>
    </body>
    <script src="template/js/core/jquery.3.2.1.min.js"></script>
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
