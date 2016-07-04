/*
* Copyright (c) 2016 www.ev-link.com.cn. All Rights Reserved.
*/
package cn.com.evlink.evcharge.config;

import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author XieJihong
 * @version V1.0
 * @Package cn.com.evlink.evcharge.config
 * @Description: ${todo}(用一句话描述该文件做什么)
 * @date 2016/7/4 21:38
 */
@Configuration
@EnableTransactionManagement
@EntityScan("cn.com.evlink.evcharge.**.entities")
@EnableJpaRepositories(basePackages = "cn.com.evlink.evcharge.**.repositories")
public class RepoConfig {
}
