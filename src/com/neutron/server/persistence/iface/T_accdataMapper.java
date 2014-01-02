package com.neutron.server.persistence.iface;

import com.neutron.server.persistence.model.T_accdata;
import com.neutron.server.persistence.model.T_accdataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface T_accdataMapper {
    int countByExample(T_accdataExample example);

    int deleteByExample(T_accdataExample example);

    int deleteByPrimaryKey(Integer tAccdataId);

    int insert(T_accdata record);

    int insertSelective(T_accdata record);

    List<T_accdata> selectByExample(T_accdataExample example);

    T_accdata selectByPrimaryKey(Integer tAccdataId);

    int updateByExampleSelective(@Param("record") T_accdata record, @Param("example") T_accdataExample example);

    int updateByExample(@Param("record") T_accdata record, @Param("example") T_accdataExample example);

    int updateByPrimaryKeySelective(T_accdata record);

    int updateByPrimaryKey(T_accdata record);
    
    int insertBatch(List<T_accdata> uploadList);
}