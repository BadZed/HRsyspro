package com.wk.pojo;

import java.util.ArrayList;
import java.util.Date;
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

        public Criteria andAdNameIsNull() {
            addCriterion("AD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAdNameIsNotNull() {
            addCriterion("AD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAdNameEqualTo(String value) {
            addCriterion("AD_NAME =", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameNotEqualTo(String value) {
            addCriterion("AD_NAME <>", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameGreaterThan(String value) {
            addCriterion("AD_NAME >", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameGreaterThanOrEqualTo(String value) {
            addCriterion("AD_NAME >=", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameLessThan(String value) {
            addCriterion("AD_NAME <", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameLessThanOrEqualTo(String value) {
            addCriterion("AD_NAME <=", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameLike(String value) {
            addCriterion("AD_NAME like", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameNotLike(String value) {
            addCriterion("AD_NAME not like", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameIn(List<String> values) {
            addCriterion("AD_NAME in", values, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameNotIn(List<String> values) {
            addCriterion("AD_NAME not in", values, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameBetween(String value1, String value2) {
            addCriterion("AD_NAME between", value1, value2, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameNotBetween(String value1, String value2) {
            addCriterion("AD_NAME not between", value1, value2, "adName");
            return (Criteria) this;
        }

        public Criteria andAdSexIsNull() {
            addCriterion("AD_SEX is null");
            return (Criteria) this;
        }

        public Criteria andAdSexIsNotNull() {
            addCriterion("AD_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andAdSexEqualTo(String value) {
            addCriterion("AD_SEX =", value, "adSex");
            return (Criteria) this;
        }

        public Criteria andAdSexNotEqualTo(String value) {
            addCriterion("AD_SEX <>", value, "adSex");
            return (Criteria) this;
        }

        public Criteria andAdSexGreaterThan(String value) {
            addCriterion("AD_SEX >", value, "adSex");
            return (Criteria) this;
        }

        public Criteria andAdSexGreaterThanOrEqualTo(String value) {
            addCriterion("AD_SEX >=", value, "adSex");
            return (Criteria) this;
        }

        public Criteria andAdSexLessThan(String value) {
            addCriterion("AD_SEX <", value, "adSex");
            return (Criteria) this;
        }

        public Criteria andAdSexLessThanOrEqualTo(String value) {
            addCriterion("AD_SEX <=", value, "adSex");
            return (Criteria) this;
        }

        public Criteria andAdSexLike(String value) {
            addCriterion("AD_SEX like", value, "adSex");
            return (Criteria) this;
        }

        public Criteria andAdSexNotLike(String value) {
            addCriterion("AD_SEX not like", value, "adSex");
            return (Criteria) this;
        }

        public Criteria andAdSexIn(List<String> values) {
            addCriterion("AD_SEX in", values, "adSex");
            return (Criteria) this;
        }

        public Criteria andAdSexNotIn(List<String> values) {
            addCriterion("AD_SEX not in", values, "adSex");
            return (Criteria) this;
        }

        public Criteria andAdSexBetween(String value1, String value2) {
            addCriterion("AD_SEX between", value1, value2, "adSex");
            return (Criteria) this;
        }

        public Criteria andAdSexNotBetween(String value1, String value2) {
            addCriterion("AD_SEX not between", value1, value2, "adSex");
            return (Criteria) this;
        }

        public Criteria andAdBirthIsNull() {
            addCriterion("AD_BIRTH is null");
            return (Criteria) this;
        }

        public Criteria andAdBirthIsNotNull() {
            addCriterion("AD_BIRTH is not null");
            return (Criteria) this;
        }

        public Criteria andAdBirthEqualTo(Date value) {
            addCriterion("AD_BIRTH =", value, "adBirth");
            return (Criteria) this;
        }

        public Criteria andAdBirthNotEqualTo(Date value) {
            addCriterion("AD_BIRTH <>", value, "adBirth");
            return (Criteria) this;
        }

        public Criteria andAdBirthGreaterThan(Date value) {
            addCriterion("AD_BIRTH >", value, "adBirth");
            return (Criteria) this;
        }

        public Criteria andAdBirthGreaterThanOrEqualTo(Date value) {
            addCriterion("AD_BIRTH >=", value, "adBirth");
            return (Criteria) this;
        }

        public Criteria andAdBirthLessThan(Date value) {
            addCriterion("AD_BIRTH <", value, "adBirth");
            return (Criteria) this;
        }

        public Criteria andAdBirthLessThanOrEqualTo(Date value) {
            addCriterion("AD_BIRTH <=", value, "adBirth");
            return (Criteria) this;
        }

        public Criteria andAdBirthIn(List<Date> values) {
            addCriterion("AD_BIRTH in", values, "adBirth");
            return (Criteria) this;
        }

        public Criteria andAdBirthNotIn(List<Date> values) {
            addCriterion("AD_BIRTH not in", values, "adBirth");
            return (Criteria) this;
        }

        public Criteria andAdBirthBetween(Date value1, Date value2) {
            addCriterion("AD_BIRTH between", value1, value2, "adBirth");
            return (Criteria) this;
        }

        public Criteria andAdBirthNotBetween(Date value1, Date value2) {
            addCriterion("AD_BIRTH not between", value1, value2, "adBirth");
            return (Criteria) this;
        }

        public Criteria andAdPhoneIsNull() {
            addCriterion("AD_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andAdPhoneIsNotNull() {
            addCriterion("AD_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andAdPhoneEqualTo(String value) {
            addCriterion("AD_PHONE =", value, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdPhoneNotEqualTo(String value) {
            addCriterion("AD_PHONE <>", value, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdPhoneGreaterThan(String value) {
            addCriterion("AD_PHONE >", value, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("AD_PHONE >=", value, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdPhoneLessThan(String value) {
            addCriterion("AD_PHONE <", value, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdPhoneLessThanOrEqualTo(String value) {
            addCriterion("AD_PHONE <=", value, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdPhoneLike(String value) {
            addCriterion("AD_PHONE like", value, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdPhoneNotLike(String value) {
            addCriterion("AD_PHONE not like", value, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdPhoneIn(List<String> values) {
            addCriterion("AD_PHONE in", values, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdPhoneNotIn(List<String> values) {
            addCriterion("AD_PHONE not in", values, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdPhoneBetween(String value1, String value2) {
            addCriterion("AD_PHONE between", value1, value2, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdPhoneNotBetween(String value1, String value2) {
            addCriterion("AD_PHONE not between", value1, value2, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdEmailIsNull() {
            addCriterion("AD_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andAdEmailIsNotNull() {
            addCriterion("AD_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andAdEmailEqualTo(String value) {
            addCriterion("AD_EMAIL =", value, "adEmail");
            return (Criteria) this;
        }

        public Criteria andAdEmailNotEqualTo(String value) {
            addCriterion("AD_EMAIL <>", value, "adEmail");
            return (Criteria) this;
        }

        public Criteria andAdEmailGreaterThan(String value) {
            addCriterion("AD_EMAIL >", value, "adEmail");
            return (Criteria) this;
        }

        public Criteria andAdEmailGreaterThanOrEqualTo(String value) {
            addCriterion("AD_EMAIL >=", value, "adEmail");
            return (Criteria) this;
        }

        public Criteria andAdEmailLessThan(String value) {
            addCriterion("AD_EMAIL <", value, "adEmail");
            return (Criteria) this;
        }

        public Criteria andAdEmailLessThanOrEqualTo(String value) {
            addCriterion("AD_EMAIL <=", value, "adEmail");
            return (Criteria) this;
        }

        public Criteria andAdEmailLike(String value) {
            addCriterion("AD_EMAIL like", value, "adEmail");
            return (Criteria) this;
        }

        public Criteria andAdEmailNotLike(String value) {
            addCriterion("AD_EMAIL not like", value, "adEmail");
            return (Criteria) this;
        }

        public Criteria andAdEmailIn(List<String> values) {
            addCriterion("AD_EMAIL in", values, "adEmail");
            return (Criteria) this;
        }

        public Criteria andAdEmailNotIn(List<String> values) {
            addCriterion("AD_EMAIL not in", values, "adEmail");
            return (Criteria) this;
        }

        public Criteria andAdEmailBetween(String value1, String value2) {
            addCriterion("AD_EMAIL between", value1, value2, "adEmail");
            return (Criteria) this;
        }

        public Criteria andAdEmailNotBetween(String value1, String value2) {
            addCriterion("AD_EMAIL not between", value1, value2, "adEmail");
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