package com.neutron.server.persistence.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class T_rmr_indexExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public T_rmr_indexExample() {
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

    protected abstract static class GeneratedCriteria {
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

        public Criteria andTRmrIndexIdIsNull() {
            addCriterion("t_rmr_index_id is null");
            return (Criteria) this;
        }

        public Criteria andTRmrIndexIdIsNotNull() {
            addCriterion("t_rmr_index_id is not null");
            return (Criteria) this;
        }

        public Criteria andTRmrIndexIdEqualTo(Integer value) {
            addCriterion("t_rmr_index_id =", value, "tRmrIndexId");
            return (Criteria) this;
        }

        public Criteria andTRmrIndexIdNotEqualTo(Integer value) {
            addCriterion("t_rmr_index_id <>", value, "tRmrIndexId");
            return (Criteria) this;
        }

        public Criteria andTRmrIndexIdGreaterThan(Integer value) {
            addCriterion("t_rmr_index_id >", value, "tRmrIndexId");
            return (Criteria) this;
        }

        public Criteria andTRmrIndexIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_rmr_index_id >=", value, "tRmrIndexId");
            return (Criteria) this;
        }

        public Criteria andTRmrIndexIdLessThan(Integer value) {
            addCriterion("t_rmr_index_id <", value, "tRmrIndexId");
            return (Criteria) this;
        }

        public Criteria andTRmrIndexIdLessThanOrEqualTo(Integer value) {
            addCriterion("t_rmr_index_id <=", value, "tRmrIndexId");
            return (Criteria) this;
        }

        public Criteria andTRmrIndexIdIn(List<Integer> values) {
            addCriterion("t_rmr_index_id in", values, "tRmrIndexId");
            return (Criteria) this;
        }

        public Criteria andTRmrIndexIdNotIn(List<Integer> values) {
            addCriterion("t_rmr_index_id not in", values, "tRmrIndexId");
            return (Criteria) this;
        }

        public Criteria andTRmrIndexIdBetween(Integer value1, Integer value2) {
            addCriterion("t_rmr_index_id between", value1, value2, "tRmrIndexId");
            return (Criteria) this;
        }

        public Criteria andTRmrIndexIdNotBetween(Integer value1, Integer value2) {
            addCriterion("t_rmr_index_id not between", value1, value2, "tRmrIndexId");
            return (Criteria) this;
        }

        public Criteria andTRmrIndexUseridIsNull() {
            addCriterion("t_rmr_index_userid is null");
            return (Criteria) this;
        }

        public Criteria andTRmrIndexUseridIsNotNull() {
            addCriterion("t_rmr_index_userid is not null");
            return (Criteria) this;
        }

        public Criteria andTRmrIndexUseridEqualTo(Integer value) {
            addCriterion("t_rmr_index_userid =", value, "tRmrIndexUserid");
            return (Criteria) this;
        }

        public Criteria andTRmrIndexUseridNotEqualTo(Integer value) {
            addCriterion("t_rmr_index_userid <>", value, "tRmrIndexUserid");
            return (Criteria) this;
        }

        public Criteria andTRmrIndexUseridGreaterThan(Integer value) {
            addCriterion("t_rmr_index_userid >", value, "tRmrIndexUserid");
            return (Criteria) this;
        }

        public Criteria andTRmrIndexUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_rmr_index_userid >=", value, "tRmrIndexUserid");
            return (Criteria) this;
        }

        public Criteria andTRmrIndexUseridLessThan(Integer value) {
            addCriterion("t_rmr_index_userid <", value, "tRmrIndexUserid");
            return (Criteria) this;
        }

        public Criteria andTRmrIndexUseridLessThanOrEqualTo(Integer value) {
            addCriterion("t_rmr_index_userid <=", value, "tRmrIndexUserid");
            return (Criteria) this;
        }

        public Criteria andTRmrIndexUseridIn(List<Integer> values) {
            addCriterion("t_rmr_index_userid in", values, "tRmrIndexUserid");
            return (Criteria) this;
        }

        public Criteria andTRmrIndexUseridNotIn(List<Integer> values) {
            addCriterion("t_rmr_index_userid not in", values, "tRmrIndexUserid");
            return (Criteria) this;
        }

        public Criteria andTRmrIndexUseridBetween(Integer value1, Integer value2) {
            addCriterion("t_rmr_index_userid between", value1, value2, "tRmrIndexUserid");
            return (Criteria) this;
        }

        public Criteria andTRmrIndexUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("t_rmr_index_userid not between", value1, value2, "tRmrIndexUserid");
            return (Criteria) this;
        }

        public Criteria andTRmrIndexValueIsNull() {
            addCriterion("t_rmr_index_value is null");
            return (Criteria) this;
        }

        public Criteria andTRmrIndexValueIsNotNull() {
            addCriterion("t_rmr_index_value is not null");
            return (Criteria) this;
        }

        public Criteria andTRmrIndexValueEqualTo(Double value) {
            addCriterion("t_rmr_index_value =", value, "tRmrIndexValue");
            return (Criteria) this;
        }

        public Criteria andTRmrIndexValueNotEqualTo(Double value) {
            addCriterion("t_rmr_index_value <>", value, "tRmrIndexValue");
            return (Criteria) this;
        }

        public Criteria andTRmrIndexValueGreaterThan(Double value) {
            addCriterion("t_rmr_index_value >", value, "tRmrIndexValue");
            return (Criteria) this;
        }

        public Criteria andTRmrIndexValueGreaterThanOrEqualTo(Double value) {
            addCriterion("t_rmr_index_value >=", value, "tRmrIndexValue");
            return (Criteria) this;
        }

        public Criteria andTRmrIndexValueLessThan(Double value) {
            addCriterion("t_rmr_index_value <", value, "tRmrIndexValue");
            return (Criteria) this;
        }

        public Criteria andTRmrIndexValueLessThanOrEqualTo(Double value) {
            addCriterion("t_rmr_index_value <=", value, "tRmrIndexValue");
            return (Criteria) this;
        }

        public Criteria andTRmrIndexValueIn(List<Double> values) {
            addCriterion("t_rmr_index_value in", values, "tRmrIndexValue");
            return (Criteria) this;
        }

        public Criteria andTRmrIndexValueNotIn(List<Double> values) {
            addCriterion("t_rmr_index_value not in", values, "tRmrIndexValue");
            return (Criteria) this;
        }

        public Criteria andTRmrIndexValueBetween(Double value1, Double value2) {
            addCriterion("t_rmr_index_value between", value1, value2, "tRmrIndexValue");
            return (Criteria) this;
        }

        public Criteria andTRmrIndexValueNotBetween(Double value1, Double value2) {
            addCriterion("t_rmr_index_value not between", value1, value2, "tRmrIndexValue");
            return (Criteria) this;
        }

        public Criteria andTRmrIndexDatetimeIsNull() {
            addCriterion("t_rmr_index_datetime is null");
            return (Criteria) this;
        }

        public Criteria andTRmrIndexDatetimeIsNotNull() {
            addCriterion("t_rmr_index_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andTRmrIndexDatetimeEqualTo(Date value) {
            addCriterion("t_rmr_index_datetime =", value, "tRmrIndexDatetime");
            return (Criteria) this;
        }

        public Criteria andTRmrIndexDatetimeNotEqualTo(Date value) {
            addCriterion("t_rmr_index_datetime <>", value, "tRmrIndexDatetime");
            return (Criteria) this;
        }

        public Criteria andTRmrIndexDatetimeGreaterThan(Date value) {
            addCriterion("t_rmr_index_datetime >", value, "tRmrIndexDatetime");
            return (Criteria) this;
        }

        public Criteria andTRmrIndexDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("t_rmr_index_datetime >=", value, "tRmrIndexDatetime");
            return (Criteria) this;
        }

        public Criteria andTRmrIndexDatetimeLessThan(Date value) {
            addCriterion("t_rmr_index_datetime <", value, "tRmrIndexDatetime");
            return (Criteria) this;
        }

        public Criteria andTRmrIndexDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("t_rmr_index_datetime <=", value, "tRmrIndexDatetime");
            return (Criteria) this;
        }

        public Criteria andTRmrIndexDatetimeIn(List<Date> values) {
            addCriterion("t_rmr_index_datetime in", values, "tRmrIndexDatetime");
            return (Criteria) this;
        }

        public Criteria andTRmrIndexDatetimeNotIn(List<Date> values) {
            addCriterion("t_rmr_index_datetime not in", values, "tRmrIndexDatetime");
            return (Criteria) this;
        }

        public Criteria andTRmrIndexDatetimeBetween(Date value1, Date value2) {
            addCriterion("t_rmr_index_datetime between", value1, value2, "tRmrIndexDatetime");
            return (Criteria) this;
        }

        public Criteria andTRmrIndexDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("t_rmr_index_datetime not between", value1, value2, "tRmrIndexDatetime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
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