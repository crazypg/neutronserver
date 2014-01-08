package com.neutron.server.persistence.model;

import java.util.ArrayList;
import java.util.List;

public class T_systemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public T_systemExample() {
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

        public Criteria andTSystemIdIsNull() {
            addCriterion("T_SYSTEM_id is null");
            return (Criteria) this;
        }

        public Criteria andTSystemIdIsNotNull() {
            addCriterion("T_SYSTEM_id is not null");
            return (Criteria) this;
        }

        public Criteria andTSystemIdEqualTo(Integer value) {
            addCriterion("T_SYSTEM_id =", value, "tSystemId");
            return (Criteria) this;
        }

        public Criteria andTSystemIdNotEqualTo(Integer value) {
            addCriterion("T_SYSTEM_id <>", value, "tSystemId");
            return (Criteria) this;
        }

        public Criteria andTSystemIdGreaterThan(Integer value) {
            addCriterion("T_SYSTEM_id >", value, "tSystemId");
            return (Criteria) this;
        }

        public Criteria andTSystemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("T_SYSTEM_id >=", value, "tSystemId");
            return (Criteria) this;
        }

        public Criteria andTSystemIdLessThan(Integer value) {
            addCriterion("T_SYSTEM_id <", value, "tSystemId");
            return (Criteria) this;
        }

        public Criteria andTSystemIdLessThanOrEqualTo(Integer value) {
            addCriterion("T_SYSTEM_id <=", value, "tSystemId");
            return (Criteria) this;
        }

        public Criteria andTSystemIdIn(List<Integer> values) {
            addCriterion("T_SYSTEM_id in", values, "tSystemId");
            return (Criteria) this;
        }

        public Criteria andTSystemIdNotIn(List<Integer> values) {
            addCriterion("T_SYSTEM_id not in", values, "tSystemId");
            return (Criteria) this;
        }

        public Criteria andTSystemIdBetween(Integer value1, Integer value2) {
            addCriterion("T_SYSTEM_id between", value1, value2, "tSystemId");
            return (Criteria) this;
        }

        public Criteria andTSystemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("T_SYSTEM_id not between", value1, value2, "tSystemId");
            return (Criteria) this;
        }

        public Criteria andTSystemNameIsNull() {
            addCriterion("T_SYSTEM_name is null");
            return (Criteria) this;
        }

        public Criteria andTSystemNameIsNotNull() {
            addCriterion("T_SYSTEM_name is not null");
            return (Criteria) this;
        }

        public Criteria andTSystemNameEqualTo(String value) {
            addCriterion("T_SYSTEM_name =", value, "tSystemName");
            return (Criteria) this;
        }

        public Criteria andTSystemNameNotEqualTo(String value) {
            addCriterion("T_SYSTEM_name <>", value, "tSystemName");
            return (Criteria) this;
        }

        public Criteria andTSystemNameGreaterThan(String value) {
            addCriterion("T_SYSTEM_name >", value, "tSystemName");
            return (Criteria) this;
        }

        public Criteria andTSystemNameGreaterThanOrEqualTo(String value) {
            addCriterion("T_SYSTEM_name >=", value, "tSystemName");
            return (Criteria) this;
        }

        public Criteria andTSystemNameLessThan(String value) {
            addCriterion("T_SYSTEM_name <", value, "tSystemName");
            return (Criteria) this;
        }

        public Criteria andTSystemNameLessThanOrEqualTo(String value) {
            addCriterion("T_SYSTEM_name <=", value, "tSystemName");
            return (Criteria) this;
        }

        public Criteria andTSystemNameLike(String value) {
            addCriterion("T_SYSTEM_name like", value, "tSystemName");
            return (Criteria) this;
        }

        public Criteria andTSystemNameNotLike(String value) {
            addCriterion("T_SYSTEM_name not like", value, "tSystemName");
            return (Criteria) this;
        }

        public Criteria andTSystemNameIn(List<String> values) {
            addCriterion("T_SYSTEM_name in", values, "tSystemName");
            return (Criteria) this;
        }

        public Criteria andTSystemNameNotIn(List<String> values) {
            addCriterion("T_SYSTEM_name not in", values, "tSystemName");
            return (Criteria) this;
        }

        public Criteria andTSystemNameBetween(String value1, String value2) {
            addCriterion("T_SYSTEM_name between", value1, value2, "tSystemName");
            return (Criteria) this;
        }

        public Criteria andTSystemNameNotBetween(String value1, String value2) {
            addCriterion("T_SYSTEM_name not between", value1, value2, "tSystemName");
            return (Criteria) this;
        }

        public Criteria andTSystemValueIsNull() {
            addCriterion("T_SYSTEM_value is null");
            return (Criteria) this;
        }

        public Criteria andTSystemValueIsNotNull() {
            addCriterion("T_SYSTEM_value is not null");
            return (Criteria) this;
        }

        public Criteria andTSystemValueEqualTo(String value) {
            addCriterion("T_SYSTEM_value =", value, "tSystemValue");
            return (Criteria) this;
        }

        public Criteria andTSystemValueNotEqualTo(String value) {
            addCriterion("T_SYSTEM_value <>", value, "tSystemValue");
            return (Criteria) this;
        }

        public Criteria andTSystemValueGreaterThan(String value) {
            addCriterion("T_SYSTEM_value >", value, "tSystemValue");
            return (Criteria) this;
        }

        public Criteria andTSystemValueGreaterThanOrEqualTo(String value) {
            addCriterion("T_SYSTEM_value >=", value, "tSystemValue");
            return (Criteria) this;
        }

        public Criteria andTSystemValueLessThan(String value) {
            addCriterion("T_SYSTEM_value <", value, "tSystemValue");
            return (Criteria) this;
        }

        public Criteria andTSystemValueLessThanOrEqualTo(String value) {
            addCriterion("T_SYSTEM_value <=", value, "tSystemValue");
            return (Criteria) this;
        }

        public Criteria andTSystemValueLike(String value) {
            addCriterion("T_SYSTEM_value like", value, "tSystemValue");
            return (Criteria) this;
        }

        public Criteria andTSystemValueNotLike(String value) {
            addCriterion("T_SYSTEM_value not like", value, "tSystemValue");
            return (Criteria) this;
        }

        public Criteria andTSystemValueIn(List<String> values) {
            addCriterion("T_SYSTEM_value in", values, "tSystemValue");
            return (Criteria) this;
        }

        public Criteria andTSystemValueNotIn(List<String> values) {
            addCriterion("T_SYSTEM_value not in", values, "tSystemValue");
            return (Criteria) this;
        }

        public Criteria andTSystemValueBetween(String value1, String value2) {
            addCriterion("T_SYSTEM_value between", value1, value2, "tSystemValue");
            return (Criteria) this;
        }

        public Criteria andTSystemValueNotBetween(String value1, String value2) {
            addCriterion("T_SYSTEM_value not between", value1, value2, "tSystemValue");
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