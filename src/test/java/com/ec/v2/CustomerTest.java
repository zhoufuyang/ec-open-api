package com.ec.v2;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.junit.Test;

import com.ec.v2.config.Config;
import com.ec.v2.entity.customer.CrmIdslDto;
import com.ec.v2.entity.customer.QueryLabelResp;
import com.ec.v2.service.Customer;
public class CustomerTest {
	@Test
	public void queryLabel() throws ClientProtocolException, IOException {
		// 1. 初始化签名 和 配置信息
		// 在同一个进程中，第一次调用，需要初始化配置， 后续调用无需初始化, 直接从第二不开始
		initConfig();
		
		// 2. 构建请求参数
		CrmIdslDto dto = new CrmIdslDto();
		dto.setCrmIds("xx");
		
		// 3. 请求服务器 获取数据
		QueryLabelResp res = Customer.queryLabel(dto);
		
		// 4。 处理结果
		System.out.println(res);
	}
	// 初始化签名 和 配置信息
	private void initConfig() {
		// 调试的时候，需要还成您的企业id
		long corpId = 0L;
		// 调试的时候，需要还成您的appId
		String appId = "${appId}";
		// 调试的时候，需要还成您的secret
		String secret = "${secret}";
		// 初始化配置信息
		Config.initConfig(corpId, appId, secret);
	}

}
