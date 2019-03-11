package com.laibao.micronaut.spring.app.service;

import com.laibao.micronaut.spring.app.domain.SysDistrict;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysDistrictService {
    List<SysDistrict> selectByCityId(@Param("cityId")String cityId);

    SysDistrict selectByPrimaryKey(SysDistrict key);
}
