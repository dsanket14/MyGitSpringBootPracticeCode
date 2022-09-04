package com.cds.controller;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;

@RestController
@RequestMapping
public class JSONController {
    @GetMapping("/getdata")
    public ResponseEntity<Map<String, Object>> getJsonData() throws IOException {
        ClassPathResource staticDataResource = new ClassPathResource("data.json");
        String staticDataString = IOUtils.toString(staticDataResource.getInputStream(), StandardCharsets.UTF_8);

        return new ResponseEntity<>(
                new JSONObject(staticDataString).toMap(),
                HttpStatus.OK
        );
    }
}
