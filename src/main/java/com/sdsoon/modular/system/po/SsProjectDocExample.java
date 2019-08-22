package com.sdsoon.modular.system.po;

import java.util.ArrayList;
import java.util.List;

public class SsProjectDocExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SsProjectDocExample() {
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

        public Criteria andProjectDocIdIsNull() {
            addCriterion("project_doc_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectDocIdIsNotNull() {
            addCriterion("project_doc_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectDocIdEqualTo(String value) {
            addCriterion("project_doc_id =", value, "projectDocId");
            return (Criteria) this;
        }

        public Criteria andProjectDocIdNotEqualTo(String value) {
            addCriterion("project_doc_id <>", value, "projectDocId");
            return (Criteria) this;
        }

        public Criteria andProjectDocIdGreaterThan(String value) {
            addCriterion("project_doc_id >", value, "projectDocId");
            return (Criteria) this;
        }

        public Criteria andProjectDocIdGreaterThanOrEqualTo(String value) {
            addCriterion("project_doc_id >=", value, "projectDocId");
            return (Criteria) this;
        }

        public Criteria andProjectDocIdLessThan(String value) {
            addCriterion("project_doc_id <", value, "projectDocId");
            return (Criteria) this;
        }

        public Criteria andProjectDocIdLessThanOrEqualTo(String value) {
            addCriterion("project_doc_id <=", value, "projectDocId");
            return (Criteria) this;
        }

        public Criteria andProjectDocIdLike(String value) {
            addCriterion("project_doc_id like", value, "projectDocId");
            return (Criteria) this;
        }

        public Criteria andProjectDocIdNotLike(String value) {
            addCriterion("project_doc_id not like", value, "projectDocId");
            return (Criteria) this;
        }

        public Criteria andProjectDocIdIn(List<String> values) {
            addCriterion("project_doc_id in", values, "projectDocId");
            return (Criteria) this;
        }

        public Criteria andProjectDocIdNotIn(List<String> values) {
            addCriterion("project_doc_id not in", values, "projectDocId");
            return (Criteria) this;
        }

        public Criteria andProjectDocIdBetween(String value1, String value2) {
            addCriterion("project_doc_id between", value1, value2, "projectDocId");
            return (Criteria) this;
        }

        public Criteria andProjectDocIdNotBetween(String value1, String value2) {
            addCriterion("project_doc_id not between", value1, value2, "projectDocId");
            return (Criteria) this;
        }

        public Criteria andProjectDocOldNameIsNull() {
            addCriterion("project_doc_old_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectDocOldNameIsNotNull() {
            addCriterion("project_doc_old_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectDocOldNameEqualTo(String value) {
            addCriterion("project_doc_old_name =", value, "projectDocOldName");
            return (Criteria) this;
        }

        public Criteria andProjectDocOldNameNotEqualTo(String value) {
            addCriterion("project_doc_old_name <>", value, "projectDocOldName");
            return (Criteria) this;
        }

        public Criteria andProjectDocOldNameGreaterThan(String value) {
            addCriterion("project_doc_old_name >", value, "projectDocOldName");
            return (Criteria) this;
        }

        public Criteria andProjectDocOldNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_doc_old_name >=", value, "projectDocOldName");
            return (Criteria) this;
        }

        public Criteria andProjectDocOldNameLessThan(String value) {
            addCriterion("project_doc_old_name <", value, "projectDocOldName");
            return (Criteria) this;
        }

        public Criteria andProjectDocOldNameLessThanOrEqualTo(String value) {
            addCriterion("project_doc_old_name <=", value, "projectDocOldName");
            return (Criteria) this;
        }

        public Criteria andProjectDocOldNameLike(String value) {
            addCriterion("project_doc_old_name like", value, "projectDocOldName");
            return (Criteria) this;
        }

        public Criteria andProjectDocOldNameNotLike(String value) {
            addCriterion("project_doc_old_name not like", value, "projectDocOldName");
            return (Criteria) this;
        }

        public Criteria andProjectDocOldNameIn(List<String> values) {
            addCriterion("project_doc_old_name in", values, "projectDocOldName");
            return (Criteria) this;
        }

        public Criteria andProjectDocOldNameNotIn(List<String> values) {
            addCriterion("project_doc_old_name not in", values, "projectDocOldName");
            return (Criteria) this;
        }

        public Criteria andProjectDocOldNameBetween(String value1, String value2) {
            addCriterion("project_doc_old_name between", value1, value2, "projectDocOldName");
            return (Criteria) this;
        }

        public Criteria andProjectDocOldNameNotBetween(String value1, String value2) {
            addCriterion("project_doc_old_name not between", value1, value2, "projectDocOldName");
            return (Criteria) this;
        }

        public Criteria andProjectDocNewNameIsNull() {
            addCriterion("project_doc_new_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectDocNewNameIsNotNull() {
            addCriterion("project_doc_new_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectDocNewNameEqualTo(String value) {
            addCriterion("project_doc_new_name =", value, "projectDocNewName");
            return (Criteria) this;
        }

        public Criteria andProjectDocNewNameNotEqualTo(String value) {
            addCriterion("project_doc_new_name <>", value, "projectDocNewName");
            return (Criteria) this;
        }

        public Criteria andProjectDocNewNameGreaterThan(String value) {
            addCriterion("project_doc_new_name >", value, "projectDocNewName");
            return (Criteria) this;
        }

        public Criteria andProjectDocNewNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_doc_new_name >=", value, "projectDocNewName");
            return (Criteria) this;
        }

        public Criteria andProjectDocNewNameLessThan(String value) {
            addCriterion("project_doc_new_name <", value, "projectDocNewName");
            return (Criteria) this;
        }

        public Criteria andProjectDocNewNameLessThanOrEqualTo(String value) {
            addCriterion("project_doc_new_name <=", value, "projectDocNewName");
            return (Criteria) this;
        }

        public Criteria andProjectDocNewNameLike(String value) {
            addCriterion("project_doc_new_name like", value, "projectDocNewName");
            return (Criteria) this;
        }

        public Criteria andProjectDocNewNameNotLike(String value) {
            addCriterion("project_doc_new_name not like", value, "projectDocNewName");
            return (Criteria) this;
        }

        public Criteria andProjectDocNewNameIn(List<String> values) {
            addCriterion("project_doc_new_name in", values, "projectDocNewName");
            return (Criteria) this;
        }

        public Criteria andProjectDocNewNameNotIn(List<String> values) {
            addCriterion("project_doc_new_name not in", values, "projectDocNewName");
            return (Criteria) this;
        }

        public Criteria andProjectDocNewNameBetween(String value1, String value2) {
            addCriterion("project_doc_new_name between", value1, value2, "projectDocNewName");
            return (Criteria) this;
        }

        public Criteria andProjectDocNewNameNotBetween(String value1, String value2) {
            addCriterion("project_doc_new_name not between", value1, value2, "projectDocNewName");
            return (Criteria) this;
        }

        public Criteria andProjectDocPathIsNull() {
            addCriterion("project_doc_path is null");
            return (Criteria) this;
        }

        public Criteria andProjectDocPathIsNotNull() {
            addCriterion("project_doc_path is not null");
            return (Criteria) this;
        }

        public Criteria andProjectDocPathEqualTo(String value) {
            addCriterion("project_doc_path =", value, "projectDocPath");
            return (Criteria) this;
        }

        public Criteria andProjectDocPathNotEqualTo(String value) {
            addCriterion("project_doc_path <>", value, "projectDocPath");
            return (Criteria) this;
        }

        public Criteria andProjectDocPathGreaterThan(String value) {
            addCriterion("project_doc_path >", value, "projectDocPath");
            return (Criteria) this;
        }

        public Criteria andProjectDocPathGreaterThanOrEqualTo(String value) {
            addCriterion("project_doc_path >=", value, "projectDocPath");
            return (Criteria) this;
        }

        public Criteria andProjectDocPathLessThan(String value) {
            addCriterion("project_doc_path <", value, "projectDocPath");
            return (Criteria) this;
        }

        public Criteria andProjectDocPathLessThanOrEqualTo(String value) {
            addCriterion("project_doc_path <=", value, "projectDocPath");
            return (Criteria) this;
        }

        public Criteria andProjectDocPathLike(String value) {
            addCriterion("project_doc_path like", value, "projectDocPath");
            return (Criteria) this;
        }

        public Criteria andProjectDocPathNotLike(String value) {
            addCriterion("project_doc_path not like", value, "projectDocPath");
            return (Criteria) this;
        }

        public Criteria andProjectDocPathIn(List<String> values) {
            addCriterion("project_doc_path in", values, "projectDocPath");
            return (Criteria) this;
        }

        public Criteria andProjectDocPathNotIn(List<String> values) {
            addCriterion("project_doc_path not in", values, "projectDocPath");
            return (Criteria) this;
        }

        public Criteria andProjectDocPathBetween(String value1, String value2) {
            addCriterion("project_doc_path between", value1, value2, "projectDocPath");
            return (Criteria) this;
        }

        public Criteria andProjectDocPathNotBetween(String value1, String value2) {
            addCriterion("project_doc_path not between", value1, value2, "projectDocPath");
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