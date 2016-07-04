/*
* Copyright (c) 2016 www.ev-link.com.cn. All Rights Reserved.
*/
package cn.com.evlink.evcharge.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author XieJihong
 * @version V1.0
 * @Package cn.com.evlink.evcharge.entities
 * @Description: ${todo}(用一句话描述该文件做什么)
 * @date 2016/7/4 22:09
 */
@Data
@Entity
@Table(name = "SYS_CITY")
public class City {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	private String code;

	private Float lat;

	private Float lot;

	@ManyToOne
	@JoinColumn(name = "PARENT_ID")
	private City parent;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "parent")
	private List<City> child = new ArrayList<>();
}
