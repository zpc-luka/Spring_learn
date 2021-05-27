package com.zpc.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//// 这个注解的意思，说明这个类被Spring注册到了容器中
@Component   // 这个不要好像也行
public class User {
    private String name;

    public String getName() {
        return name;
    }

    @Value("zpc")    // 注入值
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
