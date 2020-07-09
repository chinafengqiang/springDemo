package cn.feng.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * <p></p>
 *
 * @author: JQ.Feng
 * @create: 2020-02-03
 */
@Service
public class UserService {
    public static Random random =new Random();
    @Async(value = "taskExecutor")
    public void printA(){
        System.out.println("A print开始");
        long start = System.currentTimeMillis();
        try {
            Thread.sleep(random.nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("A print完成，耗时：" + (end - start) + "毫秒");
    }

    @Async(value = "taskExecutor")
    public void printB(){
        System.out.println("B print开始");
        long start = System.currentTimeMillis();
        try {
            Thread.sleep(random.nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("B print完成，耗时：" + (end - start) + "毫秒");
    }

}

