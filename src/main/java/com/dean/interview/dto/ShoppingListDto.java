package com.dean.interview.dto;

import lombok.Data;

import java.util.List;

@Data
public class ShoppingListDto {

    private int id;

    private List<ItemDto> items;

}
