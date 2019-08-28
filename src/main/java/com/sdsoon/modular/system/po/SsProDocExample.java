package com.sdsoon.modular.system.po;

import java.util.ArrayList;
import java.util.List;

public class SsProDocExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SsProDocExample() {
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

        public Criteria andProDocIdIsNull() {
            addCriterion("pro_doc_id is null");
            return (Criteria) this;
        }

        public Criteria andProDocIdIsNotNull() {
            addCriterion("pro_doc_id is not null");
            return (Criteria) this;
        }

        public Criteria andProDocIdEqualTo(String value) {
            addCriterion("pro_doc_id =", value, "proDocId");
            return (Criteria) this;
        }

        public Criteria andProDocIdNotEqualTo(String value) {
            addCriterion("pro_doc_id <>", value, "proDocId");
            return (Criteria) this;
        }

        public Criteria andProDocIdGreaterThan(String value) {
            addCriterion("pro_doc_id >", value, "proDocId");
            return (Criteria) this;
        }

        public Criteria andProDocIdGreaterThanOrEqualTo(String value) {
            addCriterion("pro_doc_id >=", value, "proDocId");
            return (Criteria) this;
        }

        public Criteria andProDocIdLessThan(String value) {
            addCriterion("pro_doc_id <", value, "proDocId");
            return (Criteria) this;
        }

        public Criteria andProDocIdLessThanOrEqualTo(String value) {
            addCriterion("pro_doc_id <=", value, "proDocId");
            return (Criteria) this;
        }

        public Criteria andProDocIdLike(String value) {
            addCriterion("pro_doc_id like", value, "proDocId");
            return (Criteria) this;
        }

        public Criteria andProDocIdNotLike(String value) {
            addCriterion("pro_doc_id not like", value, "proDocId");
            return (Criteria) this;
        }

        public Criteria andProDocIdIn(List<String> values) {
            addCriterion("pro_doc_id in", values, "proDocId");
            return (Criteria) this;
        }

        public Criteria andProDocIdNotIn(List<String> values) {
            addCriterion("pro_doc_id not in", values, "proDocId");
            return (Criteria) this;
        }

        public Criteria andProDocIdBetween(String value1, String value2) {
            addCriterion("pro_doc_id between", value1, value2, "proDocId");
            return (Criteria) this;
        }

        public Criteria andProDocIdNotBetween(String value1, String value2) {
            addCriterion("pro_doc_id not between", value1, value2, "proDocId");
            return (Criteria) this;
        }

        public Criteria andProNewDocNameIsNull() {
            addCriterion("pro_new_doc_name is null");
            return (Criteria) this;
        }

        public Criteria andProNewDocNameIsNotNull() {
            addCriterion("pro_new_doc_name is not null");
            return (Criteria) this;
        }

        public Criteria andProNewDocNameEqualTo(String value) {
            addCriterion("pro_new_doc_name =", value, "proNewDocName");
            return (Criteria) this;
        }

        public Criteria andProNewDocNameNotEqualTo(String value) {
            addCriterion("pro_new_doc_name <>", value, "proNewDocName");
            return (Criteria) this;
        }

        public Criteria andProNewDocNameGreaterThan(String value) {
            addCriterion("pro_new_doc_name >", value, "proNewDocName");
            return (Criteria) this;
        }

        public Criteria andProNewDocNameGreaterThanOrEqualTo(String value) {
            addCriterion("pro_new_doc_name >=", value, "proNewDocName");
            return (Criteria) this;
        }

        public Criteria andProNewDocNameLessThan(String value) {
            addCriterion("pro_new_doc_name <", value, "proNewDocName");
            return (Criteria) this;
        }

        public Criteria andProNewDocNameLessThanOrEqualTo(String value) {
            addCriterion("pro_new_doc_name <=", value, "proNewDocName");
            return (Criteria) this;
        }

        public Criteria andProNewDocNameLike(String value) {
            addCriterion("pro_new_doc_name like", value, "proNewDocName");
            return (Criteria) this;
        }

