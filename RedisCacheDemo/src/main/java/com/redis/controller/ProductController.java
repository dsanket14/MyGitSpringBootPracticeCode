package com.redis.controller;

import com.redis.dto.ProductDto;
import com.redis.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping()
    public String save(@RequestBody ProductDto dto) throws InvocationTargetException, IllegalAccessException {
            service.save(dto);
        return "Saved Successfully";

    }

    @PostMapping("/saveall")
    public String saveAll(@RequestBody List<ProductDto> list) throws InvocationTargetException, IllegalAccessException {
        service.saveAll(list);
        return "Saved All Successfully";

    }

    @GetMapping("/")
    public List<ProductDto> getAll() throws InvocationTargetException, IllegalAccessException {
       return service.getAll();
    }

    @GetMapping("/{name}")
    public ProductDto getByName(@PathVariable String name){
        return service.getByName(name);
    }

    @DeleteMapping("/delete")
    public String deleteAll(){
        service.deleteAll();
        return "Deleted SuccessFully";
    }
}
