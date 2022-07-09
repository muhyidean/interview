package com.dean.interview.service;

import com.dean.interview.dto.EventDto;
import com.dean.interview.dto.MyDto;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface EventService<TDto extends MyDto> extends MyService<TDto>{

    public List<EventDto> getEvents(String name);


}
