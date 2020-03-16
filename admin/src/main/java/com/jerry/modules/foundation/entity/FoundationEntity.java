package com.jerry.modules.foundation.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 基金实体类
 * 
 * @author Jerry
 * @email jerryxue0609@foxmail.com
 * @date 2020-03-15 22:51:33
 */
@Data
@TableName("foundation")
public class FoundationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 基金代码
	 */
	private String code;
	/**
	 * 基金名称
	 */
	private String name;
	/**
	 * 基金主题
	 */
	private String theme;
	/**
	 * 基金类型
	 */
	private String type;
	/**
	 * 持有总金额
	 */
	private Double totalmoney;
	/**
	 * 创建时间
	 */
	private Date createtime;
	/**
	 * 更新时间
	 */
	private Date updatetime;

}
