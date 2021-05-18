package com.kou.k_mini_program.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import java.io.Serializable;

/**
 * @author JIAJUN KOU
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate
//注意这个地方实体类与数据库的对应需要下面这个注解
@TableName("product_category")
public class ProductCategory implements Serializable {

    /** 类目id. 这个地方必须让mybatis知道这个库*/
    @TableId(value = "category_id", type = IdType.AUTO)
    private Integer categoryId;
    /** 类目名. */
    private String categoryName;
    /** 类目编号. */
    private Integer categoryType;


}
