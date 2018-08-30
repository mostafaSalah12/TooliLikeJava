package com.algorithmz.tooli.view;

import java.util.List;

/**
 * Created by kmagdy on 7/23/2017.
 */
public class CommonResponseTemplate<T> {

    public static final String OK = "OK";
    public static final String DATA_NOT_FOUND = "DATA_NOT_FOUND";
    public static final String USER_NOT_OWNN_ORDER = "USER_NOT_OWNN_ORDER";

    protected String status;
    protected String message;
    protected List<T> result;

    public CommonResponseTemplate() {
    }

    public CommonResponseTemplate(String status, List<T> result) {
        this.status = status;
        this.result = result;
    }

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
