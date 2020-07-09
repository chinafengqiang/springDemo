package cn.feng.dp.strategy;

import org.springframework.stereotype.Component;

/**
 * <p></p>
 *
 * @author: JQ.Feng
 * @create: 2020-03-13
 */
@Component
public class UnionPayStrategy implements PayStrategy {
    @Override
    public String toPayHtml() {
        return "调用银联支付接口...";
    }
}

