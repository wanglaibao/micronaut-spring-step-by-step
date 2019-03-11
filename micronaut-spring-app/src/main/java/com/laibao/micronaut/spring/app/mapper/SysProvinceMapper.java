package com.laibao.micronaut.spring.app.mapper;

import com.laibao.micronaut.spring.app.domain.SysProvince;

import java.util.List;

public interface SysProvinceMapper {
    int deleteByPrimaryKey(String provinceId);

    int insert(SysProvince record);

    int insertSelective(SysProvince record);

    SysProvince selectByPrimaryKey(String provinceId);

    int updateByPrimaryKeySelective(SysProvince record);

    int updateByPrimaryKey(SysProvince record);

    List<SysProvince> selectAllProvince();
}