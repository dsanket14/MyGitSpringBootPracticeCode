package com.my.trade.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.HashMap;

@Data
public class DataDto {

    private int strikePrice;
    private String expiryDate;

    @JsonProperty("CE")
    private CEDto CE;
    @JsonProperty("PE")
    private PEDto PE;

}
