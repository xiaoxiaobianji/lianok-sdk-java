# 火脸开放平台 SDK FOR JAVA

## 文档
[SDK文档首页](https://www.yuque.com/youyun-8yqqt/vpbgq7)


## 环境要求
1. lianok-sdk-java 需要 jdk 1.8 及以上的开发环境。
2. 需要提前获取对接参数
3. 环境包含\[test|pre|publish\],不同环境对应不同的对接参数

## 快速使用
以下这段代码示例向您展示了使用SDK调用一个API的主要步骤：
1. 创建对接配置，用于构建调用接口Service
2. 构建调用接口Service用于后续接口请求
3. 发起请求并处理响应或异常

```java
package com.lianok.sdk.java;

import com.alibaba.fastjson.JSON;
import com.lianok.core.config.Md5Config;
import com.lianok.core.emuns.EnvEnum;
import com.lianok.core.entity.ResponseResultBase;
import com.lianok.docking.LianokService;
import com.lianok.docking.pay.request.*;
import java.math.BigDecimal;

public class UnifiedPay {

    /** 对接码 */
    public static final String AUTHCODE = "1423254150000001";
    /** 加密密钥 */
    public static final String KEY = "hOnHeN2daY";


    public static void main(String[] args) {

        /** 测试环境，正式上线请使用 PUBLISH */
        EnvEnum testEnv = EnvEnum.TEST;

        /** config配置初始化一次，建构service使用即可 */
        /**
        Md5Config 用于交易接口列表，
        EntryConfig用于非交易接口列表，如商户入驻、消费者投诉等接口，
        UploadConfig用于图片上传
        */
        Md5Config config = new Md5Config.Builder()
                .config(testEnv, AUTHCODE, KEY)
                .build();
        /** 只构建一次即可 **/
        LianokService service = new LianokService.Builder()
                .config(config)
                .build();

        ApiHlOrderPayUnifiedRequest request = new ApiHlOrderPayUnifiedRequest();
        /** 业务订单号，保持唯一 */
        request.setBusinessOrderNo("202001010000001");
        /** 在火脸服务商后台-商户列表或商家后台-门店列表，可查看该字段 */
        request.setMerchantNo("102186");
        /** 在火脸商户后台员工管理中，可配置收银员，收银员登陆支持手机号登陆。
        	可在商户后台-员工管理中查看所有收银员的手机号。 */
        request.setOperatorAccount("18555551939");
        request.setPayAmount(new BigDecimal(1));
        request.setPayWay("wechat");
        try {
            ResponseResultBase response = service.execute(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            System.out.println("调用失败:" + e.getMessage());
        }
    }
}
```
