package com.sdsoon.modular.system.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SsProjectMissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SsProjectMissionExample() {
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

        public Criteria andProjectMissionIdIsNull() {
            addCriterion("project_mission_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectMissionIdIsNotNull() {
            addCriterion("project_mission_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectMissionIdEqualTo(String value) {
            addCriterion("project_mission_id =", value, "projectMissionId");
            return (Criteria) this;
        }

        public Criteria andProjectMissionIdNotEqualTo(String value) {
            addCriterion("project_mission_id <>", value, "projectMissionId");
            return (Criteria) this;
        }

        public Criteria andProjectMissionIdGreaterThan(String value) {
            addCriterion("project_mission_id >", value, "projectMissionId");
            return (Criteria) this;
        }

        public Criteria andProjectMissionIdGreaterThanOrEqualTo(String value) {
            addCriterion("project_mission_id >=", value, "projectMissionId");
            return (Criteria) this;
        }

        public Criteria andProjectMissionIdLessThan(String value) {
            addCriterion("project_mission_id <", value, "projectMissionId");
            return (Criteria) this;
        }

        public Criteria andProjectMissionIdLessThanOrEqualTo(String value) {
            addCriterion("project_mission_id <=", value, "projectMissionId");
            return (Criteria) this;
        }

        public Criteria andProjectMissionIdLike(String value) {
            addCriterion("project_mission_id like", value, "projectMissionId");
            return (Criteria) this;
        }

        public Criteria andProjectMissionIdNotLike(String value) {
            addCriterion("project_mission_id not like", value, "projectMissionId");
            return (Criteria) this;
        }

        public Criteria andProjectMissionIdIn(List<String> values) {
            addCriterion("project_mission_id in", values, "projectMissionId");
            return (Criteria) this;
        }

        public Criteria andProjectMissionIdNotIn(List<String> values) {
            addCriterion("project_mission_id not in", values, "projectMissionId");
            return (Criteria) this;
        }

        public Criteria andProjectMissionIdBetween(String value1, String value2) {
            addCriterion("project_mission_id between", value1, value2, "projectMissionId");
            return (Criteria) this;
        }

        public Criteria andProjectMissionIdNotBetween(String value1, String value2) {
            addCriterion("project_mission_id not between", value1, value2, "projectMissionId");
            return (Criteria) this;
        }

        public Criteria andProjectMissionCreateTimeIsNull() {
            addCriterion("project_mission_create_time is null");
            return (Criteria) this;
        }

        public Criteria andProjectMissionCreateTimeIsNotNull() {
            addCriterion("project_mission_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andProjectMissionCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("project_mission_create_time =", value, "projectMissionCreateTime");
            return (Criteria) this;
        }

        public Criteria andProjectMissionCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("project_mission_create_time <>", value, "projectMissionCreateTime");
            return (Criteria) this;
        }

        public Criteria andProjectMissionCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("project_mission_create_time >", value, "projectMissionCreateTime");
            return (Criteria) this;
        }

        public Criteria andProjectMissionCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("project_mission_create_time >=", value, "projectMissionCreateTime");
            return (Criteria) this;
        }

        public Criteria andProjectMissionCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("project_mission_create_time <", value, "projectMissionCreateTime");
            return (Criteria) this;
        }

        public Criteria andProjectMissionCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("project_mission_create_time <=", value, "projectMissionCreateTime");
            return (Criteria) this;
        }

        public Criteria andProjectMissionCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("project_mission_create_time in", values, "projectMissionCreateTime");
            return (Criteria) this;
        }

        public Criteria andProjectMissionCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("project_mission_create_time not in", values, "projectMissionCreateTime");
            return (Criteria) this;
        }

        public Criteria andProjectMissionCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("project_mission_create_time between", value1, value2, "projectMissionCreateTime");
            return (Criteria) this;
        }

        public Criteria andProjectMissionCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("project_mission_create_time not between", value1, value2, "projectMissionCreateTime");
            return (Criteria) this;
        }

        public Criteria andProjectMissionEndTimeIsNull() {
            addCriterion("project_mission_end_time is null");
            return (Criteria) this;
        }

        public Criteria andProjectMissionEndTimeIsNotNull() {
            addCriterion("project_mission_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andProjectMissionEndTimeEqualTo(Date value) {
            addCriterionForJDBCDate("project_mission_end_time =", value, "projectMissionEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectMissionEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("project_mission_end_time <>", value, "projectMissionEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectMissionEndTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("project_mission_end_time >", value, "projectMissionEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectMissionEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("project_mission_end_time >=", value, "projectMissionEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectMissionEndTimeLessThan(Date value) {
            addCriterionForJDBCDate("project_mission_end_time <", value, "projectMissionEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectMissionEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("project_mission_end_time <=", value, "projectMissionEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectMissionEndTimeIn(List<Date> values) {
            addCriterionForJDBCDate("project_mission_end_time in", values, "projectMissionEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectMissionEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("project_mission_end_time not in", values, "projectMissionEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectMissionEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("project_mission_end_time between", value1, value2, "projectMissionEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectMissionEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("project_mission_end_time not between", value1, value2, "projectMissionEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectMissionDescriptionIsNull() {
            addCriterion("project_mission_description is null");
            return (Criteria) this;
        }

        public Criteria andProjectMissionDescriptionIsNotNull() {
            addCriterion("project_mission_description is not null");
            return (Criteria) this;
        }

        public Criteria andProjectMissionDescriptionEqualTo(String value) {
            addCriterion("project_mission_description =", value, "projectMissionDescription");
            return (Criteria) this;
        }

        public Criteria andProjectMissionDescriptionNotEqualTo(String value) {
            addCriterion("project_mission_description <>", value, "projectMissionDescription");
            return (Criteria) this;
        }

        public Criteria andProjectMissionDescriptionGreaterThan(String value) {
            addCriterion("project_mission_description >", value, "projectMissionDescription");
            return (Criteria) this;
        }

        public Criteria andProjectMissionDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("project_mission_description >=", value, "projectMissionDescription");
            return (Criteria) this;
        }

        public Criteria andProjectMissionDescriptionLessThan(String value) {
            addCriterion("project_mission_description <", value, "projectMissionDescription");
            return (Criteria) this;
        }

        public Criteria andProjectMissionDescriptionLessThanOrEqualTo(String value) {
            addCriterion("project_mission_description <=", value, "projectMissionDescription");
            return (Criteria) this;
        }

        public Criteria andProjectMissionDescriptionLike(String value) {
            addCriterion("project_mission_description like", value, "projectMissionDescription");
            return (Criteria) this;
        }

        public Criteria andProjectMissionDescriptionNotLike(String value) {
            addCriterion("project_mission_description not like", value, "projectMissionDescription");
            return (Criteria) this;
        }

        public Criteria andProjectMissionDescriptionIn(List<String> values) {
            addCriterion("project_mission_description in", values, "projectMissionDescription");
            return (Criteria) this;
        }

        public Criteria andProjectMissionDescriptionNotIn(List<String> values) {
            addCriterion("project_mission_description not in", values, "projectMissionDescription");
            return (Criteria) this;
        }

        public Criteria andProjectMissionDescriptionBetween(String value1, String value2) {
            addCriterion("project_mission_description between", value1, value2, "projectMissionDescription");
            return (Criteria) this;
        }

        public Criteria andProjectMissionDescriptionNotBetween(String value1, String value2) {
            addCriterion("project_mission_description not between", value1, value2, "projectMissionDescription");
            return (Criteria) this;
        }

        public Criteria andProjectGProjectIdIsNull() {
            addCriterion("project_g_project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectGProjectIdIsNotNull() {
            addCriterion("project_g_project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectGProjectIdEqualTo(String value) {
            addCriterion("project_g_project_id =", value, "projectGProjectId");
            return (Criteria) this;
        }

        public Criteria andProjectGProjectIdNotEqualTo(String value) {
            addCriterion("project_g_project_id <>", value, "projectGProjectId");
            return (Criteria) this;
        }

        public Criteria andProjectGProjectIdGreaterThan(String value) {
            addCriterion("project_g_project_id >", value, "projectGProjectId");
            return (Criteria) this;
        }

        public Criteria andProjectGProjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("project_g_project_id >=", value, "projectGProjectId");
            return (Criteria) this;
        }

        public Criteria andProjectGProjectIdLessThan(String value) {
            addCriterion("project_g_project_id <", value, "projectGProjectId");
            return (Criteria) this;
        }

        public Criteria andProjectGProjectIdLessThanOrEqualTo(String value) {
            addCriterion("project_g_project_id <=", value, "projectGProjectId");
            return (Criteria) this;
        }

        public Criteria andProjectGProjectIdLike(String value) {
            addCriterion("project_g_project_id like", value, "projectGProjectId");
            return (Criteria) this;
        }

        public Criteria andProjectGProjectIdNotLike(String value) {
            addCriterion("project_g_project_id not like", value, "projectGProjectId");
            return (Criteria) this;
        }

        public Criteria andProjectGProjectIdIn(List<String> values) {
            addCriterion("project_g_project_id in", values, "projectGProjectId");
            return (Criteria) this;
        }

        public Criteria andProjectGProjectIdNotIn(List<String> values) {
            addCriterion("project_g_project_id not in", values, "projectGProjectId");
            return (Criteria) this;
        }

        public Criteria andProjectGProjectIdBetween(String value1, String value2) {
            addCriterion("project_g_project_id between", value1, value2, "projectGProjectId");
            return (Criteria) this;
        }

        public Criteria andProjectGProjectIdNotBetween(String value1, String value2) {
            addCriterion("project_g_project_id not between", value1, value2, "projectGProjectId");
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