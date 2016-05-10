$.get("/todos",function(todos) {
	$.each(todos,function(index, product) {
		$('#todos').append($("<tr>"));
		$("tr:last").last().append("" +
				"<td class=\"row\">" +
					"<div class=\"col-sm-6 col-xs-12\" style=\"font-size:18pt\">" + product.description + "</div>" +
					"<div class=\"col-sm-6 col-xs-12\">" +
						"<div class=\"row\">" +
							"<div class=\"col-xs-6\" style=\"font-size:18pt\">" + product.date + "</div>" +
							"<div class=\"col-xs-3\" style=\"font-size:18pt\">" + product.progress + "%</div>" +
							"<div class=\"row col-xs-3\">" +
								"<button  type=\"button\" class=\"btn btn-default\" onclick=\" window.location.href = '/editTodo.html'\">" +
									"<span class=\"glyphicon glyphicon-pencil\" aria-hidden=\"true\"></span>" +
								"</button> " +
								"<button type=\"button\" class=\"btn btn-default\" onClick=\" $.ajax({url:'/deleteTodo/" + product.id + "', type: 'DELETE', success: location.reload()});\">" +
									"<span class=\"glyphicon glyphicon-remove\" aria-hidden=\"true\"></span>" +
								"</button>" +
							"</div>" +
						"</div>" +
					"</div>" +
				"</td>");

	});
});
/*
 * $(".btn.btn-default").click(function(){ $(this).parent().parent().hide();
 * 
 * });
 */

