/**
 *
 */
package cn.com.evlink.evcharge.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;


public abstract class AdminBaseController {
	protected final Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	protected MessageSource messageSource;

	protected abstract String getHeaderTitle();

	public String getMessage(String code) {
		return messageSource.getMessage(code, null, null);
	}

	public String getMessage(String code, String defaultMsg) {
		return messageSource.getMessage(code, null, defaultMsg, null);
	}
}
