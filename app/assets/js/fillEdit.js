$.get("/todos", function(todos) {
      
     $.each(todos, function(index, product) {
          $('#todos').append($("<tr>"));
         $("tr:last").last().append("<form action=\"@routes.HomeController.addTodo()\" method=\"post\">");
       $("tr:last").last().append("<td>" + "<input type=\"text\" name=\"description\" placeholder=\"" + product.description+"\"></input>" +  "</td>");
       $("tr:last").last().append("<td>" + "<input type=\"text\" name=\"description\" placeholder=\"" + product.date+"\"></input>" +  "</td>");
      $("tr:last").last().append("<td>" + "<input type=\"text\" name=\"description\" placeholder=\"" + product.progress+"\"></input>" +  "</td>");
       $("tr:last").last().append("<td> " +" <button type=\"button\" class=\"btn btn-default\"> <span class=\"glyphicon glyphicon-pencil\" aria-hidden=\"true\"></span> "  +" <button type=\"button\" class=\"btn btn-default\"> <span class=\"glyphicon glyphicon-remove\" aria-hidden=\"true\"></span>  </button>"+"</td>");
         $("tr:last").last().append(" </form>");
    
    
    });
  });