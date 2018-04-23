package com.wk.pojo;

import java.util.ArrayList;
import java.util.List;

public class TComuserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TComuserExample() {
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

        public Criteria andCuIdIsNull() {
            addCriterion("CU_ID is null");
            return (Criteria) this;
        }

        public Criteria andCuIdIsNotNull() {
            addCriterion("CU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCuIdEqualTo(Long value) {
            addCriterion("CU_ID =", value, "cuId");
            return (Criteria) this;
        }

        public Criteria andCuIdNotEqualTo(Long value) {
            addCriterion("CU_ID <>", value, "cuId");
            return (Criteria) this;
        }

        public Criteria andCuIdGreaterThan(Long value) {
            addCriterion("CU_ID >", value, "cuId");
            return (Criteria) this;
        }

        public Criteria andCuIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CU_ID >=", value, "cuId");
            return (Criteria) this;
        }

        public Criteria andCuIdLessThan(Long value) {
            addCriterion("CU_ID <", value, "cuId");
            return (Criteria) this;
        }

        public Criteria andCuIdLessThanOrEqualTo(Long value) {
            addCriterion("CU_ID <=", value, "cuId");
            return (Criteria) this;
        }

        public Criteria andCuIdIn(List<Long> values) {
            addCriterion("CU_ID in", values, "cuId");
            return (Criteria) this;
        }

        public Criteria andCuIdNotIn(List<Long> values) {
            addCriterion("CU_ID not in", values, "cuId");
            return (Criteria) this;
        }

        public Criteria andCuIdBetween(Long value1, Long value2) {
            addCriterion("CU_ID between", value1, value2, "cuId");
            return (Criteria) this;
        }

        public Criteria andCuIdNotBetween(Long value1, Long value2) {
            addCriterion("CU_ID not between", value1, value2, "cuId");
            return (Criteria) this;
        }

        public Criteria andCuUsernameIsNull() {
            addCriterion("CU_USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andCuUsernameIsNotNull() {
            addCriterion("CU_USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCuUsernameEqualTo(String value) {
            addCriterion("CU_USERNAME =", value, "cuUsername");
            return (Criteria) this;
        }

        public Criteria andCuUsernameNotEqualTo(String value) {
            addCriterion("CU_USERNAME <>", value, "cuUsername");
            return (Criteria) this;
        }

        public Criteria andCuUsernameGreaterThan(String value) {
            addCriterion("CU_USERNAME >", value, "cuUsername");
            return (Criteria) this;
        }

        public Criteria andCuUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("CU_USERNAME >=", value, "cuUsername");
            return (Criteria) this;
        }

        public Criteria andCuUsernameLessThan(String value) {
            addCriterion("CU_USERNAME <", value, "cuUsername");
            return (Criteria) this;
        }

        public Criteria andCuUsernameLessThanOrEqualTo(String value) {
            addCriterion("CU_USERNAME <=", value, "cuUsername");
            return (Criteria) this;
        }

        public Criteria andCuUsernameLike(String value) {
            addCriterion("CU_USERNAME like", value, "cuUsername");
            return (Criteria) this;
        }

        public Criteria andCuUsernameNotLike(String value) {
            addCriterion("CU_USERNAME not like", value, "cuUsername");
            return (Criteria) this;
        }

        public Criteria andCuUsernameIn(List<String> values) {
            addCriterion("CU_USERNAME in", values, "cuUsername");
            return (Criteria) this;
        }

        public Criteria andCuUsernameNotIn(List<String> values) {
            addCriterion("CU_USERNAME not in", values, "cuUsername");
            return (Criteria) this;
        }

        public Criteria andCuUsernameBetween(String value1, String value2) {
            addCriterion("CU_USERNAME between", value1, value2, "cuUsername");
            return (Criteria) this;
        }

        public Criteria andCuUsernameNotBetween(String value1, String value2) {
            addCriterion("CU_USERNAME not between", value1, value2, "cuUsername");
            return (Criteria) this;
        }

        public Criteria andCuPassIsNull() {
            addCriterion("CU_PASS is null");
            return (Criteria) this;
        }

        public Criteria andCuPassIsNotNull() {
            addCriterion("CU_PASS is not null");
            return (Criteria) this;
        }

        public Criteria andCuPassEqualTo(String value) {
            addCriterion("CU_PASS =", value, "cuPass");
            return (Criteria) this;
        }

        public Criteria andCuPassNotEqualTo(String value) {
            addCriterion("CU_PASS <>", value, "cuPass");
            return (Criteria) this;
        }

        public Criteria andCuPassGreaterThan(String value) {
            addCriterion("CU_PASS >", value, "cuPass");
            return (Criteria) this;
        }

        public Criteria andCuPassGreaterThanOrEqualTo(String value) {
            addCriterion("CU_PASS >=", value, "cuPass");
            return (Criteria) this;
        }

        public Criteria andCuPassLessThan(String value) {
            addCriterion("CU_PASS <", value, "cuPass");
            return (Criteria) this;
        }

        public Criteria andCuPassLessThanOrEqualTo(String value) {
            addCriterion("CU_PASS <=", value, "cuPass");
            return (Criteria) this;
        }

        public Criteria andCuPassLike(String value) {
            addCriterion("CU_PASS like", value, "cuPass");
            return (Criteria) this;
        }

        public Criteria andCuPassNotLike(String value) {
            addCriterion("CU_PASS not like", value, "cuPass");
            return (Criteria) this;
        }

        public Criteria andCuPassIn(List<String> values) {
            addCriterion("CU_PASS in", values, "cuPass");
            return (Criteria) this;
        }

        public Criteria andCuPassNotIn(List<String> values) {
            addCriterion("CU_PASS not in", values, "cuPass");
            return (Criteria) this;
        }

        public Criteria andCuPassBetween(String value1, String value2) {
            addCriterion("CU_PASS between", value1, value2, "cuPass");
            return (Criteria) this;
        }

        public Criteria andCuPassNotBetween(String value1, String value2) {
            addCriterion("CU_PASS not between", value1, value2, "cuPass");
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