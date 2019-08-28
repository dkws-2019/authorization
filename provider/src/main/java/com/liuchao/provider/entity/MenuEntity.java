package com.liuchao.provider.entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="menu")
public class MenuEntity {
    @Id
    private Integer id;
    private String href;
    private String icon;
    private String name;
    private String metaHref;
    private String metaIcon;
    private String metaName;
    private String metaTitle;
    private String metaHideInBread;
    private String parentId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMetaHref() {
        return metaHref;
    }

    public void setMetaHref(String metaHref) {
        this.metaHref = metaHref;
    }

    public String getMetaIcon() {
        return metaIcon;
    }

    public void setMetaIcon(String metaIcon) {
        this.metaIcon = metaIcon;
    }

    public String getMetaName() {
        return metaName;
    }

    public void setMetaName(String metaName) {
        this.metaName = metaName;
    }

    public String getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle;
    }

    public String getMetaHideInBread() {
        return metaHideInBread;
    }

    public void setMetaHideInBread(String metaHideInBread) {
        this.metaHideInBread = metaHideInBread;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
}
