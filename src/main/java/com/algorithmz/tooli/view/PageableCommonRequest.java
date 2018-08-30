package com.algorithmz.tooli.view;

import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Created by kmagdy on 8/6/2017.
 */
public class PageableCommonRequest {

    protected int page;
    protected Integer size;
    protected Integer sort;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getSort() {
        return sort;
    }

    @JsonSetter("sortBy")
    public void setSortBy(Integer sort) {
        if (this.sort == null) {
            this.sort = sort;
        }
    }

    @JsonSetter("sort")
    public void setSort(Integer sort) {
        this.sort = sort;
    }
}
