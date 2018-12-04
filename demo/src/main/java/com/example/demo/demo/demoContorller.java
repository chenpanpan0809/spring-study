package com.example.demo.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by panpan on 2018/12/4.
 */
@RestController
public class demoContorller {
    @RequestMapping("input")
    //测试提交
    public String input(){
        return "hello this is client1";
    }
    public String input3(){
        return "hello this is client1";
    }
}
