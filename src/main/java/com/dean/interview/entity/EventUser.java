package com.dean.interview.entity;

import com.dean.interview.dto.EventDto;
import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
public class EventUser {


    @EmbeddedId
    private EventUserId id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "event_id" ,insertable = false, updatable = false)
    @MapsId("eventId")
    private Event event;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id" ,insertable = false, updatable = false)
    @MapsId("userId")
    private User user;

    private boolean done;


    public EventDto extractEventDto(Event event){
        EventDto eventDto = new EventDto();
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(event,EventDto.class);
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
