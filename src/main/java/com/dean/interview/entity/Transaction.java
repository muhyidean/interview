package com.dean.interview.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "transaction", orphanRemoval = true)
    private List<ItemTx> items;


}
