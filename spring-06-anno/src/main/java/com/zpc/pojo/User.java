package com.zpc.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// 等价于<bean id="user" class="com.zpc.pojo.User"/>
@Component
@Scope("prototype")
public class User {

    // 相当于 <property name="name" value="zpc">
//    @Value("zpc")
    public String name;

    @Value("zpc")
    public void setName(String name) {
        this.name = name;
    }
}
