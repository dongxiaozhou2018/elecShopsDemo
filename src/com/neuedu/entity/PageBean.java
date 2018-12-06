package com.neuedu.entity;

import java.io.Serializable;
import java.util.List;

/**
 *        int pageNum      用户所选页数
 *        int pageSize     每页显示多少条
 *        int allRecode     总记录数
 *        int startPage     开始页面
 *        int endPage       结束页数
 *        int allPages      总页数
 *        int startIndex 数据库开始索引值
 *        List shops        每一页数据集合
 * */

public class PageBean implements Serializable {

    public PageBean()
    {

    }

    public PageBean(int pageNum,int pageSize,int allRecods )
    {
        this.allRecods = allRecods;
        this.pageSize = pageSize;
        this.pageNum = pageNum;

        if (allRecods%pageSize == 0)
        {
            this.allPages = allRecods/pageSize;
        }else {
            this.allPages = allRecods/pageSize + 1;
        }
        this.startIndex = (pageNum-1)*pageSize;
        this.startPage = 1;
        this.endPage = 5;
        if (allPages <= 5)
        {
            this.startPage = 1;
            this.endPage = this.allPages;
        }else
         {
             this.startPage = this.pageNum-2;
             this.endPage = this.pageNum +2;
             if (startPage <= 0)
             {
                 this.startPage = 1;
                 this.endPage = 5;
             }
             if (endPage > allPages)
             {
                 this.startPage = endPage-4;
                 this.endPage = this.allPages;
             }
         }
    }

    @Override
    public String toString() {
        return "PageBean{" +
                "pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                ", allRecods=" + allRecods +
                ", startPage=" + startPage +
                ", endPage=" + endPage +
                ", allPages=" + allPages +
                ", startIndex=" + startIndex +
                ", shops=" + shops +
                '}';
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getAllRecods() {
        return allRecods;
    }

    public void setAllRecods(Integer allRecods) {
        this.allRecods = allRecods;
    }

    public Integer getStartPage() {
        return startPage;
    }

    public void setStartPage(Integer startPage) {
        this.startPage = startPage;
    }

    public Integer getEndPage() {
        return endPage;
    }

    public void setEndPage(Integer endPage) {
        this.endPage = endPage;
    }

    public Integer getAllPages() {
        return allPages;
    }

    public void setAllPages(Integer allPages) {
        this.allPages = allPages;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public List<Shops> getShops() {
        return shops;
    }

    public void setShops(List<Shops> shops) {
        this.shops = shops;
    }

    private  Integer pageNum;

    private  Integer pageSize;

    private  Integer allRecods;

    private  Integer startPage;

    private  Integer endPage;

    private  Integer allPages;

    private  Integer startIndex;

    private  List<Shops> shops;
}
