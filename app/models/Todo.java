package models;

import javax.persistence.*;

import com.avaje.ebean.*;
import play.db.ebean.*;

import java.util.Date;

@Entity
public class Todo extends Model {

	private static final long serialVersionUID = 1L;

	@Id
	public Long id;

	static Long idCount;

	public String description;

	public String progress;

	public String date;
	
	public static Finder<Long, Todo> find = new Finder(Long.class, Todo.class);

	public Todo(String description, String progress, String date) {
		this.description = description;
		this.progress = progress;
		this.date = date;
		id = idCount++;

	}

	public static void delete(long id) {
	    
		find.ref(id).delete();
	}
	
	public static Todo findTodo(long id) {
	    
	    return find.ref(id);
	}
	
	@Override
	public String toString() {
	    return "" + description +" " + progress +" " + date +" " + id;
	}

}