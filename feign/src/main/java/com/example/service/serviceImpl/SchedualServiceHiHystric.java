package com.example.service.serviceImpl;

import com.example.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * TODO (输入本类描述)
 *
 * @author mhx
 * @version 1.0
 * @date 2019/6/28 14:47
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name+"基于service-feign工程进行改造，只需要在FeignClient的SchedualServiceHi接口的注解中加上fallback的指定类就行了：SchedualServiceHiHystric需要实现SchedualServiceHi 接口，并注入到Ioc容器中";
    }
}
