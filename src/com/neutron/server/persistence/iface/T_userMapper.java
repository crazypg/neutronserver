package com.neutron.server.persistence.iface;

import com.neutron.server.persistence.model.T_user;
import com.neutron.server.persistence.model.T_userExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface T_userMapper {
    int countByExample(T_userExample example);

    int deleteByExample(T_userExample example);

    int deleteByPrimaryKey(Integer tUserId);

    int insert(T_user record);

    int insertSelective(T_user record);

    List<T_user> selectByExample(T_userExample example);

    T_user selectByPrimaryKey(Integer tUserId);

    int updateByExampleSelective(@Param("record") T_user record, @Param("example") T_userExample example);

    int updateByExample(@Param("record") T_user record, @Param("example") T_userExample example);

    int updateByPrimaryKeySelective(T_user record);

    int updateByPrimaryKey(T_user record);
    
    int getLastInsertID();
}