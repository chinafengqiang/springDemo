package cn.feng.mq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * <p>MQ消费者</p>
 *
 * @author: JQ.Feng
 * @create: 2020-05-11
 */
@Service
public class MQConsumer {
    private static final Logger log = LoggerFactory.getLogger(MQConsumer.class);


    @RabbitListener(queues = MQConfig.TOPIC_QUEUE3)
    public void receiveTopic3(String message){
        log.info("====> receive topic3 message ::"+message);
    }

}



