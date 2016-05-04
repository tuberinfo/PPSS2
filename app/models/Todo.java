package models;

import javax.persistence.*;

import com.avaje.ebean.*;

import java.util.Date;

@Entity
public class Todo extends Model {
    
    @Id
    Long id;
    
    static Long idCount;
    
    String description;
    
    int progress;
    
    Date date;
    
    
    
    public Todo(String description, int progress, Date date) {
        this.description=description;
        this.progress=progress;
        this.date=date;
       id=idCount++;
        
    }
    
    
    
    
}