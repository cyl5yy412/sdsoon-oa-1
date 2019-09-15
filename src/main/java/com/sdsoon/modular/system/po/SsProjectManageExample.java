package com.sdsoon.modular.system.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SsProjectManageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SsProjectManageExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(String value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(String value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(String value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(String value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(String value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLike(String value) {
            addCriterion("project_id like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotLike(String value) {
            addCriterion("project_id not like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<String> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<String> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(String value1, String value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(String value1, String value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionIsNull() {
            addCriterion("project_description is null");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionIsNotNull() {
            addCriterion("project_description is not null");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionEqualTo(String value) {
            addCriterion("project_description =", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionNotEqualTo(String value) {
            addCriterion("project_description <>", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionGreaterThan(String value) {
            addCriterion("project_description >", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("project_description >=", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionLessThan(String value) {
            addCriterion("project_description <", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionLessThanOrEqualTo(String value) {
            addCriterion("project_description <=", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionLike(String value) {
            addCriterion("project_description like", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionNotLike(String value) {
            addCriterion("project_description not like", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionIn(List<String> values) {
            addCriterion("project_description in", values, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionNotIn(List<String> values) {
            addCriterion("project_description not in", values, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionBetween(String value1, String value2) {
            addCriterion("project_description between", value1, value2, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionNotBetween(String value1, String value2) {
            addCriterion("project_description not between", value1, value2, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectTechnologyIsNull() {
            addCriterion("project_technology is null");
            return (Criteria) this;
        }

        public Criteria andProjectTechnologyIsNotNull() {
            addCriterion("project_technology is not null");
            return (Criteria) this;
        }

        public Criteria andProjectTechnologyEqualTo(String value) {
            addCriterion("project_technology =", value, "projectTechnology");
            return (Criteria) this;
        }

        public Criteria andProjectTechnologyNotEqualTo(String value) {
            addCriterion("project_technology <>", value, "projectTechnology");
            return (Criteria) this;
        }

        public Criteria andProjectTechnologyGreaterThan(String value) {
            addCriterion("project_technology >", value, "projectTechnology");
            return (Criteria) this;
        }

        public Criteria andProjectTechnologyGreaterThanOrEqualTo(String value) {
            addCriterion("project_technology >=", value, "projectTechnology");
            return (Criteria) this;
        }

        public Criteria andProjectTechnologyLessThan(String value) {
            addCriterion("project_technology <", value, "projectTechnology");
            return (Criteria) this;
        }

        public Criteria andProjectTechnologyLessThanOrEqualTo(String value) {
            addCriterion("project_technology <=", value, "projectTechnology");
            return (Criteria) this;
        }

        public Criteria andProjectTechnologyLike(String value) {
            addCriterion("project_technology like", value, "projectTechnology");
            return (Criteria) this;
        }

        public Criteria andProjectTechnologyNotLike(String value) {
            addCriterion("project_technology not like", value, "projectTechnology");
            return (Criteria) this;
        }

        public Criteria andProjectTechnologyIn(List<String> values) {
            addCriterion("project_technology in", values, "projectTechnology");
            return (Criteria) this;
        }

        public Criteria andProjectTechnologyNotIn(List<String> values) {
            addCriterion("project_technology not in", values, "projectTechnology");
            return (Criteria) this;
        }

        public Criteria andProjectTechnologyBetween(String value1, String value2) {
            addCriterion("project_technology between", value1, value2, "projectTechnology");
            return (Criteria) this;
        }

        public Criteria andProjectTechnologyNotBetween(String value1, String value2) {
            addCriterion("project_technology not between", value1, value2, "projectTechnology");
            return (Criteria) this;
        }

        public Criteria andProjectStandardIsNull() {
            addCriterion("project_standard is null");
            return (Criteria) this;
        }

        public Criteria andProjectStandardIsNotNull() {
            addCriterion("project_standard is not null");
            return (Criteria) this;
        }

        public Criteria andProjectStandardEqualTo(String value) {
            addCriterion("project_standard =", value, "projectStandard");
            return (Criteria) this;
        }

        public Criteria andProjectStandardNotEqualTo(String value) {
            addCriterion("project_standard <>", value, "projectStandard");
            return (Criteria) this;
        }

        public Criteria andProjectStandardGreaterThan(String value) {
            addCriterion("project_standard >", value, "projectStandard");
            return (Criteria) this;
        }

        public Criteria andProjectStandardGreaterThanOrEqualTo(String value) {
            addCriterion("project_standard >=", value, "projectStandard");
            return (Criteria) this;
        }

        public Criteria andProjectStandardLessThan(String value) {
            addCriterion("project_standard <", value, "projectStandard");
            return (Criteria) this;
        }

        public Criteria andProjectStandardLessThanOrEqualTo(String value) {
            addCriterion("project_standard <=", value, "projectStandard");
            return (Criteria) this;
        }

        public Criteria andProjectStandardLike(String value) {
            addCriterion("project_standard like", value, "projectStandard");
            return (Criteria) this;
        }

        public Criteria andProjectStandardNotLike(String value) {
            addCriterion("project_standard not like", value, "projectStandard");
            return (Criteria) this;
        }

        public Criteria andProjectStandardIn(List<String> values) {
            addCriterion("project_standard in", values, "projectStandard");
            return (Criteria) this;
        }

        public Criteria andProjectStandardNotIn(List<String> values) {
            addCriterion("project_standard not in", values, "projectStandard");
            return (Criteria) this;
        }

        public Criteria andProjectStandardBetween(String value1, String value2) {
            addCriterion("project_standard between", value1, value2, "projectStandard");
            return (Criteria) this;
        }

        public Criteria andProjectStandardNotBetween(String value1, String value2) {
            addCriterion("project_standard not between", value1, value2, "projectStandard");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderNameIsNull() {
            addCriterion("project_leader_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderNameIsNotNull() {
            addCriterion("project_leader_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderNameEqualTo(String value) {
            addCriterion("project_leader_name =", value, "projectLeaderName");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderNameNotEqualTo(String value) {
            addCriterion("project_leader_name <>", value, "projectLeaderName");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderNameGreaterThan(String value) {
            addCriterion("project_leader_name >", value, "projectLeaderName");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_leader_name >=", value, "projectLeaderName");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderNameLessThan(String value) {
            addCriterion("project_leader_name <", value, "projectLeaderName");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderNameLessThanOrEqualTo(String value) {
            addCriterion("project_leader_name <=", value, "projectLeaderName");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderNameLike(String value) {
            addCriterion("project_leader_name like", value, "projectLeaderName");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderNameNotLike(String value) {
            addCriterion("project_leader_name not like", value, "projectLeaderName");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderNameIn(List<String> values) {
            addCriterion("project_leader_name in", values, "projectLeaderName");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderNameNotIn(List<String> values) {
            addCriterion("project_leader_name not in", values, "projectLeaderName");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderNameBetween(String value1, String value2) {
            addCriterion("project_leader_name between", value1, value2, "projectLeaderName");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderNameNotBetween(String value1, String value2) {
            addCriterion("project_leader_name not between", value1, value2, "projectLeaderName");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderPhoneIsNull() {
            addCriterion("project_leader_phone is null");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderPhoneIsNotNull() {
            addCriterion("project_leader_phone is not null");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderPhoneEqualTo(String value) {
            addCriterion("project_leader_phone =", value, "projectLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderPhoneNotEqualTo(String value) {
            addCriterion("project_leader_phone <>", value, "projectLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderPhoneGreaterThan(String value) {
            addCriterion("project_leader_phone >", value, "projectLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("project_leader_phone >=", value, "projectLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderPhoneLessThan(String value) {
            addCriterion("project_leader_phone <", value, "projectLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderPhoneLessThanOrEqualTo(String value) {
            addCriterion("project_leader_phone <=", value, "projectLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderPhoneLike(String value) {
            addCriterion("project_leader_phone like", value, "projectLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderPhoneNotLike(String value) {
            addCriterion("project_leader_phone not like", value, "projectLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderPhoneIn(List<String> values) {
            addCriterion("project_leader_phone in", values, "projectLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderPhoneNotIn(List<String> values) {
            addCriterion("project_leader_phone not in", values, "projectLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderPhoneBetween(String value1, String value2) {
            addCriterion("project_leader_phone between", value1, value2, "projectLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andProjectLeaderPhoneNotBetween(String value1, String value2) {
            addCriterion("project_leader_phone not between", value1, value2, "projectLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andProjectCreateTimeIsNull() {
            addCriterion("project_create_time is null");
            return (Criteria) this;
        }

        public Criteria andProjectCreateTimeIsNotNull() {
            addCriterion("project_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andProjectCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("project_create_time =", value, "projectCreateTime");
            return (Criteria) this;
        }

        public Criteria andProjectCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("project_create_time <>", value, "projectCreateTime");
            return (Criteria) this;
        }

        public Criteria andProjectCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("project_create_time >", value, "projectCreateTime");
            return (Criteria) this;
        }

        public Criteria andProjectCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("project_create_time >=", value, "projectCreateTime");
            return (Criteria) this;
        }

        public Criteria andProjectCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("project_create_time <", value, "projectCreateTime");
            return (Criteria) this;
        }

        public Criteria andProjectCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("project_create_time <=", value, "projectCreateTime");
            return (Criteria) this;
        }

        public Criteria andProjectCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("project_create_time in", values, "projectCreateTime");
            return (Criteria) this;
        }

        public Criteria andProjectCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("project_create_time not in", values, "projectCreateTime");
            return (Criteria) this;
        }

        public Criteria andProjectCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("project_create_time between", value1, value2, "projectCreateTime");
            return (Criteria) this;
        }

        public Criteria andProjectCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("project_create_time not between", value1, value2, "projectCreateTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeIsNull() {
            addCriterion("project_end_time is null");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeIsNotNull() {
            addCriterion("project_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeEqualTo(Date value) {
            addCriterionForJDBCDate("project_end_time =", value, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("project_end_time <>", value, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("project_end_time >", value, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("project_end_time >=", value, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeLessThan(Date value) {
            addCriterionForJDBCDate("project_end_time <", value, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("project_end_time <=", value, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeIn(List<Date> values) {
            addCriterionForJDBCDate("project_end_time in", values, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("project_end_time not in", values, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("project_end_time between", value1, value2, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("project_end_time not between", value1, value2, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectStatusIsNull() {
            addCriterion("project_status is null");
            return (Criteria) this;
        }

        public Criteria andProjectStatusIsNotNull() {
            addCriterion("project_status is not null");
            return (Criteria) this;
        }

        public Criteria andProjectStatusEqualTo(Integer value) {
            addCriterion("project_status =", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusNotEqualTo(Integer value) {
            addCriterion("project_status <>", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusGreaterThan(Integer value) {
            addCriterion("project_status >", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_status >=", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusLessThan(Integer value) {
            addCriterion("project_status <", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusLessThanOrEqualTo(Integer value) {
            addCriterion("project_status <=", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusIn(List<Integer> values) {
            addCriterion("project_status in", values, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusNotIn(List<Integer> values) {
            addCriterion("project_status not in", values, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusBetween(Integer value1, Integer value2) {
            addCriterion("project_status between", value1, value2, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("project_status not between", value1, value2, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectLevelIsNull() {
            addCriterion("project_level is null");
            return (Criteria) this;
        }

        public Criteria andProjectLevelIsNotNull() {
            addCriterion("project_level is not null");
            return (Criteria) this;
        }

        public Criteria andProjectLevelEqualTo(Integer value) {
            addCriterion("project_level =", value, "projectLevel");
            return (Criteria) this;
        }

        public Criteria andProjectLevelNotEqualTo(Integer value) {
            addCriterion("project_level <>", value, "projectLevel");
            return (Criteria) this;
        }

        public Criteria andProjectLevelGreaterThan(Integer value) {
            addCriterion("project_level >", value, "projectLevel");
            return (Criteria) this;
        }

        public Criteria andProjectLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_level >=", value, "projectLevel");
            return (Criteria) this;
        }

        public Criteria andProjectLevelLessThan(Integer value) {
            addCriterion("project_level <", value, "projectLevel");
            return (Criteria) this;
        }

        public Criteria andProjectLevelLessThanOrEqualTo(Integer value) {
            addCriterion("project_level <=", value, "projectLevel");
            return (Criteria) this;
        }

        public Criteria andProjectLevelIn(List<Integer> values) {
            addCriterion("project_level in", values, "projectLevel");
            return (Criteria) this;
        }

        public Criteria andProjectLevelNotIn(List<Integer> values) {
            addCriterion("project_level not in", values, "projectLevel");
            return (Criteria) this;
        }

        public Criteria andProjectLevelBetween(Integer value1, Integer value2) {
            addCriterion("project_level between", value1, value2, "projectLevel");
            return (Criteria) this;
        }

        public Criteria andProjectLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("project_level not between", value1, value2, "projectLevel");
            return (Criteria) this;
        }

        public Criteria andProjectDocInfoIsNull() {
            addCriterion("project_doc_info is null");
            return (Criteria) this;
        }

        public Criteria andProjectDocInfoIsNotNull() {
            addCriterion("project_doc_info is not null");
            return (Criteria) this;
        }

        public Criteria andProjectDocInfoEqualTo(String value) {
            addCriterion("project_doc_info =", value, "projectDocInfo");
            return (Criteria) this;
        }

        public Criteria andProjectDocInfoNotEqualTo(String value) {
            addCriterion("project_doc_info <>", value, "projectDocInfo");
            return (Criteria) this;
        }

        public Criteria andProjectDocInfoGreaterThan(String value) {
            addCriterion("project_doc_info >", value, "projectDocInfo");
            return (Criteria) this;
        }

        public Criteria andProjectDocInfoGreaterThanOrEqualTo(String value) {
            addCriterion("project_doc_info >=", value, "projectDocInfo");
            return (Criteria) this;
        }

        public Criteria andProjectDocInfoLessThan(String value) {
            addCriterion("project_doc_info <", value, "projectDocInfo");
            return (Criteria) this;
        }

        public Criteria andProjectDocInfoLessThanOrEqualTo(String value) {
            addCriterion("project_doc_info <=", value, "projectDocInfo");
            return (Criteria) this;
        }

        public Criteria andProjectDocInfoLike(String value) {
            addCriterion("project_doc_info like", value, "projectDocInfo");
            return (Criteria) this;
        }

        public Criteria andProjectDocInfoNotLike(String value) {
            addCriterion("project_doc_info not like", value, "projectDocInfo");
            return (Criteria) this;
        }

        public Criteria andProjectDocInfoIn(List<String> values) {
            addCriterion("project_doc_info in", values, "projectDocInfo");
            return (Criteria) this;
        }

        public Criteria andProjectDocInfoNotIn(List<String> values) {
            addCriterion("project_doc_info not in", values, "projectDocInfo");
            return (Criteria) this;
        }

        public Criteria andProjectDocInfoBetween(String value1, String value2) {
            addCriterion("project_doc_info between", value1, value2, "projectDocInfo");
            return (Criteria) this;
        }

        public Criteria andProjectDocInfoNotBetween(String value1, String value2) {
            addCriterion("project_doc_info not between", value1, value2, "projectDocInfo");
            return (Criteria) this;
        }

        public Criteria andProjectPeopleNameIsNull() {
            addCriterion("project_people_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectPeopleNameIsNotNull() {
            addCriterion("project_people_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectPeopleNameEqualTo(String value) {
            addCriterion("project_people_name =", value, "projectPeopleName");
            return (Criteria) this;
        }

        public Criteria andProjectPeopleNameNotEqualTo(String value) {
            addCriterion("project_people_name <>", value, "projectPeopleName");
            return (Criteria) this;
        }

        public Criteria andProjectPeopleNameGreaterThan(String value) {
            addCriterion("project_people_name >", value, "projectPeopleName");
            return (Criteria) this;
        }

        public Criteria andProjectPeopleNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_people_name >=", value, "projectPeopleName");
            return (Criteria) this;
        }

        public Criteria andProjectPeopleNameLessThan(String value) {
            addCriterion("project_people_name <", value, "projectPeopleName");
            return (Criteria) this;
        }

        public Criteria andProjectPeopleNameLessThanOrEqualTo(String value) {
            addCriterion("project_people_name <=", value, "projectPeopleName");
            return (Criteria) this;
        }

        public Criteria andProjectPeopleNameLike(String value) {
            addCriterion("project_people_name like", value, "projectPeopleName");
            return (Criteria) this;
        }

        public Criteria andProjectPeopleNameNotLike(String value) {
            addCriterion("project_people_name not like", value, "projectPeopleName");
            return (Criteria) this;
        }

        public Criteria andProjectPeopleNameIn(List<String> values) {
            addCriterion("project_people_name in", values, "projectPeopleName");
            return (Criteria) this;
        }

        public Criteria andProjectPeopleNameNotIn(List<String> values) {
            addCriterion("project_people_name not in", values, "projectPeopleName");
            return (Criteria) this;
        }

        public Criteria andProjectPeopleNameBetween(String value1, String value2) {
            addCriterion("project_people_name between", value1, value2, "projectPeopleName");
            return (Criteria) this;
        }

        public Criteria andProjectPeopleNameNotBetween(String value1, String value2) {
            addCriterion("project_people_name not between", value1, value2, "projectPeopleName");
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