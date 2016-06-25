/*
* Copyright (c) 2016 www.ev-link.com.cn. All Rights Reserved.
*/
package cn.com.evlink.evcharge.web.controller;

import cn.com.evlink.evcharge.entities.Operators;
import com.github.dandelion.datatables.core.ajax.DataSet;
import com.github.dandelion.datatables.core.ajax.DatatablesCriterias;
import com.github.dandelion.datatables.core.ajax.DatatablesResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author XieJihong
 * @version V1.0
 * @Package cn.com.evlink.evcharge.web.controller
 * @Description: 运营商控制页面
 * @date 2016/6/25 19:11
 */
@Controller("/operators")
public class OperatorsController extends AdminBaseController {

	@Override
	protected String getHeaderTitle() {
		return null;
	}

	@RequestMapping("/index")
	public String index(){
		return "index";
	}


	@RequestMapping(value = "/list")
	public @ResponseBody
	DatatablesResponse<Operators> findAllForDataTables(HttpServletRequest request) {
		DatatablesCriterias criterias = DatatablesCriterias.getFromRequest(request);
		DataSet<Operators> persons = this.findPersonsWithDatatablesCriterias(criterias);
		return DatatablesResponse.build(persons, criterias);
	}

	public DataSet<Operators> findPersonsWithDatatablesCriterias(DatatablesCriterias criterias) {
		List<Operators> persons = new ArrayList<>();

		for(int i=0; i<1000;i++){
			Operators operators = new Operators();
			operators.setId(i + 1000L);
			operators.setCode("1000"+i);
			operators.setName("operators " + i);
			operators.setCreateTime(new Date());

			persons.add(operators);
		}

		Long count = 1000L;
		Long countFiltered = 20L;

		return new DataSet<Operators>(persons, count, countFiltered);
	}
}
