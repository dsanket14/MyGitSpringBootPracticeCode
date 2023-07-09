package com.my.trade.proxy;


import com.my.trade.dto.OptionChainDto;
import com.my.trade.dto.OptionChainRecordDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.netty.http.client.HttpClient;
import reactor.netty.resources.ConnectionProvider;

@Service
@Slf4j
public class NseProxy {

    @Value("${nse.option.chain.endpoint}")
    private String optionChainEndpoint;


    @Autowired
    private WebClient webClient;


    public OptionChainRecordDto getOptionChainData(String symbolName){

        String uri=optionChainEndpoint+symbolName;


        return webClient.get()
                .uri(uri)
                .retrieve()
                .bodyToMono(OptionChainRecordDto.class)
                .block();
    }
}
