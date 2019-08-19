package com.sdsoon.modular.system.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SsDailyTaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SsDailyTaskExample() {
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

        public Criteria andDailyTaskIdIsNull() {
            addCriterion("daily_task_id is null");
            return (Criteria) this;
        }

        public Criteria andDailyTaskIdIsNotNull() {
            addCriterion("daily_task_id is not null");
            return (Criteria) this;
        }

        public Criteria andDailyTaskIdEqualTo(String value) {
            addCriterion("daily_task_id =", value, "dailyTaskId");
            return (Criteria) this;
        }

        public Criteria andDailyTaskIdNotEqualTo(String value) {
            addCriterion("daily_task_id <>", value, "dailyTaskId");
            return (Criteria) this;
        }

        public Criteria andDailyTaskIdGreaterThan(String value) {
            addCriterion("daily_task_id >", value, "dailyTaskId");
            return (Criteria) this;
        }

        public Criteria andDailyTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("daily_task_id >=", value, "dailyTaskId");
            return (Criteria) this;
        }

        public Criteria andDailyTaskIdLessThan(String value) {
            addCriterion("daily_task_id <", value, "dailyTaskId");
            return (Criteria) this;
        }

        public Criteria andDailyTaskIdLessThanOrEqualTo(String value) {
            addCriterion("daily_task_id <=", value, "dailyTaskId");
            return (Criteria) this;
        }

        public Criteria andDailyTaskIdLike(String value) {
            addCriterion("daily_task_id like", value, "dailyTaskId");
            return (Criteria) this;
        }

        public Criteria andDailyTaskIdNotLike(String value) {
            addCriterion("daily_task_id not like", value, "dailyTaskId");
            return (Criteria) this;
        }

        public Criteria andDailyTaskIdIn(List<String> values) {
            addCriterion("daily_task_id in", values, "dailyTaskId");
            return (Criteria) this;
        }

        public Criteria andDailyTaskIdNotIn(List<String> values) {
            addCriterion("daily_task_id not in", values, "dailyTaskId");
            return (Criteria) this;
        }

        public Criteria andDailyTaskIdBetween(String value1, String value2) {
            addCriterion("daily_task_id between", value1, value2, "dailyTaskId");
            return (Criteria) this;
        }

        public Criteria andDailyTaskIdNotBetween(String value1, String value2) {
            addCriterion("daily_task_id not between", value1, value2, "dailyTaskId");
            return (Criteria) this;
        }

        public Criteria andDailyStatusIsNull() {
            addCriterion("daily_status is null");
            return (Criteria) this;
        }

        public Criteria andDailyStatusIsNotNull() {
            addCriterion("daily_status is not null");
            return (Criteria) this;
        }

        public Criteria andDailyStatusEqualTo(Integer value) {
            addCriterion("daily_status =", value, "dailyStatus");
            return (Criteria) this;
        }

        public Criteria andDailyStatusNotEqualTo(Integer value) {
            addCriterion("daily_status <>", value, "dailyStatus");
            return (Criteria) this;
        }

        public Criteria andDailyStatusGreaterThan(Integer value) {
            addCriterion("daily_status >", value, "dailyStatus");
            return (Criteria) this;
        }

        public Criteria andDailyStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("daily_status >=", value, "dailyStatus");
            return (Criteria) this;
        }

        public Criteria andDailyStatusLessThan(Integer value) {
            addCriterion("daily_status <", value, "dailyStatus");
            return (Criteria) this;
        }

        public Criteria andDailyStatusLessThanOrEqualTo(Integer value) {
            addCriterion("daily_status <=", value, "dailyStatus");
            return (Criteria) this;
        }

        public Criteria andDailyStatusIn(List<Integer> values) {
            addCriterion("daily_status in", values, "dailyStatus");
            return (Criteria) this;
        }

        public Criteria andDailyStatusNotIn(List<Integer> values) {
            addCriterion("daily_status not in", values, "dailyStatus");
            return (Criteria) this;
        }

        public Criteria andDailyStatusBetween(Integer value1, Integer value2) {
            addCriterion("daily_status between", value1, value2, "dailyStatus");
            return (Criteria) this;
        }

        public Criteria andDailyStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("daily_status not between", value1, value2, "dailyStatus");
            return (Criteria) this;
        }

        public Criteria andDailyCategoryIsNull() {
            addCriterion("daily_category is null");
            return (Criteria) this;
        }

        public Criteria andDailyCategoryIsNotNull() {
            addCriterion("daily_category is not null");
            return (Criteria) this;
        }

        public Criteria andDailyCategoryEqualTo(Integer value) {
            addCriterion("daily_category =", value, "dailyCategory");
            return (Criteria) this;
        }

        public Criteria andDailyCategoryNotEqualTo(Integer value) {
            addCriterion("daily_category <>", value, "dailyCategory");
            return (Criteria) this;
        }

        public Criteria andDailyCategoryGreaterThan(Integer value) {
            addCriterion("daily_category >", value, "dailyCategory");
            return (Criteria) this;
        }

        public Criteria andDailyCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("daily_category >=", value, "dailyCategory");
            return (Criteria) this;
        }

        public Criteria andDailyCategoryLessThan(Integer value) {
            addCriterion("daily_category <", value, "dailyCategory");
            return (Criteria) this;
        }

        public Criteria andDailyCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("daily_category <=", value, "dailyCategory");
            return (Criteria) this;
        }

        public Criteria andDailyCategoryIn(List<Integer> values) {
            addCriterion("daily_category in", values, "dailyCategory");
            return (Criteria) this;
        }

        public Criteria andDailyCategoryNotIn(List<Integer> values) {
            addCriterion("daily_category not in", values, "dailyCategory");
            return (Criteria) this;
        }

        public Criteria andDailyCategoryBetween(Integer value1, Integer value2) {
            addCriterion("daily_category between", value1, value2, "dailyCategory");
            return (Criteria) this;
        }

        public Criteria andDailyCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("daily_category not between", value1, value2, "dailyCategory");
            return (Criteria) this;
        }

        public Criteria andDailyCreateTimeIsNull() {
            addCriterion("daily_create_time is null");
            return (Criteria) this;
        }

        public Criteria andDailyCreateTimeIsNotNull() {
            addCriterion("daily_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andDailyCreateTimeEqualTo(Date value) {
            addCriterion("daily_create_time =", value, "dailyCreateTime");
            return (Criteria) this;
        }

        public Criteria andDailyCreateTimeNotEqualTo(Date value) {
            addCriterion("daily_create_time <>", value, "dailyCreateTime");
            return (Criteria) this;
        }

        public Criteria andDailyCreateTimeGreaterThan(Date value) {
            addCriterion("daily_create_time >", value, "dailyCreateTime");
            return (Criteria) this;
        }

        public Criteria andDailyCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("daily_create_time >=", value, "dailyCreateTime");
            return (Criteria) this;
        }

        public Criteria andDailyCreateTimeLessThan(Date value) {
            addCriterion("daily_create_time <", value, "dailyCreateTime");
            return (Criteria) this;
        }

        public Criteria andDailyCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("daily_create_time <=", value, "dailyCreateTime");
            return (Criteria) this;
        }

        public Criteria andDailyCreateTimeIn(List<Date> values) {
            addCriterion("daily_create_time in", values, "dailyCreateTime");
            return (Criteria) this;
        }

        public Criteria andDailyCreateTimeNotIn(List<Date> values) {
            addCriterion("daily_create_time not in", values, "dailyCreateTime");
            return (Criteria) this;
        }

        public Criteria andDailyCreateTimeBetween(Date value1, Date value2) {
            addCriterion("daily_create_time between", value1, value2, "dailyCreateTime");
            return (Criteria) this;
        }

        public Criteria andDailyCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("daily_create_time not between", value1, value2, "dailyCreateTime");
            return (Criteria) this;
        }

        public Criteria andDailyDescriptioinIsNull() {
            addCriterion("daily_descriptioin is null");
            return (Criteria) this;
        }

        public Criteria andDailyDescriptioinIsNotNull() {
            addCriterion("daily_descriptioin is not null");
            return (Criteria) this;
        }

        public Criteria andDailyDescriptioinEqualTo(String value) {
            addCriterion("daily_descriptioin =", value, "dailyDescriptioin");
            return (Criteria) this;
        }

        public Criteria andDailyDescriptioinNotEqualTo(String value) {
            addCriterion("daily_descriptioin <>", value, "dailyDescriptioin");
            return (Criteria) this;
        }

        public Criteria andDailyDescriptioinGreaterThan(String value) {
            addCriterion("daily_descriptioin >", value, "dailyDescriptioin");
            return (Criteria) this;
        }

        public Criteria andDailyDescriptioinGreaterThanOrEqualTo(String value) {
            addCriterion("daily_descriptioin >=", value, "dailyDescriptioin");
            return (Criteria) this;
        }

        public Criteria andDailyDescriptioinLessThan(String value) {
            addCriterion("daily_descriptioin <", value, "dailyDescriptioin");
            return (Criteria) this;
        }

        public Criteria andDailyDescriptioinLessThanOrEqualTo(String value) {
            addCriterion("daily_descriptioin <=", value, "dailyDescriptioin");
            return (Criteria) this;
        }

        public Criteria andDailyDescriptioinLike(String value) {
            addCriterion("daily_descriptioin like", value, "dailyDescriptioin");
            return (Criteria) this;
        }

        public Criteria andDailyDescriptioinNotLike(String value) {
            addCriterion("daily_descriptioin not like", value, "dailyDescriptioin");
            return (Criteria) this;
        }

        public Criteria andDailyDescriptioinIn(List<String> values) {
            addCriterion("daily_descriptioin in", values, "dailyDescriptioin");
            return (Criteria) this;
        }

        public Criteria andDailyDescriptioinNotIn(List<String> values) {
            addCriterion("daily_descriptioin not in", values, "dailyDescriptioin");
            return (Criteria) this;
        }

        public Criteria andDailyDescriptioinBetween(String value1, String value2) {
            addCriterion("daily_descriptioin between", value1, value2, "dailyDescriptioin");
            return (Criteria) this;
        }

        public Criteria andDailyDescriptioinNotBetween(String value1, String value2) {
            addCriterion("daily_descriptioin not between", value1, value2, "dailyDescriptioin");
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