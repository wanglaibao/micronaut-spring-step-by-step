package com.laibao.micronaut.spring.app.domain;

import java.io.Serializable;
public class SysProvince implements Serializable {
    private static final long serialVersionUID = 3314069748224400973L;

    private String provinceId;

    private String province;

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId == null ? null : provinceId.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }
}