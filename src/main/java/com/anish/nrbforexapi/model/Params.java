package com.anish.nrbforexapi.model;

import lombok.Data;

@Data
public class Params {

    private String from;
    private String to;
    private String per_page;
    private String page;
}
