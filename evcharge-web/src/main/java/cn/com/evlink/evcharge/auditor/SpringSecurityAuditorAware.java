/*
* Copyright (c) 2016 www.ev-link.com.cn. All Rights Reserved.
*/
package cn.com.evlink.evcharge.auditor;

import cn.com.evlink.evcharge.entities.User;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

/**
 * @author XieJihong
 * @version V1.0
 * @Package cn.com.evlink.evcharge.auditor
 * @Description: ${todo}(用一句话描述该文件做什么)
 * @date 2016/7/4 23:01
 */
@Component
public class SpringSecurityAuditorAware implements AuditorAware<User> {

	/*@Override
	public User getCurrentAccount() {
		//SecurityContext securityContext = SecurityContextHolder.getContext();
		//UserDetailsCustom springSecurityUser = (UserDetailsCustom) securityContext.getAuthentication().getPrincipal();
		return springSecurityUser.getAccount();
	}*/

	@Override
	public User getCurrentAuditor() {
		User user = new User();
		user.setId(1L);
		return user;
	}
}
