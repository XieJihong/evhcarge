/*
* Copyright (c) 2016 www.ev-link.com.cn. All Rights Reserved.
*/
package cn.com.evlink.evcharge.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
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
		return "home";
	}

	@RequestMapping("/{v1}/{v2}")
	public String forward(@PathVariable String v1, @PathVariable String v2){
		String forward = "";
		if(!StringUtils.isEmpty(v1)){
			forward += "/" + v1;
		}

		if(!StringUtils.isEmpty(v2)){
			forward += "/" + v2;
		}

		return forward;
	}

	@RequestMapping("/{v1}")
	public String forward(@PathVariable String v1){
		String forward = "";
		if(!StringUtils.isEmpty(v1)){
			forward += "/" + v1;
		}else{
			forward = "index";
		}

		return forward;
	}
}
