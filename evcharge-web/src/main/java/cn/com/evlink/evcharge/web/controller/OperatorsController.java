/*
* Copyright (c) 2016 www.ev-link.com.cn. All Rights Reserved.
*/
package cn.com.evlink.evcharge.web.controller;

import cn.com.evlink.evcharge.service.OperatorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
	public String index(Model model){
		operatorsService.findAll(new PageRequest(0,5));

		return "operators/index";
	}


}
