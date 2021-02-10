package app.netlify.guimaraes.adadapi.presentation.dto;

import java.sql.Date;

import app.netlify.guimaraes.adadapi.domain.event.Event;
import lombok.Getter;

@Getter
public class EventDTO {
    
    private String description;    
    private Date date;

    public Event transformToObject() {
        return new Event(description, date);
    }
}
