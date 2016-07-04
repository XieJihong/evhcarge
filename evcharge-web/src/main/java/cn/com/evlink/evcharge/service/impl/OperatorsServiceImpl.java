/*
* Copyright (c) 2016 www.ev-link.com.cn. All Rights Reserved.
*/
package cn.com.evlink.evcharge.service.impl;

import cn.com.evlink.evcharge.entities.Operators;
import cn.com.evlink.evcharge.repositories.OperatorsRepository;
import cn.com.evlink.evcharge.service.OperatorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author XieJihong
 * @version V1.0
 * @Package cn.com.evlink.evcharge.service.impl
 * @Description: ${todo}(用一句话描述该文件做什么)
 * @date 2016/7/4 21:12
 */
@Service
@Transactional
public class OperatorsServiceImpl implements OperatorsService {

	@Autowired
	private OperatorsRepository operatorsRepository;

	@Override
	public Page<Operators> findAll(Pageable pageable) {
		return operatorsRepository.findAll(pageable);
	}
}
