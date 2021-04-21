package com.cloud.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * 启动类
 *
 * @author Zhaojingwei
 * @date 2021/3/18
 */

@SpringBootApplication
@ServletComponentScan
@EnableDiscoveryClient
@RefreshScope//开启配置更新功能
public class ComsumerClientApplication {


    public static void main(String[] args) {
        SpringApplication.run(ComsumerClientApplication.class, args);

    }

}
