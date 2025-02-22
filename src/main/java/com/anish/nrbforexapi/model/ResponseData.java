package com.anish.nrbforexapi.model;


import lombok.Data;

import java.util.List;

@Data
public class ResponseData {
    private List<Payload> payload;
}
