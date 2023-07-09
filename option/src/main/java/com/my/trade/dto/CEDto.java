package com.my.trade.dto;


import lombok.Data;

@Data
public class CEDto {
    private int strikePrice;
    private String expiryDate;
    private String underlying;
    private String identifier;
    private double openInterest;
    private double changeInOpenInterest;
    private double pChangeInOpenInterest;
    private double totalTradedVolume;
    private double impliedVolatility;
    private double lastPrice;
    private double change;
    private double pChange;
    private double totalBuyQuantity;
    private double totalSellQuantity;
    private int bidQty;
    private double bidPrice;
    private int askQty;
    private double askPrice;
    private double underlyingValue;
}
