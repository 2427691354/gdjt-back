package com.lixing.siitep.entity;

import java.util.ArrayList;
import java.util.List;

public class TbWorkAttendanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbWorkAttendanceExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSNameIsNull() {
            addCriterion("s_name is null");
            return (Criteria) this;
        }

        public Criteria andSNameIsNotNull() {
            addCriterion("s_name is not null");
            return (Criteria) this;
        }

        public Criteria andSNameEqualTo(String value) {
            addCriterion("s_name =", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotEqualTo(String value) {
            addCriterion("s_name <>", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThan(String value) {
            addCriterion("s_name >", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThanOrEqualTo(String value) {
            addCriterion("s_name >=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThan(String value) {
            addCriterion("s_name <", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThanOrEqualTo(String value) {
            addCriterion("s_name <=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLike(String value) {
            addCriterion("s_name like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotLike(String value) {
            addCriterion("s_name not like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameIn(List<String> values) {
            addCriterion("s_name in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotIn(List<String> values) {
            addCriterion("s_name not in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameBetween(String value1, String value2) {
            addCriterion("s_name between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotBetween(String value1, String value2) {
            addCriterion("s_name not between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andCNameIsNull() {
            addCriterion("c_name is null");
            return (Criteria) this;
        }

        public Criteria andCNameIsNotNull() {
            addCriterion("c_name is not null");
            return (Criteria) this;
        }

        public Criteria andCNameEqualTo(String value) {
            addCriterion("c_name =", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotEqualTo(String value) {
            addCriterion("c_name <>", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThan(String value) {
            addCriterion("c_name >", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_name >=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThan(String value) {
            addCriterion("c_name <", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThanOrEqualTo(String value) {
            addCriterion("c_name <=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLike(String value) {
            addCriterion("c_name like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotLike(String value) {
            addCriterion("c_name not like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameIn(List<String> values) {
            addCriterion("c_name in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotIn(List<String> values) {
            addCriterion("c_name not in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameBetween(String value1, String value2) {
            addCriterion("c_name between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotBetween(String value1, String value2) {
            addCriterion("c_name not between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andHaveClassIsNull() {
            addCriterion("have_class is null");
            return (Criteria) this;
        }

        public Criteria andHaveClassIsNotNull() {
            addCriterion("have_class is not null");
            return (Criteria) this;
        }

        public Criteria andHaveClassEqualTo(Integer value) {
            addCriterion("have_class =", value, "haveClass");
            return (Criteria) this;
        }

        public Criteria andHaveClassNotEqualTo(Integer value) {
            addCriterion("have_class <>", value, "haveClass");
            return (Criteria) this;
        }

        public Criteria andHaveClassGreaterThan(Integer value) {
            addCriterion("have_class >", value, "haveClass");
            return (Criteria) this;
        }

        public Criteria andHaveClassGreaterThanOrEqualTo(Integer value) {
            addCriterion("have_class >=", value, "haveClass");
            return (Criteria) this;
        }

        public Criteria andHaveClassLessThan(Integer value) {
            addCriterion("have_class <", value, "haveClass");
            return (Criteria) this;
        }

        public Criteria andHaveClassLessThanOrEqualTo(Integer value) {
            addCriterion("have_class <=", value, "haveClass");
            return (Criteria) this;
        }

        public Criteria andHaveClassIn(List<Integer> values) {
            addCriterion("have_class in", values, "haveClass");
            return (Criteria) this;
        }

        public Criteria andHaveClassNotIn(List<Integer> values) {
            addCriterion("have_class not in", values, "haveClass");
            return (Criteria) this;
        }

        public Criteria andHaveClassBetween(Integer value1, Integer value2) {
            addCriterion("have_class between", value1, value2, "haveClass");
            return (Criteria) this;
        }

        public Criteria andHaveClassNotBetween(Integer value1, Integer value2) {
            addCriterion("have_class not between", value1, value2, "haveClass");
            return (Criteria) this;
        }

        public Criteria andHaveLateIsNull() {
            addCriterion("have_late is null");
            return (Criteria) this;
        }

        public Criteria andHaveLateIsNotNull() {
            addCriterion("have_late is not null");
            return (Criteria) this;
        }

        public Criteria andHaveLateEqualTo(Integer value) {
            addCriterion("have_late =", value, "haveLate");
            return (Criteria) this;
        }

        public Criteria andHaveLateNotEqualTo(Integer value) {
            addCriterion("have_late <>", value, "haveLate");
            return (Criteria) this;
        }

        public Criteria andHaveLateGreaterThan(Integer value) {
            addCriterion("have_late >", value, "haveLate");
            return (Criteria) this;
        }

        public Criteria andHaveLateGreaterThanOrEqualTo(Integer value) {
            addCriterion("have_late >=", value, "haveLate");
            return (Criteria) this;
        }

        public Criteria andHaveLateLessThan(Integer value) {
            addCriterion("have_late <", value, "haveLate");
            return (Criteria) this;
        }

        public Criteria andHaveLateLessThanOrEqualTo(Integer value) {
            addCriterion("have_late <=", value, "haveLate");
            return (Criteria) this;
        }

        public Criteria andHaveLateIn(List<Integer> values) {
            addCriterion("have_late in", values, "haveLate");
            return (Criteria) this;
        }

        public Criteria andHaveLateNotIn(List<Integer> values) {
            addCriterion("have_late not in", values, "haveLate");
            return (Criteria) this;
        }

        public Criteria andHaveLateBetween(Integer value1, Integer value2) {
            addCriterion("have_late between", value1, value2, "haveLate");
            return (Criteria) this;
        }

        public Criteria andHaveLateNotBetween(Integer value1, Integer value2) {
            addCriterion("have_late not between", value1, value2, "haveLate");
            return (Criteria) this;
        }

        public Criteria andHaveAbsentIsNull() {
            addCriterion("have_absent is null");
            return (Criteria) this;
        }

        public Criteria andHaveAbsentIsNotNull() {
            addCriterion("have_absent is not null");
            return (Criteria) this;
        }

        public Criteria andHaveAbsentEqualTo(Integer value) {
            addCriterion("have_absent =", value, "haveAbsent");
            return (Criteria) this;
        }

        public Criteria andHaveAbsentNotEqualTo(Integer value) {
            addCriterion("have_absent <>", value, "haveAbsent");
            return (Criteria) this;
        }

        public Criteria andHaveAbsentGreaterThan(Integer value) {
            addCriterion("have_absent >", value, "haveAbsent");
            return (Criteria) this;
        }

        public Criteria andHaveAbsentGreaterThanOrEqualTo(Integer value) {
            addCriterion("have_absent >=", value, "haveAbsent");
            return (Criteria) this;
        }

        public Criteria andHaveAbsentLessThan(Integer value) {
            addCriterion("have_absent <", value, "haveAbsent");
            return (Criteria) this;
        }

        public Criteria andHaveAbsentLessThanOrEqualTo(Integer value) {
            addCriterion("have_absent <=", value, "haveAbsent");
            return (Criteria) this;
        }

        public Criteria andHaveAbsentIn(List<Integer> values) {
            addCriterion("have_absent in", values, "haveAbsent");
            return (Criteria) this;
        }

        public Criteria andHaveAbsentNotIn(List<Integer> values) {
            addCriterion("have_absent not in", values, "haveAbsent");
            return (Criteria) this;
        }

        public Criteria andHaveAbsentBetween(Integer value1, Integer value2) {
            addCriterion("have_absent between", value1, value2, "haveAbsent");
            return (Criteria) this;
        }

        public Criteria andHaveAbsentNotBetween(Integer value1, Integer value2) {
            addCriterion("have_absent not between", value1, value2, "haveAbsent");
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