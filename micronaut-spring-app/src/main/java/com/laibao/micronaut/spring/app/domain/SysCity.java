package com.laibao.micronaut.spring.app.domain;

import java.io.Serializable;

public class SysCity implements Serializable {
    private static final long serialVersionUID = -4256445536717756581L;

    private String cityId;

    private String provinceId;

    private String city;

    private Byte state;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId == null ? null : cityId.trim();
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId == null ? null : provinceId.trim();
    }

}