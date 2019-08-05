package com.imooc.controller;

import com.imooc.dataobject.ProductCategory;
import com.imooc.dataobject.mapper.ProductCategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mybatis")
public class MybatisController {

    @Autowired
    private ProductCategoryMapper mapper;

    @GetMapping(path = "/find/{categoryType}")
    public ProductCategory selectByCategoryType(@PathVariable Integer categoryType){
        ProductCategory productCategory = mapper.selectByCategoryType(categoryType);
        return productCategory;
    }
}
