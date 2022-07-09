package com.dean.interview.entity;


import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class EventUserId implements Serializable {

    private int eventId;

    private int userId;

    @Override
    public int hashCode() {
        return (int)(eventId + userId);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof EventUserId) {
            EventUserId pk = (EventUserId)object;
            return eventId == pk.eventId && userId == pk.userId;
        } else {
            return false;
        }
    }

    public EventUserId(int eventId, int userId) {
        this.eventId = eventId;
        this.userId = userId;
    }

    public EventUserId() {
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
