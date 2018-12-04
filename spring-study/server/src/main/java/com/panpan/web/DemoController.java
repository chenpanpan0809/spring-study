package com.panpan.web;




import com.netflix.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * Created by panpan on 2018/12/4.
 */
@RestController
public class DemoController {
    @Autowired

    @RequestMapping("indexs")
    public String index(){
        return "hello you success";
    }
}
