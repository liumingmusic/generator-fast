package com.c503.modules.app.dao;

import org.apache.ibatis.annotations.Mapper;

import com.c503.modules.app.entity.UserEntity;
import com.c503.modules.sys.dao.BaseDao;

/**
 * 用户
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-03-23 15:22:06
 */
@Mapper
public interface UserDao extends BaseDao<UserEntity> {

    UserEntity queryByMobile(String mobile);
}
