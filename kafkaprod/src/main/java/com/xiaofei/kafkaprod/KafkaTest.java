package com.xiaofei.kafkaprod;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.concurrent.ListenableFuture;

/**
 * 类描述
 * <p>
 * 方法描述列表
 * </p>
 * User: xiao Date: 2017/8/8 0008 ProjectName: javatest
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application.xml"})
public class KafkaTest {

    @Autowired
    private KafkaTemplate<Integer, String> kafkaTemplate;

    /**
     * 向kafka里写数据.<br/>
     * @author miaohongbin
     * Date:2016年6月24日下午6:22:58
     */
    @Test
    public void testTemplateSend(){
        //设置topic
        String topic = "test";
        //发送消息 i
        for (int i=0; i<10;i++)
         kafkaTemplate.send(topic,"haha"+i);
    }

}
