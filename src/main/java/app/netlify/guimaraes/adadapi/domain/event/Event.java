package app.netlify.guimaraes.adadapi.domain.event;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@SuppressWarnings("serial")
@NoArgsConstructor
public class Event {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    
    private Date date;

    public Event(String description, Date date) {
        this.description = description;
        this.date = date;
    }
}
