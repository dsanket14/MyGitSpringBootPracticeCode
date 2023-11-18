package com.redis.service;

import com.redis.dto.ProductDto;
import com.redis.entity.Product;
import com.redis.repo.ProductRepository;
import com.redis.utils.ProductUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public void save(ProductDto dto) throws InvocationTargetException, IllegalAccessException {
        repository.save(ProductUtils.dtoToEntity(dto));
    }

    public List<ProductDto> getAll() throws InvocationTargetException, IllegalAccessException {

        List<Product> productList= repository.findAll();

        return ProductUtils.entityListToDtoList(productList);
    }

    public void saveAll(List<ProductDto> list) throws InvocationTargetException, IllegalAccessException {
        repository.saveAll(ProductUtils.dtoListToEntityList(list));
    }

    public ProductDto getByName(String name) {
       return repository.findByName(name);
    }

    public void deleteAll() {
        repository.deleteAll();
    }
}
