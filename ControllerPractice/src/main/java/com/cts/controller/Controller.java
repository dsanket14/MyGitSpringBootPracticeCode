package com.cts.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/getdata/{myname}")    //http://localhost:8080/getdata/Sanket
    public String getdata(@PathVariable String myname){
        return "my name is "+myname;
    }

    @GetMapping("/getname")     //http://localhost:8080/getname?name=Sanket
    public String getdatabypathparm(@RequestParam String name){
        return "my name is "+name;
    }
}
