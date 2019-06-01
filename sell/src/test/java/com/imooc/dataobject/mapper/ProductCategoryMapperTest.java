package com.imooc.dataobject.mapper;

import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryMapperTest {

    @Autowired
    private ProductCategoryMapper productcategoryMapper;

    @Test
    public void insertByMap() throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("category_name", "师兄最不爱");
        map.put("category_type", 101);
        int result = productcategoryMapper.insertByMap(map);
        Assert.assertEquals(1,result);
    }

    @Test
    public void insertByObject(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("师兄最不爱");
        productCategory.setCategoryType(102);
        int result = productcategoryMapper.insertByObject(productCategory);
        Assert.assertEquals(1,result);
    }
}