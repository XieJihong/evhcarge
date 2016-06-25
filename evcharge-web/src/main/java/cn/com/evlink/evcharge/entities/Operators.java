/*
* Copyright (c) 2016 www.ev-link.com.cn. All Rights Reserved.
*/
package cn.com.evlink.evcharge.entities;

import lombok.Data;

import java.util.Date;

/**
 * @author XieJihong
 * @version V1.0
 * @Package cn.com.evlink.evcharge.entities
 * @Description: 运营商实体类
 * @date 2016/6/25 19:04
 */
@Data
public class Operators {

	private Long id;

	private String name;

	private String code;

	private String iocn;

	private String contacts;

	private String phone;

	private String address;

	private String remark;

	private Long createBy;

	private Date createTime;
}
