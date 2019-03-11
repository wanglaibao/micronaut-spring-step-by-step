package com.laibao.micronaut.spring.app.domain;

import java.io.Serializable;


public class SysDistrict implements Serializable {
    private static final long serialVersionUID = 8226678133070381999L;

    private String districtId;

    private String cityId;

    private String district;

    private Byte state;

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public String getDistrictId() {
        return districtId;
    }

    public void setDistrictId(String districtId) {
        this.districtId = districtId == null ? null : districtId.trim();
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId == null ? null : cityId.trim();
    }

}