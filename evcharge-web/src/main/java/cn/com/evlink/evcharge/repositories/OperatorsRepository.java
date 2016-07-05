/*
* Copyright (c) 2016 www.ev-link.com.cn. All Rights Reserved.
*/
package cn.com.evlink.evcharge.repositories;

import cn.com.evlink.evcharge.entities.Operators;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.stereotype.Repository;

/**
 * @author XieJihong
 * @version V1.0
 * @Package cn.com.evlink.evcharge.repositories
 * @Description: 运营商操作
 * @date 2016/7/4 21:08
 */
@Repository
public interface OperatorsRepository extends DataTablesRepository<Operators, Long> {
}
