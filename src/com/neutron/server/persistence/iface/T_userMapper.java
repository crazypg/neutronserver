package com.neutron.server.persistence.iface;

import com.neutron.server.persistence.model.T_user;

public interface T_userMapper {
    int deleteByPrimaryKey(Integer tUserId);

    int insert(T_user record);

    int insertSelective(T_user record);

    T_user selectByPrimaryKey(Integer tUserId);

    int updateByPrimaryKeySelective(T_user record);

    int updateByPrimaryKey(T_user record);
}