package com.wk.pojo;

import java.util.ArrayList;
import java.util.List;

public class TAdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TAdminExample() {
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

        public Criteria andAdAccountIsNull() {
            addCriterion("AD_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAdAccountIsNotNull() {
            addCriterion("AD_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAdAccountEqualTo(String value) {
            addCriterion("AD_ACCOUNT =", value, "adAccount");
            return (Criteria) this;
        }

        public Criteria andAdAccountNotEqualTo(String value) {
            addCriterion("AD_ACCOUNT <>", value, "adAccount");
            return (Criteria) this;
        }

        public Criteria andAdAccountGreaterThan(String value) {
            addCriterion("AD_ACCOUNT >", value, "adAccount");
            return (Criteria) this;
        }

        public Criteria andAdAccountGreaterThanOrEqualTo(String value) {
            addCriterion("AD_ACCOUNT >=", value, "adAccount");
            return (Criteria) this;
        }

        public Criteria andAdAccountLessThan(String value) {
            addCriterion("AD_ACCOUNT <", value, "adAccount");
            return (Criteria) this;
        }

        public Criteria andAdAccountLessThanOrEqualTo(String value) {
            addCriterion("AD_ACCOUNT <=", value, "adAccount");
            return (Criteria) this;
        }

        public Criteria andAdAccountLike(String value) {
            addCriterion("AD_ACCOUNT like", value, "adAccount");
            return (Criteria) this;
        }

        public Criteria andAdAccountNotLike(String value) {
            addCriterion("AD_ACCOUNT not like", value, "adAccount");
            return (Criteria) this;
        }

        public Criteria andAdAccountIn(List<String> values) {
            addCriterion("AD_ACCOUNT in", values, "adAccount");
            return (Criteria) this;
        }

        public Criteria andAdAccountNotIn(List<String> values) {
            addCriterion("AD_ACCOUNT not in", values, "adAccount");
            return (Criteria) this;
        }

        public Criteria andAdAccountBetween(String value1, String value2) {
            addCriterion("AD_ACCOUNT between", value1, value2, "adAccount");
            return (Criteria) this;
        }

        public Criteria andAdAccountNotBetween(String value1, String value2) {
            addCriterion("AD_ACCOUNT not between", value1, value2, "adAccount");
            return (Criteria) this;
        }

        public Criteria andAdPassIsNull() {
            addCriterion("AD_PASS is null");
            return (Criteria) this;
        }

        public Criteria andAdPassIsNotNull() {
            addCriterion("AD_PASS is not null");
            return (Criteria) this;
        }

        public Criteria andAdPassEqualTo(String value) {
            addCriterion("AD_PASS =", value, "adPass");
            return (Criteria) this;
        }

        public Criteria andAdPassNotEqualTo(String value) {
            addCriterion("AD_PASS <>", value, "adPass");
            return (Criteria) this;
        }

        public Criteria andAdPassGreaterThan(String value) {
            addCriterion("AD_PASS >", value, "adPass");
            return (Criteria) this;
        }

        public Criteria andAdPassGreaterThanOrEqualTo(String value) {
            addCriterion("AD_PASS >=", value, "adPass");
            return (Criteria) this;
        }

        public Criteria andAdPassLessThan(String value) {
            addCriterion("AD_PASS <", value, "adPass");
            return (Criteria) this;
        }

        public Criteria andAdPassLessThanOrEqualTo(String value) {
            addCriterion("AD_PASS <=", value, "adPass");
            return (Criteria) this;
        }

        public Criteria andAdPassLike(String value) {
            addCriterion("AD_PASS like", value, "adPass");
            return (Criteria) this;
        }

        public Criteria andAdPassNotLike(String value) {
            addCriterion("AD_PASS not like", value, "adPass");
            return (Criteria) this;
        }

        public Criteria andAdPassIn(List<String> values) {
            addCriterion("AD_PASS in", values, "adPass");
            return (Criteria) this;
        }

        public Criteria andAdPassNotIn(List<String> values) {
            addCriterion("AD_PASS not in", values, "adPass");
            return (Criteria) this;
        }

        public Criteria andAdPassBetween(String value1, String value2) {
            addCriterion("AD_PASS between", value1, value2, "adPass");
            return (Criteria) this;
        }

        public Criteria andAdPassNotBetween(String value1, String value2) {
            addCriterion("AD_PASS not between", value1, value2, "adPass");
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