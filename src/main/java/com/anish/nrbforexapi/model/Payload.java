package com.anish.nrbforexapi.model;

import lombok.Data;

import java.util.List;

@Data
public class Payload {

    private String date;
    private String published_on;
    private String modified_on;
    private List<Rate> rates;
}
