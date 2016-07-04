/*
* Copyright (c) 2016 www.ev-link.com.cn. All Rights Reserved.
*/
package cn.com.evlink.evcharge.repositories;

import cn.com.evlink.evcharge.entities.City;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * @author XieJihong
 * @version V1.0
 * @Package cn.com.evlink.evcharge.repositories
 * @Description: ${todo}(用一句话描述该文件做什么)
 * @date 2016/7/4 22:19
 */
@Repository
public interface CityRepository extends PagingAndSortingRepository<City, Long> {

	@Query("select c from City c where c.parent is null")
	Page<City> findByRoot(Pageable pageable);

}
