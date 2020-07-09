package cn.feng.bean;

import org.springframework.stereotype.Component;

/**
 * <p></p>
 *
 * @author: JQ.Feng
 * @create: 2020-02-12
 */
public class Car {
    public Car() {
        System.out.println("Car constructor...");
    }

    public void init(){
        System.out.println("Car init...");
    }

    public void destroy(){
        System.out.println("Car destroy...");
    }

    public void print(){
        System.out.println("Car...print...");
    }
}

