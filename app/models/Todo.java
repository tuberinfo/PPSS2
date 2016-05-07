package models;

import javax.persistence.*;

import com.avaje.ebean.*;

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
    
    
    
    public Todo(String description, String progress, String date) {
        this.description=description;
        this.progress=progress;
        this.date=date;
       id=idCount++;
        
    }
    
    
    
    
}