package com.algorithmz.tooli.view;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Created by kmagdy on 8/1/2017.
 */
public class PageableCommonResponse<T> extends CommonResponseTemplate<T> {

    private boolean isNext;

    public PageableCommonResponse(String status, List<T> data) {
        super(status, data);

    }

    public PageableCommonResponse(String status, List<T> data, boolean isNext) {
        super(status, data);
        this.isNext = isNext;
    }

    @JsonProperty("isNext")
    public boolean isNext() {
        return isNext;
    }

    public void setNext(boolean next) {
        isNext = next;
    }
}
