/*
* Copyright (c) 2016 www.ev-link.com.cn. All Rights Reserved.
*/
package cn.com.evlink.evcharge.config;

import org.hibernate.cfg.ImprovedNamingStrategy;

/**
 * @author XieJihong
 * @version V1.0
 * @Package cn.com.evlink.evcharge.config
 * @Description: ${todo}(用一句话描述该文件做什么)
 * @date 2016/7/4 22:00
 */
public class MySQLUpperCaseStrategy extends ImprovedNamingStrategy {

	@Override
	public String tableName(String tableName) {
		return tableName.toUpperCase();
	}
}
