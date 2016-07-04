/*
* Copyright (c) 2016 www.ev-link.com.cn. All Rights Reserved.
*/
package cn.com.evlink.evcharge.entities;

import lombok.Data;

import javax.persistence.*;

/**
 * @author XieJihong
 * @version V1.0
 * @Package cn.com.evlink.evcharge.entities
 * @Description: ${todo}(用一句话描述该文件做什么)
 * @date 2016/7/4 22:03
 */
@Data
@Entity
@Table(name = "SYS_USER")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
}
