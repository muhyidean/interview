package com.dean.interview.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EventDto extends MyDto {

    private int id;
    private String name;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private boolean done;
    private ShoppingListDto shoppingList;

}
