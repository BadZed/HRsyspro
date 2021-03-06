package com.wk.pojo;

import java.util.ArrayList;
import java.util.List;

public class TEmpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TEmpExample() {
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

        public Criteria andEmpAccountIsNull() {
            addCriterion("EMP_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andEmpAccountIsNotNull() {
            addCriterion("EMP_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andEmpAccountEqualTo(String value) {
            addCriterion("EMP_ACCOUNT =", value, "empAccount");
            return (Criteria) this;
        }

        public Criteria andEmpAccountNotEqualTo(String value) {
            addCriterion("EMP_ACCOUNT <>", value, "empAccount");
            return (Criteria) this;
        }

        public Criteria andEmpAccountGreaterThan(String value) {
            addCriterion("EMP_ACCOUNT >", value, "empAccount");
            return (Criteria) this;
        }

        public Criteria andEmpAccountGreaterThanOrEqualTo(String value) {
            addCriterion("EMP_ACCOUNT >=", value, "empAccount");
            return (Criteria) this;
        }

        public Criteria andEmpAccountLessThan(String value) {
            addCriterion("EMP_ACCOUNT <", value, "empAccount");
            return (Criteria) this;
        }

        public Criteria andEmpAccountLessThanOrEqualTo(String value) {
            addCriterion("EMP_ACCOUNT <=", value, "empAccount");
            return (Criteria) this;
        }

        public Criteria andEmpAccountLike(String value) {
            addCriterion("EMP_ACCOUNT like", value, "empAccount");
            return (Criteria) this;
        }

        public Criteria andEmpAccountNotLike(String value) {
            addCriterion("EMP_ACCOUNT not like", value, "empAccount");
            return (Criteria) this;
        }

        public Criteria andEmpAccountIn(List<String> values) {
            addCriterion("EMP_ACCOUNT in", values, "empAccount");
            return (Criteria) this;
        }

        public Criteria andEmpAccountNotIn(List<String> values) {
            addCriterion("EMP_ACCOUNT not in", values, "empAccount");
            return (Criteria) this;
        }

        public Criteria andEmpAccountBetween(String value1, String value2) {
            addCriterion("EMP_ACCOUNT between", value1, value2, "empAccount");
            return (Criteria) this;
        }

        public Criteria andEmpAccountNotBetween(String value1, String value2) {
            addCriterion("EMP_ACCOUNT not between", value1, value2, "empAccount");
            return (Criteria) this;
        }

        public Criteria andEmpPassIsNull() {
            addCriterion("EMP_PASS is null");
            return (Criteria) this;
        }

        public Criteria andEmpPassIsNotNull() {
            addCriterion("EMP_PASS is not null");
            return (Criteria) this;
        }

        public Criteria andEmpPassEqualTo(String value) {
            addCriterion("EMP_PASS =", value, "empPass");
            return (Criteria) this;
        }

        public Criteria andEmpPassNotEqualTo(String value) {
            addCriterion("EMP_PASS <>", value, "empPass");
            return (Criteria) this;
        }

        public Criteria andEmpPassGreaterThan(String value) {
            addCriterion("EMP_PASS >", value, "empPass");
            return (Criteria) this;
        }

        public Criteria andEmpPassGreaterThanOrEqualTo(String value) {
            addCriterion("EMP_PASS >=", value, "empPass");
            return (Criteria) this;
        }

        public Criteria andEmpPassLessThan(String value) {
            addCriterion("EMP_PASS <", value, "empPass");
            return (Criteria) this;
        }

        public Criteria andEmpPassLessThanOrEqualTo(String value) {
            addCriterion("EMP_PASS <=", value, "empPass");
            return (Criteria) this;
        }

        public Criteria andEmpPassLike(String value) {
            addCriterion("EMP_PASS like", value, "empPass");
            return (Criteria) this;
        }

        public Criteria andEmpPassNotLike(String value) {
            addCriterion("EMP_PASS not like", value, "empPass");
            return (Criteria) this;
        }

        public Criteria andEmpPassIn(List<String> values) {
            addCriterion("EMP_PASS in", values, "empPass");
            return (Criteria) this;
        }

        public Criteria andEmpPassNotIn(List<String> values) {
            addCriterion("EMP_PASS not in", values, "empPass");
            return (Criteria) this;
        }

        public Criteria andEmpPassBetween(String value1, String value2) {
            addCriterion("EMP_PASS between", value1, value2, "empPass");
            return (Criteria) this;
        }

        public Criteria andEmpPassNotBetween(String value1, String value2) {
            addCriterion("EMP_PASS not between", value1, value2, "empPass");
            return (Criteria) this;
        }

        public Criteria andEmpStatusIsNull() {
            addCriterion("EMP_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andEmpStatusIsNotNull() {
            addCriterion("EMP_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andEmpStatusEqualTo(Short value) {
            addCriterion("EMP_STATUS =", value, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusNotEqualTo(Short value) {
            addCriterion("EMP_STATUS <>", value, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusGreaterThan(Short value) {
            addCriterion("EMP_STATUS >", value, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("EMP_STATUS >=", value, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusLessThan(Short value) {
            addCriterion("EMP_STATUS <", value, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusLessThanOrEqualTo(Short value) {
            addCriterion("EMP_STATUS <=", value, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusIn(List<Short> values) {
            addCriterion("EMP_STATUS in", values, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusNotIn(List<Short> values) {
            addCriterion("EMP_STATUS not in", values, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusBetween(Short value1, Short value2) {
            addCriterion("EMP_STATUS between", value1, value2, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpStatusNotBetween(Short value1, Short value2) {
            addCriterion("EMP_STATUS not between", value1, value2, "empStatus");
            return (Criteria) this;
        }

        public Criteria andEmpSerResumeIdIsNull() {
            addCriterion("EMP_SER_RESUME_ID is null");
            return (Criteria) this;
        }

        public Criteria andEmpSerResumeIdIsNotNull() {
            addCriterion("EMP_SER_RESUME_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEmpSerResumeIdEqualTo(Long value) {
            addCriterion("EMP_SER_RESUME_ID =", value, "empSerResumeId");
            return (Criteria) this;
        }

        public Criteria andEmpSerResumeIdNotEqualTo(Long value) {
            addCriterion("EMP_SER_RESUME_ID <>", value, "empSerResumeId");
            return (Criteria) this;
        }

        public Criteria andEmpSerResumeIdGreaterThan(Long value) {
            addCriterion("EMP_SER_RESUME_ID >", value, "empSerResumeId");
            return (Criteria) this;
        }

        public Criteria andEmpSerResumeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("EMP_SER_RESUME_ID >=", value, "empSerResumeId");
            return (Criteria) this;
        }

        public Criteria andEmpSerResumeIdLessThan(Long value) {
            addCriterion("EMP_SER_RESUME_ID <", value, "empSerResumeId");
            return (Criteria) this;
        }

        public Criteria andEmpSerResumeIdLessThanOrEqualTo(Long value) {
            addCriterion("EMP_SER_RESUME_ID <=", value, "empSerResumeId");
            return (Criteria) this;
        }

        public Criteria andEmpSerResumeIdIn(List<Long> values) {
            addCriterion("EMP_SER_RESUME_ID in", values, "empSerResumeId");
            return (Criteria) this;
        }

        public Criteria andEmpSerResumeIdNotIn(List<Long> values) {
            addCriterion("EMP_SER_RESUME_ID not in", values, "empSerResumeId");
            return (Criteria) this;
        }

        public Criteria andEmpSerResumeIdBetween(Long value1, Long value2) {
            addCriterion("EMP_SER_RESUME_ID between", value1, value2, "empSerResumeId");
            return (Criteria) this;
        }

        public Criteria andEmpSerResumeIdNotBetween(Long value1, Long value2) {
            addCriterion("EMP_SER_RESUME_ID not between", value1, value2, "empSerResumeId");
            return (Criteria) this;
        }

        public Criteria andEmpJobIsNull() {
            addCriterion("EMP_JOB is null");
            return (Criteria) this;
        }

        public Criteria andEmpJobIsNotNull() {
            addCriterion("EMP_JOB is not null");
            return (Criteria) this;
        }

        public Criteria andEmpJobEqualTo(String value) {
            addCriterion("EMP_JOB =", value, "empJob");
            return (Criteria) this;
        }

        public Criteria andEmpJobNotEqualTo(String value) {
            addCriterion("EMP_JOB <>", value, "empJob");
            return (Criteria) this;
        }

        public Criteria andEmpJobGreaterThan(String value) {
            addCriterion("EMP_JOB >", value, "empJob");
            return (Criteria) this;
        }

        public Criteria andEmpJobGreaterThanOrEqualTo(String value) {
            addCriterion("EMP_JOB >=", value, "empJob");
            return (Criteria) this;
        }

        public Criteria andEmpJobLessThan(String value) {
            addCriterion("EMP_JOB <", value, "empJob");
            return (Criteria) this;
        }

        public Criteria andEmpJobLessThanOrEqualTo(String value) {
            addCriterion("EMP_JOB <=", value, "empJob");
            return (Criteria) this;
        }

        public Criteria andEmpJobLike(String value) {
            addCriterion("EMP_JOB like", value, "empJob");
            return (Criteria) this;
        }

        public Criteria andEmpJobNotLike(String value) {
            addCriterion("EMP_JOB not like", value, "empJob");
            return (Criteria) this;
        }

        public Criteria andEmpJobIn(List<String> values) {
            addCriterion("EMP_JOB in", values, "empJob");
            return (Criteria) this;
        }

        public Criteria andEmpJobNotIn(List<String> values) {
            addCriterion("EMP_JOB not in", values, "empJob");
            return (Criteria) this;
        }

        public Criteria andEmpJobBetween(String value1, String value2) {
            addCriterion("EMP_JOB between", value1, value2, "empJob");
            return (Criteria) this;
        }

        public Criteria andEmpJobNotBetween(String value1, String value2) {
            addCriterion("EMP_JOB not between", value1, value2, "empJob");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentIsNull() {
            addCriterion("EMP_DEPARTMENT is null");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentIsNotNull() {
            addCriterion("EMP_DEPARTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentEqualTo(String value) {
            addCriterion("EMP_DEPARTMENT =", value, "empDepartment");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentNotEqualTo(String value) {
            addCriterion("EMP_DEPARTMENT <>", value, "empDepartment");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentGreaterThan(String value) {
            addCriterion("EMP_DEPARTMENT >", value, "empDepartment");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("EMP_DEPARTMENT >=", value, "empDepartment");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentLessThan(String value) {
            addCriterion("EMP_DEPARTMENT <", value, "empDepartment");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentLessThanOrEqualTo(String value) {
            addCriterion("EMP_DEPARTMENT <=", value, "empDepartment");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentLike(String value) {
            addCriterion("EMP_DEPARTMENT like", value, "empDepartment");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentNotLike(String value) {
            addCriterion("EMP_DEPARTMENT not like", value, "empDepartment");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentIn(List<String> values) {
            addCriterion("EMP_DEPARTMENT in", values, "empDepartment");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentNotIn(List<String> values) {
            addCriterion("EMP_DEPARTMENT not in", values, "empDepartment");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentBetween(String value1, String value2) {
            addCriterion("EMP_DEPARTMENT between", value1, value2, "empDepartment");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentNotBetween(String value1, String value2) {
            addCriterion("EMP_DEPARTMENT not between", value1, value2, "empDepartment");
            return (Criteria) this;
        }

        public Criteria andEmpDateIsNull() {
            addCriterion("EMP_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEmpDateIsNotNull() {
            addCriterion("EMP_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEmpDateEqualTo(String value) {
            addCriterion("EMP_DATE =", value, "empDate");
            return (Criteria) this;
        }

        public Criteria andEmpDateNotEqualTo(String value) {
            addCriterion("EMP_DATE <>", value, "empDate");
            return (Criteria) this;
        }

        public Criteria andEmpDateGreaterThan(String value) {
            addCriterion("EMP_DATE >", value, "empDate");
            return (Criteria) this;
        }

        public Criteria andEmpDateGreaterThanOrEqualTo(String value) {
            addCriterion("EMP_DATE >=", value, "empDate");
            return (Criteria) this;
        }

        public Criteria andEmpDateLessThan(String value) {
            addCriterion("EMP_DATE <", value, "empDate");
            return (Criteria) this;
        }

        public Criteria andEmpDateLessThanOrEqualTo(String value) {
            addCriterion("EMP_DATE <=", value, "empDate");
            return (Criteria) this;
        }

        public Criteria andEmpDateLike(String value) {
            addCriterion("EMP_DATE like", value, "empDate");
            return (Criteria) this;
        }

        public Criteria andEmpDateNotLike(String value) {
            addCriterion("EMP_DATE not like", value, "empDate");
            return (Criteria) this;
        }

        public Criteria andEmpDateIn(List<String> values) {
            addCriterion("EMP_DATE in", values, "empDate");
            return (Criteria) this;
        }

        public Criteria andEmpDateNotIn(List<String> values) {
            addCriterion("EMP_DATE not in", values, "empDate");
            return (Criteria) this;
        }

        public Criteria andEmpDateBetween(String value1, String value2) {
            addCriterion("EMP_DATE between", value1, value2, "empDate");
            return (Criteria) this;
        }

        public Criteria andEmpDateNotBetween(String value1, String value2) {
            addCriterion("EMP_DATE not between", value1, value2, "empDate");
            return (Criteria) this;
        }

        public Criteria andEmpJobIdIsNull() {
            addCriterion("EMP_JOB_ID is null");
            return (Criteria) this;
        }

        public Criteria andEmpJobIdIsNotNull() {
            addCriterion("EMP_JOB_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEmpJobIdEqualTo(Long value) {
            addCriterion("EMP_JOB_ID =", value, "empJobId");
            return (Criteria) this;
        }

        public Criteria andEmpJobIdNotEqualTo(Long value) {
            addCriterion("EMP_JOB_ID <>", value, "empJobId");
            return (Criteria) this;
        }

        public Criteria andEmpJobIdGreaterThan(Long value) {
            addCriterion("EMP_JOB_ID >", value, "empJobId");
            return (Criteria) this;
        }

        public Criteria andEmpJobIdGreaterThanOrEqualTo(Long value) {
            addCriterion("EMP_JOB_ID >=", value, "empJobId");
            return (Criteria) this;
        }

        public Criteria andEmpJobIdLessThan(Long value) {
            addCriterion("EMP_JOB_ID <", value, "empJobId");
            return (Criteria) this;
        }

        public Criteria andEmpJobIdLessThanOrEqualTo(Long value) {
            addCriterion("EMP_JOB_ID <=", value, "empJobId");
            return (Criteria) this;
        }

        public Criteria andEmpJobIdIn(List<Long> values) {
            addCriterion("EMP_JOB_ID in", values, "empJobId");
            return (Criteria) this;
        }

        public Criteria andEmpJobIdNotIn(List<Long> values) {
            addCriterion("EMP_JOB_ID not in", values, "empJobId");
            return (Criteria) this;
        }

        public Criteria andEmpJobIdBetween(Long value1, Long value2) {
            addCriterion("EMP_JOB_ID between", value1, value2, "empJobId");
            return (Criteria) this;
        }

        public Criteria andEmpJobIdNotBetween(Long value1, Long value2) {
            addCriterion("EMP_JOB_ID not between", value1, value2, "empJobId");
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