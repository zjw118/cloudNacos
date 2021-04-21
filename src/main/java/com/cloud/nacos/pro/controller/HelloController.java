package com.cloud.nacos.pro.controller;

import com.cloud.nacos.common.result.RestfulResult;
import com.cloud.nacos.common.utils.CommUtils;
import com.cloud.nacos.pro.entity.ServiceInfo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 微服务控制器
 *
 * @author Zhaojingwei
 * @date 2021/3/18
 */
@RestController
@RequestMapping("service")
public class HelloController {

    @RequestMapping( "hello")
    public void login(HttpServletResponse response, HttpServletRequest request, @RequestBody ServiceInfo serviceInfo) {

        RestfulResult restfulResult = new RestfulResult();

        try {
            restfulResult.setData("Service1:Welcome " + serviceInfo.getName() + "!");

        } catch (Exception e) {
            e.printStackTrace();
        }

        CommUtils.printDataJason(response, restfulResult);
    }
    @RequestMapping(value = "rest")
    public String rest(@RequestBody ServiceInfo serviceInfo){

        return "Service1:Welcome " + serviceInfo.getName() + " !";
    }


}
