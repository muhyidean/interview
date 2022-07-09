package com.dean.interview.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private float price;

//    @ManyToMany
//    private List<ShoppingList> shoppingLists;


    @OneToMany(mappedBy = "item", orphanRemoval = true)
    private List<ItemTx> transactions;

}
