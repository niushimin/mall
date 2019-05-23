package com.mall4j.springboot.pojo.mallregion;

import java.util.List;

public class MallRegionProvince {
    private Integer id;

    private String name;

    private Byte type;

    private Integer code;

    private List<MallRegion> children;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public List<MallRegion> getChildren() {
        return children;
    }

    public void setChildren(List<MallRegion> children) {
        this.children = children;
    }

}