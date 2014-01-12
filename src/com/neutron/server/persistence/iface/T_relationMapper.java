package com.neutron.server.persistence.iface;

import com.neutron.server.persistence.model.T_relation;
import com.neutron.server.persistence.model.T_relationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface T_relationMapper {
    int countByExample(T_relationExample example);

    int deleteByExample(T_relationExample example);

    int deleteByPrimaryKey(Integer tRelationId);

    int insert(T_relation record);

    int insertSelective(T_relation record);

    List<T_relation> selectByExample(T_relationExample example);

    T_relation selectByPrimaryKey(Integer tRelationId);

    int updateByExampleSelective(@Param("record") T_relation record, @Param("example") T_relationExample example);

    int updateByExample(@Param("record") T_relation record, @Param("example") T_relationExample example);

    int updateByPrimaryKeySelective(T_relation record);

    int updateByPrimaryKey(T_relation record);
    
    int getLastInsertID();
}