package com.neutron.server.persistence.model;

import java.io.Serializable;

public class T_relation implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 6729128095944399947L;

	private Integer tRelationId;

    private Integer tRelationMasterId;

    private Integer tRelationSalveId;

    private Integer tRelationRelation;

    private String tRelationDeltag;

    private String tRelationConfirmtag;

    private String tRelationConfirmcontent;

    public Integer gettRelationId() {
        return tRelationId;
    }

    public void settRelationId(Integer tRelationId) {
        this.tRelationId = tRelationId;
    }

    public Integer gettRelationMasterId() {
        return tRelationMasterId;
    }

    public void settRelationMasterId(Integer tRelationMasterId) {
        this.tRelationMasterId = tRelationMasterId;
    }

    public Integer gettRelationSalveId() {
        return tRelationSalveId;
    }

    public void settRelationSalveId(Integer tRelationSalveId) {
        this.tRelationSalveId = tRelationSalveId;
    }

    public Integer gettRelationRelation() {
        return tRelationRelation;
    }

    public void settRelationRelation(Integer tRelationRelation) {
        this.tRelationRelation = tRelationRelation;
    }

    public String gettRelationDeltag() {
        return tRelationDeltag;
    }

    public void settRelationDeltag(String tRelationDeltag) {
        this.tRelationDeltag = tRelationDeltag == null ? null : tRelationDeltag.trim();
    }

    public String gettRelationConfirmtag() {
        return tRelationConfirmtag;
    }

    public void settRelationConfirmtag(String tRelationConfirmtag) {
        this.tRelationConfirmtag = tRelationConfirmtag == null ? null : tRelationConfirmtag.trim();
    }

    public String gettRelationConfirmcontent() {
        return tRelationConfirmcontent;
    }

    public void settRelationConfirmcontent(String tRelationConfirmcontent) {
        this.tRelationConfirmcontent = tRelationConfirmcontent == null ? null : tRelationConfirmcontent.trim();
    }
}