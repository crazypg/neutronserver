package com.neutron.server.persistence.model;

import java.io.Serializable;

public class T_system implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -7774857509359665442L;

	private Integer tSystemId;

    private String tSystemName;

    private String tSystemValue;

    public Integer gettSystemId() {
        return tSystemId;
    }

    public void settSystemId(Integer tSystemId) {
        this.tSystemId = tSystemId;
    }

    public String gettSystemName() {
        return tSystemName;
    }

    public void settSystemName(String tSystemName) {
        this.tSystemName = tSystemName == null ? null : tSystemName.trim();
    }

    public String gettSystemValue() {
        return tSystemValue;
    }

    public void settSystemValue(String tSystemValue) {
        this.tSystemValue = tSystemValue == null ? null : tSystemValue.trim();
    }
}