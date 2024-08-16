package com.itcast.domain;

import jdk.jfr.DataAmount;
import lombok.Data;

import javax.persistence.*;

/*
* 客户类
*  配置映射关系
*       1.实体类和表
*       2.实体类属性和表字段
* */
@Entity
@Table(name = "cst_customer")
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//GenerationType.IDENTITY主键自增长
    @Column(name = "cust_id")
    private long custId;
    @Column(name = "cust_name")
    private String custName;
    @Column(name = "cust_source")
    private String cusSource;
    @Column(name = "cust_level")
    private String custLevel;
    @Column(name = "cust_industry")
    private String custIndustry;
    @Column(name = "cust_address")
    private String custAddress;
    @Column(name = "cust_phone")
    private String custPhone;

}
