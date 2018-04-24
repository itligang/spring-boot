package com.tiantian.boot.controller;

import com.tiantian.boot.mapper.HomeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/home")
@RestController
public class HomeControler {
    @Autowired
   private   HomeMapper  homeMapper;

    @GetMapping("hello.do")
    public  String  hello(){
        return  "Hello World";
    }

    //@GetMapping("hello.do")
    @RequestMapping("hello2.do")
    public  String  hello2(){
        return  "Hello 2----2 World";
    }


    @GetMapping("testmysql.do")
    public  String  testmysql(){
        return   homeMapper.querydata();
    }
}
