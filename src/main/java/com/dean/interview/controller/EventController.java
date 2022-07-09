package com.dean.interview.controller;


import com.dean.interview.dto.EventDto;
import com.dean.interview.service.EventService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/events")
public class EventController extends CrudController<EventService, EventDto> {
}
