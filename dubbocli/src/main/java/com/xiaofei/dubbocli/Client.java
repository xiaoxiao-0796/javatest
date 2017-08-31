package com.xiaofei.dubbocli;

import com.bestpay.dubbo.result.Result;
import com.bestpay.ecurrency.bestpaycard.core.service.model.request.QueryCardInfoReqDTO;
import com.bestpay.ecurrency.pcpf.api.model.request.QueryCardWithoutPassReqDTO;
import com.bestpay.ecurrency.pcpf.api.model.result.QueryCardWithoutPassRltDTO;
import com.bestpay.ecurrency.pcpf.api.order.OrderQueryService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.UUID;

public class Client {
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		/*OrderQueryService orderTradeService = (OrderQueryService) SpringContextHelper.getBean("orderQueryService1");
		QueryCardInfoReqDTO reqDTO =  QueryCardInfoReqDTO.builder().cardNo("160011483344").build();
		Result<QueryCardInfoResultDTO> result = orderTradeService.queryCardInfo(reqDTO);
		System.out.println(result);*/
		OrderQueryService orderTradeService = (OrderQueryService) SpringContextHelper.getBean("orderQueryService");
		QueryCardWithoutPassReqDTO queryCardWithoutPassReqDTO = new QueryCardWithoutPassReqDTO();
		queryCardWithoutPassReqDTO.setCardNo("160011483334");
queryCardWithoutPassReqDTO.setAgentCode("000041700000");
		queryCardWithoutPassReqDTO.setTraceLogId(UUID.randomUUID().toString())	;
		Result<QueryCardWithoutPassRltDTO> queryCardWithoutPassRltDTOResult = orderTradeService.queryCardWithoutPassInfo(queryCardWithoutPassReqDTO);
		System.out.println(queryCardWithoutPassReqDTO);
		System.in.read();
	}


}

