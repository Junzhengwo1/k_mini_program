package com.kou.k_mini_program.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.kou.k_mini_program.KMiniProgramApplication;
import com.kou.k_mini_program.pojo.ProductCategory;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;


/**
 * @author JIAJUN KOU
 */
@SpringBootTest(classes = KMiniProgramApplication.class)
public class ProductCategoryTest {

    @Autowired
    private ProductCategoryMapper mapper;

    @Test
    public void TestFindOne(){
        ProductCategory productCategory = mapper.selectById(1);
        System.out.println(productCategory);
        QueryWrapper<ProductCategory> wrapper = new QueryWrapper<ProductCategory>();
        wrapper.eq("category_name","手机");

        ProductCategory productCategory1 = mapper.selectOne(wrapper);
        String categoryName = productCategory1.getCategoryName();
        System.out.println(categoryName);
    }

    @Test
    @Transactional
    public void saveTest(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("王后");
        productCategory.setCategoryType(3);
        mapper.insert(productCategory);
        mapper.selectBatchIds(Arrays.asList(1, 2)).forEach(System.out::println);
    }

    @Test
    public void updateTest(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryId(2);
        productCategory.setCategoryName("网页");
        mapper.updateById(productCategory);

    }

    @Test
    public void findByCategoryTypeIn(){
        List<Integer> list= Arrays.asList(1,2,4);

        List<ProductCategory> productCategories = mapper.selectBatchIds(list);
        productCategories.forEach(System.out::println);

    }

}
