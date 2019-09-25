package com.sdsoon.modular.system.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SsProjectProdExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SsProjectProdExample() {
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

        public Criteria andProjectProdIdIsNull() {
            addCriterion("project_prod_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectProdIdIsNotNull() {
            addCriterion("project_prod_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectProdIdEqualTo(String value) {
            addCriterion("project_prod_id =", value, "projectProdId");
            return (Criteria) this;
        }

        public Criteria andProjectProdIdNotEqualTo(String value) {
            addCriterion("project_prod_id <>", value, "projectProdId");
            return (Criteria) this;
        }

        public Criteria andProjectProdIdGreaterThan(String value) {
            addCriterion("project_prod_id >", value, "projectProdId");
            return (Criteria) this;
        }

        public Criteria andProjectProdIdGreaterThanOrEqualTo(String value) {
            addCriterion("project_prod_id >=", value, "projectProdId");
            return (Criteria) this;
        }

        public Criteria andProjectProdIdLessThan(String value) {
            addCriterion("project_prod_id <", value, "projectProdId");
            return (Criteria) this;
        }

        public Criteria andProjectProdIdLessThanOrEqualTo(String value) {
            addCriterion("project_prod_id <=", value, "projectProdId");
            return (Criteria) this;
        }

        public Criteria andProjectProdIdLike(String value) {
            addCriterion("project_prod_id like", value, "projectProdId");
            return (Criteria) this;
        }

        public Criteria andProjectProdIdNotLike(String value) {
            addCriterion("project_prod_id not like", value, "projectProdId");
            return (Criteria) this;
        }

        public Criteria andProjectProdIdIn(List<String> values) {
            addCriterion("project_prod_id in", values, "projectProdId");
            return (Criteria) this;
        }

        public Criteria andProjectProdIdNotIn(List<String> values) {
            addCriterion("project_prod_id not in", values, "projectProdId");
            return (Criteria) this;
        }

        public Criteria andProjectProdIdBetween(String value1, String value2) {
            addCriterion("project_prod_id between", value1, value2, "projectProdId");
            return (Criteria) this;
        }

        public Criteria andProjectProdIdNotBetween(String value1, String value2) {
            addCriterion("project_prod_id not between", value1, value2, "projectProdId");
            return (Criteria) this;
        }

        public Criteria andProjectProdMissionNameIsNull() {
            addCriterion("project_prod_mission_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectProdMissionNameIsNotNull() {
            addCriterion("project_prod_mission_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectProdMissionNameEqualTo(String value) {
            addCriterion("project_prod_mission_name =", value, "projectProdMissionName");
            return (Criteria) this;
        }

        public Criteria andProjectProdMissionNameNotEqualTo(String value) {
            addCriterion("project_prod_mission_name <>", value, "projectProdMissionName");
            return (Criteria) this;
        }

        public Criteria andProjectProdMissionNameGreaterThan(String value) {
            addCriterion("project_prod_mission_name >", value, "projectProdMissionName");
            return (Criteria) this;
        }

        public Criteria andProjectProdMissionNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_prod_mission_name >=", value, "projectProdMissionName");
            return (Criteria) this;
        }

        public Criteria andProjectProdMissionNameLessThan(String value) {
            addCriterion("project_prod_mission_name <", value, "projectProdMissionName");
            return (Criteria) this;
        }

        public Criteria andProjectProdMissionNameLessThanOrEqualTo(String value) {
            addCriterion("project_prod_mission_name <=", value, "projectProdMissionName");
            return (Criteria) this;
        }

        public Criteria andProjectProdMissionNameLike(String value) {
            addCriterion("project_prod_mission_name like", value, "projectProdMissionName");
            return (Criteria) this;
        }

        public Criteria andProjectProdMissionNameNotLike(String value) {
            addCriterion("project_prod_mission_name not like", value, "projectProdMissionName");
            return (Criteria) this;
        }

        public Criteria andProjectProdMissionNameIn(List<String> values) {
            addCriterion("project_prod_mission_name in", values, "projectProdMissionName");
            return (Criteria) this;
        }

        public Criteria andProjectProdMissionNameNotIn(List<String> values) {
            addCriterion("project_prod_mission_name not in", values, "projectProdMissionName");
            return (Criteria) this;
        }

        public Criteria andProjectProdMissionNameBetween(String value1, String value2) {
            addCriterion("project_prod_mission_name between", value1, value2, "projectProdMissionName");
            return (Criteria) this;
        }

        public Criteria andProjectProdMissionNameNotBetween(String value1, String value2) {
            addCriterion("project_prod_mission_name not between", value1, value2, "projectProdMissionName");
            return (Criteria) this;
        }

        public Criteria andProjectProdNameIsNull() {
            addCriterion("project_prod_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectProdNameIsNotNull() {
            addCriterion("project_prod_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectProdNameEqualTo(String value) {
            addCriterion("project_prod_name =", value, "projectProdName");
            return (Criteria) this;
        }

        public Criteria andProjectProdNameNotEqualTo(String value) {
            addCriterion("project_prod_name <>", value, "projectProdName");
            return (Criteria) this;
        }

        public Criteria andProjectProdNameGreaterThan(String value) {
            addCriterion("project_prod_name >", value, "projectProdName");
            return (Criteria) this;
        }

        public Criteria andProjectProdNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_prod_name >=", value, "projectProdName");
            return (Criteria) this;
        }

        public Criteria andProjectProdNameLessThan(String value) {
            addCriterion("project_prod_name <", value, "projectProdName");
            return (Criteria) this;
        }

        public Criteria andProjectProdNameLessThanOrEqualTo(String value) {
            addCriterion("project_prod_name <=", value, "projectProdName");
            return (Criteria) this;
        }

        public Criteria andProjectProdNameLike(String value) {
            addCriterion("project_prod_name like", value, "projectProdName");
            return (Criteria) this;
        }

        public Criteria andProjectProdNameNotLike(String value) {
            addCriterion("project_prod_name not like", value, "projectProdName");
            return (Criteria) this;
        }

        public Criteria andProjectProdNameIn(List<String> values) {
            addCriterion("project_prod_name in", values, "projectProdName");
            return (Criteria) this;
        }

        public Criteria andProjectProdNameNotIn(List<String> values) {
            addCriterion("project_prod_name not in", values, "projectProdName");
            return (Criteria) this;
        }

        public Criteria andProjectProdNameBetween(String value1, String value2) {
            addCriterion("project_prod_name between", value1, value2, "projectProdName");
            return (Criteria) this;
        }

        public Criteria andProjectProdNameNotBetween(String value1, String value2) {
            addCriterion("project_prod_name not between", value1, value2, "projectProdName");
            return (Criteria) this;
        }

        public Criteria andProjectProdDateIsNull() {
            addCriterion("project_prod_date is null");
            return (Criteria) this;
        }

        public Criteria andProjectProdDateIsNotNull() {
            addCriterion("project_prod_date is not null");
            return (Criteria) this;
        }

        public Criteria andProjectProdDateEqualTo(Date value) {
            addCriterionForJDBCDate("project_prod_date =", value, "projectProdDate");
            return (Criteria) this;
        }

        public Criteria andProjectProdDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("project_prod_date <>", value, "projectProdDate");
            return (Criteria) this;
        }

        public Criteria andProjectProdDateGreaterThan(Date value) {
            addCriterionForJDBCDate("project_prod_date >", value, "projectProdDate");
            return (Criteria) this;
        }

        public Criteria andProjectProdDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("project_prod_date >=", value, "projectProdDate");
            return (Criteria) this;
        }

        public Criteria andProjectProdDateLessThan(Date value) {
            addCriterionForJDBCDate("project_prod_date <", value, "projectProdDate");
            return (Criteria) this;
        }

        public Criteria andProjectProdDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("project_prod_date <=", value, "projectProdDate");
            return (Criteria) this;
        }

        public Criteria andProjectProdDateIn(List<Date> values) {
            addCriterionForJDBCDate("project_prod_date in", values, "projectProdDate");
            return (Criteria) this;
        }

        public Criteria andProjectProdDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("project_prod_date not in", values, "projectProdDate");
            return (Criteria) this;
        }

        public Criteria andProjectProdDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("project_prod_date between", value1, value2, "projectProdDate");
            return (Criteria) this;
        }

        public Criteria andProjectProdDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("project_prod_date not between", value1, value2, "projectProdDate");
            return (Criteria) this;
        }

        public Criteria andProjectProdLeaderNameIsNull() {
            addCriterion("project_prod_leader_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectProdLeaderNameIsNotNull() {
            addCriterion("project_prod_leader_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectProdLeaderNameEqualTo(String value) {
            addCriterion("project_prod_leader_name =", value, "projectProdLeaderName");
            return (Criteria) this;
        }

        public Criteria andProjectProdLeaderNameNotEqualTo(String value) {
            addCriterion("project_prod_leader_name <>", value, "projectProdLeaderName");
            return (Criteria) this;
        }

        public Criteria andProjectProdLeaderNameGreaterThan(String value) {
            addCriterion("project_prod_leader_name >", value, "projectProdLeaderName");
            return (Criteria) this;
        }

        public Criteria andProjectProdLeaderNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_prod_leader_name >=", value, "projectProdLeaderName");
            return (Criteria) this;
        }

        public Criteria andProjectProdLeaderNameLessThan(String value) {
            addCriterion("project_prod_leader_name <", value, "projectProdLeaderName");
            return (Criteria) this;
        }

        public Criteria andProjectProdLeaderNameLessThanOrEqualTo(String value) {
            addCriterion("project_prod_leader_name <=", value, "projectProdLeaderName");
            return (Criteria) this;
        }

        public Criteria andProjectProdLeaderNameLike(String value) {
            addCriterion("project_prod_leader_name like", value, "projectProdLeaderName");
            return (Criteria) this;
        }

        public Criteria andProjectProdLeaderNameNotLike(String value) {
            addCriterion("project_prod_leader_name not like", value, "projectProdLeaderName");
            return (Criteria) this;
        }

        public Criteria andProjectProdLeaderNameIn(List<String> values) {
            addCriterion("project_prod_leader_name in", values, "projectProdLeaderName");
            return (Criteria) this;
        }

        public Criteria andProjectProdLeaderNameNotIn(List<String> values) {
            addCriterion("project_prod_leader_name not in", values, "projectProdLeaderName");
            return (Criteria) this;
        }

        public Criteria andProjectProdLeaderNameBetween(String value1, String value2) {
            addCriterion("project_prod_leader_name between", value1, value2, "projectProdLeaderName");
            return (Criteria) this;
        }

        public Criteria andProjectProdLeaderNameNotBetween(String value1, String value2) {
            addCriterion("project_prod_leader_name not between", value1, value2, "projectProdLeaderName");
            return (Criteria) this;
        }

        public Criteria andProjectProdLeaderPhoneIsNull() {
            addCriterion("project_prod_leader_phone is null");
            return (Criteria) this;
        }

        public Criteria andProjectProdLeaderPhoneIsNotNull() {
            addCriterion("project_prod_leader_phone is not null");
            return (Criteria) this;
        }

        public Criteria andProjectProdLeaderPhoneEqualTo(String value) {
            addCriterion("project_prod_leader_phone =", value, "projectProdLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andProjectProdLeaderPhoneNotEqualTo(String value) {
            addCriterion("project_prod_leader_phone <>", value, "projectProdLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andProjectProdLeaderPhoneGreaterThan(String value) {
            addCriterion("project_prod_leader_phone >", value, "projectProdLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andProjectProdLeaderPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("project_prod_leader_phone >=", value, "projectProdLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andProjectProdLeaderPhoneLessThan(String value) {
            addCriterion("project_prod_leader_phone <", value, "projectProdLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andProjectProdLeaderPhoneLessThanOrEqualTo(String value) {
            addCriterion("project_prod_leader_phone <=", value, "projectProdLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andProjectProdLeaderPhoneLike(String value) {
            addCriterion("project_prod_leader_phone like", value, "projectProdLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andProjectProdLeaderPhoneNotLike(String value) {
            addCriterion("project_prod_leader_phone not like", value, "projectProdLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andProjectProdLeaderPhoneIn(List<String> values) {
            addCriterion("project_prod_leader_phone in", values, "projectProdLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andProjectProdLeaderPhoneNotIn(List<String> values) {
            addCriterion("project_prod_leader_phone not in", values, "projectProdLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andProjectProdLeaderPhoneBetween(String value1, String value2) {
            addCriterion("project_prod_leader_phone between", value1, value2, "projectProdLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andProjectProdLeaderPhoneNotBetween(String value1, String value2) {
            addCriterion("project_prod_leader_phone not between", value1, value2, "projectProdLeaderPhone");
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

        public Criteria andProjectProdPropleIsNull() {
            addCriterion("project_prod_prople is null");
            return (Criteria) this;
        }

        public Criteria andProjectProdPropleIsNotNull() {
            addCriterion("project_prod_prople is not null");
            return (Criteria) this;
        }

        public Criteria andProjectProdPropleEqualTo(String value) {
            addCriterion("project_prod_prople =", value, "projectProdProple");
            return (Criteria) this;
        }

        public Criteria andProjectProdPropleNotEqualTo(String value) {
            addCriterion("project_prod_prople <>", value, "projectProdProple");
            return (Criteria) this;
        }

        public Criteria andProjectProdPropleGreaterThan(String value) {
            addCriterion("project_prod_prople >", value, "projectProdProple");
            return (Criteria) this;
        }

        public Criteria andProjectProdPropleGreaterThanOrEqualTo(String value) {
            addCriterion("project_prod_prople >=", value, "projectProdProple");
            return (Criteria) this;
        }

        public Criteria andProjectProdPropleLessThan(String value) {
            addCriterion("project_prod_prople <", value, "projectProdProple");
            return (Criteria) this;
        }

        public Criteria andProjectProdPropleLessThanOrEqualTo(String value) {
            addCriterion("project_prod_prople <=", value, "projectProdProple");
            return (Criteria) this;
        }

        public Criteria andProjectProdPropleLike(String value) {
            addCriterion("project_prod_prople like", value, "projectProdProple");
            return (Criteria) this;
        }

        public Criteria andProjectProdPropleNotLike(String value) {
            addCriterion("project_prod_prople not like", value, "projectProdProple");
            return (Criteria) this;
        }

        public Criteria andProjectProdPropleIn(List<String> values) {
            addCriterion("project_prod_prople in", values, "projectProdProple");
            return (Criteria) this;
        }

        public Criteria andProjectProdPropleNotIn(List<String> values) {
            addCriterion("project_prod_prople not in", values, "projectProdProple");
            return (Criteria) this;
        }

        public Criteria andProjectProdPropleBetween(String value1, String value2) {
            addCriterion("project_prod_prople between", value1, value2, "projectProdProple");
            return (Criteria) this;
        }

        public Criteria andProjectProdPropleNotBetween(String value1, String value2) {
            addCriterion("project_prod_prople not between", value1, value2, "projectProdProple");
            return (Criteria) this;
        }

        public Criteria andProjectProdStatusIsNull() {
            addCriterion("project_prod_status is null");
            return (Criteria) this;
        }

        public Criteria andProjectProdStatusIsNotNull() {
            addCriterion("project_prod_status is not null");
            return (Criteria) this;
        }

        public Criteria andProjectProdStatusEqualTo(Integer value) {
            addCriterion("project_prod_status =", value, "projectProdStatus");
            return (Criteria) this;
        }

        public Criteria andProjectProdStatusNotEqualTo(Integer value) {
            addCriterion("project_prod_status <>", value, "projectProdStatus");
            return (Criteria) this;
        }

        public Criteria andProjectProdStatusGreaterThan(Integer value) {
            addCriterion("project_prod_status >", value, "projectProdStatus");
            return (Criteria) this;
        }

        public Criteria andProjectProdStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_prod_status >=", value, "projectProdStatus");
            return (Criteria) this;
        }

        public Criteria andProjectProdStatusLessThan(Integer value) {
            addCriterion("project_prod_status <", value, "projectProdStatus");
            return (Criteria) this;
        }

        public Criteria andProjectProdStatusLessThanOrEqualTo(Integer value) {
            addCriterion("project_prod_status <=", value, "projectProdStatus");
            return (Criteria) this;
        }

        public Criteria andProjectProdStatusIn(List<Integer> values) {
            addCriterion("project_prod_status in", values, "projectProdStatus");
            return (Criteria) this;
        }

        public Criteria andProjectProdStatusNotIn(List<Integer> values) {
            addCriterion("project_prod_status not in", values, "projectProdStatus");
            return (Criteria) this;
        }

        public Criteria andProjectProdStatusBetween(Integer value1, Integer value2) {
            addCriterion("project_prod_status between", value1, value2, "projectProdStatus");
            return (Criteria) this;
        }

        public Criteria andProjectProdStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("project_prod_status not between", value1, value2, "projectProdStatus");
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