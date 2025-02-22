package com.anish.nrbforexapi.model;

import lombok.Data;

import java.util.List;

@Data
public class Errors {

    private List<String> per_page;
    private List<String> page;
    private List<String> from;
    private List<String> to;
}
