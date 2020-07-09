package cn.feng.dp.chain;

import org.springframework.stereotype.Component;

/**
 * <p></p>
 *
 * @author: JQ.Feng
 * @create: 2020-03-13
 */
@Component
public class BacklistHandler extends GatewayHandler {
    @Override
    public void service() {
        System.out.println("第二关 黑名单拦截.......");
        nextService();
    }
}

