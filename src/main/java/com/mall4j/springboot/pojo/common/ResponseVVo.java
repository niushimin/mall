package com.mall4j.springboot.pojo.common;

/**
 * @Author: Ethan New
 * @Date: 2019/5/23 21:57
 * @Description:
 */

public class ResponseVVo {
    private String errmsg;
    private int errno;

    public ResponseVVo() {
    }

    public ResponseVVo(String errmsg, int errno) {
        this.errmsg = errmsg;
        this.errno = errno;
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
