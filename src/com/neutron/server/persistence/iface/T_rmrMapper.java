package com.neutron.server.persistence.iface;

import com.neutron.server.persistence.model.T_rmr;
import com.neutron.server.persistence.model.T_rmrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface T_rmrMapper {
    int countByExample(T_rmrExample example);

    int deleteByExample(T_rmrExample example);

    int deleteByPrimaryKey(Integer tRmrId);

    int insert(T_rmr record);

    int insertSelective(T_rmr record);

    List<T_rmr> selectByExample(T_rmrExample example);

    T_rmr selectByPrimaryKey(Integer tRmrId);

    int updateByExampleSelective(@Param("record") T_rmr record, @Param("example") T_rmrExample example);

    int updateByExample(@Param("record") T_rmr record, @Param("example") T_rmrExample example);

    int updateByPrimaryKeySelective(T_rmr record);

    int updateByPrimaryKey(T_rmr record);
}