package com.neutron.server.persistence.iface;

import com.neutron.server.persistence.model.T_relation;

public interface T_relationMapper {
    int deleteByPrimaryKey(Integer tRelationId);

    int insert(T_relation record);

    int insertSelective(T_relation record);

    T_relation selectByPrimaryKey(Integer tRelationId);

    int updateByPrimaryKeySelective(T_relation record);

    int updateByPrimaryKey(T_relation record);
}