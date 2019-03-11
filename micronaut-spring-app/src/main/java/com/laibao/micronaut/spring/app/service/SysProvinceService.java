package com.laibao.micronaut.spring.app.service;

import com.laibao.micronaut.spring.app.domain.SysProvince;

import java.util.List;

public interface SysProvinceService {
    SysProvince selectByPrimaryKey(String provinceId);
    List<SysProvince> selectAllProvince();
}
