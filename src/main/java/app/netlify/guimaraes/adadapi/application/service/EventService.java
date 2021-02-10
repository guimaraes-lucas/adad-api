package app.netlify.guimaraes.adadapi.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.netlify.guimaraes.adadapi.domain.event.Event;
import app.netlify.guimaraes.adadapi.domain.event.EventRepository;

@Service
public class EventService {
    
    @Autowired
    private EventRepository eventRepository;

    public Event save(Event event) {
        return eventRepository.saveAndFlush(event);
    }
}
