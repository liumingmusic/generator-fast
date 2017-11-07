package com.c503.modules.oss.dao;

import org.apache.ibatis.annotations.Mapper;

import com.c503.modules.oss.entity.SysOssEntity;
import com.c503.modules.sys.dao.BaseDao;

/**
 * 文件上传
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-03-25 12:13:26
 */
@Mapper
public interface SysOssDao extends BaseDao<SysOssEntity> {
	
}
