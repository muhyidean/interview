package com.dean.interview.entity;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
@Data
public class ItemTxId implements Serializable {


    private int idItem;

    private int idTx;

}
