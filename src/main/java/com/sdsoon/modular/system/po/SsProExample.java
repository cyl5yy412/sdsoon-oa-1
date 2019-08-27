package com.sdsoon.modular.system.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SsProExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SsProExample() {
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

        public Criteria andProIdIsNull() {
            addCriterion("pro_id is null");
            return (Criteria) this;
        }

        public Criteria andProIdIsNotNull() {
            addCriterion("pro_id is not null");
            return (Criteria) this;
        }

        public Criteria andProIdEqualTo(String value) {
            addCriterion("pro_id =", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotEqualTo(String value) {
            addCriterion("pro_id <>", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThan(String value) {
            addCriterion("pro_id >", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThanOrEqualTo(String value) {
            addCriterion("pro_id >=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThan(String value) {
            addCriterion("pro_id <", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThanOrEqualTo(String value) {
            addCriterion("pro_id <=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLike(String value) {
            addCriterion("pro_id like", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotLike(String value) {
            addCriterion("pro_id not like", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdIn(List<String> values) {
            addCriterion("pro_id in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotIn(List<String> values) {
            addCriterion("pro_id not in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdBetween(String value1, String value2) {
            addCriterion("pro_id between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotBetween(String value1, String value2) {
            addCriterion("pro_id not between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andProStatusIsNull() {
            addCriterion("pro_status is null");
            return (Criteria) this;
        }

        public Criteria andProStatusIsNotNull() {
            addCriterion("pro_status is not null");
            return (Criteria) this;
        }

        public Criteria andProStatusEqualTo(Integer value) {
            addCriterion("pro_status =", value, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusNotEqualTo(Integer value) {
            addCriterion("pro_status <>", value, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusGreaterThan(Integer value) {
            addCriterion("pro_status >", value, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_status >=", value, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusLessThan(Integer value) {
            addCriterion("pro_status <", value, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusLessThanOrEqualTo(Integer value) {
            addCriterion("pro_status <=", value, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusIn(List<Integer> values) {
            addCriterion("pro_status in", values, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusNotIn(List<Integer> values) {
            addCriterion("pro_status not in", values, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusBetween(Integer value1, Integer value2) {
            addCriterion("pro_status between", value1, value2, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_status not between", value1, value2, "proStatus");
            return (Criteria) this;
        }

        public Criteria andProCreateTimeIsNull() {
            addCriterion("pro_create_time is null");
            return (Criteria) this;
        }

        public Criteria andProCreateTimeIsNotNull() {
            addCriterion("pro_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andProCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("pro_create_time =", value, "proCreateTime");
            return (Criteria) this;
        }

        public Criteria andProCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("pro_create_time <>", value, "proCreateTime");
            return (Criteria) this;
        }

        public Criteria andProCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("pro_create_time >", value, "proCreateTime");
            return (Criteria) this;
        }

        public Criteria andProCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pro_create_time >=", value, "proCreateTime");
            return (Criteria) this;
        }

        public Criteria andProCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("pro_create_time <", value, "proCreateTime");
            return (Criteria) this;
        }

        public Criteria andProCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pro_create_time <=", value, "proCreateTime");
            return (Criteria) this;
        }

        public Criteria andProCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("pro_create_time in", values, "proCreateTime");
            return (Criteria) this;
        }

        public Criteria andProCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("pro_create_time not in", values, "proCreateTime");
            return (Criteria) this;
        }

        public Criteria andProCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pro_create_time between", value1, value2, "proCreateTime");
            return (Criteria) this;
        }

        public Criteria andProCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pro_create_time not between", value1, value2, "proCreateTime");
            return (Criteria) this;
        }

        public Criteria andProEndTimeIsNull() {
            addCriterion("pro_end_time is null");
            return (Criteria) this;
        }

        public Criteria andProEndTimeIsNotNull() {
            addCriterion("pro_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andProEndTimeEqualTo(Date value) {
            addCriterionForJDBCDate("pro_end_time =", value, "proEndTime");
            return (Criteria) this;
        }

        public Criteria andProEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("pro_end_time <>", value, "proEndTime");
            return (Criteria) this;
        }

        public Criteria andProEndTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("pro_end_time >", value, "proEndTime");
            return (Criteria) this;
        }

        public Criteria andProEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pro_end_time >=", value, "proEndTime");
            return (Criteria) this;
        }

        public Criteria andProEndTimeLessThan(Date value) {
            addCriterionForJDBCDate("pro_end_time <", value, "proEndTime");
            return (Criteria) this;
        }

        public Criteria andProEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pro_end_time <=", value, "proEndTime");
            return (Criteria) this;
        }

        public Criteria andProEndTimeIn(List<Date> values) {
            addCriterionForJDBCDate("pro_end_time in", values, "proEndTime");
            return (Criteria) this;
        }

        public Criteria andProEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("pro_end_time not in", values, "proEndTime");
            return (Criteria) this;
        }

        public Criteria andProEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pro_end_time between", value1, value2, "proEndTime");
            return (Criteria) this;
        }

        public Criteria andProEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pro_end_time not between", value1, value2, "proEndTime");
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

        public Criteria andProDocPathIsNull() {
            addCriterion("pro_doc_path is null");
            return (Criteria) this;
        }

        public Criteria andProDocPathIsNotNull() {
            addCriterion("pro_doc_path is not null");
            return (Criteria) this;
        }

        public Criteria andProDocPathEqualTo(String value) {
            addCriterion("pro_doc_path =", value, "proDocPath");
            return (Criteria) this;
        }

        public Criteria andProDocPathNotEqualTo(String value) {
            addCriterion("pro_doc_path <>", value, "proDocPath");
            return (Criteria) this;
        }

        public Criteria andProDocPathGreaterThan(String value) {
            addCriterion("pro_doc_path >", value, "proDocPath");
            return (Criteria) this;
        }

        public Criteria andProDocPathGreaterThanOrEqualTo(String value) {
            addCriterion("pro_doc_path >=", value, "proDocPath");
            return (Criteria) this;
        }

        public Criteria andProDocPathLessThan(String value) {
            addCriterion("pro_doc_path <", value, "proDocPath");
            return (Criteria) this;
        }

        public Criteria andProDocPathLessThanOrEqualTo(String value) {
            addCriterion("pro_doc_path <=", value, "proDocPath");
            return (Criteria) this;
        }

        public Criteria andProDocPathLike(String value) {
            addCriterion("pro_doc_path like", value, "proDocPath");
            return (Criteria) this;
        }

        public Criteria andProDocPathNotLike(String value) {
            addCriterion("pro_doc_path not like", value, "proDocPath");
            return (Criteria) this;
        }

        public Criteria andProDocPathIn(List<String> values) {
            addCriterion("pro_doc_path in", values, "proDocPath");
            return (Criteria) this;
        }

        public Criteria andProDocPathNotIn(List<String> values) {
            addCriterion("pro_doc_path not in", values, "proDocPath");
            return (Criteria) this;
        }

        public Criteria andProDocPathBetween(String value1, String value2) {
            addCriterion("pro_doc_path between", value1, value2, "proDocPath");
            return (Criteria) this;
        }

        public Criteria andProDocPathNotBetween(String value1, String value2) {
            addCriterion("pro_doc_path not between", value1, value2, "proDocPath");
            return (Criteria) this;
        }

        public Criteria andProLeaderNameIsNull() {
            addCriterion("pro_leader_name is null");
            return (Criteria) this;
        }

        public Criteria andProLeaderNameIsNotNull() {
            addCriterion("pro_leader_name is not null");
            return (Criteria) this;
        }

        public Criteria andProLeaderNameEqualTo(String value) {
            addCriterion("pro_leader_name =", value, "proLeaderName");
            return (Criteria) this;
        }

        public Criteria andProLeaderNameNotEqualTo(String value) {
            addCriterion("pro_leader_name <>", value, "proLeaderName");
            return (Criteria) this;
        }

        public Criteria andProLeaderNameGreaterThan(String value) {
            addCriterion("pro_leader_name >", value, "proLeaderName");
            return (Criteria) this;
        }

        public Criteria andProLeaderNameGreaterThanOrEqualTo(String value) {
            addCriterion("pro_leader_name >=", value, "proLeaderName");
            return (Criteria) this;
        }

        public Criteria andProLeaderNameLessThan(String value) {
            addCriterion("pro_leader_name <", value, "proLeaderName");
            return (Criteria) this;
        }

        public Criteria andProLeaderNameLessThanOrEqualTo(String value) {
            addCriterion("pro_leader_name <=", value, "proLeaderName");
            return (Criteria) this;
        }

        public Criteria andProLeaderNameLike(String value) {
            addCriterion("pro_leader_name like", value, "proLeaderName");
            return (Criteria) this;
        }

        public Criteria andProLeaderNameNotLike(String value) {
            addCriterion("pro_leader_name not like", value, "proLeaderName");
            return (Criteria) this;
        }

        public Criteria andProLeaderNameIn(List<String> values) {
            addCriterion("pro_leader_name in", values, "proLeaderName");
            return (Criteria) this;
        }

        public Criteria andProLeaderNameNotIn(List<String> values) {
            addCriterion("pro_leader_name not in", values, "proLeaderName");
            return (Criteria) this;
        }

        public Criteria andProLeaderNameBetween(String value1, String value2) {
            addCriterion("pro_leader_name between", value1, value2, "proLeaderName");
            return (Criteria) this;
        }

        public Criteria andProLeaderNameNotBetween(String value1, String value2) {
            addCriterion("pro_leader_name not between", value1, value2, "proLeaderName");
            return (Criteria) this;
        }

        public Criteria andProLevelIsNull() {
            addCriterion("pro_level is null");
            return (Criteria) this;
        }

        public Criteria andProLevelIsNotNull() {
            addCriterion("pro_level is not null");
            return (Criteria) this;
        }

        public Criteria andProLevelEqualTo(Integer value) {
            addCriterion("pro_level =", value, "proLevel");
            return (Criteria) this;
        }

        public Criteria andProLevelNotEqualTo(Integer value) {
            addCriterion("pro_level <>", value, "proLevel");
            return (Criteria) this;
        }

        public Criteria andProLevelGreaterThan(Integer value) {
            addCriterion("pro_level >", value, "proLevel");
            return (Criteria) this;
        }

        public Criteria andProLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_level >=", value, "proLevel");
            return (Criteria) this;
        }

        public Criteria andProLevelLessThan(Integer value) {
            addCriterion("pro_level <", value, "proLevel");
            return (Criteria) this;
        }

        public Criteria andProLevelLessThanOrEqualTo(Integer value) {
            addCriterion("pro_level <=", value, "proLevel");
            return (Criteria) this;
        }

        public Criteria andProLevelIn(List<Integer> values) {
            addCriterion("pro_level in", values, "proLevel");
            return (Criteria) this;
        }

        public Criteria andProLevelNotIn(List<Integer> values) {
            addCriterion("pro_level not in", values, "proLevel");
            return (Criteria) this;
        }

        public Criteria andProLevelBetween(Integer value1, Integer value2) {
            addCriterion("pro_level between", value1, value2, "proLevel");
            return (Criteria) this;
        }

        public Criteria andProLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_level not between", value1, value2, "proLevel");
            return (Criteria) this;
        }

        public Criteria andProNameIsNull() {
            addCriterion("pro_name is null");
            return (Criteria) this;
        }

        public Criteria andProNameIsNotNull() {
            addCriterion("pro_name is not null");
            return (Criteria) this;
        }

        public Criteria andProNameEqualTo(String value) {
            addCriterion("pro_name =", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotEqualTo(String value) {
            addCriterion("pro_name <>", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThan(String value) {
            addCriterion("pro_name >", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThanOrEqualTo(String value) {
            addCriterion("pro_name >=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThan(String value) {
            addCriterion("pro_name <", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThanOrEqualTo(String value) {
            addCriterion("pro_name <=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLike(String value) {
            addCriterion("pro_name like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotLike(String value) {
            addCriterion("pro_name not like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameIn(List<String> values) {
            addCriterion("pro_name in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotIn(List<String> values) {
            addCriterion("pro_name not in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameBetween(String value1, String value2) {
            addCriterion("pro_name between", value1, value2, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotBetween(String value1, String value2) {
            addCriterion("pro_name not between", value1, value2, "proName");
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