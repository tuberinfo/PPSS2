


    
  $.get("/todos", function(todos) {
      
     $.each(todos, function(index, product) {
          $('#todos').append($("<tr>"));
       
       $("tr:last").last().append("<td>" + product.description + "</td>");
       $("tr:last").last().append("<td>" + product.date  + "</td>");
       $("tr:last").last().append("<td>" +  product.progress + "</td>");
         $("tr:last").last().append("<td> " +" <button  type=\"button\" class=\"btn btn-default\" onclick=\"myFunction()\"> <span class=\"glyphicon glyphicon-pencil\" aria-hidden=\"true\"></span> "  +" <button id=\"delete\" type=\"button\" class=\"btn btn-default\"> <span class=\"glyphicon glyphicon-remove\" aria-hidden=\"true\"></span>  </button>"+"</td>");
       
    });
  });
  /*
  $(".btn.btn-default").click(function(){
      $(this).parent().parent().hide();
      
  });
  */
  
 
