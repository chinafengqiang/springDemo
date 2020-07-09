package cn.feng.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p></p>
 *
 * @author: JQ.Feng
 * @create: 2020-03-12
 */
@Service
public class DemoService {
    @Autowired
    private UserService userService;

    public void print(){
        System.out.println("All Start...");
        userService.printA();
        userService.printB();
        System.out.println("All Over...");
    }
}

