package com.example.gdjtback.entity;

import java.util.ArrayList;
import java.util.List;

public class StationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StationExample() {
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

        public Criteria andStationidIsNull() {
            addCriterion("stationID is null");
            return (Criteria) this;
        }

        public Criteria andStationidIsNotNull() {
            addCriterion("stationID is not null");
            return (Criteria) this;
        }

        public Criteria andStationidEqualTo(String value) {
            addCriterion("stationID =", value, "stationid");
            return (Criteria) this;
        }

        public Criteria andStationidNotEqualTo(String value) {
            addCriterion("stationID <>", value, "stationid");
            return (Criteria) this;
        }

        public Criteria andStationidGreaterThan(String value) {
            addCriterion("stationID >", value, "stationid");
            return (Criteria) this;
        }

        public Criteria andStationidGreaterThanOrEqualTo(String value) {
            addCriterion("stationID >=", value, "stationid");
            return (Criteria) this;
        }

        public Criteria andStationidLessThan(String value) {
            addCriterion("stationID <", value, "stationid");
            return (Criteria) this;
        }

        public Criteria andStationidLessThanOrEqualTo(String value) {
            addCriterion("stationID <=", value, "stationid");
            return (Criteria) this;
        }

        public Criteria andStationidLike(String value) {
            addCriterion("stationID like", value, "stationid");
            return (Criteria) this;
        }

        public Criteria andStationidNotLike(String value) {
            addCriterion("stationID not like", value, "stationid");
            return (Criteria) this;
        }

        public Criteria andStationidIn(List<String> values) {
            addCriterion("stationID in", values, "stationid");
            return (Criteria) this;
        }

        public Criteria andStationidNotIn(List<String> values) {
            addCriterion("stationID not in", values, "stationid");
            return (Criteria) this;
        }

        public Criteria andStationidBetween(String value1, String value2) {
            addCriterion("stationID between", value1, value2, "stationid");
            return (Criteria) this;
        }

        public Criteria andStationidNotBetween(String value1, String value2) {
            addCriterion("stationID not between", value1, value2, "stationid");
            return (Criteria) this;
        }

        public Criteria andStationnameIsNull() {
            addCriterion("stationName is null");
            return (Criteria) this;
        }

        public Criteria andStationnameIsNotNull() {
            addCriterion("stationName is not null");
            return (Criteria) this;
        }

        public Criteria andStationnameEqualTo(String value) {
            addCriterion("stationName =", value, "stationname");
            return (Criteria) this;
        }

        public Criteria andStationnameNotEqualTo(String value) {
            addCriterion("stationName <>", value, "stationname");
            return (Criteria) this;
        }

        public Criteria andStationnameGreaterThan(String value) {
            addCriterion("stationName >", value, "stationname");
            return (Criteria) this;
        }

        public Criteria andStationnameGreaterThanOrEqualTo(String value) {
            addCriterion("stationName >=", value, "stationname");
            return (Criteria) this;
        }

        public Criteria andStationnameLessThan(String value) {
            addCriterion("stationName <", value, "stationname");
            return (Criteria) this;
        }

        public Criteria andStationnameLessThanOrEqualTo(String value) {
            addCriterion("stationName <=", value, "stationname");
            return (Criteria) this;
        }

        public Criteria andStationnameLike(String value) {
            addCriterion("stationName like", value, "stationname");
            return (Criteria) this;
        }

        public Criteria andStationnameNotLike(String value) {
            addCriterion("stationName not like", value, "stationname");
            return (Criteria) this;
        }

        public Criteria andStationnameIn(List<String> values) {
            addCriterion("stationName in", values, "stationname");
            return (Criteria) this;
        }

        public Criteria andStationnameNotIn(List<String> values) {
            addCriterion("stationName not in", values, "stationname");
            return (Criteria) this;
        }

        public Criteria andStationnameBetween(String value1, String value2) {
            addCriterion("stationName between", value1, value2, "stationname");
            return (Criteria) this;
        }

        public Criteria andStationnameNotBetween(String value1, String value2) {
            addCriterion("stationName not between", value1, value2, "stationname");
            return (Criteria) this;
        }

        public Criteria andLineidIsNull() {
            addCriterion("lineID is null");
            return (Criteria) this;
        }

        public Criteria andLineidIsNotNull() {
            addCriterion("lineID is not null");
            return (Criteria) this;
        }

