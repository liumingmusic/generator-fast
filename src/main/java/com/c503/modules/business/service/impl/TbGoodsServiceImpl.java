package com.c503.modules.business.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.c503.modules.business.dao.TbGoodsDao;
import com.c503.modules.business.entity.TbGoodsEntity;
import com.c503.modules.business.service.TbGoodsService;


/**
 * 商品管理
 * 
 * @author generation
 * @email generation@163.com
 * @date 2017-11-10 20:35:45
 */
@Service("tbGoodsService")
public class TbGoodsServiceImpl implements TbGoodsService {

	@Autowired
	private TbGoodsDao tbGoodsDao;
	
	@Override
	public TbGoodsEntity queryObject(Long goodsId){
		return tbGoodsDao.queryObject(goodsId);
	}
	
	@Override
	public List<TbGoodsEntity> queryList(Map<String, Object> map){
		return tbGoodsDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return tbGoodsDao.queryTotal(map);
	}
	
	@Override
	public void save(TbGoodsEntity tbGoods){
		tbGoodsDao.save(tbGoods);
	}
	
	@Override
	public void update(TbGoodsEntity tbGoods){
		tbGoodsDao.update(tbGoods);
	}
	
	@Override
	public void delete(Long goodsId){
		tbGoodsDao.delete(goodsId);
	}
	
	@Override
	public void deleteBatch(Long[] goodsIds){
		tbGoodsDao.deleteBatch(goodsIds);
	}
	
}
