package com.zys.boot_jeep.controller;


import com.zys.boot_jeep.domain.Cark;
import com.zys.boot_jeep.service.CarkService;
import com.zys.boot_jeep.util.DataGridView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 小张666
 * @since 2020-04-21
 */
@RestController
@RequestMapping("/api/cark")
public class CarkController {

    @Autowired
    CarkService carkService;

    @RequestMapping("getAllCar")
    public DataGridView getAllCar(Integer page){
        System.out.println(page);
        List<Cark> list = carkService.getAllCar(page);
        return new DataGridView(200,"成功", (long) list.size(),list);
    }
}
