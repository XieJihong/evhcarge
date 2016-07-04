/*
* Copyright (c) 2016 www.ev-link.com.cn. All Rights Reserved.
*/
package cn.com.evlink.evcharge.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author XieJihong
 * @version V1.0
 * @Package cn.com.evlink.evcharge.web.controller
 * @Description: ${todo}(用一句话描述该文件做什么)
 * @date 2016/6/25 9:03
 */
@Controller
public class HomeController extends AdminBaseController {

	@Override
	protected String getHeaderTitle() {
		return "";
	}

	@RequestMapping("/home")
	public String home(Model model) {
		return "dashboard";
	}

}
