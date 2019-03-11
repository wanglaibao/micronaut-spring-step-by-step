package com.laibao.micronaut.spring.app.mapper;

import com.laibao.micronaut.spring.app.domain.SysCity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysCityMapper {
    int deleteByPrimaryKey(SysCity key);

    int insert(SysCity record);

    int insertSelective(SysCity record);

    List<SysCity> selectByProvinceId(@Param("provinceId") String provinceId);

    SysCity selectByPrimaryKey(SysCity key);

    int updateByPrimaryKeySelective(SysCity record);

    int updateByPrimaryKey(SysCity record);

    List<SysCity> selectAllCities();
}