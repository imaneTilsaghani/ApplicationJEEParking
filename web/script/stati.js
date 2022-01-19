/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function (){
       $.ajax({
        url: "PlaceController",
        data: {op: "statitics"},
        type: 'POST',
        success: function (data, textStatus, jqXHR) {
          
        },
        error: function (jqXHR, textStatus, errorThrown) {
            alert(textStatus);
        }
        
    });
 var myChart = document.getElementById("myChart").getContext('2d');
            var chart = new Chart(myChart, {
                type: 'bar',
                data: {
                    labels: ["section 1 "," section 2","section 3"],
                    datasets: [{
                            label: 'Nombre des places libres',
                            data: [1,7,9],
                            backgroundColor: '#ff006e',
                            borderWidth: 2,
                            borderColor: 'black'
                        }]
                }
            });
           
            $('#chart').show();
       
       });
