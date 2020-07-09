package cn.feng.dp.strategy;

import org.springframework.stereotype.Component;

/**
 * <p></p>
 *
 * @author: JQ.Feng
 * @create: 2020-03-13
 */
@Component
public class AliPayStrategy implements PayStrategy {
    @Override
    public String toPayHtml() {
        return "调用支付宝支付接口...";
    }
}

