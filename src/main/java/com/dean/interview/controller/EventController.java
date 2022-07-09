package com.dean.interview.controller;


import com.dean.interview.dto.EventDto;
import com.dean.interview.entity.Event;
import com.dean.interview.repo.EventRepo;
import com.dean.interview.service.EventService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/events")
public class EventController extends CrudController<EventService, EventDto> {


@Autowired
    EventService eventService;
    public void setEventService(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/search/{name}")
    public List<EventDto> getEvents(@PathVariable("name") String name){
        var events = eventService.getEvents(name);
        return events;
    }
}
