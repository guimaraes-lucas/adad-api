package app.netlify.guimaraes.adadapi.infraestructure.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import app.netlify.guimaraes.adadapi.application.service.EventService;
import app.netlify.guimaraes.adadapi.domain.event.Event;
import app.netlify.guimaraes.adadapi.domain.event.EventRepository;
import app.netlify.guimaraes.adadapi.presentation.dto.EventDTO;

@RestController
public class EventController {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private EventService eventService;

    @GetMapping("/events")
    public List<Event> findAll() {
        return eventRepository.findAll();
    }

    @PostMapping("/events")
    public ResponseEntity<Event> save(@RequestBody EventDTO event) {
        Event persistentEvent = eventService.save(event.transformToObject());
        return new ResponseEntity<>(persistentEvent, HttpStatus.CREATED);
    }
}
