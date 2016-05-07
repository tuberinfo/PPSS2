package controllers;

import play.*;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {

	public Result index() {
        return redirect("index.html");
    }
	
	public Result todos() {
        return TODO;
    }
	
	public Result newTodo() {
        return TODO;
    }
	
	public Result updateTodo(Long id) {
        return TODO;
    }
	
	public Result deleteTodo(Long id) {
        return TODO;
    }
	
	
	public Result legalInformation() {
        return redirect("legalInformation.html");
    }
}
