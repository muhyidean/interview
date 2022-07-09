package com.dean.interview.entity.EventUserPK;

import com.dean.interview.dto.EventDto;
import com.dean.interview.entity.Event;
import com.dean.interview.entity.User;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import javax.persistence.*;

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
