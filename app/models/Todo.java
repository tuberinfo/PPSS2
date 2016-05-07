package models;

import javax.persistence.*;

import com.avaje.ebean.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Todo extends Model {

	@Id
	Long id;

	static Long idCount;

	String description;

	int progress;

	Date date;

	public Todo(String description, int progress, Date date) {
		this.description = description;
		this.progress = progress;
		this.date = date;
		id = idCount++;

	}
	
	public static List<Todo> all(){
		return new ArrayList<Todo>();
	}
	
	public static void create(Todo todo){
		
	}
	
	public static void delete(Long id){
		
	}

}