        public Criteria andProNewDocNameNotLike(String value) {
            addCriterion("pro_new_doc_name not like", value, "proNewDocName");
            return (Criteria) this;
        }

        public Criteria andProNewDocNameIn(List<String> values) {
            addCriterion("pro_new_doc_name in", values, "proNewDocName");
            return (Criteria) this;
        }

        public Criteria andProNewDocNameNotIn(List<String> values) {
            addCriterion("pro_new_doc_name not in", values, "proNewDocName");
            return (Criteria) this;
        }

        public Criteria andProNewDocNameBetween(String value1, String value2) {
            addCriterion("pro_new_doc_name between", value1, value2, "proNewDocName");
            return (Criteria) this;
        }

        public Criteria andProNewDocNameNotBetween(String value1, String value2) {
            addCriterion("pro_new_doc_name not between", value1, value2, "proNewDocName");
            return (Criteria) this;
        }

        public Criteria andProOldDocNameIsNull() {
            addCriterion("pro_old_doc_name is null");
            return (Criteria) this;
        }

        public Criteria andProOldDocNameIsNotNull() {
            addCriterion("pro_old_doc_name is not null");
            return (Criteria) this;
        }

        public Criteria andProOldDocNameEqualTo(String value) {
            addCriterion("pro_old_doc_name =", value, "proOldDocName");
            return (Criteria) this;
        }

        public Criteria andProOldDocNameNotEqualTo(String value) {
            addCriterion("pro_old_doc_name <>", value, "proOldDocName");
            return (Criteria) this;
        }

        public Criteria andProOldDocNameGreaterThan(String value) {
            addCriterion("pro_old_doc_name >", value, "proOldDocName");
            return (Criteria) this;
        }

        public Criteria andProOldDocNameGreaterThanOrEqualTo(String value) {
            addCriterion("pro_old_doc_name >=", value, "proOldDocName");
            return (Criteria) this;
        }

        public Criteria andProOldDocNameLessThan(String value) {
            addCriterion("pro_old_doc_name <", value, "proOldDocName");
            return (Criteria) this;
        }

        public Criteria andProOldDocNameLessThanOrEqualTo(String value) {
            addCriterion("pro_old_doc_name <=", value, "proOldDocName");
            return (Criteria) this;
        }

        public Criteria andProOldDocNameLike(String value) {
            addCriterion("pro_old_doc_name like", value, "proOldDocName");
            return (Criteria) this;
        }

        public Criteria andProOldDocNameNotLike(String value) {
            addCriterion("pro_old_doc_name not like", value, "proOldDocName");
            return (Criteria) this;
        }

        public Criteria andProOldDocNameIn(List<String> values) {
            addCriterion("pro_old_doc_name in", values, "proOldDocName");
            return (Criteria) this;
        }

        public Criteria andProOldDocNameNotIn(List<String> values) {
            addCriterion("pro_old_doc_name not in", values, "proOldDocName");
            return (Criteria) this;
        }

        public Criteria andProOldDocNameBetween(String value1, String value2) {
            addCriterion("pro_old_doc_name between", value1, value2, "proOldDocName");
            return (Criteria) this;
        }

        public Criteria andProOldDocNameNotBetween(String value1, String value2) {
            addCriterion("pro_old_doc_name not between", value1, value2, "proOldDocName");
            return (Criteria) this;
        }

        public Criteria andProPathIsNull() {
            addCriterion("pro_path is null");
            return (Criteria) this;
        }

        public Criteria andProPathIsNotNull() {
            addCriterion("pro_path is not null");
            return (Criteria) this;
        }

        public Criteria andProPathEqualTo(String value) {
            addCriterion("pro_path =", value, "proPath");
            return (Criteria) this;
        }

        public Criteria andProPathNotEqualTo(String value) {
            addCriterion("pro_path <>", value, "proPath");
            return (Criteria) this;
        }

