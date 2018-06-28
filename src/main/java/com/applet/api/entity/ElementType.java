package com.applet.api.entity;

import java.io.Serializable;
import java.util.Date;

public class ElementType implements Serializable {
    private Integer id;

    private Integer templatePageId;

    private String typeName;

    private String elementType;

    private Integer elementAmount;

    private Date careateTime;

    private Boolean status;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTemplatePageId() {
        return templatePageId;
    }

    public void setTemplatePageId(Integer templatePageId) {
        this.templatePageId = templatePageId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getElementType() {
        return elementType;
    }

    public void setElementType(String elementType) {
        this.elementType = elementType;
    }

    public Integer getElementAmount() {
        return elementAmount;
    }

    public void setElementAmount(Integer elementAmount) {
        this.elementAmount = elementAmount;
    }

    public Date getCareateTime() {
        return careateTime;
    }

    public void setCareateTime(Date careateTime) {
        this.careateTime = careateTime;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}