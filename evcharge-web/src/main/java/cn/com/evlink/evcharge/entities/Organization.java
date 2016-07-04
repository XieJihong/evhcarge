/*
* Copyright (c) 2016 www.ev-link.com.cn. All Rights Reserved.
*/
package cn.com.evlink.evcharge.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author XieJihong
 * @version V1.0
 * @Package cn.com.evlink.evcharge.entities
 * @Description: ${todo}(用一句话描述该文件做什么)
 * @date 2016/7/4 22:05
 */
/*@Data
@Entity
@Table(name = "SYS_ORG")*/
public class Organization {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	private String code;

	private Organization parentId;

	private int type;

	private City cityId;
	private String address;
	private String contact;
	private String phone;
	private String email;
	private String status;
	private String remark;
	private int delFlag;
	private User createBy;
	private Date createDate;
	private User updateBy;
	private Date updateDate;
}
