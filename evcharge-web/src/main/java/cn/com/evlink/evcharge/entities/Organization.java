/*
* Copyright (c) 2016 www.ev-link.com.cn. All Rights Reserved.
*/
package cn.com.evlink.evcharge.entities;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

/**
 * @author XieJihong
 * @version V1.0
 * @Package cn.com.evlink.evcharge.entities
 * @Description: ${todo}(用一句话描述该文件做什么)
 * @date 2016/7/4 22:05
 */
@Data
@Entity
@Table(name = "SYS_ORG")
@EntityListeners(AuditingEntityListener.class)
public class Organization {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	private String code;

	@ManyToOne
	@JoinColumn(name = "PARENT_ID")
	private Organization parentId;

	private int type;

	@ManyToOne
	@JoinColumn(name = "CITY_ID")
	private City cityId;

	private String address;

	private String contact;

	private String phone;

	private String email;

	private String status;

	private String remark;

	private int delFlag;

	@CreatedBy
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CREATE_BY")
	private User createBy;

	@CreatedDate
	private Date createDate;

	@LastModifiedBy
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UPDATE_BY")
	private User updateBy;

	@LastModifiedDate
	private Date updateDate;
}
