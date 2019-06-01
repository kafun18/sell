package com.imooc.dataobject.mapper;

import com.imooc.dataobject.ProductCategory;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;

import java.util.Map;

public interface ProductCategoryMapper {

    @Insert("insert into product_category(category_name, category_type) values " +
            "(#{category_name, jdbcType=VARCHAR}, #{category_type, jdbcType=INTEGER})")
    int insertByMap(Map<String, Object> map);

    @Insert("insert into product_category(category_name, category_type) values " +
            "(#{categoryName, jdbcType=VARCHAR}, #{categoryType, jdbcType=INTEGER})")
    /*@Results({
            @Result(property = "categoryName",column = "category_name"),
            @Result(property = "categoryType",column = "category_type")
    })*/
    int insertByObject(ProductCategory productCategory);
}
