/*
* Copyright (c) 2016 www.ev-link.com.cn. All Rights Reserved.
*/
package cn.com.evlink.evcharge.service;

import cn.com.evlink.evcharge.entities.Operators;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author XieJihong
 * @version V1.0
 * @Package cn.com.evlink.evcharge.service
 * @Description: ${todo}(用一句话描述该文件做什么)
 * @date 2016/7/4 21:09
 */
public interface OperatorsService {

	Page<Operators> findAll(Pageable pageable);

}
