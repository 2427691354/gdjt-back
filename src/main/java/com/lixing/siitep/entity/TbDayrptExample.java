package com.lixing.siitep.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbDayrptExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_dayrpt
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_dayrpt
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_dayrpt
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_dayrpt
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
    public TbDayrptExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_dayrpt
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_dayrpt
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_dayrpt
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_dayrpt
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_dayrpt
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_dayrpt
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_dayrpt
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_dayrpt
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_dayrpt
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_dayrpt
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_dayrpt
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
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

        public Criteria andSIdIsNull() {
            addCriterion("s_id is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("s_id is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(String value) {
            addCriterion("s_id =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(String value) {
            addCriterion("s_id <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(String value) {
            addCriterion("s_id >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(String value) {
            addCriterion("s_id >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(String value) {
            addCriterion("s_id <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(String value) {
            addCriterion("s_id <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLike(String value) {
            addCriterion("s_id like", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotLike(String value) {
            addCriterion("s_id not like", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<String> values) {
            addCriterion("s_id in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<String> values) {
            addCriterion("s_id not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(String value1, String value2) {
            addCriterion("s_id between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(String value1, String value2) {
            addCriterion("s_id not between", value1, value2, "sId");
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

        public Criteria andDeptNameIsNull() {
            addCriterion("dept_name is null");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNotNull() {
            addCriterion("dept_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeptNameEqualTo(String value) {
            addCriterion("dept_name =", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotEqualTo(String value) {
            addCriterion("dept_name <>", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThan(String value) {
            addCriterion("dept_name >", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThanOrEqualTo(String value) {
            addCriterion("dept_name >=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThan(String value) {
            addCriterion("dept_name <", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThanOrEqualTo(String value) {
            addCriterion("dept_name <=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLike(String value) {
            addCriterion("dept_name like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotLike(String value) {
            addCriterion("dept_name not like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameIn(List<String> values) {
            addCriterion("dept_name in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotIn(List<String> values) {
            addCriterion("dept_name not in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameBetween(String value1, String value2) {
            addCriterion("dept_name between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotBetween(String value1, String value2) {
            addCriterion("dept_name not between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNull() {
            addCriterion("temperature is null");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNotNull() {
            addCriterion("temperature is not null");
            return (Criteria) this;
        }

        public Criteria andTemperatureEqualTo(Float value) {
            addCriterion("temperature =", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotEqualTo(Float value) {
            addCriterion("temperature <>", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThan(Float value) {
            addCriterion("temperature >", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThanOrEqualTo(Float value) {
            addCriterion("temperature >=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThan(Float value) {
            addCriterion("temperature <", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThanOrEqualTo(Float value) {
            addCriterion("temperature <=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureIn(List<Float> values) {
            addCriterion("temperature in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotIn(List<Float> values) {
            addCriterion("temperature not in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureBetween(Float value1, Float value2) {
            addCriterion("temperature between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotBetween(Float value1, Float value2) {
            addCriterion("temperature not between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andIsContactIsNull() {
            addCriterion("is_contact is null");
            return (Criteria) this;
        }

        public Criteria andIsContactIsNotNull() {
            addCriterion("is_contact is not null");
            return (Criteria) this;
        }

        public Criteria andIsContactEqualTo(Integer value) {
            addCriterion("is_contact =", value, "isContact");
            return (Criteria) this;
        }

        public Criteria andIsContactNotEqualTo(Integer value) {
            addCriterion("is_contact <>", value, "isContact");
            return (Criteria) this;
        }

        public Criteria andIsContactGreaterThan(Integer value) {
            addCriterion("is_contact >", value, "isContact");
            return (Criteria) this;
        }

        public Criteria andIsContactGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_contact >=", value, "isContact");
            return (Criteria) this;
        }

        public Criteria andIsContactLessThan(Integer value) {
            addCriterion("is_contact <", value, "isContact");
            return (Criteria) this;
        }

        public Criteria andIsContactLessThanOrEqualTo(Integer value) {
            addCriterion("is_contact <=", value, "isContact");
            return (Criteria) this;
        }

        public Criteria andIsContactIn(List<Integer> values) {
            addCriterion("is_contact in", values, "isContact");
            return (Criteria) this;
        }

        public Criteria andIsContactNotIn(List<Integer> values) {
            addCriterion("is_contact not in", values, "isContact");
            return (Criteria) this;
        }

        public Criteria andIsContactBetween(Integer value1, Integer value2) {
            addCriterion("is_contact between", value1, value2, "isContact");
            return (Criteria) this;
        }

        public Criteria andIsContactNotBetween(Integer value1, Integer value2) {
            addCriterion("is_contact not between", value1, value2, "isContact");
            return (Criteria) this;
        }

        public Criteria andIsPassIsNull() {
            addCriterion("is_pass is null");
            return (Criteria) this;
        }

        public Criteria andIsPassIsNotNull() {
            addCriterion("is_pass is not null");
            return (Criteria) this;
        }

        public Criteria andIsPassEqualTo(Integer value) {
            addCriterion("is_pass =", value, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassNotEqualTo(Integer value) {
            addCriterion("is_pass <>", value, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassGreaterThan(Integer value) {
            addCriterion("is_pass >", value, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_pass >=", value, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassLessThan(Integer value) {
            addCriterion("is_pass <", value, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassLessThanOrEqualTo(Integer value) {
            addCriterion("is_pass <=", value, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassIn(List<Integer> values) {
            addCriterion("is_pass in", values, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassNotIn(List<Integer> values) {
            addCriterion("is_pass not in", values, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassBetween(Integer value1, Integer value2) {
            addCriterion("is_pass between", value1, value2, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassNotBetween(Integer value1, Integer value2) {
            addCriterion("is_pass not between", value1, value2, "isPass");
            return (Criteria) this;
        }

        public Criteria andLocationProvinceIsNull() {
            addCriterion("location_province is null");
            return (Criteria) this;
        }

        public Criteria andLocationProvinceIsNotNull() {
            addCriterion("location_province is not null");
            return (Criteria) this;
        }

        public Criteria andLocationProvinceEqualTo(String value) {
            addCriterion("location_province =", value, "locationProvince");
            return (Criteria) this;
        }

        public Criteria andLocationProvinceNotEqualTo(String value) {
            addCriterion("location_province <>", value, "locationProvince");
            return (Criteria) this;
        }

        public Criteria andLocationProvinceGreaterThan(String value) {
            addCriterion("location_province >", value, "locationProvince");
            return (Criteria) this;
        }

        public Criteria andLocationProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("location_province >=", value, "locationProvince");
            return (Criteria) this;
        }

        public Criteria andLocationProvinceLessThan(String value) {
            addCriterion("location_province <", value, "locationProvince");
            return (Criteria) this;
        }

        public Criteria andLocationProvinceLessThanOrEqualTo(String value) {
            addCriterion("location_province <=", value, "locationProvince");
            return (Criteria) this;
        }

        public Criteria andLocationProvinceLike(String value) {
            addCriterion("location_province like", value, "locationProvince");
            return (Criteria) this;
        }

        public Criteria andLocationProvinceNotLike(String value) {
            addCriterion("location_province not like", value, "locationProvince");
            return (Criteria) this;
        }

        public Criteria andLocationProvinceIn(List<String> values) {
            addCriterion("location_province in", values, "locationProvince");
            return (Criteria) this;
        }

        public Criteria andLocationProvinceNotIn(List<String> values) {
            addCriterion("location_province not in", values, "locationProvince");
            return (Criteria) this;
        }

        public Criteria andLocationProvinceBetween(String value1, String value2) {
            addCriterion("location_province between", value1, value2, "locationProvince");
            return (Criteria) this;
        }

        public Criteria andLocationProvinceNotBetween(String value1, String value2) {
            addCriterion("location_province not between", value1, value2, "locationProvince");
            return (Criteria) this;
        }

        public Criteria andLocationCityIsNull() {
            addCriterion("location_city is null");
            return (Criteria) this;
        }

        public Criteria andLocationCityIsNotNull() {
            addCriterion("location_city is not null");
            return (Criteria) this;
        }

        public Criteria andLocationCityEqualTo(String value) {
            addCriterion("location_city =", value, "locationCity");
            return (Criteria) this;
        }

        public Criteria andLocationCityNotEqualTo(String value) {
            addCriterion("location_city <>", value, "locationCity");
            return (Criteria) this;
        }

        public Criteria andLocationCityGreaterThan(String value) {
            addCriterion("location_city >", value, "locationCity");
            return (Criteria) this;
        }

        public Criteria andLocationCityGreaterThanOrEqualTo(String value) {
            addCriterion("location_city >=", value, "locationCity");
            return (Criteria) this;
        }

        public Criteria andLocationCityLessThan(String value) {
            addCriterion("location_city <", value, "locationCity");
            return (Criteria) this;
        }

        public Criteria andLocationCityLessThanOrEqualTo(String value) {
            addCriterion("location_city <=", value, "locationCity");
            return (Criteria) this;
        }

        public Criteria andLocationCityLike(String value) {
            addCriterion("location_city like", value, "locationCity");
            return (Criteria) this;
        }

        public Criteria andLocationCityNotLike(String value) {
            addCriterion("location_city not like", value, "locationCity");
            return (Criteria) this;
        }

        public Criteria andLocationCityIn(List<String> values) {
            addCriterion("location_city in", values, "locationCity");
            return (Criteria) this;
        }

        public Criteria andLocationCityNotIn(List<String> values) {
            addCriterion("location_city not in", values, "locationCity");
            return (Criteria) this;
        }

        public Criteria andLocationCityBetween(String value1, String value2) {
            addCriterion("location_city between", value1, value2, "locationCity");
            return (Criteria) this;
        }

        public Criteria andLocationCityNotBetween(String value1, String value2) {
            addCriterion("location_city not between", value1, value2, "locationCity");
            return (Criteria) this;
        }

        public Criteria andIsIsolatedIsNull() {
            addCriterion("is_isolated is null");
            return (Criteria) this;
        }

        public Criteria andIsIsolatedIsNotNull() {
            addCriterion("is_isolated is not null");
            return (Criteria) this;
        }

        public Criteria andIsIsolatedEqualTo(Integer value) {
            addCriterion("is_isolated =", value, "isIsolated");
            return (Criteria) this;
        }

        public Criteria andIsIsolatedNotEqualTo(Integer value) {
            addCriterion("is_isolated <>", value, "isIsolated");
            return (Criteria) this;
        }

        public Criteria andIsIsolatedGreaterThan(Integer value) {
            addCriterion("is_isolated >", value, "isIsolated");
            return (Criteria) this;
        }

        public Criteria andIsIsolatedGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_isolated >=", value, "isIsolated");
            return (Criteria) this;
        }

        public Criteria andIsIsolatedLessThan(Integer value) {
            addCriterion("is_isolated <", value, "isIsolated");
            return (Criteria) this;
        }

        public Criteria andIsIsolatedLessThanOrEqualTo(Integer value) {
            addCriterion("is_isolated <=", value, "isIsolated");
            return (Criteria) this;
        }

        public Criteria andIsIsolatedIn(List<Integer> values) {
            addCriterion("is_isolated in", values, "isIsolated");
            return (Criteria) this;
        }

        public Criteria andIsIsolatedNotIn(List<Integer> values) {
            addCriterion("is_isolated not in", values, "isIsolated");
            return (Criteria) this;
        }

        public Criteria andIsIsolatedBetween(Integer value1, Integer value2) {
            addCriterion("is_isolated between", value1, value2, "isIsolated");
            return (Criteria) this;
        }

        public Criteria andIsIsolatedNotBetween(Integer value1, Integer value2) {
            addCriterion("is_isolated not between", value1, value2, "isIsolated");
            return (Criteria) this;
        }

        public Criteria andQuarantineIsNull() {
            addCriterion("quarantine is null");
            return (Criteria) this;
        }

        public Criteria andQuarantineIsNotNull() {
            addCriterion("quarantine is not null");
            return (Criteria) this;
        }

        public Criteria andQuarantineEqualTo(Integer value) {
            addCriterion("quarantine =", value, "quarantine");
            return (Criteria) this;
        }

        public Criteria andQuarantineNotEqualTo(Integer value) {
            addCriterion("quarantine <>", value, "quarantine");
            return (Criteria) this;
        }

        public Criteria andQuarantineGreaterThan(Integer value) {
            addCriterion("quarantine >", value, "quarantine");
            return (Criteria) this;
        }

        public Criteria andQuarantineGreaterThanOrEqualTo(Integer value) {
            addCriterion("quarantine >=", value, "quarantine");
            return (Criteria) this;
        }

        public Criteria andQuarantineLessThan(Integer value) {
            addCriterion("quarantine <", value, "quarantine");
            return (Criteria) this;
        }

        public Criteria andQuarantineLessThanOrEqualTo(Integer value) {
            addCriterion("quarantine <=", value, "quarantine");
            return (Criteria) this;
        }

        public Criteria andQuarantineIn(List<Integer> values) {
            addCriterion("quarantine in", values, "quarantine");
            return (Criteria) this;
        }

        public Criteria andQuarantineNotIn(List<Integer> values) {
            addCriterion("quarantine not in", values, "quarantine");
            return (Criteria) this;
        }

        public Criteria andQuarantineBetween(Integer value1, Integer value2) {
            addCriterion("quarantine between", value1, value2, "quarantine");
            return (Criteria) this;
        }

        public Criteria andQuarantineNotBetween(Integer value1, Integer value2) {
            addCriterion("quarantine not between", value1, value2, "quarantine");
            return (Criteria) this;
        }

        public Criteria andHowLongIsNull() {
            addCriterion("how_long is null");
            return (Criteria) this;
        }

        public Criteria andHowLongIsNotNull() {
            addCriterion("how_long is not null");
            return (Criteria) this;
        }

        public Criteria andHowLongEqualTo(Integer value) {
            addCriterion("how_long =", value, "howLong");
            return (Criteria) this;
        }

        public Criteria andHowLongNotEqualTo(Integer value) {
            addCriterion("how_long <>", value, "howLong");
            return (Criteria) this;
        }

        public Criteria andHowLongGreaterThan(Integer value) {
            addCriterion("how_long >", value, "howLong");
            return (Criteria) this;
        }

        public Criteria andHowLongGreaterThanOrEqualTo(Integer value) {
            addCriterion("how_long >=", value, "howLong");
            return (Criteria) this;
        }

        public Criteria andHowLongLessThan(Integer value) {
            addCriterion("how_long <", value, "howLong");
            return (Criteria) this;
        }

        public Criteria andHowLongLessThanOrEqualTo(Integer value) {
            addCriterion("how_long <=", value, "howLong");
            return (Criteria) this;
        }

        public Criteria andHowLongIn(List<Integer> values) {
            addCriterion("how_long in", values, "howLong");
            return (Criteria) this;
        }

        public Criteria andHowLongNotIn(List<Integer> values) {
            addCriterion("how_long not in", values, "howLong");
            return (Criteria) this;
        }

        public Criteria andHowLongBetween(Integer value1, Integer value2) {
            addCriterion("how_long between", value1, value2, "howLong");
            return (Criteria) this;
        }

        public Criteria andHowLongNotBetween(Integer value1, Integer value2) {
            addCriterion("how_long not between", value1, value2, "howLong");
            return (Criteria) this;
        }

        public Criteria andUpTimeIsNull() {
            addCriterion("up_time is null");
            return (Criteria) this;
        }

        public Criteria andUpTimeIsNotNull() {
            addCriterion("up_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpTimeEqualTo(Date value) {
            addCriterion("up_time =", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeNotEqualTo(Date value) {
            addCriterion("up_time <>", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeGreaterThan(Date value) {
            addCriterion("up_time >", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("up_time >=", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeLessThan(Date value) {
            addCriterion("up_time <", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeLessThanOrEqualTo(Date value) {
            addCriterion("up_time <=", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeIn(List<Date> values) {
            addCriterion("up_time in", values, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeNotIn(List<Date> values) {
            addCriterion("up_time not in", values, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeBetween(Date value1, Date value2) {
            addCriterion("up_time between", value1, value2, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeNotBetween(Date value1, Date value2) {
            addCriterion("up_time not between", value1, value2, "upTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_dayrpt
     *
     * @mbg.generated do_not_delete_during_merge Mon Feb 24 09:59:27 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_dayrpt
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
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