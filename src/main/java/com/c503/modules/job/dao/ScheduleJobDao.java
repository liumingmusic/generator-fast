package com.c503.modules.job.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.c503.modules.job.entity.ScheduleJobEntity;
import com.c503.modules.sys.dao.BaseDao;

/**
 * 定时任务
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2016年12月1日 下午10:29:57
 */
@Mapper
public interface ScheduleJobDao extends BaseDao<ScheduleJobEntity> {
	
	/**
	 * 批量更新状态
	 */
	int updateBatch(Map<String, Object> map);
}
