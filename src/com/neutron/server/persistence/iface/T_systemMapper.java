package com.neutron.server.persistence.iface;

import com.neutron.server.persistence.model.T_system;
import com.neutron.server.persistence.model.T_systemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface T_systemMapper {
    int countByExample(T_systemExample example);

    int deleteByExample(T_systemExample example);

    int deleteByPrimaryKey(Integer tSystemId);

    int insert(T_system record);

    int insertSelective(T_system record);

    List<T_system> selectByExample(T_systemExample example);

    T_system selectByPrimaryKey(Integer tSystemId);

    int updateByExampleSelective(@Param("record") T_system record, @Param("example") T_systemExample example);

    int updateByExample(@Param("record") T_system record, @Param("example") T_systemExample example);

    int updateByPrimaryKeySelective(T_system record);

    int updateByPrimaryKey(T_system record);
}