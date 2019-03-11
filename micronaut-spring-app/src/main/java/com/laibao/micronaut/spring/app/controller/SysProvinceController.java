package com.laibao.micronaut.spring.app.controller;

import com.laibao.micronaut.spring.app.domain.SysProvince;
import com.laibao.micronaut.spring.app.service.SysProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/province")
public class SysProvinceController {

    @Autowired
    private SysProvinceService sysProvinceService;

    @GetMapping("/all/list")
    List<SysProvince> selectAllProvince() {
        return sysProvinceService.selectAllProvince();
    }
}
