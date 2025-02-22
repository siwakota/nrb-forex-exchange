package com.anish.nrbforexapi.model;

import lombok.Data;

@Data
public class ApiResponse {

    private Status status;
    private Errors errors;
    private Params params;
    private ResponseData data;
    private Pagination pagination;
}
