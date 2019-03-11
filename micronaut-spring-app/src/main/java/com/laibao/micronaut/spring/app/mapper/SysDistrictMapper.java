package com.laibao.micronaut.spring.app.mapper;

import com.laibao.micronaut.spring.app.domain.SysDistrict;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysDistrictMapper {
    int deleteByPrimaryKey(SysDistrict key);

    int insert(SysDistrict record);

    int insertSelective(SysDistrict record);

    List<SysDistrict> selectByCityId(@Param("cityId") String cityId);

    SysDistrict selectByPrimaryKey(SysDistrict key);

    int updateByPrimaryKeySelective(SysDistrict record);

    int updateByPrimaryKey(SysDistrict record);
}