        public Criteria andLineidEqualTo(String value) {
            addCriterion("lineID =", value, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidNotEqualTo(String value) {
            addCriterion("lineID <>", value, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidGreaterThan(String value) {
            addCriterion("lineID >", value, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidGreaterThanOrEqualTo(String value) {
            addCriterion("lineID >=", value, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidLessThan(String value) {
            addCriterion("lineID <", value, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidLessThanOrEqualTo(String value) {
            addCriterion("lineID <=", value, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidLike(String value) {
            addCriterion("lineID like", value, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidNotLike(String value) {
            addCriterion("lineID not like", value, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidIn(List<String> values) {
            addCriterion("lineID in", values, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidNotIn(List<String> values) {
            addCriterion("lineID not in", values, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidBetween(String value1, String value2) {
            addCriterion("lineID between", value1, value2, "lineid");
            return (Criteria) this;
        }

        public Criteria andLineidNotBetween(String value1, String value2) {
            addCriterion("lineID not between", value1, value2, "lineid");
            return (Criteria) this;
        }

        public Criteria andDlongitudeIsNull() {
            addCriterion("dLongitude is null");
            return (Criteria) this;
        }

        public Criteria andDlongitudeIsNotNull() {
            addCriterion("dLongitude is not null");
            return (Criteria) this;
        }

        public Criteria andDlongitudeEqualTo(Long value) {
            addCriterion("dLongitude =", value, "dlongitude");
            return (Criteria) this;
        }

        public Criteria andDlongitudeNotEqualTo(Long value) {
            addCriterion("dLongitude <>", value, "dlongitude");
            return (Criteria) this;
        }

        public Criteria andDlongitudeGreaterThan(Long value) {
            addCriterion("dLongitude >", value, "dlongitude");
            return (Criteria) this;
        }

        public Criteria andDlongitudeGreaterThanOrEqualTo(Long value) {
            addCriterion("dLongitude >=", value, "dlongitude");
            return (Criteria) this;
        }

        public Criteria andDlongitudeLessThan(Long value) {
            addCriterion("dLongitude <", value, "dlongitude");
            return (Criteria) this;
        }

        public Criteria andDlongitudeLessThanOrEqualTo(Long value) {
            addCriterion("dLongitude <=", value, "dlongitude");
            return (Criteria) this;
        }

        public Criteria andDlongitudeIn(List<Long> values) {
            addCriterion("dLongitude in", values, "dlongitude");
            return (Criteria) this;
        }

        public Criteria andDlongitudeNotIn(List<Long> values) {
            addCriterion("dLongitude not in", values, "dlongitude");
            return (Criteria) this;
        }

        public Criteria andDlongitudeBetween(Long value1, Long value2) {
            addCriterion("dLongitude between", value1, value2, "dlongitude");
            return (Criteria) this;
        }

        public Criteria andDlongitudeNotBetween(Long value1, Long value2) {
            addCriterion("dLongitude not between", value1, value2, "dlongitude");
            return (Criteria) this;
        }

        public Criteria andDlatitudeIsNull() {
            addCriterion("dLatitude is null");
            return (Criteria) this;
        }

        public Criteria andDlatitudeIsNotNull() {
            addCriterion("dLatitude is not null");
            return (Criteria) this;
        }

        public Criteria andDlatitudeEqualTo(Long value) {
            addCriterion("dLatitude =", value, "dlatitude");
            return (Criteria) this;
        }

        public Criteria andDlatitudeNotEqualTo(Long value) {
            addCriterion("dLatitude <>", value, "dlatitude");
            return (Criteria) this;
        }

        public Criteria andDlatitudeGreaterThan(Long value) {
            addCriterion("dLatitude >", value, "dlatitude");
            return (Criteria) this;
        }

        public Criteria andDlatitudeGreaterThanOrEqualTo(Long value) {
            addCriterion("dLatitude >=", value, "dlatitude");
            return (Criteria) this;
        }

        public Criteria andDlatitudeLessThan(Long value) {
            addCriterion("dLatitude <", value, "dlatitude");
            return (Criteria) this;
        }

        public Criteria andDlatitudeLessThanOrEqualTo(Long value) {
            addCriterion("dLatitude <=", value, "dlatitude");
            return (Criteria) this;
        }

        public Criteria andDlatitudeIn(List<Long> values) {
            addCriterion("dLatitude in", values, "dlatitude");
            return (Criteria) this;
        }

        public Criteria andDlatitudeNotIn(List<Long> values) {
            addCriterion("dLatitude not in", values, "dlatitude");
            return (Criteria) this;
        }

        public Criteria andDlatitudeBetween(Long value1, Long value2) {
            addCriterion("dLatitude between", value1, value2, "dlatitude");
            return (Criteria) this;
        }

        public Criteria andDlatitudeNotBetween(Long value1, Long value2) {
            addCriterion("dLatitude not between", value1, value2, "dlatitude");
            return (Criteria) this;
        }

        public Criteria andDeleteflagIsNull() {
            addCriterion("deleteFlag is null");
            return (Criteria) this;
        }

        public Criteria andDeleteflagIsNotNull() {
            addCriterion("deleteFlag is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteflagEqualTo(Integer value) {
            addCriterion("deleteFlag =", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagNotEqualTo(Integer value) {
            addCriterion("deleteFlag <>", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagGreaterThan(Integer value) {
            addCriterion("deleteFlag >", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("deleteFlag >=", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagLessThan(Integer value) {
            addCriterion("deleteFlag <", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagLessThanOrEqualTo(Integer value) {
            addCriterion("deleteFlag <=", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagIn(List<Integer> values) {
            addCriterion("deleteFlag in", values, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagNotIn(List<Integer> values) {
            addCriterion("deleteFlag not in", values, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagBetween(Integer value1, Integer value2) {
            addCriterion("deleteFlag between", value1, value2, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagNotBetween(Integer value1, Integer value2) {
            addCriterion("deleteFlag not between", value1, value2, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
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