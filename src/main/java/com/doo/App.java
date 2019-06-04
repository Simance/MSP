package com.doo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*@EnableAutoConfiguration*/
@SpringBootApplication(scanBasePackages = {"com.doo"})
@RestController
@MapperScan("com.doo.dao")
public class App
{
    @RequestMapping("/")
    public String home(){
        return "hello world";
    }
    public static void main( String[] args )
    {
        SpringApplication.run(App.class,args);
    }
}
