package com.laibao.micronaut.spring.app.service.impl;

import com.laibao.micronaut.spring.app.domain.SysCity;
import com.laibao.micronaut.spring.app.mapper.SysCityMapper;
import com.laibao.micronaut.spring.app.service.SysCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("sysCityService")
public class SysCityServiceImpl implements SysCityService {

    @Autowired
    private SysCityMapper sysCityMapper;

    @Override
    public List<SysCity> selectByProvinceId(String provinceId) {
        return sysCityMapper.selectByProvinceId(provinceId);
    }

    @Override
    public SysCity selectByPrimaryKey(SysCity key) {
        return sysCityMapper.selectByPrimaryKey(key);
    }

    @Override
    public List<SysCity> selectAllCities() {
        return sysCityMapper.selectAllCities();
    }
}
