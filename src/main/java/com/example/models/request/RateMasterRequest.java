package com.example.models.request;

import lombok.Data;

@Data

public class RateMasterRequest {

    String groupCode;
    Long amount;
    String audit;
    String remark;
}
