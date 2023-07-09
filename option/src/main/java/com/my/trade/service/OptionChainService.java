package com.my.trade.service;

import com.my.trade.dto.OptionChainDto;
import com.my.trade.dto.OptionChainRecordDto;
import com.my.trade.proxy.NseProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OptionChainService {

    @Autowired
    NseProxy nseProxy;

    public OptionChainRecordDto optionChainResponse(String symbolName,String expiryDate){
        OptionChainRecordDto recordDto=nseProxy.getOptionChainData(symbolName);

        recordDto.getRecords().getData().removeIf(i->!i.getExpiryDate().equals(expiryDate));
      return recordDto;
    }


    public HashMap<String, List<Integer>> getOpenHigh(String symbolName, String expiryDate) {
        OptionChainRecordDto recordDto=nseProxy.getOptionChainData(symbolName);
        recordDto.getRecords().getData().removeIf(i->!i.getExpiryDate().equals(expiryDate));
        HashMap<String, List<Integer>> hMap= new HashMap<>();
        List<Integer> listCE=new ArrayList<>();
        List<Integer> listPE=new ArrayList<>();
        recordDto.getRecords().getData().removeIf(i->
                {
                    if (i.getPE()!=null && i.getCE().getChange() < 0) {
                        listCE.add(i.getStrikePrice());
                    } else if (i.getPE() !=null && i.getPE().getChange() < 0) {
                        listPE.add(i.getStrikePrice());
                    }
                    return false;
                }
        );
        hMap.put("CE",listCE);
        hMap.put("PE",listPE);

        return hMap;
    }
}
