package com.mall4j.springboot.actionform;

public class ReponseVoo<T> {
    T data;
    String errmsg = "成功";
    Integer errno = 0;

    public ReponseVoo() {
    }

    public ReponseVoo(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public Integer getErrno() {
        return errno;
    }

    public void setErrno(Integer errno) {
        this.errno = errno;
    }
}
