package com.zpc.config;

import com.zpc.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration        // 这个也会被Spring容器托管，注册到容器中，因为他被@Component，
                      // @Configuration 代表这是个配置类，，就和之前Beans.xml一样
@ComponentScan("com.zpc.pojo")
@Import(config2.class)
public class Config {

    //注册一个Bean，就相当于写的一个Bean标签
    //这个方法的名字相当于 bean标签的id属性
    //这个方法的返回值，相当于 bean标签的class属性
    @Bean
    public User getUser() {
        return new User();          // 就是返回要注入的bean对象
    }
}
