package com.neutron.server.persistence.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class T_rmrExample {
    protected String orderByClause;
    protected int limitClause;
    
    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public T_rmrExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setlimitClause(int limitClause) {
        this.limitClause = limitClause;
    }

    public int getlimitClause() {
        return limitClause;
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
        limitClause = 0;
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

        public Criteria andTRmrIdIsNull() {
            addCriterion("t_rmr_id is null");
            return (Criteria) this;
        }

        public Criteria andTRmrIdIsNotNull() {
            addCriterion("t_rmr_id is not null");
            return (Criteria) this;
        }

        public Criteria andTRmrIdEqualTo(Integer value) {
            addCriterion("t_rmr_id =", value, "tRmrId");
            return (Criteria) this;
        }

        public Criteria andTRmrIdNotEqualTo(Integer value) {
            addCriterion("t_rmr_id <>", value, "tRmrId");
            return (Criteria) this;
        }

        public Criteria andTRmrIdGreaterThan(Integer value) {
            addCriterion("t_rmr_id >", value, "tRmrId");
            return (Criteria) this;
        }

        public Criteria andTRmrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_rmr_id >=", value, "tRmrId");
            return (Criteria) this;
        }

        public Criteria andTRmrIdLessThan(Integer value) {
            addCriterion("t_rmr_id <", value, "tRmrId");
            return (Criteria) this;
        }

        public Criteria andTRmrIdLessThanOrEqualTo(Integer value) {
            addCriterion("t_rmr_id <=", value, "tRmrId");
            return (Criteria) this;
        }

        public Criteria andTRmrIdIn(List<Integer> values) {
            addCriterion("t_rmr_id in", values, "tRmrId");
            return (Criteria) this;
        }

        public Criteria andTRmrIdNotIn(List<Integer> values) {
            addCriterion("t_rmr_id not in", values, "tRmrId");
            return (Criteria) this;
        }

        public Criteria andTRmrIdBetween(Integer value1, Integer value2) {
            addCriterion("t_rmr_id between", value1, value2, "tRmrId");
            return (Criteria) this;
        }

        public Criteria andTRmrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("t_rmr_id not between", value1, value2, "tRmrId");
            return (Criteria) this;
        }

        public Criteria andTRmrUseridIsNull() {
            addCriterion("t_rmr_userid is null");
            return (Criteria) this;
        }

        public Criteria andTRmrUseridIsNotNull() {
            addCriterion("t_rmr_userid is not null");
            return (Criteria) this;
        }

        public Criteria andTRmrUseridEqualTo(Integer value) {
            addCriterion("t_rmr_userid =", value, "tRmrUserid");
            return (Criteria) this;
        }

        public Criteria andTRmrUseridNotEqualTo(Integer value) {
            addCriterion("t_rmr_userid <>", value, "tRmrUserid");
            return (Criteria) this;
        }

        public Criteria andTRmrUseridGreaterThan(Integer value) {
            addCriterion("t_rmr_userid >", value, "tRmrUserid");
            return (Criteria) this;
        }

        public Criteria andTRmrUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_rmr_userid >=", value, "tRmrUserid");
            return (Criteria) this;
        }

        public Criteria andTRmrUseridLessThan(Integer value) {
            addCriterion("t_rmr_userid <", value, "tRmrUserid");
            return (Criteria) this;
        }

        public Criteria andTRmrUseridLessThanOrEqualTo(Integer value) {
            addCriterion("t_rmr_userid <=", value, "tRmrUserid");
            return (Criteria) this;
        }

        public Criteria andTRmrUseridIn(List<Integer> values) {
            addCriterion("t_rmr_userid in", values, "tRmrUserid");
            return (Criteria) this;
        }

        public Criteria andTRmrUseridNotIn(List<Integer> values) {
            addCriterion("t_rmr_userid not in", values, "tRmrUserid");
            return (Criteria) this;
        }

        public Criteria andTRmrUseridBetween(Integer value1, Integer value2) {
            addCriterion("t_rmr_userid between", value1, value2, "tRmrUserid");
            return (Criteria) this;
        }

        public Criteria andTRmrUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("t_rmr_userid not between", value1, value2, "tRmrUserid");
            return (Criteria) this;
        }

        public Criteria andTRmrValueIsNull() {
            addCriterion("t_rmr_value is null");
            return (Criteria) this;
        }

        public Criteria andTRmrValueIsNotNull() {
            addCriterion("t_rmr_value is not null");
            return (Criteria) this;
        }

        public Criteria andTRmrValueEqualTo(Double value) {
            addCriterion("t_rmr_value =", value, "tRmrValue");
            return (Criteria) this;
        }

        public Criteria andTRmrValueNotEqualTo(Double value) {
            addCriterion("t_rmr_value <>", value, "tRmrValue");
            return (Criteria) this;
        }

        public Criteria andTRmrValueGreaterThan(Double value) {
            addCriterion("t_rmr_value >", value, "tRmrValue");
            return (Criteria) this;
        }

        public Criteria andTRmrValueGreaterThanOrEqualTo(Double value) {
            addCriterion("t_rmr_value >=", value, "tRmrValue");
            return (Criteria) this;
        }

        public Criteria andTRmrValueLessThan(Double value) {
            addCriterion("t_rmr_value <", value, "tRmrValue");
            return (Criteria) this;
        }

        public Criteria andTRmrValueLessThanOrEqualTo(Double value) {
            addCriterion("t_rmr_value <=", value, "tRmrValue");
            return (Criteria) this;
        }

        public Criteria andTRmrValueIn(List<Double> values) {
            addCriterion("t_rmr_value in", values, "tRmrValue");
            return (Criteria) this;
        }

        public Criteria andTRmrValueNotIn(List<Double> values) {
            addCriterion("t_rmr_value not in", values, "tRmrValue");
            return (Criteria) this;
        }

        public Criteria andTRmrValueBetween(Double value1, Double value2) {
            addCriterion("t_rmr_value between", value1, value2, "tRmrValue");
            return (Criteria) this;
        }

        public Criteria andTRmrValueNotBetween(Double value1, Double value2) {
            addCriterion("t_rmr_value not between", value1, value2, "tRmrValue");
            return (Criteria) this;
        }

        public Criteria andTRmrDatetimeIsNull() {
            addCriterion("t_rmr_datetime is null");
            return (Criteria) this;
        }

        public Criteria andTRmrDatetimeIsNotNull() {
            addCriterion("t_rmr_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andTRmrDatetimeEqualTo(Date value) {
            addCriterion("t_rmr_datetime =", value, "tRmrDatetime");
            return (Criteria) this;
        }

        public Criteria andTRmrDatetimeNotEqualTo(Date value) {
            addCriterion("t_rmr_datetime <>", value, "tRmrDatetime");
            return (Criteria) this;
        }

        public Criteria andTRmrDatetimeGreaterThan(Date value) {
            addCriterion("t_rmr_datetime >", value, "tRmrDatetime");
            return (Criteria) this;
        }

        public Criteria andTRmrDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("t_rmr_datetime >=", value, "tRmrDatetime");
            return (Criteria) this;
        }

        public Criteria andTRmrDatetimeLessThan(Date value) {
            addCriterion("t_rmr_datetime <", value, "tRmrDatetime");
            return (Criteria) this;
        }

        public Criteria andTRmrDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("t_rmr_datetime <=", value, "tRmrDatetime");
            return (Criteria) this;
        }

        public Criteria andTRmrDatetimeIn(List<Date> values) {
            addCriterion("t_rmr_datetime in", values, "tRmrDatetime");
            return (Criteria) this;
        }

        public Criteria andTRmrDatetimeNotIn(List<Date> values) {
            addCriterion("t_rmr_datetime not in", values, "tRmrDatetime");
            return (Criteria) this;
        }

        public Criteria andTRmrDatetimeBetween(Date value1, Date value2) {
            addCriterion("t_rmr_datetime between", value1, value2, "tRmrDatetime");
            return (Criteria) this;
        }

        public Criteria andTRmrDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("t_rmr_datetime not between", value1, value2, "tRmrDatetime");
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