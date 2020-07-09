package cn.feng.config;

import cn.feng.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Controller;

/**
 * <p>
 * @Configuration声明为一个配置类
 * @Bean声明一个bean交给Spring管理，类型为方法返回类型
 * @ComponentScan value：指定要扫描的包
 *              excludeFilters: 指定扫描时按什么规则排除哪些组件
 *              includeFilter:  指定扫描的时候需要包括哪些组件
 * @ComponentScans =  @ComponentScan[] : 可以指定多个@ComponentScan
 * </p>
 *
 * @author: JQ.Feng
 * @create: 2020-02-03
 */
@Configuration
//@ComponentScan(value = "cn.feng",excludeFilters = {@ComponentScan.Filter(
//    type = FilterType.ANNOTATION,classes = {Controller.class}
//)})
@ComponentScan(value = "cn.feng",includeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,
                classes = {Controller.class})},
        useDefaultFilters = false
                )
public class UserConfig {
    @Bean
    public User user(){
        return new User("user1",30);
    }
}

