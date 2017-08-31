package com.xiaofei.kafkacons;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.listener.MessageListener;

/**
 * 类描述
 * <p>
 * 方法描述列表
 * </p>
 * User: xiao Date: 2017/8/8 0008 ProjectName: javatest
 */
public class KafkaConsumer implements MessageListener<Integer, String> {

    @Override
    public void onMessage(ConsumerRecord<Integer, String> integerStringConsumerRecord) {
        System.out.println(integerStringConsumerRecord.value());
    }

}
