package com.neutron.server.persistence.model;

public class T_relation {
    private Integer tRelationId;

    private Integer tRelationMasterId;

    private Integer tRelationSalveId;

    private Integer tRelationRelation;

    private String tRelationDeltag;

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
}