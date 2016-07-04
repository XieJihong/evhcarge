/*
* Copyright (c) 2016 www.ev-link.com.cn. All Rights Reserved.
*/
package cn.com.evlink.evcharge.repositories;

import cn.com.evlink.evcharge.Application;
import cn.com.evlink.evcharge.entities.City;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import java.util.List;

/**
 * @author XieJihong
 * @version V1.0
 * @Package cn.com.evlink.evcharge.repositories
 * @Description: ${todo}(用一句话描述该文件做什么)
 * @date 2016/7/4 22:25
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class CityRepositoryTest {

	@Autowired
	CityRepository cityRepository;

	@Test
	public void findByRootTest(){
		Pageable pageable = new PageRequest(0, 5);
		Page<City> cityPage = cityRepository.findByRoot(pageable);
		Assert.notEmpty(cityPage.getContent());

		List<City> cityList = cityPage.getContent();
		for (City c: cityList) {
			System.out.println(c.getName() + "--->" + c.getChild().size());
		}
	}

	@Test
	public void findOne(){
		City city = cityRepository.findOne(2L);
		Assert.notNull(city);
		if(city != null){
			System.out.println(city.getParent().getName());
		}
	}
}
