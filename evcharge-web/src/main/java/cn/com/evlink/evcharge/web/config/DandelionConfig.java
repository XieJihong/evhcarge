/*
* Copyright (c) 2016 www.ev-link.com.cn. All Rights Reserved.
*/
package cn.com.evlink.evcharge.web.config;

import com.github.dandelion.core.web.DandelionFilter;
import com.github.dandelion.core.web.DandelionServlet;
import com.github.dandelion.datatables.core.web.filter.DatatablesFilter;
import com.github.dandelion.datatables.thymeleaf.dialect.DataTablesDialect;
import com.github.dandelion.thymeleaf.dialect.DandelionDialect;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author XieJihong
 * @version V1.0
 * @Package cn.com.evlink.evcharge.web.config
 * @Description: ${todo}(用一句话描述该文件做什么)
 * @date 2016/6/25 19:00
 */
@Component
@Configuration
public class DandelionConfig {

	@Bean
	public DataTablesDialect dataTablesDialect() {
		return new DataTablesDialect();
	}

	@Bean
	public DandelionDialect dandelionDialect() {
		return new DandelionDialect();
	}

	@Bean
	public FilterRegistrationBean dandelionFilterRegistrationBean() {
		return new FilterRegistrationBean(new DandelionFilter());
	}

	@Bean
	public FilterRegistrationBean datatableFilterRegistrationBean() {
		return new FilterRegistrationBean(new DatatablesFilter());
	}

	@Bean
	public ServletRegistrationBean dandelionServletRegistrationBean() {
		return new ServletRegistrationBean(new DandelionServlet(), "/dandelion-assets/*");
	}
}