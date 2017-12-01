package com.xc.rocketmq;


import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.client.producer.DefaultMQProducer;
import com.alibaba.rocketmq.client.producer.SendResult;
import com.alibaba.rocketmq.common.message.Message;

import java.util.Date;

/**
 * Created by xc on 2017/11/30.
 */
public class Producer {
    public static void main(String[] args) throws MQClientException {
        DefaultMQProducer producer = new DefaultMQProducer("rmq-group");
        producer.setNamesrvAddr("47.104.16.32:9876");
        producer.setInstanceName("producer");
        producer.start();
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(1000);  //每秒发送一次MQ
                Message msg = new Message("TopicA-test",// topic
                        "TagA",// tag
                        (new Date() + " Hello RocketMQ ,QuickStart " + i)
                                .getBytes()// body
                );
                SendResult sendResult = producer.send(msg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        producer.shutdown();
    }
}
