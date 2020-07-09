package cn.feng.dp.strategy;

import cn.feng.common.SpringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <p></p>
 *
 * @author: JQ.Feng
 * @create: 2020-03-13
 */
@Component
public class PayContextStrategy {
    public String toPayHtml(String strategyBeanId){
        PayStrategy payStrategy = SpringUtils.getBean(strategyBeanId, PayStrategy.class);
        return payStrategy.toPayHtml();
    }
}

