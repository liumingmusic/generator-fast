package com.c503.modules.business.service;

import com.c503.modules.business.entity.TbGoodsEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品管理
 * 
 * @author generation
 * @email generation@163.com
 * @date 2017-11-10 20:35:45
 */
public interface TbGoodsService {
	
	TbGoodsEntity queryObject(Long goodsId);
	
	List<TbGoodsEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(TbGoodsEntity tbGoods);
	
	void update(TbGoodsEntity tbGoods);
	
	void delete(Long goodsId);
	
	void deleteBatch(Long[] goodsIds);
}
