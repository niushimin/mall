package com.mall4j.springboot.pojo.common;

/**
 * @Author: Ethan New
 * @Date: 2019/5/22 19:51
 * @Description:
 */

public class ResponseVo {
    private Object data;
    private String errmsg;
    private int errno;

    public ResponseVo() {
    }

    public ResponseVo(Object data, String errmsg, int errno) {
        this.data = data;
        this.errmsg = errmsg;
        this.errno = errno;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public int getErrno() {
        return errno;
    }

    public void setErrno(int errno) {
        this.errno = errno;
    }
}
