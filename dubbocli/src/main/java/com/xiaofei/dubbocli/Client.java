package com.xiaofei.dubbocli;

import com.bestpay.dubbo.result.Result;
import com.bestpay.ecurrency.bestpaycard.core.service.model.request.QueryCardInfoReqDTO;
import com.bestpay.ecurrency.pcpf.api.model.request.QueryCardWithoutPassReqDTO;
import com.bestpay.ecurrency.pcpf.api.model.result.QueryCardWithoutPassRltDTO;
import com.bestpay.ecurrency.pcpf.api.order.OrderQueryService;
import com.bestpay.ecurrency.tycardcore.service.TycardPaymentDubboService;
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
		/*OrderQueryService orderTradeService = (OrderQueryService) SpringContextHelper.getBean("orderQueryService");
		QueryCardWithoutPassReqDTO queryCardWithoutPassReqDTO = new QueryCardWithoutPassReqDTO();
		queryCardWithoutPassReqDTO.setCardNo("160011483334");
queryCardWithoutPassReqDTO.setAgentCode("000041700000");
		queryCardWithoutPassReqDTO.setTraceLogId(UUID.randomUUID().toString())	;
		Result<QueryCardWithoutPassRltDTO> queryCardWithoutPassRltDTOResult = orderTradeService.queryCardWithoutPassInfo(queryCardWithoutPassReqDTO);
		System.out.println(queryCardWithoutPassReqDTO);*/
		TycardPaymentDubboService tycardPaymentDubboService =
				(TycardPaymentDubboService)SpringContextHelper.getBean("tycardPaymentDubboService");
//		String s = tycardPaymentDubboService.checkRefund("00000000009077162150", "111310049001128", "171024911507582127"
//				, "20171024", 10);
		// java -jar dubbocli-1.0-SNAPSHOT.jar 00000000009077162150 111310049001128 171024911507582127 20171024 10 20000000000002177732
		System.out.println("get object:tycardPaymentDubboService="+tycardPaymentDubboService);
		for (String s : args){
			System.out.println("param:s="+s);
		}
		String s = tycardPaymentDubboService.checkRefund(args[0], args[1], args[2]
				, args[3], Integer.parseInt(args[4]));
		System.out.println("return value="+s);
		/*String refund = tycardPaymentDubboService.refund("20000000000002177732", "111310049001128", "171024911507582127",
				"20171024", 10);*/
		String refund = tycardPaymentDubboService.refund(args[5], args[1], args[2],
				args[3], Integer.parseInt(args[4]));
		System.out.println("refund value="+refund);
		System.in.read();
	}


}

