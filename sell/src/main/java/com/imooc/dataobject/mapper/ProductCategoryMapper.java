package com.imooc.dataobject.mapper;

import com.imooc.dataobject.ProductCategory;
import org.apache.ibatis.annotations.*;

import java.util.List;
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

    @Select("select * from product_category where category_type=#{categoryType}")
    @Results({
            @Result(property = "categoryId",column = "category_id"),
            @Result(property = "categoryName",column = "category_name"),
            @Result(property = "categoryType",column = "category_type")
    })
    ProductCategory findByCategoryType(Integer categoryType);

    @Select("select * from product_category where category_name=#{categoryName}")
    @Results({
            @Result(property = "categoryId",column = "category_id"),
            @Result(property = "categoryName",column = "category_name"),
            @Result(property = "categoryType",column = "category_type")
    })
    List<ProductCategory> findByCategoryName(String categoryName);

    @Update("update product_category set category_name=#{categoryName} where category_type=#{categoryType}")
    int updateByCategoryType(@Param("categoryName") String categoryName,@Param("categoryType")Integer categoryType);

    @Update("update product_category set category_name=#{categoryName} where category_type=#{categoryType}")
    int updateByObject(ProductCategory productCategory);

    @Delete("delete from product_category where category_type=#{categoryType}")
    int deleteByCategoryType(Integer categoryType);

    ProductCategory selectByCategoryType(Integer categoryType);
}
