/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function () {
    var id;
    $.ajax({
        url: "SectionController",
        data: {op: "load"},
        type: 'POST',
        success: function (data, textStatus, jqXHR) {
            remplir(data);
            console.log(data);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            alert(textStatus);
            alert(jqXHR);
            alert(errorThrown);
        }
    });
    $("#add").click(function () {
        var ref = $("#ref").val();
        $.ajax({
            url: "SectionController",
            data: {ref: ref},
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
    $('#Gsec').toggle().hide();
    //  $('#Gsec').css('visibility', 'hidden');
    $("#h").click(function () {
        $('#Gsec').toggle(2000).show();

    });
    $("#content").on("click", "#delete", function () {
        var id = $(this).closest("tr").find("td").eq(0).text();
        $.ajax({
            url: "SectionController",
            data: {op: "delete", id: id},
            type: 'POST',
            success: function (data, textStatus, jqXHR) {
                remplir(data);
            },
            error: function (jqXHR, textStatus, errorThrown) {
                console.log(textStatus);
            }
        });

    });

    $("#content").on("click", "#update", function ()
    {
        id = $(this).closest("tr").find("td").eq(0).text();
        $("#ref").val($(this).closest("tr").find("td").eq(1).text());
        $('#Gsec').toggle(1000).show();
    }
    );
    $("#mod").click(function () {
        var ref=$("#ref").val();
        console.log(ref);
        $.ajax({
            url: "SectionController",
            data: {op: "update", id: id, ref: ref},
            type: 'POST',
            success: function (data, textStatus, jqXHR) {
                remplir(data);
            },
            error: function (jqXHR, textStatus, errorThrown) {
                console.log(textStatus);
            }
        });
    });
     $("#content").on("click", "#generer", function () {
        var id = $(this).closest("tr").find("td").eq(0).text();
        $.ajax({
            url: "PlaceController",
            data: {op:"gene",id:id},
            type: 'POST',
            success: function (data, textStatus, jqXHR) {
                alert(data);
            },
            error: function (jqXHR, textStatus, errorThrown) {
                alert(textStatus);
            }
        });
    });

    function remplir(data) {
        var ligne = "";
        data.forEach(function (e) {
            ligne += "<tr><td>" + e.id + "</td><td>" + e.ref + "</td><td><button  class='btn btn-danger'id='delete'>Supprimer</button></td><td><button class='btn btn-warning' id='update'>Modifier</button></td><td><button id='generer' class='btn btn-success'>Generer</button></td></tr>";
        });
        $("#content").html(ligne);
    }
});





