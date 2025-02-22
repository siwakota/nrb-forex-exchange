package com.anish.nrbforexapi.model;

import lombok.Data;

@Data
public class Rate {
    private Currency currency;
    private double buy;
    private double sell;
}
