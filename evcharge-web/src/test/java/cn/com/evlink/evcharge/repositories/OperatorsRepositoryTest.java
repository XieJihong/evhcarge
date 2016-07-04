/*
* Copyright (c) 2016 www.ev-link.com.cn. All Rights Reserved.
*/
package cn.com.evlink.evcharge.repositories;

import cn.com.evlink.evcharge.Application;
import cn.com.evlink.evcharge.entities.Operators;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

/**
 * @author XieJihong
 * @version V1.0
 * @Package cn.com.evlink.evcharge.repositories
 * @Description: ${todo}(用一句话描述该文件做什么)
 * @date 2016/7/4 21:42
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class OperatorsRepositoryTest {

	@Autowired
	OperatorsRepository operatorsRepository;

	@Test
	public void findAll(){
		Iterable<Operators> operatorses = operatorsRepository.findAll();
		Assert.isTrue(operatorses.iterator().hasNext());
	}

	@Test
	public void findOne(){
		Operators operators = operatorsRepository.findOne(1L);
		System.out.println(operators.toString());
	}
}
