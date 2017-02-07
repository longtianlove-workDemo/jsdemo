package com.hybrid.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 58 on 2017/1/20.
 */
@Controller
public class DemoController  {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    @ResponseBody
    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}
