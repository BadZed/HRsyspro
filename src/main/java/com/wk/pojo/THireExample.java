package com.wk.pojo;

import java.util.ArrayList;
import java.util.List;

public class THireExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public THireExample() {
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

        public Criteria andHrIdIsNull() {
            addCriterion("HR_ID is null");
            return (Criteria) this;
        }

        public Criteria andHrIdIsNotNull() {
            addCriterion("HR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andHrIdEqualTo(Long value) {
            addCriterion("HR_ID =", value, "hrId");
            return (Criteria) this;
        }

        public Criteria andHrIdNotEqualTo(Long value) {
            addCriterion("HR_ID <>", value, "hrId");
            return (Criteria) this;
        }

        public Criteria andHrIdGreaterThan(Long value) {
            addCriterion("HR_ID >", value, "hrId");
            return (Criteria) this;
        }

        public Criteria andHrIdGreaterThanOrEqualTo(Long value) {
            addCriterion("HR_ID >=", value, "hrId");
            return (Criteria) this;
        }

        public Criteria andHrIdLessThan(Long value) {
            addCriterion("HR_ID <", value, "hrId");
            return (Criteria) this;
        }

        public Criteria andHrIdLessThanOrEqualTo(Long value) {
            addCriterion("HR_ID <=", value, "hrId");
            return (Criteria) this;
        }

        public Criteria andHrIdIn(List<Long> values) {
            addCriterion("HR_ID in", values, "hrId");
            return (Criteria) this;
        }

        public Criteria andHrIdNotIn(List<Long> values) {
            addCriterion("HR_ID not in", values, "hrId");
            return (Criteria) this;
        }

        public Criteria andHrIdBetween(Long value1, Long value2) {
            addCriterion("HR_ID between", value1, value2, "hrId");
            return (Criteria) this;
        }

        public Criteria andHrIdNotBetween(Long value1, Long value2) {
            addCriterion("HR_ID not between", value1, value2, "hrId");
            return (Criteria) this;
        }

        public Criteria andHrJobIsNull() {
            addCriterion("HR_JOB is null");
            return (Criteria) this;
        }

        public Criteria andHrJobIsNotNull() {
            addCriterion("HR_JOB is not null");
            return (Criteria) this;
        }

        public Criteria andHrJobEqualTo(String value) {
            addCriterion("HR_JOB =", value, "hrJob");
            return (Criteria) this;
        }

        public Criteria andHrJobNotEqualTo(String value) {
            addCriterion("HR_JOB <>", value, "hrJob");
            return (Criteria) this;
        }

        public Criteria andHrJobGreaterThan(String value) {
            addCriterion("HR_JOB >", value, "hrJob");
            return (Criteria) this;
        }

        public Criteria andHrJobGreaterThanOrEqualTo(String value) {
            addCriterion("HR_JOB >=", value, "hrJob");
            return (Criteria) this;
        }

        public Criteria andHrJobLessThan(String value) {
            addCriterion("HR_JOB <", value, "hrJob");
            return (Criteria) this;
        }

        public Criteria andHrJobLessThanOrEqualTo(String value) {
            addCriterion("HR_JOB <=", value, "hrJob");
            return (Criteria) this;
        }

        public Criteria andHrJobLike(String value) {
            addCriterion("HR_JOB like", value, "hrJob");
            return (Criteria) this;
        }

        public Criteria andHrJobNotLike(String value) {
            addCriterion("HR_JOB not like", value, "hrJob");
            return (Criteria) this;
        }

        public Criteria andHrJobIn(List<String> values) {
            addCriterion("HR_JOB in", values, "hrJob");
            return (Criteria) this;
        }

        public Criteria andHrJobNotIn(List<String> values) {
            addCriterion("HR_JOB not in", values, "hrJob");
            return (Criteria) this;
        }

        public Criteria andHrJobBetween(String value1, String value2) {
            addCriterion("HR_JOB between", value1, value2, "hrJob");
            return (Criteria) this;
        }

        public Criteria andHrJobNotBetween(String value1, String value2) {
            addCriterion("HR_JOB not between", value1, value2, "hrJob");
            return (Criteria) this;
        }

        public Criteria andHrSalIsNull() {
            addCriterion("HR_SAL is null");
            return (Criteria) this;
        }

        public Criteria andHrSalIsNotNull() {
            addCriterion("HR_SAL is not null");
            return (Criteria) this;
        }

        public Criteria andHrSalEqualTo(String value) {
            addCriterion("HR_SAL =", value, "hrSal");
            return (Criteria) this;
        }

        public Criteria andHrSalNotEqualTo(String value) {
            addCriterion("HR_SAL <>", value, "hrSal");
            return (Criteria) this;
        }

        public Criteria andHrSalGreaterThan(String value) {
            addCriterion("HR_SAL >", value, "hrSal");
            return (Criteria) this;
        }

        public Criteria andHrSalGreaterThanOrEqualTo(String value) {
            addCriterion("HR_SAL >=", value, "hrSal");
            return (Criteria) this;
        }

        public Criteria andHrSalLessThan(String value) {
            addCriterion("HR_SAL <", value, "hrSal");
            return (Criteria) this;
        }

        public Criteria andHrSalLessThanOrEqualTo(String value) {
            addCriterion("HR_SAL <=", value, "hrSal");
            return (Criteria) this;
        }

        public Criteria andHrSalLike(String value) {
            addCriterion("HR_SAL like", value, "hrSal");
            return (Criteria) this;
        }

        public Criteria andHrSalNotLike(String value) {
            addCriterion("HR_SAL not like", value, "hrSal");
            return (Criteria) this;
        }

        public Criteria andHrSalIn(List<String> values) {
            addCriterion("HR_SAL in", values, "hrSal");
            return (Criteria) this;
        }

        public Criteria andHrSalNotIn(List<String> values) {
            addCriterion("HR_SAL not in", values, "hrSal");
            return (Criteria) this;
        }

        public Criteria andHrSalBetween(String value1, String value2) {
            addCriterion("HR_SAL between", value1, value2, "hrSal");
            return (Criteria) this;
        }

        public Criteria andHrSalNotBetween(String value1, String value2) {
            addCriterion("HR_SAL not between", value1, value2, "hrSal");
            return (Criteria) this;
        }

        public Criteria andHrJobinforIsNull() {
            addCriterion("HR_JOBINFOR is null");
            return (Criteria) this;
        }

        public Criteria andHrJobinforIsNotNull() {
            addCriterion("HR_JOBINFOR is not null");
            return (Criteria) this;
        }

        public Criteria andHrJobinforEqualTo(String value) {
            addCriterion("HR_JOBINFOR =", value, "hrJobinfor");
            return (Criteria) this;
        }

        public Criteria andHrJobinforNotEqualTo(String value) {
            addCriterion("HR_JOBINFOR <>", value, "hrJobinfor");
            return (Criteria) this;
        }

        public Criteria andHrJobinforGreaterThan(String value) {
            addCriterion("HR_JOBINFOR >", value, "hrJobinfor");
            return (Criteria) this;
        }

        public Criteria andHrJobinforGreaterThanOrEqualTo(String value) {
            addCriterion("HR_JOBINFOR >=", value, "hrJobinfor");
            return (Criteria) this;
        }

        public Criteria andHrJobinforLessThan(String value) {
            addCriterion("HR_JOBINFOR <", value, "hrJobinfor");
            return (Criteria) this;
        }

        public Criteria andHrJobinforLessThanOrEqualTo(String value) {
            addCriterion("HR_JOBINFOR <=", value, "hrJobinfor");
            return (Criteria) this;
        }

        public Criteria andHrJobinforLike(String value) {
            addCriterion("HR_JOBINFOR like", value, "hrJobinfor");
            return (Criteria) this;
        }

        public Criteria andHrJobinforNotLike(String value) {
            addCriterion("HR_JOBINFOR not like", value, "hrJobinfor");
            return (Criteria) this;
        }

        public Criteria andHrJobinforIn(List<String> values) {
            addCriterion("HR_JOBINFOR in", values, "hrJobinfor");
            return (Criteria) this;
        }

        public Criteria andHrJobinforNotIn(List<String> values) {
            addCriterion("HR_JOBINFOR not in", values, "hrJobinfor");
            return (Criteria) this;
        }

        public Criteria andHrJobinforBetween(String value1, String value2) {
            addCriterion("HR_JOBINFOR between", value1, value2, "hrJobinfor");
            return (Criteria) this;
        }

        public Criteria andHrJobinforNotBetween(String value1, String value2) {
            addCriterion("HR_JOBINFOR not between", value1, value2, "hrJobinfor");
            return (Criteria) this;
        }

        public Criteria andHrWelfareIsNull() {
            addCriterion("HR_WELFARE is null");
            return (Criteria) this;
        }

        public Criteria andHrWelfareIsNotNull() {
            addCriterion("HR_WELFARE is not null");
            return (Criteria) this;
        }

        public Criteria andHrWelfareEqualTo(String value) {
            addCriterion("HR_WELFARE =", value, "hrWelfare");
            return (Criteria) this;
        }

        public Criteria andHrWelfareNotEqualTo(String value) {
            addCriterion("HR_WELFARE <>", value, "hrWelfare");
            return (Criteria) this;
        }

        public Criteria andHrWelfareGreaterThan(String value) {
            addCriterion("HR_WELFARE >", value, "hrWelfare");
            return (Criteria) this;
        }

        public Criteria andHrWelfareGreaterThanOrEqualTo(String value) {
            addCriterion("HR_WELFARE >=", value, "hrWelfare");
            return (Criteria) this;
        }

        public Criteria andHrWelfareLessThan(String value) {
            addCriterion("HR_WELFARE <", value, "hrWelfare");
            return (Criteria) this;
        }

        public Criteria andHrWelfareLessThanOrEqualTo(String value) {
            addCriterion("HR_WELFARE <=", value, "hrWelfare");
            return (Criteria) this;
        }

        public Criteria andHrWelfareLike(String value) {
            addCriterion("HR_WELFARE like", value, "hrWelfare");
            return (Criteria) this;
        }

        public Criteria andHrWelfareNotLike(String value) {
            addCriterion("HR_WELFARE not like", value, "hrWelfare");
            return (Criteria) this;
        }

        public Criteria andHrWelfareIn(List<String> values) {
            addCriterion("HR_WELFARE in", values, "hrWelfare");
            return (Criteria) this;
        }

        public Criteria andHrWelfareNotIn(List<String> values) {
            addCriterion("HR_WELFARE not in", values, "hrWelfare");
            return (Criteria) this;
        }

        public Criteria andHrWelfareBetween(String value1, String value2) {
            addCriterion("HR_WELFARE between", value1, value2, "hrWelfare");
            return (Criteria) this;
        }

        public Criteria andHrWelfareNotBetween(String value1, String value2) {
            addCriterion("HR_WELFARE not between", value1, value2, "hrWelfare");
            return (Criteria) this;
        }

        public Criteria andHrCominforIsNull() {
            addCriterion("HR_COMINFOR is null");
            return (Criteria) this;
        }

        public Criteria andHrCominforIsNotNull() {
            addCriterion("HR_COMINFOR is not null");
            return (Criteria) this;
        }

        public Criteria andHrCominforEqualTo(String value) {
            addCriterion("HR_COMINFOR =", value, "hrCominfor");
            return (Criteria) this;
        }

        public Criteria andHrCominforNotEqualTo(String value) {
            addCriterion("HR_COMINFOR <>", value, "hrCominfor");
            return (Criteria) this;
        }

        public Criteria andHrCominforGreaterThan(String value) {
            addCriterion("HR_COMINFOR >", value, "hrCominfor");
            return (Criteria) this;
        }

        public Criteria andHrCominforGreaterThanOrEqualTo(String value) {
            addCriterion("HR_COMINFOR >=", value, "hrCominfor");
            return (Criteria) this;
        }

        public Criteria andHrCominforLessThan(String value) {
            addCriterion("HR_COMINFOR <", value, "hrCominfor");
            return (Criteria) this;
        }

        public Criteria andHrCominforLessThanOrEqualTo(String value) {
            addCriterion("HR_COMINFOR <=", value, "hrCominfor");
            return (Criteria) this;
        }

        public Criteria andHrCominforLike(String value) {
            addCriterion("HR_COMINFOR like", value, "hrCominfor");
            return (Criteria) this;
        }

        public Criteria andHrCominforNotLike(String value) {
            addCriterion("HR_COMINFOR not like", value, "hrCominfor");
            return (Criteria) this;
        }

        public Criteria andHrCominforIn(List<String> values) {
            addCriterion("HR_COMINFOR in", values, "hrCominfor");
            return (Criteria) this;
        }

        public Criteria andHrCominforNotIn(List<String> values) {
            addCriterion("HR_COMINFOR not in", values, "hrCominfor");
            return (Criteria) this;
        }

        public Criteria andHrCominforBetween(String value1, String value2) {
            addCriterion("HR_COMINFOR between", value1, value2, "hrCominfor");
            return (Criteria) this;
        }

        public Criteria andHrCominforNotBetween(String value1, String value2) {
            addCriterion("HR_COMINFOR not between", value1, value2, "hrCominfor");
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