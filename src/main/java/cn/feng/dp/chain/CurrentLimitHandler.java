package cn.feng.dp.chain;

import org.springframework.stereotype.Component;

/**
 * <p>具体Handler实现</p>
 *
 * @author: JQ.Feng
 * @create: 2020-03-13
 */
@Component
public class CurrentLimitHandler extends GatewayHandler{
    @Override
    public void service() {
        System.out.println("第一关 API接口限流操作.....");
        /**
         * 指向下一关
         */
        nextService();
    }
}

