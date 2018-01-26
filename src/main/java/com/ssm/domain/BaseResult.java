package com.ssm.domain;

import java.util.List;

/**
 * Created by dllo on 18/1/26.
 */
/*封装miniui 显示 的结果集*/
public class BaseResult<T> {
    private int total;//总记录数
    private List<T> data;//当页数据集合

    //Z  分页参数
    private int startIndex;
    private int pageSize;

    public  int getTotal(){
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
