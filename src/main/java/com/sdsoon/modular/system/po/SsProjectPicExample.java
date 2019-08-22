package com.sdsoon.modular.system.po;

import java.util.ArrayList;
import java.util.List;

public class SsProjectPicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SsProjectPicExample() {
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

        public Criteria andProjectPicIdIsNull() {
            addCriterion("project_pic_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectPicIdIsNotNull() {
            addCriterion("project_pic_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectPicIdEqualTo(String value) {
            addCriterion("project_pic_id =", value, "projectPicId");
            return (Criteria) this;
        }

        public Criteria andProjectPicIdNotEqualTo(String value) {
            addCriterion("project_pic_id <>", value, "projectPicId");
            return (Criteria) this;
        }

        public Criteria andProjectPicIdGreaterThan(String value) {
            addCriterion("project_pic_id >", value, "projectPicId");
            return (Criteria) this;
        }

        public Criteria andProjectPicIdGreaterThanOrEqualTo(String value) {
            addCriterion("project_pic_id >=", value, "projectPicId");
            return (Criteria) this;
        }

        public Criteria andProjectPicIdLessThan(String value) {
            addCriterion("project_pic_id <", value, "projectPicId");
            return (Criteria) this;
        }

        public Criteria andProjectPicIdLessThanOrEqualTo(String value) {
            addCriterion("project_pic_id <=", value, "projectPicId");
            return (Criteria) this;
        }

        public Criteria andProjectPicIdLike(String value) {
            addCriterion("project_pic_id like", value, "projectPicId");
            return (Criteria) this;
        }

        public Criteria andProjectPicIdNotLike(String value) {
            addCriterion("project_pic_id not like", value, "projectPicId");
            return (Criteria) this;
        }

        public Criteria andProjectPicIdIn(List<String> values) {
            addCriterion("project_pic_id in", values, "projectPicId");
            return (Criteria) this;
        }

        public Criteria andProjectPicIdNotIn(List<String> values) {
            addCriterion("project_pic_id not in", values, "projectPicId");
            return (Criteria) this;
        }

        public Criteria andProjectPicIdBetween(String value1, String value2) {
            addCriterion("project_pic_id between", value1, value2, "projectPicId");
            return (Criteria) this;
        }

        public Criteria andProjectPicIdNotBetween(String value1, String value2) {
            addCriterion("project_pic_id not between", value1, value2, "projectPicId");
            return (Criteria) this;
        }

        public Criteria andProjectPicOldNameIsNull() {
            addCriterion("project_pic_old_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectPicOldNameIsNotNull() {
            addCriterion("project_pic_old_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectPicOldNameEqualTo(String value) {
            addCriterion("project_pic_old_name =", value, "projectPicOldName");
            return (Criteria) this;
        }

        public Criteria andProjectPicOldNameNotEqualTo(String value) {
            addCriterion("project_pic_old_name <>", value, "projectPicOldName");
            return (Criteria) this;
        }

        public Criteria andProjectPicOldNameGreaterThan(String value) {
            addCriterion("project_pic_old_name >", value, "projectPicOldName");
            return (Criteria) this;
        }

        public Criteria andProjectPicOldNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_pic_old_name >=", value, "projectPicOldName");
            return (Criteria) this;
        }

        public Criteria andProjectPicOldNameLessThan(String value) {
            addCriterion("project_pic_old_name <", value, "projectPicOldName");
            return (Criteria) this;
        }

        public Criteria andProjectPicOldNameLessThanOrEqualTo(String value) {
            addCriterion("project_pic_old_name <=", value, "projectPicOldName");
            return (Criteria) this;
        }

        public Criteria andProjectPicOldNameLike(String value) {
            addCriterion("project_pic_old_name like", value, "projectPicOldName");
            return (Criteria) this;
        }

        public Criteria andProjectPicOldNameNotLike(String value) {
            addCriterion("project_pic_old_name not like", value, "projectPicOldName");
            return (Criteria) this;
        }

        public Criteria andProjectPicOldNameIn(List<String> values) {
            addCriterion("project_pic_old_name in", values, "projectPicOldName");
            return (Criteria) this;
        }

        public Criteria andProjectPicOldNameNotIn(List<String> values) {
            addCriterion("project_pic_old_name not in", values, "projectPicOldName");
            return (Criteria) this;
        }

        public Criteria andProjectPicOldNameBetween(String value1, String value2) {
            addCriterion("project_pic_old_name between", value1, value2, "projectPicOldName");
            return (Criteria) this;
        }

        public Criteria andProjectPicOldNameNotBetween(String value1, String value2) {
            addCriterion("project_pic_old_name not between", value1, value2, "projectPicOldName");
            return (Criteria) this;
        }

        public Criteria andProjectPicNewNameIsNull() {
            addCriterion("project_pic_new_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectPicNewNameIsNotNull() {
            addCriterion("project_pic_new_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectPicNewNameEqualTo(String value) {
            addCriterion("project_pic_new_name =", value, "projectPicNewName");
            return (Criteria) this;
        }

        public Criteria andProjectPicNewNameNotEqualTo(String value) {
            addCriterion("project_pic_new_name <>", value, "projectPicNewName");
            return (Criteria) this;
        }

        public Criteria andProjectPicNewNameGreaterThan(String value) {
            addCriterion("project_pic_new_name >", value, "projectPicNewName");
            return (Criteria) this;
        }

        public Criteria andProjectPicNewNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_pic_new_name >=", value, "projectPicNewName");
            return (Criteria) this;
        }

        public Criteria andProjectPicNewNameLessThan(String value) {
            addCriterion("project_pic_new_name <", value, "projectPicNewName");
            return (Criteria) this;
        }

        public Criteria andProjectPicNewNameLessThanOrEqualTo(String value) {
            addCriterion("project_pic_new_name <=", value, "projectPicNewName");
            return (Criteria) this;
        }

        public Criteria andProjectPicNewNameLike(String value) {
            addCriterion("project_pic_new_name like", value, "projectPicNewName");
            return (Criteria) this;
        }

        public Criteria andProjectPicNewNameNotLike(String value) {
            addCriterion("project_pic_new_name not like", value, "projectPicNewName");
            return (Criteria) this;
        }

        public Criteria andProjectPicNewNameIn(List<String> values) {
            addCriterion("project_pic_new_name in", values, "projectPicNewName");
            return (Criteria) this;
        }

        public Criteria andProjectPicNewNameNotIn(List<String> values) {
            addCriterion("project_pic_new_name not in", values, "projectPicNewName");
            return (Criteria) this;
        }

        public Criteria andProjectPicNewNameBetween(String value1, String value2) {
            addCriterion("project_pic_new_name between", value1, value2, "projectPicNewName");
            return (Criteria) this;
        }

        public Criteria andProjectPicNewNameNotBetween(String value1, String value2) {
            addCriterion("project_pic_new_name not between", value1, value2, "projectPicNewName");
            return (Criteria) this;
        }

        public Criteria andProjectPicPathIsNull() {
            addCriterion("project_pic_path is null");
            return (Criteria) this;
        }

        public Criteria andProjectPicPathIsNotNull() {
            addCriterion("project_pic_path is not null");
            return (Criteria) this;
        }

        public Criteria andProjectPicPathEqualTo(String value) {
            addCriterion("project_pic_path =", value, "projectPicPath");
            return (Criteria) this;
        }

        public Criteria andProjectPicPathNotEqualTo(String value) {
            addCriterion("project_pic_path <>", value, "projectPicPath");
            return (Criteria) this;
        }

        public Criteria andProjectPicPathGreaterThan(String value) {
            addCriterion("project_pic_path >", value, "projectPicPath");
            return (Criteria) this;
        }

        public Criteria andProjectPicPathGreaterThanOrEqualTo(String value) {
            addCriterion("project_pic_path >=", value, "projectPicPath");
            return (Criteria) this;
        }

        public Criteria andProjectPicPathLessThan(String value) {
            addCriterion("project_pic_path <", value, "projectPicPath");
            return (Criteria) this;
        }

        public Criteria andProjectPicPathLessThanOrEqualTo(String value) {
            addCriterion("project_pic_path <=", value, "projectPicPath");
            return (Criteria) this;
        }

        public Criteria andProjectPicPathLike(String value) {
            addCriterion("project_pic_path like", value, "projectPicPath");
            return (Criteria) this;
        }

        public Criteria andProjectPicPathNotLike(String value) {
            addCriterion("project_pic_path not like", value, "projectPicPath");
            return (Criteria) this;
        }

        public Criteria andProjectPicPathIn(List<String> values) {
            addCriterion("project_pic_path in", values, "projectPicPath");
            return (Criteria) this;
        }

        public Criteria andProjectPicPathNotIn(List<String> values) {
            addCriterion("project_pic_path not in", values, "projectPicPath");
            return (Criteria) this;
        }

        public Criteria andProjectPicPathBetween(String value1, String value2) {
            addCriterion("project_pic_path between", value1, value2, "projectPicPath");
            return (Criteria) this;
        }

        public Criteria andProjectPicPathNotBetween(String value1, String value2) {
            addCriterion("project_pic_path not between", value1, value2, "projectPicPath");
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