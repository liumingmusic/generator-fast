package com.c503.modules.business.entity;

import java.io.Serializable;
import java.math.BigDecimal;


/**
 * 商品管理
 * 
 * @author generation
 * @email generation@163.com
 * @date 2017-11-10 20:35:45
 */
public class TbGoodsEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Long goodsId;
	//商品名
	private String name;
	//介绍
	private String intro;
	//价格
	private BigDecimal price;
	//数量
	private Integer num;

	/**
	 * 设置：
	 */
	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}
	/**
	 * 获取：
	 */
	public Long getGoodsId() {
		return goodsId;
	}
	/**
	 * 设置：商品名
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：商品名
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：介绍
	 */
	public void setIntro(String intro) {
		this.intro = intro;
	}
	/**
	 * 获取：介绍
	 */
	public String getIntro() {
		return intro;
	}
	/**
	 * 设置：价格
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	/**
	 * 获取：价格
	 */
	public BigDecimal getPrice() {
		return price;
	}
	/**
	 * 设置：数量
	 */
	public void setNum(Integer num) {
		this.num = num;
	}
	/**
	 * 获取：数量
	 */
	public Integer getNum() {
		return num;
	}
}
