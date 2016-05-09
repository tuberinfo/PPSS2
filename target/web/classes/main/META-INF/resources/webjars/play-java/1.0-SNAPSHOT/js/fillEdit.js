$.get("/todos", function(todos) {
	$.each(todos, function(index, product) {
										$('#todos').append($("<tr>"));
										/*$("tr:last").last().append("<form action=\"@routes.HomeController.addTodo()\" method=\"post\" >");*/
										$("tr:last").last().append("<td>" + "<input type=\"text\" name=\"description\" value=\"" + product.description + "\" id=\"descr-" + product.id + "\"></input>" + "</td>");
										$("tr:last").last().append("<td>" + "<input type=\"text\" name=\"date\" value=\"" + product.date + "\" id=\"date-" + product.id + "\"></input>" + "</td>");
										$("tr:last").last().append("<td>" + "<input type=\"text\" name=\"progress\" value=\"" + product.progress + "\" id=\"progr-" + product.id + "\"></input>" + "</td>");
										$("tr:last").last().append("<td> " + " <button type=\"button\" class=\"btn btn-default\" onclick=\" doUpdate(" + product.id + ")\"> <span class=\"glyphicon glyphicon-pencil\" aria-hidden=\"true\"></span> </button>" + 
												" <button type=\"button\" class=\"btn btn-default\"> <span class=\"glyphicon glyphicon-remove\" aria-hidden=\"true\"></span> </button>" + "</td>");
										$("tr:last").last().append(" </form>");

									});
				});


function doUpdate(id){
	$.ajax({url:"/changeTodo/" + id, type: "PUT", data: "description=" + $("#descr-" + id).val() + "&date=" + $("#date-" + id).val() + "&progress=" + $("#progr-" + id).val(), success: location.reload()});
	alert('doen');
}