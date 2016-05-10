$.get("/todos",function(todos) {
	$.each(todos,function(index, product) {
		$('#todos').append($("<tr>"));
		$("tr:last").last().append("<td>" + product.description + "</td>");
		$("tr:last").last().append("<td>" + product.date + "</td>");
		$("tr:last").last().append("<td>" + product.progress + "</td>");
		$("tr:last").last().append("<td>" + "<button  type=\"button\" class=\"btn btn-default\" onclick=\" window.location.href = '/editTodo.html'\"> <span class=\"glyphicon glyphicon-pencil\" aria-hidden=\"true\"></span> </button> " +
		" <button type=\"button\" class=\"btn btn-default\" onClick=\" $.ajax({url:'/deleteTodo/" + product.id + "', type: 'DELETE', success: location.reload()});\"> <span class=\"glyphicon glyphicon-remove\" aria-hidden=\"true\"></span>  </button>" + "</td>");
	});
});
/*
 * $(".btn.btn-default").click(function(){ $(this).parent().parent().hide();
 * 
 * });
 */

