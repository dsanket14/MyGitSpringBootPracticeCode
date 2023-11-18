package com.redis.utils;

import com.redis.dto.ProductDto;
import com.redis.entity.Product;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class ProductUtils {

    public static ProductDto entityToDto(Product product) throws InvocationTargetException, IllegalAccessException {
        ProductDto dto = new ProductDto();
        BeanUtils.copyProperties(product, dto);
        return dto;
    }

    public static Product dtoToEntity(ProductDto dto) throws InvocationTargetException, IllegalAccessException {
        Product product = new Product();
        BeanUtils.copyProperties(dto, product);
        return product;
    }

    public static List<ProductDto> entityListToDtoList(List<Product> product) throws InvocationTargetException, IllegalAccessException {
        List<ProductDto> dto = new ArrayList<>();
        BeanUtils.copyProperties(product, dto);
        return dto;
    }


    public static List<Product> dtoListToEntityList(List<ProductDto> list) throws InvocationTargetException, IllegalAccessException {
        List<Product> productList = new ArrayList<>();
        BeanUtils.copyProperties(list, productList);
        return productList;
    }
}
