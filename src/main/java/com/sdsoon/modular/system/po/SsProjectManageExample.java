package com.sdsoon.modular.system.po;

import java.util.ArrayList;
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