package com.sdsoon.modular.system.po;

import java.util.ArrayList;
import java.util.List;

public class SsProjectProdDocExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SsProjectProdDocExample() {
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

        public Criteria andProdDocIdIsNull() {
            addCriterion("prod_doc_id is null");
            return (Criteria) this;
        }

        public Criteria andProdDocIdIsNotNull() {
            addCriterion("prod_doc_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdDocIdEqualTo(String value) {
            addCriterion("prod_doc_id =", value, "prodDocId");
            return (Criteria) this;
        }

        public Criteria andProdDocIdNotEqualTo(String value) {
            addCriterion("prod_doc_id <>", value, "prodDocId");
            return (Criteria) this;
        }

        public Criteria andProdDocIdGreaterThan(String value) {
            addCriterion("prod_doc_id >", value, "prodDocId");
            return (Criteria) this;
        }

        public Criteria andProdDocIdGreaterThanOrEqualTo(String value) {
            addCriterion("prod_doc_id >=", value, "prodDocId");
            return (Criteria) this;
        }

        public Criteria andProdDocIdLessThan(String value) {
            addCriterion("prod_doc_id <", value, "prodDocId");
            return (Criteria) this;
        }

        public Criteria andProdDocIdLessThanOrEqualTo(String value) {
            addCriterion("prod_doc_id <=", value, "prodDocId");
            return (Criteria) this;
        }

        public Criteria andProdDocIdLike(String value) {
            addCriterion("prod_doc_id like", value, "prodDocId");
            return (Criteria) this;
        }

        public Criteria andProdDocIdNotLike(String value) {
            addCriterion("prod_doc_id not like", value, "prodDocId");
            return (Criteria) this;
        }

        public Criteria andProdDocIdIn(List<String> values) {
            addCriterion("prod_doc_id in", values, "prodDocId");
            return (Criteria) this;
        }

        public Criteria andProdDocIdNotIn(List<String> values) {
            addCriterion("prod_doc_id not in", values, "prodDocId");
            return (Criteria) this;
        }

        public Criteria andProdDocIdBetween(String value1, String value2) {
            addCriterion("prod_doc_id between", value1, value2, "prodDocId");
            return (Criteria) this;
        }

        public Criteria andProdDocIdNotBetween(String value1, String value2) {
            addCriterion("prod_doc_id not between", value1, value2, "prodDocId");
            return (Criteria) this;
        }

        public Criteria andProdDocOldNameIsNull() {
            addCriterion("prod_doc_old_name is null");
            return (Criteria) this;
        }

        public Criteria andProdDocOldNameIsNotNull() {
            addCriterion("prod_doc_old_name is not null");
            return (Criteria) this;
        }

        public Criteria andProdDocOldNameEqualTo(String value) {
            addCriterion("prod_doc_old_name =", value, "prodDocOldName");
            return (Criteria) this;
        }

        public Criteria andProdDocOldNameNotEqualTo(String value) {
            addCriterion("prod_doc_old_name <>", value, "prodDocOldName");
            return (Criteria) this;
        }

        public Criteria andProdDocOldNameGreaterThan(String value) {
            addCriterion("prod_doc_old_name >", value, "prodDocOldName");
            return (Criteria) this;
        }

        public Criteria andProdDocOldNameGreaterThanOrEqualTo(String value) {
            addCriterion("prod_doc_old_name >=", value, "prodDocOldName");
            return (Criteria) this;
        }

        public Criteria andProdDocOldNameLessThan(String value) {
            addCriterion("prod_doc_old_name <", value, "prodDocOldName");
            return (Criteria) this;
        }

        public Criteria andProdDocOldNameLessThanOrEqualTo(String value) {
            addCriterion("prod_doc_old_name <=", value, "prodDocOldName");
            return (Criteria) this;
        }

        public Criteria andProdDocOldNameLike(String value) {
            addCriterion("prod_doc_old_name like", value, "prodDocOldName");
            return (Criteria) this;
        }

        public Criteria andProdDocOldNameNotLike(String value) {
            addCriterion("prod_doc_old_name not like", value, "prodDocOldName");
            return (Criteria) this;
        }

        public Criteria andProdDocOldNameIn(List<String> values) {
            addCriterion("prod_doc_old_name in", values, "prodDocOldName");
            return (Criteria) this;
        }

        public Criteria andProdDocOldNameNotIn(List<String> values) {
            addCriterion("prod_doc_old_name not in", values, "prodDocOldName");
            return (Criteria) this;
        }

        public Criteria andProdDocOldNameBetween(String value1, String value2) {
            addCriterion("prod_doc_old_name between", value1, value2, "prodDocOldName");
            return (Criteria) this;
        }

        public Criteria andProdDocOldNameNotBetween(String value1, String value2) {
            addCriterion("prod_doc_old_name not between", value1, value2, "prodDocOldName");
            return (Criteria) this;
        }

        public Criteria andProdDocNewNameIsNull() {
            addCriterion("prod_doc_new_name is null");
            return (Criteria) this;
        }

        public Criteria andProdDocNewNameIsNotNull() {
            addCriterion("prod_doc_new_name is not null");
            return (Criteria) this;
        }

        public Criteria andProdDocNewNameEqualTo(String value) {
            addCriterion("prod_doc_new_name =", value, "prodDocNewName");
            return (Criteria) this;
        }

        public Criteria andProdDocNewNameNotEqualTo(String value) {
            addCriterion("prod_doc_new_name <>", value, "prodDocNewName");
            return (Criteria) this;
        }

        public Criteria andProdDocNewNameGreaterThan(String value) {
            addCriterion("prod_doc_new_name >", value, "prodDocNewName");
            return (Criteria) this;
        }

        public Criteria andProdDocNewNameGreaterThanOrEqualTo(String value) {
            addCriterion("prod_doc_new_name >=", value, "prodDocNewName");
            return (Criteria) this;
        }

        public Criteria andProdDocNewNameLessThan(String value) {
            addCriterion("prod_doc_new_name <", value, "prodDocNewName");
            return (Criteria) this;
        }

        public Criteria andProdDocNewNameLessThanOrEqualTo(String value) {
            addCriterion("prod_doc_new_name <=", value, "prodDocNewName");
            return (Criteria) this;
        }

        public Criteria andProdDocNewNameLike(String value) {
            addCriterion("prod_doc_new_name like", value, "prodDocNewName");
            return (Criteria) this;
        }

        public Criteria andProdDocNewNameNotLike(String value) {
            addCriterion("prod_doc_new_name not like", value, "prodDocNewName");
            return (Criteria) this;
        }

        public Criteria andProdDocNewNameIn(List<String> values) {
            addCriterion("prod_doc_new_name in", values, "prodDocNewName");
            return (Criteria) this;
        }

        public Criteria andProdDocNewNameNotIn(List<String> values) {
            addCriterion("prod_doc_new_name not in", values, "prodDocNewName");
            return (Criteria) this;
        }

        public Criteria andProdDocNewNameBetween(String value1, String value2) {
            addCriterion("prod_doc_new_name between", value1, value2, "prodDocNewName");
            return (Criteria) this;
        }

        public Criteria andProdDocNewNameNotBetween(String value1, String value2) {
            addCriterion("prod_doc_new_name not between", value1, value2, "prodDocNewName");
            return (Criteria) this;
        }

        public Criteria andProdDocPathIsNull() {
            addCriterion("prod_doc_path is null");
            return (Criteria) this;
        }

        public Criteria andProdDocPathIsNotNull() {
            addCriterion("prod_doc_path is not null");
            return (Criteria) this;
        }

        public Criteria andProdDocPathEqualTo(String value) {
            addCriterion("prod_doc_path =", value, "prodDocPath");
            return (Criteria) this;
        }

        public Criteria andProdDocPathNotEqualTo(String value) {
            addCriterion("prod_doc_path <>", value, "prodDocPath");
            return (Criteria) this;
        }

        public Criteria andProdDocPathGreaterThan(String value) {
            addCriterion("prod_doc_path >", value, "prodDocPath");
            return (Criteria) this;
        }

        public Criteria andProdDocPathGreaterThanOrEqualTo(String value) {
            addCriterion("prod_doc_path >=", value, "prodDocPath");
            return (Criteria) this;
        }

        public Criteria andProdDocPathLessThan(String value) {
            addCriterion("prod_doc_path <", value, "prodDocPath");
            return (Criteria) this;
        }

        public Criteria andProdDocPathLessThanOrEqualTo(String value) {
            addCriterion("prod_doc_path <=", value, "prodDocPath");
            return (Criteria) this;
        }

        public Criteria andProdDocPathLike(String value) {
            addCriterion("prod_doc_path like", value, "prodDocPath");
            return (Criteria) this;
        }

        public Criteria andProdDocPathNotLike(String value) {
            addCriterion("prod_doc_path not like", value, "prodDocPath");
            return (Criteria) this;
        }

        public Criteria andProdDocPathIn(List<String> values) {
            addCriterion("prod_doc_path in", values, "prodDocPath");
            return (Criteria) this;
        }

        public Criteria andProdDocPathNotIn(List<String> values) {
            addCriterion("prod_doc_path not in", values, "prodDocPath");
            return (Criteria) this;
        }

        public Criteria andProdDocPathBetween(String value1, String value2) {
            addCriterion("prod_doc_path between", value1, value2, "prodDocPath");
            return (Criteria) this;
        }

        public Criteria andProdDocPathNotBetween(String value1, String value2) {
            addCriterion("prod_doc_path not between", value1, value2, "prodDocPath");
            return (Criteria) this;
        }

        public Criteria andProdGProdIdIsNull() {
            addCriterion("prod_g_prod_id is null");
            return (Criteria) this;
        }

        public Criteria andProdGProdIdIsNotNull() {
            addCriterion("prod_g_prod_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdGProdIdEqualTo(String value) {
            addCriterion("prod_g_prod_id =", value, "prodGProdId");
            return (Criteria) this;
        }

        public Criteria andProdGProdIdNotEqualTo(String value) {
            addCriterion("prod_g_prod_id <>", value, "prodGProdId");
            return (Criteria) this;
        }

        public Criteria andProdGProdIdGreaterThan(String value) {
            addCriterion("prod_g_prod_id >", value, "prodGProdId");
            return (Criteria) this;
        }

        public Criteria andProdGProdIdGreaterThanOrEqualTo(String value) {
            addCriterion("prod_g_prod_id >=", value, "prodGProdId");
            return (Criteria) this;
        }

        public Criteria andProdGProdIdLessThan(String value) {
            addCriterion("prod_g_prod_id <", value, "prodGProdId");
            return (Criteria) this;
        }

        public Criteria andProdGProdIdLessThanOrEqualTo(String value) {
            addCriterion("prod_g_prod_id <=", value, "prodGProdId");
            return (Criteria) this;
        }

        public Criteria andProdGProdIdLike(String value) {
            addCriterion("prod_g_prod_id like", value, "prodGProdId");
            return (Criteria) this;
        }

        public Criteria andProdGProdIdNotLike(String value) {
            addCriterion("prod_g_prod_id not like", value, "prodGProdId");
            return (Criteria) this;
        }

        public Criteria andProdGProdIdIn(List<String> values) {
            addCriterion("prod_g_prod_id in", values, "prodGProdId");
            return (Criteria) this;
        }

        public Criteria andProdGProdIdNotIn(List<String> values) {
            addCriterion("prod_g_prod_id not in", values, "prodGProdId");
            return (Criteria) this;
        }

        public Criteria andProdGProdIdBetween(String value1, String value2) {
            addCriterion("prod_g_prod_id between", value1, value2, "prodGProdId");
            return (Criteria) this;
        }

        public Criteria andProdGProdIdNotBetween(String value1, String value2) {
            addCriterion("prod_g_prod_id not between", value1, value2, "prodGProdId");
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