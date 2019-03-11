package com.laibao.micronaut.spring.app.service;

import com.laibao.micronaut.spring.app.domain.SysCity;

import java.util.List;

public interface SysCityService {

    List<SysCity> selectByProvinceId(String provinceId);

    SysCity selectByPrimaryKey(SysCity key);

    List<SysCity> selectAllCities();
}
