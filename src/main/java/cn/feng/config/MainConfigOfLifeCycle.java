package cn.feng.config;

import cn.feng.bean.Car;
import cn.feng.bean.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * <p>生命周期</p>
 * bean创建(构造) -- 初始化 -- 销毁过程
 * 容器管理bean的生命周期：
 * 我们可以自定义初始化和销毁方法：容器在bean进行到当前生命周期都时候来调用我们自定义的
 *                            初始化和销毁方法
 * 整个生命周期执行顺序如下：
 * 一、构造（对象创建）：即执行构造方法创建对象
 *      单实例（单例）：在容器启动的时候创建对象
 *      多实例：在每次获取的时候创建对象
 * 二、BeanPostProcessor.postProcessBeforeInitialization
 * 三、初始化（具体初始化方式参见下方自定义初始化方式）：对象创建完成，并赋好值。调用初始化方法。。。
 * 四、BeanPostProcessor.postProcessAfterInitialization
 * 五、销毁（具体初始化方式参见下方自定义销毁方式）：
 *      单实例：在容器关闭的时候
 *      多实例：容器不管理这个bean，容器不会调用销毁方法
 *
 * 自定义初始化和销毁方法的具体方式：
 *  1、通过@Bean指定具体的initMethod和destroyMethod
 *  2、通过让bean实现InitializingBean（定义初始化逻辑）和DisposableBean（定义销毁逻辑）接口
 *  3、可以使用JSR250：
 *          @PostConstruct，在bean创建完成并且属性赋值完成，来执行初始化方法。
 *          @PreDestroy，在容器销毁bean之前通知我们进行清理工作
 *  4、BeanPostProcessor：bean的后置处理器
 *      在bean的初始化前后进行一些处理工作
 *      postProcessBeforeInitialization：在初始化之前工作
 *      postProcessAfterInitialization：在初始化之后工作
 *
 * @author: JQ.Feng
 * @create: 2020-02-14
 */
@ComponentScan("cn.feng.bean")
@Configuration
public class MainConfigOfLifeCycle {

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Car car(){
        return new Car();
    }

}




