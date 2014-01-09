package com.neutron.server.persistence.iface;

import com.neutron.server.persistence.model.T_rmr_index;
import com.neutron.server.persistence.model.T_rmr_indexExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface T_rmr_indexMapper {
    int countByExample(T_rmr_indexExample example);

    int deleteByExample(T_rmr_indexExample example);

    int deleteByPrimaryKey(Integer tRmrIndexId);

    int insert(T_rmr_index record);

    int insertSelective(T_rmr_index record);

    List<T_rmr_index> selectByExample(T_rmr_indexExample example);

    T_rmr_index selectByPrimaryKey(Integer tRmrIndexId);

    int updateByExampleSelective(@Param("record") T_rmr_index record, @Param("example") T_rmr_indexExample example);

    int updateByExample(@Param("record") T_rmr_index record, @Param("example") T_rmr_indexExample example);

    int updateByPrimaryKeySelective(T_rmr_index record);

    int updateByPrimaryKey(T_rmr_index record);
}