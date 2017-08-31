package com.xiaofei.base.ws;

import org.apache.axis.AxisFault;

import javax.xml.rpc.holders.StringHolder;
import java.rmi.RemoteException;

/**
 * 类描述
 * <p>
 * 方法描述列表
 * </p>
 * User: xiao Date: 2017/8/15 0015 ProjectName: javatest
 */
public class WsClient {

    public static void main(String[] args) throws RemoteException {
        BpWebSer webSer = new BestpayServiceServerOnSkyszWsSoapBindingStub();
        StringHolder info = new StringHolder();
        info.value = "<datas>\n" +
                "<data>\n" +
                "<bank-accountno>20170815142711</bank-accountno>\n" +
                "<startdate>2017-08-10）</startdate>\n" +
                "<enddate>2017-08-17</enddate>\n" +
                "<startamount>0</startamount>\n" +
                "<endamount>10000</endamount>\n" +
                "</data>\n" +
                "</datas>\n";
        webSer.ifService("KPT","BFkdSAPddu2k","updateIncome","UPDATE_INCOME",info);
    }

}
