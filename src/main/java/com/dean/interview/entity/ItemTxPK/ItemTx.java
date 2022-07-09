package com.dean.interview.entity.ItemTxPK;


import com.dean.interview.entity.Item;
import com.dean.interview.entity.Transaction;
import lombok.Data;

import javax.persistence.*;

@Entity
public class ItemTx {

    @EmbeddedId
    private ItemTxId id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "transaction_id" ,insertable = false, updatable = false)
    @MapsId("idTx")
    private Transaction transaction;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "item_id" ,insertable = false, updatable = false)
    @MapsId("idItem")
    private Item item;

    private boolean bought;

    public ItemTxId getId() {
        return id;
    }

    public void setId(ItemTxId id) {
        this.id = id;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public boolean isBought() {
        return bought;
    }

    public void setBought(boolean bought) {
        this.bought = bought;
    }
}
