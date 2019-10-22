package com.wells.ssm.exception;

public class LOLException extends Exception {

    private String msg;

    public LOLException(String msg) {
        super();
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
