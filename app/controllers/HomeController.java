package controllers;

import models.Todo;
import play.data.DynamicForm;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;

import views.html.*;

import java.util.ArrayList;
import java.util.List;
import com.avaje.ebean.Model;

import javax.inject.Inject;

import static play.libs.Json.toJson;
/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {



    @Inject
    private FormFactory formFactory;
    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render("Your new application is ready."));
    }
    
    public Result legalInformation() {
        return ok(legalInformation.render("Hi"));
    }
    
    public Result newTodo() {
        return ok(newTodo.render("Hi"));
    }
    
     public Result editTodo() {
        return ok(editTodo.render("Hi"));
    }
    
    public Result addTodo() {
        Form<Todo> userForm = formFactory.form(Todo.class);
        Todo todo = userForm.bindFromRequest().get();
        todo.save();
      //  return ok("Product: " + todo.description + todo.id + todo.date + todo.progress); // DEBUG
    return redirect(routes.HomeController.index());
    }
    
    public Result getProducts() {
        Model.Finder<Integer, Todo> finder = new Model.Finder<>(Todo.class);
        List<Todo> products = finder.all();
        return ok(toJson(products));
    }

}
