package com.sdsoon.modular.system.po;

import java.util.ArrayList;
import java.util.List;

public class SsPermissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SsPermissionExample() {
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

        public Criteria andPermIdIsNull() {
            addCriterion("perm_id is null");
            return (Criteria) this;
        }

        public Criteria andPermIdIsNotNull() {
            addCriterion("perm_id is not null");
            return (Criteria) this;
        }

        public Criteria andPermIdEqualTo(Integer value) {
            addCriterion("perm_id =", value, "permId");
            return (Criteria) this;
        }

        public Criteria andPermIdNotEqualTo(Integer value) {
            addCriterion("perm_id <>", value, "permId");
            return (Criteria) this;
        }

        public Criteria andPermIdGreaterThan(Integer value) {
            addCriterion("perm_id >", value, "permId");
            return (Criteria) this;
        }

        public Criteria andPermIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("perm_id >=", value, "permId");
            return (Criteria) this;
        }

        public Criteria andPermIdLessThan(Integer value) {
            addCriterion("perm_id <", value, "permId");
            return (Criteria) this;
        }

        public Criteria andPermIdLessThanOrEqualTo(Integer value) {
            addCriterion("perm_id <=", value, "permId");
            return (Criteria) this;
        }

        public Criteria andPermIdIn(List<Integer> values) {
            addCriterion("perm_id in", values, "permId");
            return (Criteria) this;
        }

        public Criteria andPermIdNotIn(List<Integer> values) {
            addCriterion("perm_id not in", values, "permId");
            return (Criteria) this;
        }

        public Criteria andPermIdBetween(Integer value1, Integer value2) {
            addCriterion("perm_id between", value1, value2, "permId");
            return (Criteria) this;
        }

        public Criteria andPermIdNotBetween(Integer value1, Integer value2) {
            addCriterion("perm_id not between", value1, value2, "permId");
            return (Criteria) this;
        }

        public Criteria andPermNameIsNull() {
            addCriterion("perm_name is null");
            return (Criteria) this;
        }

        public Criteria andPermNameIsNotNull() {
            addCriterion("perm_name is not null");
            return (Criteria) this;
        }

        public Criteria andPermNameEqualTo(String value) {
            addCriterion("perm_name =", value, "permName");
            return (Criteria) this;
        }

        public Criteria andPermNameNotEqualTo(String value) {
            addCriterion("perm_name <>", value, "permName");
            return (Criteria) this;
        }

        public Criteria andPermNameGreaterThan(String value) {
            addCriterion("perm_name >", value, "permName");
            return (Criteria) this;
        }

        public Criteria andPermNameGreaterThanOrEqualTo(String value) {
            addCriterion("perm_name >=", value, "permName");
            return (Criteria) this;
        }

        public Criteria andPermNameLessThan(String value) {
            addCriterion("perm_name <", value, "permName");
            return (Criteria) this;
        }

        public Criteria andPermNameLessThanOrEqualTo(String value) {
            addCriterion("perm_name <=", value, "permName");
            return (Criteria) this;
        }

        public Criteria andPermNameLike(String value) {
            addCriterion("perm_name like", value, "permName");
            return (Criteria) this;
        }

        public Criteria andPermNameNotLike(String value) {
            addCriterion("perm_name not like", value, "permName");
            return (Criteria) this;
        }

        public Criteria andPermNameIn(List<String> values) {
            addCriterion("perm_name in", values, "permName");
            return (Criteria) this;
        }

        public Criteria andPermNameNotIn(List<String> values) {
            addCriterion("perm_name not in", values, "permName");
            return (Criteria) this;
        }

        public Criteria andPermNameBetween(String value1, String value2) {
            addCriterion("perm_name between", value1, value2, "permName");
            return (Criteria) this;
        }

        public Criteria andPermNameNotBetween(String value1, String value2) {
            addCriterion("perm_name not between", value1, value2, "permName");
            return (Criteria) this;
        }

        public Criteria andPermCodeIsNull() {
            addCriterion("perm_code is null");
            return (Criteria) this;
        }

        public Criteria andPermCodeIsNotNull() {
            addCriterion("perm_code is not null");
            return (Criteria) this;
        }

        public Criteria andPermCodeEqualTo(String value) {
            addCriterion("perm_code =", value, "permCode");
            return (Criteria) this;
        }

        public Criteria andPermCodeNotEqualTo(String value) {
            addCriterion("perm_code <>", value, "permCode");
            return (Criteria) this;
        }

        public Criteria andPermCodeGreaterThan(String value) {
            addCriterion("perm_code >", value, "permCode");
            return (Criteria) this;
        }

        public Criteria andPermCodeGreaterThanOrEqualTo(String value) {
            addCriterion("perm_code >=", value, "permCode");
            return (Criteria) this;
        }

        public Criteria andPermCodeLessThan(String value) {
            addCriterion("perm_code <", value, "permCode");
            return (Criteria) this;
        }

        public Criteria andPermCodeLessThanOrEqualTo(String value) {
            addCriterion("perm_code <=", value, "permCode");
            return (Criteria) this;
        }

        public Criteria andPermCodeLike(String value) {
            addCriterion("perm_code like", value, "permCode");
            return (Criteria) this;
        }

        public Criteria andPermCodeNotLike(String value) {
            addCriterion("perm_code not like", value, "permCode");
            return (Criteria) this;
        }

        public Criteria andPermCodeIn(List<String> values) {
            addCriterion("perm_code in", values, "permCode");
            return (Criteria) this;
        }

        public Criteria andPermCodeNotIn(List<String> values) {
            addCriterion("perm_code not in", values, "permCode");
            return (Criteria) this;
        }

        public Criteria andPermCodeBetween(String value1, String value2) {
            addCriterion("perm_code between", value1, value2, "permCode");
            return (Criteria) this;
        }

        public Criteria andPermCodeNotBetween(String value1, String value2) {
            addCriterion("perm_code not between", value1, value2, "permCode");
            return (Criteria) this;
        }

        public Criteria andPermStatusIsNull() {
            addCriterion("perm_status is null");
            return (Criteria) this;
        }

        public Criteria andPermStatusIsNotNull() {
            addCriterion("perm_status is not null");
            return (Criteria) this;
        }

        public Criteria andPermStatusEqualTo(Integer value) {
            addCriterion("perm_status =", value, "permStatus");
            return (Criteria) this;
        }

        public Criteria andPermStatusNotEqualTo(Integer value) {
            addCriterion("perm_status <>", value, "permStatus");
            return (Criteria) this;
        }

        public Criteria andPermStatusGreaterThan(Integer value) {
            addCriterion("perm_status >", value, "permStatus");
            return (Criteria) this;
        }

        public Criteria andPermStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("perm_status >=", value, "permStatus");
            return (Criteria) this;
        }

        public Criteria andPermStatusLessThan(Integer value) {
            addCriterion("perm_status <", value, "permStatus");
            return (Criteria) this;
        }

        public Criteria andPermStatusLessThanOrEqualTo(Integer value) {
            addCriterion("perm_status <=", value, "permStatus");
            return (Criteria) this;
        }

        public Criteria andPermStatusIn(List<Integer> values) {
            addCriterion("perm_status in", values, "permStatus");
            return (Criteria) this;
        }

        public Criteria andPermStatusNotIn(List<Integer> values) {
            addCriterion("perm_status not in", values, "permStatus");
            return (Criteria) this;
        }

        public Criteria andPermStatusBetween(Integer value1, Integer value2) {
            addCriterion("perm_status between", value1, value2, "permStatus");
            return (Criteria) this;
        }

        public Criteria andPermStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("perm_status not between", value1, value2, "permStatus");
            return (Criteria) this;
        }

        public Criteria andPermDescriptionIsNull() {
            addCriterion("perm_description is null");
            return (Criteria) this;
        }

        public Criteria andPermDescriptionIsNotNull() {
            addCriterion("perm_description is not null");
            return (Criteria) this;
        }

        public Criteria andPermDescriptionEqualTo(String value) {
            addCriterion("perm_description =", value, "permDescription");
            return (Criteria) this;
        }

        public Criteria andPermDescriptionNotEqualTo(String value) {
            addCriterion("perm_description <>", value, "permDescription");
            return (Criteria) this;
        }

        public Criteria andPermDescriptionGreaterThan(String value) {
            addCriterion("perm_description >", value, "permDescription");
            return (Criteria) this;
        }

        public Criteria andPermDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("perm_description >=", value, "permDescription");
            return (Criteria) this;
        }

        public Criteria andPermDescriptionLessThan(String value) {
            addCriterion("perm_description <", value, "permDescription");
            return (Criteria) this;
        }

        public Criteria andPermDescriptionLessThanOrEqualTo(String value) {
            addCriterion("perm_description <=", value, "permDescription");
            return (Criteria) this;
        }

        public Criteria andPermDescriptionLike(String value) {
            addCriterion("perm_description like", value, "permDescription");
            return (Criteria) this;
        }

        public Criteria andPermDescriptionNotLike(String value) {
            addCriterion("perm_description not like", value, "permDescription");
            return (Criteria) this;
        }

        public Criteria andPermDescriptionIn(List<String> values) {
            addCriterion("perm_description in", values, "permDescription");
            return (Criteria) this;
        }

        public Criteria andPermDescriptionNotIn(List<String> values) {
            addCriterion("perm_description not in", values, "permDescription");
            return (Criteria) this;
        }

        public Criteria andPermDescriptionBetween(String value1, String value2) {
            addCriterion("perm_description between", value1, value2, "permDescription");
            return (Criteria) this;
        }

        public Criteria andPermDescriptionNotBetween(String value1, String value2) {
            addCriterion("perm_description not between", value1, value2, "permDescription");
            return (Criteria) this;
        }

        public Criteria andPermParentIdIsNull() {
            addCriterion("perm_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andPermParentIdIsNotNull() {
            addCriterion("perm_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andPermParentIdEqualTo(Integer value) {
            addCriterion("perm_parent_id =", value, "permParentId");
            return (Criteria) this;
        }

        public Criteria andPermParentIdNotEqualTo(Integer value) {
            addCriterion("perm_parent_id <>", value, "permParentId");
            return (Criteria) this;
        }

        public Criteria andPermParentIdGreaterThan(Integer value) {
            addCriterion("perm_parent_id >", value, "permParentId");
            return (Criteria) this;
        }

        public Criteria andPermParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("perm_parent_id >=", value, "permParentId");
            return (Criteria) this;
        }

        public Criteria andPermParentIdLessThan(Integer value) {
            addCriterion("perm_parent_id <", value, "permParentId");
            return (Criteria) this;
        }

        public Criteria andPermParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("perm_parent_id <=", value, "permParentId");
            return (Criteria) this;
        }

        public Criteria andPermParentIdIn(List<Integer> values) {
            addCriterion("perm_parent_id in", values, "permParentId");
            return (Criteria) this;
        }

        public Criteria andPermParentIdNotIn(List<Integer> values) {
            addCriterion("perm_parent_id not in", values, "permParentId");
            return (Criteria) this;
        }

        public Criteria andPermParentIdBetween(Integer value1, Integer value2) {
            addCriterion("perm_parent_id between", value1, value2, "permParentId");
            return (Criteria) this;
        }

        public Criteria andPermParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("perm_parent_id not between", value1, value2, "permParentId");
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