package com.neutron.server.persistence.model;

import java.io.Serializable;
import java.util.Date;

public class T_rmr implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 5450901902460194361L;

	private Integer tRmrId;

    private Integer tRmrUserid;

    private Double tRmrValue;

    private Date tRmrDatetime;

    public Integer gettRmrId() {
        return tRmrId;
    }

    public void settRmrId(Integer tRmrId) {
        this.tRmrId = tRmrId;
    }

    public Integer gettRmrUserid() {
        return tRmrUserid;
    }

    public void settRmrUserid(Integer tRmrUserid) {
        this.tRmrUserid = tRmrUserid;
    }

    public Double gettRmrValue() {
        return tRmrValue;
    }

    public void settRmrValue(Double tRmrValue) {
        this.tRmrValue = tRmrValue;
    }

    public Date gettRmrDatetime() {
        return tRmrDatetime;
    }

    public void settRmrDatetime(Date tRmrDatetime) {
        this.tRmrDatetime = tRmrDatetime;
    }
}