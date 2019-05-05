package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest(){
        ProductCategory productCategory = repository.findById(1).get();
        System.out.print(productCategory.toString());
    }

    @Test
    @Transactional
    public void saveTest(){
        //ProductCategory productCategory = repository.findById(2).get();
        //productCategory.setCategoryType(5);
        /*ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryId(2);
        productCategory.setCategoryName("男生最爱123");
        productCategory.setCategoryType(3);*/
        //repository.save(productCategory);
        ProductCategory productCategory = new ProductCategory("男生最爱",5);
        ProductCategory result = repository.save(productCategory);
        Assert.assertNotNull(result);

    }

    @Test
    public void findByCategoryTypeInTest(){
        List<Integer> list = Arrays.asList(2,5);
        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        Assert.assertNotNull(result.size());
    }

}