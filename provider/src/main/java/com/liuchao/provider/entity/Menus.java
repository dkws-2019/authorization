package com.liuchao.provider.entity;

import java.util.List;

public class Menus {
    private Integer id;
    private Integer parentId;
    private String href;
    private String icon;
    private String name;
    private Meta meta;
    private List<Menus> children;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public Integer getId() {
        return id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public String getHref() {
        return href;
    }

    public String getIcon() {
        return icon;
    }

    public String getName() {
        return name;
    }

    public Meta getMeta() {
        return meta;
    }

    public List<Menus> getChildren() {
        return children;
    }

    public void setChildren(List<Menus> children) {
        this.children = children;
    }
}
