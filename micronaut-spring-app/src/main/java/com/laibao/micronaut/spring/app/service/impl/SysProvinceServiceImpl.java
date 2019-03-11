package com.laibao.micronaut.spring.app.service.impl;

import com.laibao.micronaut.spring.app.domain.SysProvince;
import com.laibao.micronaut.spring.app.mapper.SysProvinceMapper;
import com.laibao.micronaut.spring.app.service.SysProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("sysProvinceService")
public class SysProvinceServiceImpl implements SysProvinceService {

    @Autowired
    private SysProvinceMapper sysProvinceMapper;

    @Override
    public SysProvince selectByPrimaryKey(String provinceId) {
        return sysProvinceMapper.selectByPrimaryKey(provinceId);
    }

    @Override
    public List<SysProvince> selectAllProvince() {
        return sysProvinceMapper.selectAllProvince();
    }
}
