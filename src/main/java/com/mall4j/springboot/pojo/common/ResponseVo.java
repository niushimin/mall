package com.mall4j.springboot.pojo.common;

/**
 * @Author: Ethan New
 * @Date: 2019/5/22 19:51
 * @Description:
 */

public class ResponseVo {
    private String data;
    private String errmsg;
    private int errno;

    public ResponseVo() {
    }

    public ResponseVo(String data, String errmsg, int errno) {
        this.data = data;
        this.errmsg = errmsg;
        this.errno = errno;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
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
