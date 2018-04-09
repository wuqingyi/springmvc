package com.wqy.springmvc.controllers;

import com.wqy.springmvc.entities.DemoObj;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
    @RequestMapping(value = "/getjson", produces = {"application/json;charset=UTF-8"})
    //2
    public DemoObj getjson(DemoObj obj) {
        return new DemoObj(obj.getId() + 1L, obj.getName() + "yy", obj.getGender());//3
    }
}
