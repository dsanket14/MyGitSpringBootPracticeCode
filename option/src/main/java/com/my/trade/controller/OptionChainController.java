package com.my.trade.controller;

import com.my.trade.dto.OptionChainDto;
import com.my.trade.dto.OptionChainRecordDto;
import com.my.trade.service.OptionChainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("api/v1/option-chain")
public class OptionChainController {

    @Autowired
    OptionChainService service;

    @GetMapping
    public OptionChainRecordDto getResponse(@RequestParam String symbolName,@RequestParam String expiryDate){
      return service.optionChainResponse(symbolName.toUpperCase(),expiryDate);
    }

    @GetMapping("/open-high")
    public HashMap<String, List<Integer>> getOpenHigh(@RequestParam String symbolName, @RequestParam String expiryDate){
        return service.getOpenHigh(symbolName.toUpperCase(),expiryDate);
    }
}
