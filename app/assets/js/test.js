
/*
$.get("/products", function (product) {
   
    $("#products").append("<tr>");
    
   
    
        for ( i=0; i<3;i++) {
             $("tr:last").last().append("<td> test " +product.id+ "</td>");
        }
    
});
*/


    
  $.get("/products", function(products) {
      
     $.each(products, function(index, product) {
          $('#products').append($("<tr>"));
       
       $("tr:last").last().append("<td>" + product.id + "</td>");
       $("tr:last").last().append("<td>" + product.date  + "</td>");
       $("tr:last").last().append("<td>" +  product.progress + "</td>");
         $("tr:last").last().append("<td> " +" <button type=\"button\" class=\"btn btn-default\"> <span class=\"glyphicon glyphicon-pencil\" aria-hidden=\"true\"></span> "  +" <button type=\"button\" class=\"btn btn-default\"> <span class=\"glyphicon glyphicon-remove\" aria-hidden=\"true\"></span>  </button>"+"</td>");
       
    });
  });
  
 
