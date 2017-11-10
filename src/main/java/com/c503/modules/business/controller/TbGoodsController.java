package com.c503.modules.business.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.c503.modules.business.entity.TbGoodsEntity;
import com.c503.modules.business.service.TbGoodsService;
import com.c503.common.utils.PageUtils;
import com.c503.common.utils.Query;
import com.c503.common.utils.R;




/**
 * 商品管理
 * 
 * @author generation
 * @email generation@163.com
 * @date 2017-11-10 20:35:45
 */
@RestController
@RequestMapping("/business/tbgoods")
public class TbGoodsController {

	@Autowired
	private TbGoodsService tbGoodsService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("business:tbgoods:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<TbGoodsEntity> tbGoodsList = tbGoodsService.queryList(query);
		int total = tbGoodsService.queryTotal(query);
		PageUtils pageUtil = new PageUtils(tbGoodsList, total, query.getLimit(), query.getPage());
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{goodsId}")
	@RequiresPermissions("business:tbgoods:info")
	public R info(@PathVariable("goodsId") Long goodsId){
		TbGoodsEntity tbGoods = tbGoodsService.queryObject(goodsId);
		return R.ok().put("tbGoods", tbGoods);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("business:tbgoods:save")
	public R save(@RequestBody TbGoodsEntity tbGoods){
		tbGoodsService.save(tbGoods);
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("business:tbgoods:update")
	public R update(@RequestBody TbGoodsEntity tbGoods){
		tbGoodsService.update(tbGoods);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("business:tbgoods:delete")
	public R delete(@RequestBody Long[] goodsIds){
		tbGoodsService.deleteBatch(goodsIds);
		return R.ok();
	}
	
}
