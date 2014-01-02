package com.neutron.server.persistence.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class T_accdataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public T_accdataExample() {
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

        public Criteria andTAccdataIdIsNull() {
            addCriterion("t_accData_id is null");
            return (Criteria) this;
        }

        public Criteria andTAccdataIdIsNotNull() {
            addCriterion("t_accData_id is not null");
            return (Criteria) this;
        }

        public Criteria andTAccdataIdEqualTo(Integer value) {
            addCriterion("t_accData_id =", value, "tAccdataId");
            return (Criteria) this;
        }

        public Criteria andTAccdataIdNotEqualTo(Integer value) {
            addCriterion("t_accData_id <>", value, "tAccdataId");
            return (Criteria) this;
        }

        public Criteria andTAccdataIdGreaterThan(Integer value) {
            addCriterion("t_accData_id >", value, "tAccdataId");
            return (Criteria) this;
        }

        public Criteria andTAccdataIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_accData_id >=", value, "tAccdataId");
            return (Criteria) this;
        }

        public Criteria andTAccdataIdLessThan(Integer value) {
            addCriterion("t_accData_id <", value, "tAccdataId");
            return (Criteria) this;
        }

        public Criteria andTAccdataIdLessThanOrEqualTo(Integer value) {
            addCriterion("t_accData_id <=", value, "tAccdataId");
            return (Criteria) this;
        }

        public Criteria andTAccdataIdIn(List<Integer> values) {
            addCriterion("t_accData_id in", values, "tAccdataId");
            return (Criteria) this;
        }

        public Criteria andTAccdataIdNotIn(List<Integer> values) {
            addCriterion("t_accData_id not in", values, "tAccdataId");
            return (Criteria) this;
        }

        public Criteria andTAccdataIdBetween(Integer value1, Integer value2) {
            addCriterion("t_accData_id between", value1, value2, "tAccdataId");
            return (Criteria) this;
        }

        public Criteria andTAccdataIdNotBetween(Integer value1, Integer value2) {
            addCriterion("t_accData_id not between", value1, value2, "tAccdataId");
            return (Criteria) this;
        }

        public Criteria andTAccdataUseridIsNull() {
            addCriterion("t_accData_userid is null");
            return (Criteria) this;
        }

        public Criteria andTAccdataUseridIsNotNull() {
            addCriterion("t_accData_userid is not null");
            return (Criteria) this;
        }

        public Criteria andTAccdataUseridEqualTo(Integer value) {
            addCriterion("t_accData_userid =", value, "tAccdataUserid");
            return (Criteria) this;
        }

        public Criteria andTAccdataUseridNotEqualTo(Integer value) {
            addCriterion("t_accData_userid <>", value, "tAccdataUserid");
            return (Criteria) this;
        }

        public Criteria andTAccdataUseridGreaterThan(Integer value) {
            addCriterion("t_accData_userid >", value, "tAccdataUserid");
            return (Criteria) this;
        }

        public Criteria andTAccdataUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_accData_userid >=", value, "tAccdataUserid");
            return (Criteria) this;
        }

        public Criteria andTAccdataUseridLessThan(Integer value) {
            addCriterion("t_accData_userid <", value, "tAccdataUserid");
            return (Criteria) this;
        }

        public Criteria andTAccdataUseridLessThanOrEqualTo(Integer value) {
            addCriterion("t_accData_userid <=", value, "tAccdataUserid");
            return (Criteria) this;
        }

        public Criteria andTAccdataUseridIn(List<Integer> values) {
            addCriterion("t_accData_userid in", values, "tAccdataUserid");
            return (Criteria) this;
        }

        public Criteria andTAccdataUseridNotIn(List<Integer> values) {
            addCriterion("t_accData_userid not in", values, "tAccdataUserid");
            return (Criteria) this;
        }

        public Criteria andTAccdataUseridBetween(Integer value1, Integer value2) {
            addCriterion("t_accData_userid between", value1, value2, "tAccdataUserid");
            return (Criteria) this;
        }

        public Criteria andTAccdataUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("t_accData_userid not between", value1, value2, "tAccdataUserid");
            return (Criteria) this;
        }

        public Criteria andTAccdataValueIsNull() {
            addCriterion("t_accData_value is null");
            return (Criteria) this;
        }

        public Criteria andTAccdataValueIsNotNull() {
            addCriterion("t_accData_value is not null");
            return (Criteria) this;
        }

        public Criteria andTAccdataValueEqualTo(Double value) {
            addCriterion("t_accData_value =", value, "tAccdataValue");
            return (Criteria) this;
        }

        public Criteria andTAccdataValueNotEqualTo(Double value) {
            addCriterion("t_accData_value <>", value, "tAccdataValue");
            return (Criteria) this;
        }

        public Criteria andTAccdataValueGreaterThan(Double value) {
            addCriterion("t_accData_value >", value, "tAccdataValue");
            return (Criteria) this;
        }

        public Criteria andTAccdataValueGreaterThanOrEqualTo(Double value) {
            addCriterion("t_accData_value >=", value, "tAccdataValue");
            return (Criteria) this;
        }

        public Criteria andTAccdataValueLessThan(Double value) {
            addCriterion("t_accData_value <", value, "tAccdataValue");
            return (Criteria) this;
        }

        public Criteria andTAccdataValueLessThanOrEqualTo(Double value) {
            addCriterion("t_accData_value <=", value, "tAccdataValue");
            return (Criteria) this;
        }

        public Criteria andTAccdataValueIn(List<Double> values) {
            addCriterion("t_accData_value in", values, "tAccdataValue");
            return (Criteria) this;
        }

        public Criteria andTAccdataValueNotIn(List<Double> values) {
            addCriterion("t_accData_value not in", values, "tAccdataValue");
            return (Criteria) this;
        }

        public Criteria andTAccdataValueBetween(Double value1, Double value2) {
            addCriterion("t_accData_value between", value1, value2, "tAccdataValue");
            return (Criteria) this;
        }

        public Criteria andTAccdataValueNotBetween(Double value1, Double value2) {
            addCriterion("t_accData_value not between", value1, value2, "tAccdataValue");
            return (Criteria) this;
        }

        public Criteria andTAccdataDatatimeIsNull() {
            addCriterion("t_accData_datatime is null");
            return (Criteria) this;
        }

        public Criteria andTAccdataDatatimeIsNotNull() {
            addCriterion("t_accData_datatime is not null");
            return (Criteria) this;
        }

        public Criteria andTAccdataDatatimeEqualTo(Date value) {
            addCriterion("t_accData_datatime =", value, "tAccdataDatatime");
            return (Criteria) this;
        }

        public Criteria andTAccdataDatatimeNotEqualTo(Date value) {
            addCriterion("t_accData_datatime <>", value, "tAccdataDatatime");
            return (Criteria) this;
        }

        public Criteria andTAccdataDatatimeGreaterThan(Date value) {
            addCriterion("t_accData_datatime >", value, "tAccdataDatatime");
            return (Criteria) this;
        }

        public Criteria andTAccdataDatatimeGreaterThanOrEqualTo(Date value) {
            addCriterion("t_accData_datatime >=", value, "tAccdataDatatime");
            return (Criteria) this;
        }

        public Criteria andTAccdataDatatimeLessThan(Date value) {
            addCriterion("t_accData_datatime <", value, "tAccdataDatatime");
            return (Criteria) this;
        }

        public Criteria andTAccdataDatatimeLessThanOrEqualTo(Date value) {
            addCriterion("t_accData_datatime <=", value, "tAccdataDatatime");
            return (Criteria) this;
        }

        public Criteria andTAccdataDatatimeIn(List<Date> values) {
            addCriterion("t_accData_datatime in", values, "tAccdataDatatime");
            return (Criteria) this;
        }

        public Criteria andTAccdataDatatimeNotIn(List<Date> values) {
            addCriterion("t_accData_datatime not in", values, "tAccdataDatatime");
            return (Criteria) this;
        }

        public Criteria andTAccdataDatatimeBetween(Date value1, Date value2) {
            addCriterion("t_accData_datatime between", value1, value2, "tAccdataDatatime");
            return (Criteria) this;
        }

        public Criteria andTAccdataDatatimeNotBetween(Date value1, Date value2) {
            addCriterion("t_accData_datatime not between", value1, value2, "tAccdataDatatime");
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