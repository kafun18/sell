package com.imooc.dataobject.dao;

import com.imooc.dataobject.ProductCategory;
import com.imooc.dataobject.mapper.ProductCategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class ProductCategoryDao {

    @Autowired
    ProductCategoryMapper mapper;

    //注解形式的Mybatis
    public int insertByMap (Map<String, Object> map){
        return mapper.insertByMap(map);
    }

    public ProductCategory selectByCategoryType(Integer categoryType){
        return mapper.selectByCategoryType(categoryType);
    }
}
