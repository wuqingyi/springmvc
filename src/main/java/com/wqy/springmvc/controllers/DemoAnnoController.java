package com.wqy.springmvc.controllers;

import com.sun.org.apache.regexp.internal.RE;
import com.wqy.springmvc.entities.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/anno")
public class DemoAnnoController {

    @RequestMapping(produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String index(HttpServletRequest request) {
        return "url:" + request.getRequestURL() + " can access.";
    }

    @RequestMapping(value = "/pathvar/{str}")
    public @ResponseBody
    String demoPathVar(@PathVariable String str, HttpServletRequest request) {
        return "url:" + request.getRequestURL() + " can access,str:" + str;
    }

    @RequestMapping(value = "/requestParam")
    public @ResponseBody
    String passRequestParam(long id, HttpServletRequest request) {
        return "url:" + request.getRequestURL() + " can access, id:" + id;
    }

    @RequestMapping(value = "/Param")
    public @ResponseBody
    String passRequestParam(String xxx, HttpServletRequest request) {
        return "url:" + request.getRequestURL() + " can access, name:" + xxx;
    }

    @RequestMapping(value = "/obj")
    @ResponseBody
    public String passObj(DemoObj obj, HttpServletRequest request) {
        String str = "url:" + request.getRequestURL() + " can access, obj id:" + obj.getId() + " obj name:" + obj.getName() + " obj gender:" + obj.getGender();
        System.out.println(str);
        return str;
    }

    @RequestMapping("/exception")
    @ResponseBody
    public String  throwException(String isEx, HttpServletRequest request) throws Exception {
        if("true".equals(isEx)){
            throw new Exception("This is a mistake!");
        }
        return "OK";
    }
}
