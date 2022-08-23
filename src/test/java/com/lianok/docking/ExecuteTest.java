package com.lianok.docking;

import cn.hutool.core.date.DateTime;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lianok.docking.request.*;
import com.lianok.docking.response.*;
import com.lianok.docking.util.HttpUtil;

import java.lang.reflect.Type;
import java.math.BigDecimal;

/**
 * @author linshu
 * @create 2022/8/22 20:21
 */
public class ExecuteTest {

    private static IDockingClient client;
    private final static String MERCHANTNO = "xxxx";
    private final static String ACCOUNT = "xxxx";

    private static String orderNo;

    public static void main(String[] args) {

        //client = new DefaultClient();
        client = new DefaultClient(DockingConfig.getUrl(), "xxxx", "xxxx");

        ApiHLOrderPayUnifiedTest();
        ApiHLOrderPayDetailsTest();
        ApiHLOrderCloseTest();

        ApiHLOrderPayBarcodeTest();
        ApiHLOrderRefundOperationTest();
        ApiHLOrderRefundDetailsTest();

    }

    private static void ApiHLOrderPayBarcodeTest() {
        ApiHLOrderPayBarcodeRequest request = new ApiHLOrderPayBarcodeRequest();
        request.setBusinessOrderNo(getThirdNo());
        request.setDeviceNo(getThirdNo());
        request.setMerchantNo(MERCHANTNO);
        request.setOperatorAccount(ACCOUNT);
        request.setPayAmount(BigDecimal.valueOf(0.01));
        request.setPayBarcode("付款码");
        request.setRemark("remark0");

        ResponseResultBase<ApiHLOrderPayBarcodeResponse> response = client.execute(request);
        orderNo = response.getData().getOrderNo();
    }

    private static void ApiHLOrderRefundOperationTest() {
        ApiHLOrderRefundOperationRequest request = new ApiHLOrderRefundOperationRequest();
        request.setBusinessRefundNo(getThirdNo());
        request.setOrderNo(orderNo);
        request.setRefundAmount(BigDecimal.valueOf(0.01));
        // 退款密码
        request.setRefundPassword("123456");
        request.setOperatorAccount(ACCOUNT);
        request.setMerchantNo(MERCHANTNO);
        request.setRemark("remark1");

        ResponseResultBase response = client.execute(request);
    }

    private static void ApiHLOrderPayDetailsTest() {
        ApiHLOrderPayDetailsRequest request = new ApiHLOrderPayDetailsRequest();
        request.setOrderNo(orderNo);
        request.setMerchantNo(MERCHANTNO);

        ResponseResultBase<ApiHLOrderPayDetailsResponse> response = client.execute(request);

    }

    private static void ApiHLOrderPayUnifiedTest() {
        ApiHLOrderPayUnifiedRequest request = new ApiHLOrderPayUnifiedRequest();
        request.setBusinessOrderNo(getThirdNo());
        request.setDeviceNo(getThirdNo());
        request.setMerchantNo(MERCHANTNO);
        request.setOperatorAccount(ACCOUNT);
        request.setPayWay("wechat");
        request.setPayAmount(BigDecimal.valueOf(0.01));
        request.setRemark("remark2");

        ResponseResultBase<ApiHLOrderPayUnifiedResponse> response = client.execute(request);
        orderNo = response.getData().getOrderNo();
    }

    private static void ApiHLOrderCloseTest() {
        ApiHLOrderCloseRequest request = new ApiHLOrderCloseRequest();
        request.setMerchantNo(MERCHANTNO);
        request.setOrderNo(orderNo);

        ResponseResultBase<ApiHLOrderCloseResponse> response = client.execute(request);
    }

    private static void ApiHLOrderRefundDetailsTest() {
        ApiHLOrderRefundDetailsRequest request = new ApiHLOrderRefundDetailsRequest();
        request.setMerchantNo(MERCHANTNO);
        request.setRefundNo("2022231090000002");

        ResponseResultBase response = client.execute(request);
    }

    private static void ApiHLOrderPayAppletTest() {
        ApiHLOrderPayAppletRequest request = new ApiHLOrderPayAppletRequest();
        request.setOperatorAccount(ACCOUNT);
        request.setMerchantNo(MERCHANTNO);
        request.setRemark("remark3");
        request.setAppId("appid");
        request.setOpenId("openid");
        request.setPayWay("wechat");
        request.setPayAmount(BigDecimal.valueOf(0.01));
        request.setSubject("title");
        request.setBusinessOrderNo(getThirdNo());

        ResponseResultBase response = client.execute(request);
        assert response != null;
        assert response.success();
    }
    
    private static String getThirdNo() {
        return DateTime.now().toString("yyyyMMddHHmmss");
    }
}