        public Criteria andProPathGreaterThan(String value) {
            addCriterion("pro_path >", value, "proPath");
            return (Criteria) this;
        }

        public Criteria andProPathGreaterThanOrEqualTo(String value) {
            addCriterion("pro_path >=", value, "proPath");
            return (Criteria) this;
        }

        public Criteria andProPathLessThan(String value) {
            addCriterion("pro_path <", value, "proPath");
            return (Criteria) this;
        }

        public Criteria andProPathLessThanOrEqualTo(String value) {
            addCriterion("pro_path <=", value, "proPath");
            return (Criteria) this;
        }

        public Criteria andProPathLike(String value) {
            addCriterion("pro_path like", value, "proPath");
            return (Criteria) this;
        }

        public Criteria andProPathNotLike(String value) {
            addCriterion("pro_path not like", value, "proPath");
            return (Criteria) this;
        }

        public Criteria andProPathIn(List<String> values) {
            addCriterion("pro_path in", values, "proPath");
            return (Criteria) this;
        }

        public Criteria andProPathNotIn(List<String> values) {
            addCriterion("pro_path not in", values, "proPath");
            return (Criteria) this;
        }

        public Criteria andProPathBetween(String value1, String value2) {
            addCriterion("pro_path between", value1, value2, "proPath");
            return (Criteria) this;
        }

        public Criteria andProPathNotBetween(String value1, String value2) {
            addCriterion("pro_path not between", value1, value2, "proPath");
            return (Criteria) this;
        }

        public Criteria andProDocGProIdIsNull() {
            addCriterion("pro_doc_g_pro_id is null");
            return (Criteria) this;
        }

        public Criteria andProDocGProIdIsNotNull() {
            addCriterion("pro_doc_g_pro_id is not null");
            return (Criteria) this;
        }

        public Criteria andProDocGProIdEqualTo(String value) {
            addCriterion("pro_doc_g_pro_id =", value, "proDocGProId");
            return (Criteria) this;
        }

        public Criteria andProDocGProIdNotEqualTo(String value) {
            addCriterion("pro_doc_g_pro_id <>", value, "proDocGProId");
            return (Criteria) this;
        }

        public Criteria andProDocGProIdGreaterThan(String value) {
            addCriterion("pro_doc_g_pro_id >", value, "proDocGProId");
            return (Criteria) this;
        }

        public Criteria andProDocGProIdGreaterThanOrEqualTo(String value) {
            addCriterion("pro_doc_g_pro_id >=", value, "proDocGProId");
            return (Criteria) this;
        }

        public Criteria andProDocGProIdLessThan(String value) {
            addCriterion("pro_doc_g_pro_id <", value, "proDocGProId");
            return (Criteria) this;
        }

        public Criteria andProDocGProIdLessThanOrEqualTo(String value) {
            addCriterion("pro_doc_g_pro_id <=", value, "proDocGProId");
            return (Criteria) this;
        }

        public Criteria andProDocGProIdLike(String value) {
            addCriterion("pro_doc_g_pro_id like", value, "proDocGProId");
            return (Criteria) this;
        }

        public Criteria andProDocGProIdNotLike(String value) {
            addCriterion("pro_doc_g_pro_id not like", value, "proDocGProId");
            return (Criteria) this;
        }

        public Criteria andProDocGProIdIn(List<String> values) {
            addCriterion("pro_doc_g_pro_id in", values, "proDocGProId");
            return (Criteria) this;
        }

        public Criteria andProDocGProIdNotIn(List<String> values) {
            addCriterion("pro_doc_g_pro_id not in", values, "proDocGProId");
            return (Criteria) this;
        }

        public Criteria andProDocGProIdBetween(String value1, String value2) {
            addCriterion("pro_doc_g_pro_id between", value1, value2, "proDocGProId");
            return (Criteria) this;
        }

        public Criteria andProDocGProIdNotBetween(String value1, String value2) {
            addCriterion("pro_doc_g_pro_id not between", value1, value2, "proDocGProId");
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