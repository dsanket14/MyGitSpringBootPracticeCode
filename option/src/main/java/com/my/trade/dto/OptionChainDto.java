package com.my.trade.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class OptionChainDto {

    private List<String> expiryDates;
    private List<DataDto> data;
    @JsonProperty("CE")
    private SumOfVolOiDto CE;
    @JsonProperty("PE")
    private SumOfVolOiDto PE;
}
