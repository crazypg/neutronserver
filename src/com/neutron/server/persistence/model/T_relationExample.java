package com.neutron.server.persistence.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class T_relationExample implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 9104441042961419754L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public T_relationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria implements Serializable{
        /**
		 * 
		 */
		private static final long serialVersionUID = -504876160545040626L;
		protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTRelationIdIsNull() {
            addCriterion("T_RELATION_id is null");
            return (Criteria) this;
        }

        public Criteria andTRelationIdIsNotNull() {
            addCriterion("T_RELATION_id is not null");
            return (Criteria) this;
        }

        public Criteria andTRelationIdEqualTo(Integer value) {
            addCriterion("T_RELATION_id =", value, "tRelationId");
            return (Criteria) this;
        }

        public Criteria andTRelationIdNotEqualTo(Integer value) {
            addCriterion("T_RELATION_id <>", value, "tRelationId");
            return (Criteria) this;
        }

        public Criteria andTRelationIdGreaterThan(Integer value) {
            addCriterion("T_RELATION_id >", value, "tRelationId");
            return (Criteria) this;
        }

        public Criteria andTRelationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("T_RELATION_id >=", value, "tRelationId");
            return (Criteria) this;
        }

        public Criteria andTRelationIdLessThan(Integer value) {
            addCriterion("T_RELATION_id <", value, "tRelationId");
            return (Criteria) this;
        }

        public Criteria andTRelationIdLessThanOrEqualTo(Integer value) {
            addCriterion("T_RELATION_id <=", value, "tRelationId");
            return (Criteria) this;
        }

        public Criteria andTRelationIdIn(List<Integer> values) {
            addCriterion("T_RELATION_id in", values, "tRelationId");
            return (Criteria) this;
        }

        public Criteria andTRelationIdNotIn(List<Integer> values) {
            addCriterion("T_RELATION_id not in", values, "tRelationId");
            return (Criteria) this;
        }

        public Criteria andTRelationIdBetween(Integer value1, Integer value2) {
            addCriterion("T_RELATION_id between", value1, value2, "tRelationId");
            return (Criteria) this;
        }

        public Criteria andTRelationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("T_RELATION_id not between", value1, value2, "tRelationId");
            return (Criteria) this;
        }

        public Criteria andTRelationMasterIdIsNull() {
            addCriterion("T_RELATION_master_id is null");
            return (Criteria) this;
        }

        public Criteria andTRelationMasterIdIsNotNull() {
            addCriterion("T_RELATION_master_id is not null");
            return (Criteria) this;
        }

        public Criteria andTRelationMasterIdEqualTo(Integer value) {
            addCriterion("T_RELATION_master_id =", value, "tRelationMasterId");
            return (Criteria) this;
        }

        public Criteria andTRelationMasterIdNotEqualTo(Integer value) {
            addCriterion("T_RELATION_master_id <>", value, "tRelationMasterId");
            return (Criteria) this;
        }

        public Criteria andTRelationMasterIdGreaterThan(Integer value) {
            addCriterion("T_RELATION_master_id >", value, "tRelationMasterId");
            return (Criteria) this;
        }

        public Criteria andTRelationMasterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("T_RELATION_master_id >=", value, "tRelationMasterId");
            return (Criteria) this;
        }

        public Criteria andTRelationMasterIdLessThan(Integer value) {
            addCriterion("T_RELATION_master_id <", value, "tRelationMasterId");
            return (Criteria) this;
        }

        public Criteria andTRelationMasterIdLessThanOrEqualTo(Integer value) {
            addCriterion("T_RELATION_master_id <=", value, "tRelationMasterId");
            return (Criteria) this;
        }

        public Criteria andTRelationMasterIdIn(List<Integer> values) {
            addCriterion("T_RELATION_master_id in", values, "tRelationMasterId");
            return (Criteria) this;
        }

        public Criteria andTRelationMasterIdNotIn(List<Integer> values) {
            addCriterion("T_RELATION_master_id not in", values, "tRelationMasterId");
            return (Criteria) this;
        }

        public Criteria andTRelationMasterIdBetween(Integer value1, Integer value2) {
            addCriterion("T_RELATION_master_id between", value1, value2, "tRelationMasterId");
            return (Criteria) this;
        }

        public Criteria andTRelationMasterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("T_RELATION_master_id not between", value1, value2, "tRelationMasterId");
            return (Criteria) this;
        }

        public Criteria andTRelationSalveIdIsNull() {
            addCriterion("T_RELATION_salve_id is null");
            return (Criteria) this;
        }

        public Criteria andTRelationSalveIdIsNotNull() {
            addCriterion("T_RELATION_salve_id is not null");
            return (Criteria) this;
        }

        public Criteria andTRelationSalveIdEqualTo(Integer value) {
            addCriterion("T_RELATION_salve_id =", value, "tRelationSalveId");
            return (Criteria) this;
        }

        public Criteria andTRelationSalveIdNotEqualTo(Integer value) {
            addCriterion("T_RELATION_salve_id <>", value, "tRelationSalveId");
            return (Criteria) this;
        }

        public Criteria andTRelationSalveIdGreaterThan(Integer value) {
            addCriterion("T_RELATION_salve_id >", value, "tRelationSalveId");
            return (Criteria) this;
        }

        public Criteria andTRelationSalveIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("T_RELATION_salve_id >=", value, "tRelationSalveId");
            return (Criteria) this;
        }

        public Criteria andTRelationSalveIdLessThan(Integer value) {
            addCriterion("T_RELATION_salve_id <", value, "tRelationSalveId");
            return (Criteria) this;
        }

        public Criteria andTRelationSalveIdLessThanOrEqualTo(Integer value) {
            addCriterion("T_RELATION_salve_id <=", value, "tRelationSalveId");
            return (Criteria) this;
        }

        public Criteria andTRelationSalveIdIn(List<Integer> values) {
            addCriterion("T_RELATION_salve_id in", values, "tRelationSalveId");
            return (Criteria) this;
        }

        public Criteria andTRelationSalveIdNotIn(List<Integer> values) {
            addCriterion("T_RELATION_salve_id not in", values, "tRelationSalveId");
            return (Criteria) this;
        }

        public Criteria andTRelationSalveIdBetween(Integer value1, Integer value2) {
            addCriterion("T_RELATION_salve_id between", value1, value2, "tRelationSalveId");
            return (Criteria) this;
        }

        public Criteria andTRelationSalveIdNotBetween(Integer value1, Integer value2) {
            addCriterion("T_RELATION_salve_id not between", value1, value2, "tRelationSalveId");
            return (Criteria) this;
        }

        public Criteria andTRelationRelationIsNull() {
            addCriterion("T_RELATION_relation is null");
            return (Criteria) this;
        }

        public Criteria andTRelationRelationIsNotNull() {
            addCriterion("T_RELATION_relation is not null");
            return (Criteria) this;
        }

        public Criteria andTRelationRelationEqualTo(Integer value) {
            addCriterion("T_RELATION_relation =", value, "tRelationRelation");
            return (Criteria) this;
        }

        public Criteria andTRelationRelationNotEqualTo(Integer value) {
            addCriterion("T_RELATION_relation <>", value, "tRelationRelation");
            return (Criteria) this;
        }

        public Criteria andTRelationRelationGreaterThan(Integer value) {
            addCriterion("T_RELATION_relation >", value, "tRelationRelation");
            return (Criteria) this;
        }

        public Criteria andTRelationRelationGreaterThanOrEqualTo(Integer value) {
            addCriterion("T_RELATION_relation >=", value, "tRelationRelation");
            return (Criteria) this;
        }

        public Criteria andTRelationRelationLessThan(Integer value) {
            addCriterion("T_RELATION_relation <", value, "tRelationRelation");
            return (Criteria) this;
        }

        public Criteria andTRelationRelationLessThanOrEqualTo(Integer value) {
            addCriterion("T_RELATION_relation <=", value, "tRelationRelation");
            return (Criteria) this;
        }

        public Criteria andTRelationRelationIn(List<Integer> values) {
            addCriterion("T_RELATION_relation in", values, "tRelationRelation");
            return (Criteria) this;
        }

        public Criteria andTRelationRelationNotIn(List<Integer> values) {
            addCriterion("T_RELATION_relation not in", values, "tRelationRelation");
            return (Criteria) this;
        }

        public Criteria andTRelationRelationBetween(Integer value1, Integer value2) {
            addCriterion("T_RELATION_relation between", value1, value2, "tRelationRelation");
            return (Criteria) this;
        }

        public Criteria andTRelationRelationNotBetween(Integer value1, Integer value2) {
            addCriterion("T_RELATION_relation not between", value1, value2, "tRelationRelation");
            return (Criteria) this;
        }

        public Criteria andTRelationDeltagIsNull() {
            addCriterion("T_RELATION_deltag is null");
            return (Criteria) this;
        }

        public Criteria andTRelationDeltagIsNotNull() {
            addCriterion("T_RELATION_deltag is not null");
            return (Criteria) this;
        }

        public Criteria andTRelationDeltagEqualTo(String value) {
            addCriterion("T_RELATION_deltag =", value, "tRelationDeltag");
            return (Criteria) this;
        }

        public Criteria andTRelationDeltagNotEqualTo(String value) {
            addCriterion("T_RELATION_deltag <>", value, "tRelationDeltag");
            return (Criteria) this;
        }

        public Criteria andTRelationDeltagGreaterThan(String value) {
            addCriterion("T_RELATION_deltag >", value, "tRelationDeltag");
            return (Criteria) this;
        }

        public Criteria andTRelationDeltagGreaterThanOrEqualTo(String value) {
            addCriterion("T_RELATION_deltag >=", value, "tRelationDeltag");
            return (Criteria) this;
        }

        public Criteria andTRelationDeltagLessThan(String value) {
            addCriterion("T_RELATION_deltag <", value, "tRelationDeltag");
            return (Criteria) this;
        }

        public Criteria andTRelationDeltagLessThanOrEqualTo(String value) {
            addCriterion("T_RELATION_deltag <=", value, "tRelationDeltag");
            return (Criteria) this;
        }

        public Criteria andTRelationDeltagLike(String value) {
            addCriterion("T_RELATION_deltag like", value, "tRelationDeltag");
            return (Criteria) this;
        }

        public Criteria andTRelationDeltagNotLike(String value) {
            addCriterion("T_RELATION_deltag not like", value, "tRelationDeltag");
            return (Criteria) this;
        }

        public Criteria andTRelationDeltagIn(List<String> values) {
            addCriterion("T_RELATION_deltag in", values, "tRelationDeltag");
            return (Criteria) this;
        }

        public Criteria andTRelationDeltagNotIn(List<String> values) {
            addCriterion("T_RELATION_deltag not in", values, "tRelationDeltag");
            return (Criteria) this;
        }

        public Criteria andTRelationDeltagBetween(String value1, String value2) {
            addCriterion("T_RELATION_deltag between", value1, value2, "tRelationDeltag");
            return (Criteria) this;
        }

        public Criteria andTRelationDeltagNotBetween(String value1, String value2) {
            addCriterion("T_RELATION_deltag not between", value1, value2, "tRelationDeltag");
            return (Criteria) this;
        }

        public Criteria andTRelationConfirmtagIsNull() {
            addCriterion("t_relation_confirmtag is null");
            return (Criteria) this;
        }

        public Criteria andTRelationConfirmtagIsNotNull() {
            addCriterion("t_relation_confirmtag is not null");
            return (Criteria) this;
        }

        public Criteria andTRelationConfirmtagEqualTo(String value) {
            addCriterion("t_relation_confirmtag =", value, "tRelationConfirmtag");
            return (Criteria) this;
        }

        public Criteria andTRelationConfirmtagNotEqualTo(String value) {
            addCriterion("t_relation_confirmtag <>", value, "tRelationConfirmtag");
            return (Criteria) this;
        }

        public Criteria andTRelationConfirmtagGreaterThan(String value) {
            addCriterion("t_relation_confirmtag >", value, "tRelationConfirmtag");
            return (Criteria) this;
        }

        public Criteria andTRelationConfirmtagGreaterThanOrEqualTo(String value) {
            addCriterion("t_relation_confirmtag >=", value, "tRelationConfirmtag");
            return (Criteria) this;
        }

        public Criteria andTRelationConfirmtagLessThan(String value) {
            addCriterion("t_relation_confirmtag <", value, "tRelationConfirmtag");
            return (Criteria) this;
        }

        public Criteria andTRelationConfirmtagLessThanOrEqualTo(String value) {
            addCriterion("t_relation_confirmtag <=", value, "tRelationConfirmtag");
            return (Criteria) this;
        }

        public Criteria andTRelationConfirmtagLike(String value) {
            addCriterion("t_relation_confirmtag like", value, "tRelationConfirmtag");
            return (Criteria) this;
        }

        public Criteria andTRelationConfirmtagNotLike(String value) {
            addCriterion("t_relation_confirmtag not like", value, "tRelationConfirmtag");
            return (Criteria) this;
        }

        public Criteria andTRelationConfirmtagIn(List<String> values) {
            addCriterion("t_relation_confirmtag in", values, "tRelationConfirmtag");
            return (Criteria) this;
        }

        public Criteria andTRelationConfirmtagNotIn(List<String> values) {
            addCriterion("t_relation_confirmtag not in", values, "tRelationConfirmtag");
            return (Criteria) this;
        }

        public Criteria andTRelationConfirmtagBetween(String value1, String value2) {
            addCriterion("t_relation_confirmtag between", value1, value2, "tRelationConfirmtag");
            return (Criteria) this;
        }

        public Criteria andTRelationConfirmtagNotBetween(String value1, String value2) {
            addCriterion("t_relation_confirmtag not between", value1, value2, "tRelationConfirmtag");
            return (Criteria) this;
        }

        public Criteria andTRelationConfirmcontentIsNull() {
            addCriterion("t_relation_confirmcontent is null");
            return (Criteria) this;
        }

        public Criteria andTRelationConfirmcontentIsNotNull() {
            addCriterion("t_relation_confirmcontent is not null");
            return (Criteria) this;
        }

        public Criteria andTRelationConfirmcontentEqualTo(String value) {
            addCriterion("t_relation_confirmcontent =", value, "tRelationConfirmcontent");
            return (Criteria) this;
        }

        public Criteria andTRelationConfirmcontentNotEqualTo(String value) {
            addCriterion("t_relation_confirmcontent <>", value, "tRelationConfirmcontent");
            return (Criteria) this;
        }

        public Criteria andTRelationConfirmcontentGreaterThan(String value) {
            addCriterion("t_relation_confirmcontent >", value, "tRelationConfirmcontent");
            return (Criteria) this;
        }

        public Criteria andTRelationConfirmcontentGreaterThanOrEqualTo(String value) {
            addCriterion("t_relation_confirmcontent >=", value, "tRelationConfirmcontent");
            return (Criteria) this;
        }

        public Criteria andTRelationConfirmcontentLessThan(String value) {
            addCriterion("t_relation_confirmcontent <", value, "tRelationConfirmcontent");
            return (Criteria) this;
        }

        public Criteria andTRelationConfirmcontentLessThanOrEqualTo(String value) {
            addCriterion("t_relation_confirmcontent <=", value, "tRelationConfirmcontent");
            return (Criteria) this;
        }

        public Criteria andTRelationConfirmcontentLike(String value) {
            addCriterion("t_relation_confirmcontent like", value, "tRelationConfirmcontent");
            return (Criteria) this;
        }

        public Criteria andTRelationConfirmcontentNotLike(String value) {
            addCriterion("t_relation_confirmcontent not like", value, "tRelationConfirmcontent");
            return (Criteria) this;
        }

        public Criteria andTRelationConfirmcontentIn(List<String> values) {
            addCriterion("t_relation_confirmcontent in", values, "tRelationConfirmcontent");
            return (Criteria) this;
        }

        public Criteria andTRelationConfirmcontentNotIn(List<String> values) {
            addCriterion("t_relation_confirmcontent not in", values, "tRelationConfirmcontent");
            return (Criteria) this;
        }

        public Criteria andTRelationConfirmcontentBetween(String value1, String value2) {
            addCriterion("t_relation_confirmcontent between", value1, value2, "tRelationConfirmcontent");
            return (Criteria) this;
        }

        public Criteria andTRelationConfirmcontentNotBetween(String value1, String value2) {
            addCriterion("t_relation_confirmcontent not between", value1, value2, "tRelationConfirmcontent");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable{

        /**
		 * 
		 */
		private static final long serialVersionUID = -6759427508701268555L;

		protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable{
        /**
		 * 
		 */
		private static final long serialVersionUID = -5878921335278890663L;

		private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}