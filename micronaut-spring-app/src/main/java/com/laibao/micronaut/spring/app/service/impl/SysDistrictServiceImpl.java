package com.laibao.micronaut.spring.app.service.impl;


import com.laibao.micronaut.spring.app.domain.SysDistrict;
import com.laibao.micronaut.spring.app.mapper.SysDistrictMapper;
import com.laibao.micronaut.spring.app.service.SysDistrictService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("sysDistrictService")
public class SysDistrictServiceImpl implements SysDistrictService {

    @Autowired
    private SysDistrictMapper sysDistrictMapper;

    @Override
    public List<SysDistrict> selectByCityId(@Param("cityId") String cityId) {
        return sysDistrictMapper.selectByCityId(cityId);
    }

    @Override
    public SysDistrict selectByPrimaryKey(SysDistrict key) {
        return sysDistrictMapper.selectByPrimaryKey(key);
    }
}
