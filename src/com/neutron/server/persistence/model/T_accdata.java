package com.neutron.server.persistence.model;

import java.io.Serializable;
import java.util.Date;

public class T_accdata implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -8384678687325500773L;

	private Integer tAccdataId;

    private Integer tAccdataUserid;

    private Double tAccdataValue;

    private Date tAccdataDatatime;

    public Integer gettAccdataId() {
        return tAccdataId;
    }

    public void settAccdataId(Integer tAccdataId) {
        this.tAccdataId = tAccdataId;
    }

    public Integer gettAccdataUserid() {
        return tAccdataUserid;
    }

    public void settAccdataUserid(Integer tAccdataUserid) {
        this.tAccdataUserid = tAccdataUserid;
    }

    public Double gettAccdataValue() {
        return tAccdataValue;
    }

    public void settAccdataValue(Double tAccdataValue) {
        this.tAccdataValue = tAccdataValue;
    }

    public Date gettAccdataDatatime() {
        return tAccdataDatatime;
    }

    public void settAccdataDatatime(Date tAccdataDatatime) {
        this.tAccdataDatatime = tAccdataDatatime;
    }
}