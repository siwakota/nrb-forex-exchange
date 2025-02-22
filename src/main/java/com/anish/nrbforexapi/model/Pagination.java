package com.anish.nrbforexapi.model;

import lombok.Data;

@Data
public class Pagination {
    private Integer page;
    private Integer pages;
    private Integer per_page;
    private Integer total;
    private Links links;
}
