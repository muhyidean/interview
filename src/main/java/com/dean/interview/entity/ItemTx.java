package com.dean.interview.entity;


import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import java.util.List;

@Entity
@Data
public class ItemTx {

    @EmbeddedId
    private ItemTxId id;

    @ManyToOne
    @MapsId("idTx")
    private Transaction transaction;


    @ManyToOne
    @MapsId("idItem")
    private Item item;

    private boolean bought;

}
