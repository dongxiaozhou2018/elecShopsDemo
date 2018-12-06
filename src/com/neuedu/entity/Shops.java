package com.neuedu.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class Shops implements Serializable {

    public  Shops(){

    }

    private  Integer shop_id;           //商品ID

    private String shop_name;           //商品名称

    private String shop_des;            //商品描述

    private String shop_img;            //商品图片

    private BigDecimal shop_price;      //商品价格

    private Integer shop_cateId;        //商品类别ID

    private Integer shop_stock;         //商品库存

    private Integer shop_isGc;          //商品是否上架

    public Shops(Integer shop_id, String shop_name, String shop_des, String shop_img, BigDecimal shop_price, Integer shop_cateId, Integer shop_stock, Integer shop_isGc) {
        this.shop_id = shop_id;
        this.shop_name = shop_name;
        this.shop_des = shop_des;
        this.shop_img = shop_img;
        this.shop_price = shop_price;
        this.shop_cateId = shop_cateId;
        this.shop_stock = shop_stock;
        this.shop_isGc = shop_isGc;
    }

    @Override
    public String toString() {
        return "Shops{" +
                "shop_id=" + shop_id +
                ", shop_name='" + shop_name + '\'' +
                ", shop_des='" + shop_des + '\'' +
                ", shop_img='" + shop_img + '\'' +
                ", shop_price=" + shop_price +
                ", shop_cateId=" + shop_cateId +
                ", shop_stock=" + shop_stock +
                ", shop_isGc=" + shop_isGc +
                '}';
    }

    public Integer getShop_id() {
        return shop_id;
    }

    public void setShop_id(Integer shop_id) {
        this.shop_id = shop_id;
    }

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    public String getShop_des() {
        return shop_des;
    }

    public void setShop_des(String shop_des) {
        this.shop_des = shop_des;
    }

    public String getShop_img() {
        return shop_img;
    }

    public void setShop_img(String shop_img) {
        this.shop_img = shop_img;
    }

    public BigDecimal getShop_price() {
        return shop_price;
    }

    public void setShop_price(BigDecimal shop_price) {
        this.shop_price = shop_price;
    }

    public Integer getShop_cateId() {
        return shop_cateId;
    }

    public void setShop_cateId(Integer shop_cateId) {
        this.shop_cateId = shop_cateId;
    }

    public Integer getShop_stock() {
        return shop_stock;
    }

    public void setShop_stock(Integer shop_stock) {
        this.shop_stock = shop_stock;
    }

    public Integer getShop_isGc() {
        return shop_isGc;
    }

    public void setShop_isGc(Integer shop_isGc) {
        this.shop_isGc = shop_isGc;
    }
}