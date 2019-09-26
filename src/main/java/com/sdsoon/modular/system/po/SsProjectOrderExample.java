package com.sdsoon.modular.system.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SsProjectOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SsProjectOrderExample() {
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

        public Criteria andProjectOrderIdIsNull() {
            addCriterion("project_order_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectOrderIdIsNotNull() {
            addCriterion("project_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectOrderIdEqualTo(String value) {
            addCriterion("project_order_id =", value, "projectOrderId");
            return (Criteria) this;
        }

        public Criteria andProjectOrderIdNotEqualTo(String value) {
            addCriterion("project_order_id <>", value, "projectOrderId");
            return (Criteria) this;
        }

        public Criteria andProjectOrderIdGreaterThan(String value) {
            addCriterion("project_order_id >", value, "projectOrderId");
            return (Criteria) this;
        }

        public Criteria andProjectOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("project_order_id >=", value, "projectOrderId");
            return (Criteria) this;
        }

        public Criteria andProjectOrderIdLessThan(String value) {
            addCriterion("project_order_id <", value, "projectOrderId");
            return (Criteria) this;
        }

        public Criteria andProjectOrderIdLessThanOrEqualTo(String value) {
            addCriterion("project_order_id <=", value, "projectOrderId");
            return (Criteria) this;
        }

        public Criteria andProjectOrderIdLike(String value) {
            addCriterion("project_order_id like", value, "projectOrderId");
            return (Criteria) this;
        }

        public Criteria andProjectOrderIdNotLike(String value) {
            addCriterion("project_order_id not like", value, "projectOrderId");
            return (Criteria) this;
        }

        public Criteria andProjectOrderIdIn(List<String> values) {
            addCriterion("project_order_id in", values, "projectOrderId");
            return (Criteria) this;
        }

        public Criteria andProjectOrderIdNotIn(List<String> values) {
            addCriterion("project_order_id not in", values, "projectOrderId");
            return (Criteria) this;
        }

        public Criteria andProjectOrderIdBetween(String value1, String value2) {
            addCriterion("project_order_id between", value1, value2, "projectOrderId");
            return (Criteria) this;
        }

        public Criteria andProjectOrderIdNotBetween(String value1, String value2) {
            addCriterion("project_order_id not between", value1, value2, "projectOrderId");
            return (Criteria) this;
        }

        public Criteria andProjectOrderProducerIsNull() {
            addCriterion("project_order_producer is null");
            return (Criteria) this;
        }

        public Criteria andProjectOrderProducerIsNotNull() {
            addCriterion("project_order_producer is not null");
            return (Criteria) this;
        }

        public Criteria andProjectOrderProducerEqualTo(String value) {
            addCriterion("project_order_producer =", value, "projectOrderProducer");
            return (Criteria) this;
        }

        public Criteria andProjectOrderProducerNotEqualTo(String value) {
            addCriterion("project_order_producer <>", value, "projectOrderProducer");
            return (Criteria) this;
        }

        public Criteria andProjectOrderProducerGreaterThan(String value) {
            addCriterion("project_order_producer >", value, "projectOrderProducer");
            return (Criteria) this;
        }

        public Criteria andProjectOrderProducerGreaterThanOrEqualTo(String value) {
            addCriterion("project_order_producer >=", value, "projectOrderProducer");
            return (Criteria) this;
        }

        public Criteria andProjectOrderProducerLessThan(String value) {
            addCriterion("project_order_producer <", value, "projectOrderProducer");
            return (Criteria) this;
        }

        public Criteria andProjectOrderProducerLessThanOrEqualTo(String value) {
            addCriterion("project_order_producer <=", value, "projectOrderProducer");
            return (Criteria) this;
        }

        public Criteria andProjectOrderProducerLike(String value) {
            addCriterion("project_order_producer like", value, "projectOrderProducer");
            return (Criteria) this;
        }

        public Criteria andProjectOrderProducerNotLike(String value) {
            addCriterion("project_order_producer not like", value, "projectOrderProducer");
            return (Criteria) this;
        }

        public Criteria andProjectOrderProducerIn(List<String> values) {
            addCriterion("project_order_producer in", values, "projectOrderProducer");
            return (Criteria) this;
        }

        public Criteria andProjectOrderProducerNotIn(List<String> values) {
            addCriterion("project_order_producer not in", values, "projectOrderProducer");
            return (Criteria) this;
        }

        public Criteria andProjectOrderProducerBetween(String value1, String value2) {
            addCriterion("project_order_producer between", value1, value2, "projectOrderProducer");
            return (Criteria) this;
        }

        public Criteria andProjectOrderProducerNotBetween(String value1, String value2) {
            addCriterion("project_order_producer not between", value1, value2, "projectOrderProducer");
            return (Criteria) this;
        }

        public Criteria andProjectGProdIdIsNull() {
            addCriterion("project_g_prod_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectGProdIdIsNotNull() {
            addCriterion("project_g_prod_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectGProdIdEqualTo(String value) {
            addCriterion("project_g_prod_id =", value, "projectGProdId");
            return (Criteria) this;
        }

        public Criteria andProjectGProdIdNotEqualTo(String value) {
            addCriterion("project_g_prod_id <>", value, "projectGProdId");
            return (Criteria) this;
        }

        public Criteria andProjectGProdIdGreaterThan(String value) {
            addCriterion("project_g_prod_id >", value, "projectGProdId");
            return (Criteria) this;
        }

        public Criteria andProjectGProdIdGreaterThanOrEqualTo(String value) {
            addCriterion("project_g_prod_id >=", value, "projectGProdId");
            return (Criteria) this;
        }

        public Criteria andProjectGProdIdLessThan(String value) {
            addCriterion("project_g_prod_id <", value, "projectGProdId");
            return (Criteria) this;
        }

        public Criteria andProjectGProdIdLessThanOrEqualTo(String value) {
            addCriterion("project_g_prod_id <=", value, "projectGProdId");
            return (Criteria) this;
        }

        public Criteria andProjectGProdIdLike(String value) {
            addCriterion("project_g_prod_id like", value, "projectGProdId");
            return (Criteria) this;
        }

        public Criteria andProjectGProdIdNotLike(String value) {
            addCriterion("project_g_prod_id not like", value, "projectGProdId");
            return (Criteria) this;
        }

        public Criteria andProjectGProdIdIn(List<String> values) {
            addCriterion("project_g_prod_id in", values, "projectGProdId");
            return (Criteria) this;
        }

        public Criteria andProjectGProdIdNotIn(List<String> values) {
            addCriterion("project_g_prod_id not in", values, "projectGProdId");
            return (Criteria) this;
        }

        public Criteria andProjectGProdIdBetween(String value1, String value2) {
            addCriterion("project_g_prod_id between", value1, value2, "projectGProdId");
            return (Criteria) this;
        }

        public Criteria andProjectGProdIdNotBetween(String value1, String value2) {
            addCriterion("project_g_prod_id not between", value1, value2, "projectGProdId");
            return (Criteria) this;
        }

        public Criteria andProjectOrderPartIsNull() {
            addCriterion("project_order_part is null");
            return (Criteria) this;
        }

        public Criteria andProjectOrderPartIsNotNull() {
            addCriterion("project_order_part is not null");
            return (Criteria) this;
        }

        public Criteria andProjectOrderPartEqualTo(String value) {
            addCriterion("project_order_part =", value, "projectOrderPart");
            return (Criteria) this;
        }

        public Criteria andProjectOrderPartNotEqualTo(String value) {
            addCriterion("project_order_part <>", value, "projectOrderPart");
            return (Criteria) this;
        }

        public Criteria andProjectOrderPartGreaterThan(String value) {
            addCriterion("project_order_part >", value, "projectOrderPart");
            return (Criteria) this;
        }

        public Criteria andProjectOrderPartGreaterThanOrEqualTo(String value) {
            addCriterion("project_order_part >=", value, "projectOrderPart");
            return (Criteria) this;
        }

        public Criteria andProjectOrderPartLessThan(String value) {
            addCriterion("project_order_part <", value, "projectOrderPart");
            return (Criteria) this;
        }

        public Criteria andProjectOrderPartLessThanOrEqualTo(String value) {
            addCriterion("project_order_part <=", value, "projectOrderPart");
            return (Criteria) this;
        }

        public Criteria andProjectOrderPartLike(String value) {
            addCriterion("project_order_part like", value, "projectOrderPart");
            return (Criteria) this;
        }

        public Criteria andProjectOrderPartNotLike(String value) {
            addCriterion("project_order_part not like", value, "projectOrderPart");
            return (Criteria) this;
        }

        public Criteria andProjectOrderPartIn(List<String> values) {
            addCriterion("project_order_part in", values, "projectOrderPart");
            return (Criteria) this;
        }

        public Criteria andProjectOrderPartNotIn(List<String> values) {
            addCriterion("project_order_part not in", values, "projectOrderPart");
            return (Criteria) this;
        }

        public Criteria andProjectOrderPartBetween(String value1, String value2) {
            addCriterion("project_order_part between", value1, value2, "projectOrderPart");
            return (Criteria) this;
        }

        public Criteria andProjectOrderPartNotBetween(String value1, String value2) {
            addCriterion("project_order_part not between", value1, value2, "projectOrderPart");
            return (Criteria) this;
        }

        public Criteria andProjectOrderLeaderNameIsNull() {
            addCriterion("project_order_leader_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectOrderLeaderNameIsNotNull() {
            addCriterion("project_order_leader_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectOrderLeaderNameEqualTo(String value) {
            addCriterion("project_order_leader_name =", value, "projectOrderLeaderName");
            return (Criteria) this;
        }

        public Criteria andProjectOrderLeaderNameNotEqualTo(String value) {
            addCriterion("project_order_leader_name <>", value, "projectOrderLeaderName");
            return (Criteria) this;
        }

        public Criteria andProjectOrderLeaderNameGreaterThan(String value) {
            addCriterion("project_order_leader_name >", value, "projectOrderLeaderName");
            return (Criteria) this;
        }

        public Criteria andProjectOrderLeaderNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_order_leader_name >=", value, "projectOrderLeaderName");
            return (Criteria) this;
        }

        public Criteria andProjectOrderLeaderNameLessThan(String value) {
            addCriterion("project_order_leader_name <", value, "projectOrderLeaderName");
            return (Criteria) this;
        }

        public Criteria andProjectOrderLeaderNameLessThanOrEqualTo(String value) {
            addCriterion("project_order_leader_name <=", value, "projectOrderLeaderName");
            return (Criteria) this;
        }

        public Criteria andProjectOrderLeaderNameLike(String value) {
            addCriterion("project_order_leader_name like", value, "projectOrderLeaderName");
            return (Criteria) this;
        }

        public Criteria andProjectOrderLeaderNameNotLike(String value) {
            addCriterion("project_order_leader_name not like", value, "projectOrderLeaderName");
            return (Criteria) this;
        }

        public Criteria andProjectOrderLeaderNameIn(List<String> values) {
            addCriterion("project_order_leader_name in", values, "projectOrderLeaderName");
            return (Criteria) this;
        }

        public Criteria andProjectOrderLeaderNameNotIn(List<String> values) {
            addCriterion("project_order_leader_name not in", values, "projectOrderLeaderName");
            return (Criteria) this;
        }

        public Criteria andProjectOrderLeaderNameBetween(String value1, String value2) {
            addCriterion("project_order_leader_name between", value1, value2, "projectOrderLeaderName");
            return (Criteria) this;
        }

        public Criteria andProjectOrderLeaderNameNotBetween(String value1, String value2) {
            addCriterion("project_order_leader_name not between", value1, value2, "projectOrderLeaderName");
            return (Criteria) this;
        }

        public Criteria andProjectOrderLeaderPhoneIsNull() {
            addCriterion("project_order_leader_phone is null");
            return (Criteria) this;
        }

        public Criteria andProjectOrderLeaderPhoneIsNotNull() {
            addCriterion("project_order_leader_phone is not null");
            return (Criteria) this;
        }

        public Criteria andProjectOrderLeaderPhoneEqualTo(String value) {
            addCriterion("project_order_leader_phone =", value, "projectOrderLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andProjectOrderLeaderPhoneNotEqualTo(String value) {
            addCriterion("project_order_leader_phone <>", value, "projectOrderLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andProjectOrderLeaderPhoneGreaterThan(String value) {
            addCriterion("project_order_leader_phone >", value, "projectOrderLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andProjectOrderLeaderPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("project_order_leader_phone >=", value, "projectOrderLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andProjectOrderLeaderPhoneLessThan(String value) {
            addCriterion("project_order_leader_phone <", value, "projectOrderLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andProjectOrderLeaderPhoneLessThanOrEqualTo(String value) {
            addCriterion("project_order_leader_phone <=", value, "projectOrderLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andProjectOrderLeaderPhoneLike(String value) {
            addCriterion("project_order_leader_phone like", value, "projectOrderLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andProjectOrderLeaderPhoneNotLike(String value) {
            addCriterion("project_order_leader_phone not like", value, "projectOrderLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andProjectOrderLeaderPhoneIn(List<String> values) {
            addCriterion("project_order_leader_phone in", values, "projectOrderLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andProjectOrderLeaderPhoneNotIn(List<String> values) {
            addCriterion("project_order_leader_phone not in", values, "projectOrderLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andProjectOrderLeaderPhoneBetween(String value1, String value2) {
            addCriterion("project_order_leader_phone between", value1, value2, "projectOrderLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andProjectOrderLeaderPhoneNotBetween(String value1, String value2) {
            addCriterion("project_order_leader_phone not between", value1, value2, "projectOrderLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andProjectOrderStatusIsNull() {
            addCriterion("project_order_status is null");
            return (Criteria) this;
        }

        public Criteria andProjectOrderStatusIsNotNull() {
            addCriterion("project_order_status is not null");
            return (Criteria) this;
        }

        public Criteria andProjectOrderStatusEqualTo(Integer value) {
            addCriterion("project_order_status =", value, "projectOrderStatus");
            return (Criteria) this;
        }

        public Criteria andProjectOrderStatusNotEqualTo(Integer value) {
            addCriterion("project_order_status <>", value, "projectOrderStatus");
            return (Criteria) this;
        }

        public Criteria andProjectOrderStatusGreaterThan(Integer value) {
            addCriterion("project_order_status >", value, "projectOrderStatus");
            return (Criteria) this;
        }

        public Criteria andProjectOrderStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_order_status >=", value, "projectOrderStatus");
            return (Criteria) this;
        }

        public Criteria andProjectOrderStatusLessThan(Integer value) {
            addCriterion("project_order_status <", value, "projectOrderStatus");
            return (Criteria) this;
        }

        public Criteria andProjectOrderStatusLessThanOrEqualTo(Integer value) {
            addCriterion("project_order_status <=", value, "projectOrderStatus");
            return (Criteria) this;
        }

        public Criteria andProjectOrderStatusIn(List<Integer> values) {
            addCriterion("project_order_status in", values, "projectOrderStatus");
            return (Criteria) this;
        }

        public Criteria andProjectOrderStatusNotIn(List<Integer> values) {
            addCriterion("project_order_status not in", values, "projectOrderStatus");
            return (Criteria) this;
        }

        public Criteria andProjectOrderStatusBetween(Integer value1, Integer value2) {
            addCriterion("project_order_status between", value1, value2, "projectOrderStatus");
            return (Criteria) this;
        }

        public Criteria andProjectOrderStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("project_order_status not between", value1, value2, "projectOrderStatus");
            return (Criteria) this;
        }

        public Criteria andProjectOrderDateIsNull() {
            addCriterion("project_order_date is null");
            return (Criteria) this;
        }

        public Criteria andProjectOrderDateIsNotNull() {
            addCriterion("project_order_date is not null");
            return (Criteria) this;
        }

        public Criteria andProjectOrderDateEqualTo(Date value) {
            addCriterionForJDBCDate("project_order_date =", value, "projectOrderDate");
            return (Criteria) this;
        }

        public Criteria andProjectOrderDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("project_order_date <>", value, "projectOrderDate");
            return (Criteria) this;
        }

        public Criteria andProjectOrderDateGreaterThan(Date value) {
            addCriterionForJDBCDate("project_order_date >", value, "projectOrderDate");
            return (Criteria) this;
        }

        public Criteria andProjectOrderDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("project_order_date >=", value, "projectOrderDate");
            return (Criteria) this;
        }

        public Criteria andProjectOrderDateLessThan(Date value) {
            addCriterionForJDBCDate("project_order_date <", value, "projectOrderDate");
            return (Criteria) this;
        }

        public Criteria andProjectOrderDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("project_order_date <=", value, "projectOrderDate");
            return (Criteria) this;
        }

        public Criteria andProjectOrderDateIn(List<Date> values) {
            addCriterionForJDBCDate("project_order_date in", values, "projectOrderDate");
            return (Criteria) this;
        }

        public Criteria andProjectOrderDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("project_order_date not in", values, "projectOrderDate");
            return (Criteria) this;
        }

        public Criteria andProjectOrderDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("project_order_date between", value1, value2, "projectOrderDate");
            return (Criteria) this;
        }

        public Criteria andProjectOrderDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("project_order_date not between", value1, value2, "projectOrderDate");
            return (Criteria) this;
        }

        public Criteria andProjectOrderNameIsNull() {
            addCriterion("project_order_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectOrderNameIsNotNull() {
            addCriterion("project_order_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectOrderNameEqualTo(String value) {
            addCriterion("project_order_name =", value, "projectOrderName");
            return (Criteria) this;
        }

        public Criteria andProjectOrderNameNotEqualTo(String value) {
            addCriterion("project_order_name <>", value, "projectOrderName");
            return (Criteria) this;
        }

        public Criteria andProjectOrderNameGreaterThan(String value) {
            addCriterion("project_order_name >", value, "projectOrderName");
            return (Criteria) this;
        }

        public Criteria andProjectOrderNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_order_name >=", value, "projectOrderName");
            return (Criteria) this;
        }

        public Criteria andProjectOrderNameLessThan(String value) {
            addCriterion("project_order_name <", value, "projectOrderName");
            return (Criteria) this;
        }

        public Criteria andProjectOrderNameLessThanOrEqualTo(String value) {
            addCriterion("project_order_name <=", value, "projectOrderName");
            return (Criteria) this;
        }

        public Criteria andProjectOrderNameLike(String value) {
            addCriterion("project_order_name like", value, "projectOrderName");
            return (Criteria) this;
        }

        public Criteria andProjectOrderNameNotLike(String value) {
            addCriterion("project_order_name not like", value, "projectOrderName");
            return (Criteria) this;
        }

        public Criteria andProjectOrderNameIn(List<String> values) {
            addCriterion("project_order_name in", values, "projectOrderName");
            return (Criteria) this;
        }

        public Criteria andProjectOrderNameNotIn(List<String> values) {
            addCriterion("project_order_name not in", values, "projectOrderName");
            return (Criteria) this;
        }

        public Criteria andProjectOrderNameBetween(String value1, String value2) {
            addCriterion("project_order_name between", value1, value2, "projectOrderName");
            return (Criteria) this;
        }

        public Criteria andProjectOrderNameNotBetween(String value1, String value2) {
            addCriterion("project_order_name not between", value1, value2, "projectOrderName");
            return (Criteria) this;
        }

        public Criteria andProjectOrderDescriptionIsNull() {
            addCriterion("project_order_description is null");
            return (Criteria) this;
        }

        public Criteria andProjectOrderDescriptionIsNotNull() {
            addCriterion("project_order_description is not null");
            return (Criteria) this;
        }

        public Criteria andProjectOrderDescriptionEqualTo(String value) {
            addCriterion("project_order_description =", value, "projectOrderDescription");
            return (Criteria) this;
        }

        public Criteria andProjectOrderDescriptionNotEqualTo(String value) {
            addCriterion("project_order_description <>", value, "projectOrderDescription");
            return (Criteria) this;
        }

        public Criteria andProjectOrderDescriptionGreaterThan(String value) {
            addCriterion("project_order_description >", value, "projectOrderDescription");
            return (Criteria) this;
        }

        public Criteria andProjectOrderDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("project_order_description >=", value, "projectOrderDescription");
            return (Criteria) this;
        }

        public Criteria andProjectOrderDescriptionLessThan(String value) {
            addCriterion("project_order_description <", value, "projectOrderDescription");
            return (Criteria) this;
        }

        public Criteria andProjectOrderDescriptionLessThanOrEqualTo(String value) {
            addCriterion("project_order_description <=", value, "projectOrderDescription");
            return (Criteria) this;
        }

        public Criteria andProjectOrderDescriptionLike(String value) {
            addCriterion("project_order_description like", value, "projectOrderDescription");
            return (Criteria) this;
        }

        public Criteria andProjectOrderDescriptionNotLike(String value) {
            addCriterion("project_order_description not like", value, "projectOrderDescription");
            return (Criteria) this;
        }

        public Criteria andProjectOrderDescriptionIn(List<String> values) {
            addCriterion("project_order_description in", values, "projectOrderDescription");
            return (Criteria) this;
        }

        public Criteria andProjectOrderDescriptionNotIn(List<String> values) {
            addCriterion("project_order_description not in", values, "projectOrderDescription");
            return (Criteria) this;
        }

        public Criteria andProjectOrderDescriptionBetween(String value1, String value2) {
            addCriterion("project_order_description between", value1, value2, "projectOrderDescription");
            return (Criteria) this;
        }

        public Criteria andProjectOrderDescriptionNotBetween(String value1, String value2) {
            addCriterion("project_order_description not between", value1, value2, "projectOrderDescription");
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