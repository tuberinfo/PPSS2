$.get("/todos", function(todos) {
	$.each(todos, function(index, product) {
		$('#todos').append($("<tr>"));
		$("tr:last").last().append("" +
			"<td class=\"row\">" +
				"<form action=\"@routes.HomeController.addTodo()\" method=\"post\">" +
						"<div class=\"col-xs-4\">" +
								"<input  name=\"descr\" value=\"" + product.description + "\" id=\"descr-" + product.id + "\" class=\"form-control input-group\"></input>" + 
							"</div>" +
					"<div class=\"col-sm-8 col-xs-12\">" +
						"<div class=\"row\">" +
							"<div class=\"col-xs-4\">" +
								"<input type=\"date\" name=\"date\" value=\"" + product.date + "\" id=\"date-" + product.id + "\" class=\"form-control input-group\"></input>" + 
							"</div>" +
							"<div class=\"col-xs-4\">" +
								"<input type=\"range\" min=\"0\" max=\"100\" step=\"5\" name=\"progress\" value=\"" + product.progress + "\" id=\"progr-" + product.id + "\" class=\"form-control input-group\"></input>" + 
							"</div>" +
							"<div class=\"row col-xs-4\">" +
								"<button type=\"button\" class=\"btn btn-default\" onclick=\" doUpdate(" + product.id + ")\"> " +
									"<span class=\"glyphicon glyphicon-pencil\" aria-hidden=\"true\"></span> " +
								"</button>" + 
								"<button type=\"button\" class=\"btn btn-default\" onClick=\" $.ajax({url:'/deleteTodo/" + product.id + "', type: 'DELETE', success: location.reload()});\"> " +
									"<span class=\"glyphicon glyphicon-remove\" aria-hidden=\"true\"></span>  " +
								"</button>" + 
							"</div>" +
						"</div>" +
					"</div>" +
				"</form>" +
			"</td>");
	});
});


function doUpdate(id){
   
	$.ajax({url:"/changeTodo/" + id, type: "PUT", data: "description=" + $("#descr-" + id).val() + "&date=" + $("#date-" + id).val() + "&progress=" + $("#progr-" + id).val(), success: location.reload()});
}