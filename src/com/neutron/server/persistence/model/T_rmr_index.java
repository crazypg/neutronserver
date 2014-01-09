package com.neutron.server.persistence.model;

import java.io.Serializable;
import java.util.Date;

public class T_rmr_index implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -5411539549658357280L;

	private Integer tRmrIndexId;

    private Integer tRmrIndexUserid;

    private Double tRmrIndexValue;

    private Date tRmrIndexDatetime;

    public Integer gettRmrIndexId() {
        return tRmrIndexId;
    }

    public void settRmrIndexId(Integer tRmrIndexId) {
        this.tRmrIndexId = tRmrIndexId;
    }

    public Integer gettRmrIndexUserid() {
        return tRmrIndexUserid;
    }

    public void settRmrIndexUserid(Integer tRmrIndexUserid) {
        this.tRmrIndexUserid = tRmrIndexUserid;
    }

    public Double gettRmrIndexValue() {
        return tRmrIndexValue;
    }

    public void settRmrIndexValue(Double tRmrIndexValue) {
        this.tRmrIndexValue = tRmrIndexValue;
    }

    public Date gettRmrIndexDatetime() {
        return tRmrIndexDatetime;
    }

    public void settRmrIndexDatetime(Date tRmrIndexDatetime) {
        this.tRmrIndexDatetime = tRmrIndexDatetime;
    }
}