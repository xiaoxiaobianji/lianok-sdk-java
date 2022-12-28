package com.lianok.docking;

import com.alibaba.fastjson.JSONObject;
import com.lianok.docking.enums.ChannelEnum;
import com.lianok.docking.enums.PayWayEnum;
import com.lianok.docking.request.applet.ApiHLOrderPayAppletRequest;
import com.lianok.docking.request.ledger.*;

import java.math.BigDecimal;

/**
 * 分账测试
 *
 * @author linshu
 * @create 2022/11/2 14:07
 */
public class LedgerTest {
    private static IDockingClient client;
    private final static String MERCHANTNO = "751329";
    private final static String ACCOUNT = "18629600032";


    public static void main(String[] args) {
        client = new DefaultClient(DockingConfig.getUrl(), "1422168100000001", "JfvzmmB1iK");
        // 分账开通
//        ApiHLBillContractAccreditTest();

        //开通查询
//        ApiHLBillContractAccreditQueryTest();


//        ApiHLBillMerchantBindTest();
//        ApiHLBillMerchantUnbindTest();
//        ApiHLBillMerchantQueryTest();


//        ApiHLBillOrderCancelTest();
//        ApiHLBillOrderCreateTest();
//        ApiHLBillOrderQueryTest();
//        ApiHLBillRefundTest();
        ApiHLBillRuleCreateTest();
//        ApiHLBillRuleQueryTest();
//        ApiHLBillRuleUpdateTest();
//        ApiHLBillSetTest();
    }

    // 分账开通
    private static void ApiHLBillContractAccreditTest() {
        ApiHLBillContractAccreditRequest request = new ApiHLBillContractAccreditRequest();
        request.setMerchantNo(MERCHANTNO);
        request.setChannelCode(ChannelEnum.getEnumValue(ChannelEnum.LESHUA));
        request.setRateType(2);
        request.setSharePercent(1000);

        ResponseResultBase response = client.execute(request);
        assert response != null;
        assert response.success();
    }

    //开通查询
    private static void ApiHLBillContractAccreditQueryTest() {
        ApiHLBillContractAccreditQueryRequest request = new ApiHLBillContractAccreditQueryRequest();
        request.setMerchantNo(MERCHANTNO);
        request.setChannelCode(ChannelEnum.getEnumValue(ChannelEnum.LESHUA));

        ResponseResultBase response = client.execute(request);
        assert response != null;
        assert response.success();
    }

    // 分账接收方关系绑定
    private static void ApiHLBillMerchantBindTest() {
        ApiHLBillMerchantBindRequest request = new ApiHLBillMerchantBindRequest();
        request.setMerchantNo(MERCHANTNO);
        request.setChannelCode(ChannelEnum.getEnumValue(ChannelEnum.LESHUA));
        request.setReceiveMerchantNo("791007");
        request.setReceiveChannelCode(ChannelEnum.getEnumValue(ChannelEnum.LESHUA));

        ResponseResultBase response = client.execute(request);
        System.out.println(JSONObject.toJSONString(response.getData()));
        assert response != null;
        assert response.success();
    }

    // 分账接收方关系解除绑定
    private static void ApiHLBillMerchantUnbindTest() {
        ApiHLBillMerchantUnbindRequest request = new ApiHLBillMerchantUnbindRequest();
        request.setMerchantNo(MERCHANTNO);
        request.setChannelCode(ChannelEnum.getEnumValue(ChannelEnum.LESHUA));
        request.setReceiveMerchantNo("791007");
        request.setReceiveChannelCode(ChannelEnum.getEnumValue(ChannelEnum.LESHUA));

        ResponseResultBase response = client.execute(request);
        assert response != null;
        assert response.success();
    }

    // 分账关系查询
    private static void ApiHLBillMerchantQueryTest() {
        ApiHLBillMerchantQueryRequest request = new ApiHLBillMerchantQueryRequest();
        request.setMerchantNo(MERCHANTNO);
        request.setChannelCode(ChannelEnum.getEnumValue(ChannelEnum.LESHUA));

        ResponseResultBase response = client.execute(request);
        assert response != null;
        assert response.success();
    }

    private static void ApiHLBillOrderCancelTest(){

    }

    private static void ApiHLBillOrderCreateTest(){

    }

    private static void ApiHLBillOrderQueryTest(){

    }

    private static void ApiHLBillRefundTest(){

    }

    private static void ApiHLBillRuleCreateTest(){
        ApiHLBillRuleCreateRequest request = new ApiHLBillRuleCreateRequest();
        request.setMerchantNo(MERCHANTNO);
        request.setChannelCode(ChannelEnum.getEnumValue(ChannelEnum.LESHUA));
        request.setShareRuleStatus(0);
        request.setSharePercent(10);
        request.setMaxShareAmount(BigDecimal.valueOf(1000));
        request.setMaxMonthShareAmount(BigDecimal.valueOf(1000));
        request.setReceiveMerchantNo("791007");
        request.setReceiveChannelCode(ChannelEnum.getEnumValue(ChannelEnum.LESHUA));
        ResponseResultBase response = client.execute(request);
        System.out.println(JSONObject.toJSONString(response.getData()));
        assert response != null;
        assert response.success();
    }

    private static void ApiHLBillRuleQueryTest(){

    }

    private static void ApiHLBillRuleUpdateTest(){

    }

    private static void ApiHLBillSetTest(){

    }
}
