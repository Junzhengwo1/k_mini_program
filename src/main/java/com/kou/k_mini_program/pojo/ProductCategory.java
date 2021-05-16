package com.kou.k_mini_program.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author JIAJUN KOU
 */
@Entity
@Data
public class ProductCategory {

    /** 类目id. */
    @Id
    @GeneratedValue
    private Integer categoryId;
    /** 类目名. */
    private String categoryName;
    /** 类目编号. */
    private Integer categoryType;


}
