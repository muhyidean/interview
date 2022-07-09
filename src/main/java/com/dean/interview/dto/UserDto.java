package com.dean.interview.dto;

import lombok.Data;

import java.util.List;

@Data
public class UserDto extends MyDto{

    private int id;

    private String fullname;
    private String email;

    private List<EventDto> events;

}
