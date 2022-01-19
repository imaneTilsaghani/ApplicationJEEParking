/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function () {
    var id;
    $.ajax({
        url: "PlaceController",
        data: {op: "load"},
        type: 'POST',
        success: function (data, textStatus, jqXHR) {
            remplir(data);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            alert(textStatus);
        }
    });

    $("#content").on("click", "#lib", function ()
    {
        id = $(this).closest("tr").find("td").eq(0).text();
        $.ajax({
            url: "PlaceController",
            data: {op: "updateEtatFalse", id: id},
            type: 'POST',
            success: function (data, textStatus, jqXHR) {
                remplir(data);
            },
            error: function (jqXHR, textStatus, errorThrown) {
                console.log(textStatus);
            }
        });
    });

    $("#content").on("click", "#occuper", function ()
    {
        id = $(this).closest("tr").find("td").eq(0).text();
        $.ajax({
            url: "PlaceController",
            data: {op: "updateEtat", id: id},
            type: 'POST',
            success: function (data, textStatus, jqXHR) {
                remplir(data);
            },
            error: function (jqXHR, textStatus, errorThrown) {
                console.log(textStatus);
            }
        });

    });

    function remplir(data) {
        var ligne = "";
        data.forEach(function (e) {
            ligne += "<tr><td>" + e.id + "</td><td>" + e.numero + "</td><td>" + e.etat + "</td><td>" + e.type + "</td><td>" + e.ref + "</td><td><button class='btn btn-success' id='lib'>liberer</button></td> <td><button class='btn btn-warning' id='occuper'>occuper</button></td></tr>";
        });
        $("#content").html(ligne);
    }
});


