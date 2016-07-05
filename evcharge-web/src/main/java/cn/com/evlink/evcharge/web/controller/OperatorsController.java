/*
* Copyright (c) 2016 www.ev-link.com.cn. All Rights Reserved.
*/
package cn.com.evlink.evcharge.web.controller;

import cn.com.evlink.evcharge.entities.Operators;
import cn.com.evlink.evcharge.service.OperatorsService;
import com.github.dandelion.datatables.core.ajax.DataSet;
import com.github.dandelion.datatables.core.ajax.DatatablesCriterias;
import com.github.dandelion.datatables.core.ajax.DatatablesResponse;
import com.github.dandelion.datatables.extras.spring3.ajax.DatatablesParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author XieJihong
 * @version V1.0
 * @Package cn.com.evlink.evcharge.web.controller
 * @Description: 运营商控制页面
 * @date 2016/6/25 19:11
 */
@Controller()
@RequestMapping("/operators")
public class OperatorsController extends AdminBaseController {

	@Autowired
	OperatorsService operatorsService;

	@Override
	protected String getHeaderTitle() {
		return null;
	}

	@RequestMapping("/index")
	public String index(Model model, Pageable pageable){
		return "operators/index";
	}

	@RequestMapping("/list") @ResponseBody
	public DatatablesResponse<Operators> list(@DatatablesParams DatatablesCriterias criterias){

		Page<Foo> page = fooService.findAll(criterias.getCurrentPageIndex(), metadata.getLenght(), metadata.getSearch());

		Page<Operators> page = operatorsService.findAll(new PageRequest(0,5));
		DataSet<Operators> dataSet = new DataSet<>(
				page.getContent(),
				page.getTotalElements(),
				(long)page.getContent().size());
		return DatatablesResponse.build(dataSet, criterias);
	}


}
