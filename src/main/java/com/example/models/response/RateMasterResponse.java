package com.example.models.response;

import lombok.Data;

@Data

public class RateMasterResponse {

    String groupCode;
    Long amount;
    String audit;
    String remark;
}
