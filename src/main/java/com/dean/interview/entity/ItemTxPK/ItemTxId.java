package com.dean.interview.entity.ItemTxPK;


import com.dean.interview.entity.EventUserPK.EventUserId;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class ItemTxId implements Serializable {


    private int idItem;

    private int idTx;

    @Override
    public int hashCode() {
        return (int)(idItem + idTx);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof ItemTxId) {
            ItemTxId pk = (ItemTxId)object;
            return idItem == pk.idItem && idTx == pk.idTx;
        } else {
            return false;
        }
    }

    public ItemTxId(int idItem, int idTx) {
        this.idItem = idItem;
        this.idTx = idTx;
    }

    public ItemTxId() {
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public int getIdTx() {
        return idTx;
    }

    public void setIdTx(int idTx) {
        this.idTx = idTx;
    }
}
