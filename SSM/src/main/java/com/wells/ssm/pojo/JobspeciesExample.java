package com.wells.ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class JobspeciesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JobspeciesExample() {
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

        public Criteria andFidIsNull() {
            addCriterion("fid is null");
            return (Criteria) this;
        }

        public Criteria andFidIsNotNull() {
            addCriterion("fid is not null");
            return (Criteria) this;
        }

        public Criteria andFidEqualTo(Integer value) {
            addCriterion("fid =", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotEqualTo(Integer value) {
            addCriterion("fid <>", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThan(Integer value) {
            addCriterion("fid >", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fid >=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThan(Integer value) {
            addCriterion("fid <", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThanOrEqualTo(Integer value) {
            addCriterion("fid <=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidIn(List<Integer> values) {
            addCriterion("fid in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotIn(List<Integer> values) {
            addCriterion("fid not in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidBetween(Integer value1, Integer value2) {
            addCriterion("fid between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotBetween(Integer value1, Integer value2) {
            addCriterion("fid not between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFtriggercountIsNull() {
            addCriterion("ftriggercount is null");
            return (Criteria) this;
        }

        public Criteria andFtriggercountIsNotNull() {
            addCriterion("ftriggercount is not null");
            return (Criteria) this;
        }

        public Criteria andFtriggercountEqualTo(String value) {
            addCriterion("ftriggercount =", value, "ftriggercount");
            return (Criteria) this;
        }

        public Criteria andFtriggercountNotEqualTo(String value) {
            addCriterion("ftriggercount <>", value, "ftriggercount");
            return (Criteria) this;
        }

        public Criteria andFtriggercountGreaterThan(String value) {
            addCriterion("ftriggercount >", value, "ftriggercount");
            return (Criteria) this;
        }

        public Criteria andFtriggercountGreaterThanOrEqualTo(String value) {
            addCriterion("ftriggercount >=", value, "ftriggercount");
            return (Criteria) this;
        }

        public Criteria andFtriggercountLessThan(String value) {
            addCriterion("ftriggercount <", value, "ftriggercount");
            return (Criteria) this;
        }

        public Criteria andFtriggercountLessThanOrEqualTo(String value) {
            addCriterion("ftriggercount <=", value, "ftriggercount");
            return (Criteria) this;
        }

        public Criteria andFtriggercountLike(String value) {
            addCriterion("ftriggercount like", value, "ftriggercount");
            return (Criteria) this;
        }

        public Criteria andFtriggercountNotLike(String value) {
            addCriterion("ftriggercount not like", value, "ftriggercount");
            return (Criteria) this;
        }

        public Criteria andFtriggercountIn(List<String> values) {
            addCriterion("ftriggercount in", values, "ftriggercount");
            return (Criteria) this;
        }

        public Criteria andFtriggercountNotIn(List<String> values) {
            addCriterion("ftriggercount not in", values, "ftriggercount");
            return (Criteria) this;
        }

        public Criteria andFtriggercountBetween(String value1, String value2) {
            addCriterion("ftriggercount between", value1, value2, "ftriggercount");
            return (Criteria) this;
        }

        public Criteria andFtriggercountNotBetween(String value1, String value2) {
            addCriterion("ftriggercount not between", value1, value2, "ftriggercount");
            return (Criteria) this;
        }

        public Criteria andFtriggercount2IsNull() {
            addCriterion("ftriggercount2 is null");
            return (Criteria) this;
        }

        public Criteria andFtriggercount2IsNotNull() {
            addCriterion("ftriggercount2 is not null");
            return (Criteria) this;
        }

        public Criteria andFtriggercount2EqualTo(String value) {
            addCriterion("ftriggercount2 =", value, "ftriggercount2");
            return (Criteria) this;
        }

        public Criteria andFtriggercount2NotEqualTo(String value) {
            addCriterion("ftriggercount2 <>", value, "ftriggercount2");
            return (Criteria) this;
        }

        public Criteria andFtriggercount2GreaterThan(String value) {
            addCriterion("ftriggercount2 >", value, "ftriggercount2");
            return (Criteria) this;
        }

        public Criteria andFtriggercount2GreaterThanOrEqualTo(String value) {
            addCriterion("ftriggercount2 >=", value, "ftriggercount2");
            return (Criteria) this;
        }

        public Criteria andFtriggercount2LessThan(String value) {
            addCriterion("ftriggercount2 <", value, "ftriggercount2");
            return (Criteria) this;
        }

        public Criteria andFtriggercount2LessThanOrEqualTo(String value) {
            addCriterion("ftriggercount2 <=", value, "ftriggercount2");
            return (Criteria) this;
        }

        public Criteria andFtriggercount2Like(String value) {
            addCriterion("ftriggercount2 like", value, "ftriggercount2");
            return (Criteria) this;
        }

        public Criteria andFtriggercount2NotLike(String value) {
            addCriterion("ftriggercount2 not like", value, "ftriggercount2");
            return (Criteria) this;
        }

        public Criteria andFtriggercount2In(List<String> values) {
            addCriterion("ftriggercount2 in", values, "ftriggercount2");
            return (Criteria) this;
        }

        public Criteria andFtriggercount2NotIn(List<String> values) {
            addCriterion("ftriggercount2 not in", values, "ftriggercount2");
            return (Criteria) this;
        }

        public Criteria andFtriggercount2Between(String value1, String value2) {
            addCriterion("ftriggercount2 between", value1, value2, "ftriggercount2");
            return (Criteria) this;
        }

        public Criteria andFtriggercount2NotBetween(String value1, String value2) {
            addCriterion("ftriggercount2 not between", value1, value2, "ftriggercount2");
            return (Criteria) this;
        }

        public Criteria andFtriggercount3IsNull() {
            addCriterion("ftriggercount3 is null");
            return (Criteria) this;
        }

        public Criteria andFtriggercount3IsNotNull() {
            addCriterion("ftriggercount3 is not null");
            return (Criteria) this;
        }

        public Criteria andFtriggercount3EqualTo(String value) {
            addCriterion("ftriggercount3 =", value, "ftriggercount3");
            return (Criteria) this;
        }

        public Criteria andFtriggercount3NotEqualTo(String value) {
            addCriterion("ftriggercount3 <>", value, "ftriggercount3");
            return (Criteria) this;
        }

        public Criteria andFtriggercount3GreaterThan(String value) {
            addCriterion("ftriggercount3 >", value, "ftriggercount3");
            return (Criteria) this;
        }

        public Criteria andFtriggercount3GreaterThanOrEqualTo(String value) {
            addCriterion("ftriggercount3 >=", value, "ftriggercount3");
            return (Criteria) this;
        }

        public Criteria andFtriggercount3LessThan(String value) {
            addCriterion("ftriggercount3 <", value, "ftriggercount3");
            return (Criteria) this;
        }

        public Criteria andFtriggercount3LessThanOrEqualTo(String value) {
            addCriterion("ftriggercount3 <=", value, "ftriggercount3");
            return (Criteria) this;
        }

        public Criteria andFtriggercount3Like(String value) {
            addCriterion("ftriggercount3 like", value, "ftriggercount3");
            return (Criteria) this;
        }

        public Criteria andFtriggercount3NotLike(String value) {
            addCriterion("ftriggercount3 not like", value, "ftriggercount3");
            return (Criteria) this;
        }

        public Criteria andFtriggercount3In(List<String> values) {
            addCriterion("ftriggercount3 in", values, "ftriggercount3");
            return (Criteria) this;
        }

        public Criteria andFtriggercount3NotIn(List<String> values) {
            addCriterion("ftriggercount3 not in", values, "ftriggercount3");
            return (Criteria) this;
        }

        public Criteria andFtriggercount3Between(String value1, String value2) {
            addCriterion("ftriggercount3 between", value1, value2, "ftriggercount3");
            return (Criteria) this;
        }

        public Criteria andFtriggercount3NotBetween(String value1, String value2) {
            addCriterion("ftriggercount3 not between", value1, value2, "ftriggercount3");
            return (Criteria) this;
        }

        public Criteria andFtriggermaxcountIsNull() {
            addCriterion("ftriggermaxcount is null");
            return (Criteria) this;
        }

        public Criteria andFtriggermaxcountIsNotNull() {
            addCriterion("ftriggermaxcount is not null");
            return (Criteria) this;
        }

        public Criteria andFtriggermaxcountEqualTo(String value) {
            addCriterion("ftriggermaxcount =", value, "ftriggermaxcount");
            return (Criteria) this;
        }

        public Criteria andFtriggermaxcountNotEqualTo(String value) {
            addCriterion("ftriggermaxcount <>", value, "ftriggermaxcount");
            return (Criteria) this;
        }

        public Criteria andFtriggermaxcountGreaterThan(String value) {
            addCriterion("ftriggermaxcount >", value, "ftriggermaxcount");
            return (Criteria) this;
        }

        public Criteria andFtriggermaxcountGreaterThanOrEqualTo(String value) {
            addCriterion("ftriggermaxcount >=", value, "ftriggermaxcount");
            return (Criteria) this;
        }

        public Criteria andFtriggermaxcountLessThan(String value) {
            addCriterion("ftriggermaxcount <", value, "ftriggermaxcount");
            return (Criteria) this;
        }

        public Criteria andFtriggermaxcountLessThanOrEqualTo(String value) {
            addCriterion("ftriggermaxcount <=", value, "ftriggermaxcount");
            return (Criteria) this;
        }

        public Criteria andFtriggermaxcountLike(String value) {
            addCriterion("ftriggermaxcount like", value, "ftriggermaxcount");
            return (Criteria) this;
        }

        public Criteria andFtriggermaxcountNotLike(String value) {
            addCriterion("ftriggermaxcount not like", value, "ftriggermaxcount");
            return (Criteria) this;
        }

        public Criteria andFtriggermaxcountIn(List<String> values) {
            addCriterion("ftriggermaxcount in", values, "ftriggermaxcount");
            return (Criteria) this;
        }

        public Criteria andFtriggermaxcountNotIn(List<String> values) {
            addCriterion("ftriggermaxcount not in", values, "ftriggermaxcount");
            return (Criteria) this;
        }

        public Criteria andFtriggermaxcountBetween(String value1, String value2) {
            addCriterion("ftriggermaxcount between", value1, value2, "ftriggermaxcount");
            return (Criteria) this;
        }

        public Criteria andFtriggermaxcountNotBetween(String value1, String value2) {
            addCriterion("ftriggermaxcount not between", value1, value2, "ftriggermaxcount");
            return (Criteria) this;
        }

        public Criteria andFnameIsNull() {
            addCriterion("fname is null");
            return (Criteria) this;
        }

        public Criteria andFnameIsNotNull() {
            addCriterion("fname is not null");
            return (Criteria) this;
        }

        public Criteria andFnameEqualTo(String value) {
            addCriterion("fname =", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotEqualTo(String value) {
            addCriterion("fname <>", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameGreaterThan(String value) {
            addCriterion("fname >", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameGreaterThanOrEqualTo(String value) {
            addCriterion("fname >=", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLessThan(String value) {
            addCriterion("fname <", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLessThanOrEqualTo(String value) {
            addCriterion("fname <=", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLike(String value) {
            addCriterion("fname like", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotLike(String value) {
            addCriterion("fname not like", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameIn(List<String> values) {
            addCriterion("fname in", values, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotIn(List<String> values) {
            addCriterion("fname not in", values, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameBetween(String value1, String value2) {
            addCriterion("fname between", value1, value2, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotBetween(String value1, String value2) {
            addCriterion("fname not between", value1, value2, "fname");
            return (Criteria) this;
        }

        public Criteria andFnumberIsNull() {
            addCriterion("fnumber is null");
            return (Criteria) this;
        }

        public Criteria andFnumberIsNotNull() {
            addCriterion("fnumber is not null");
            return (Criteria) this;
        }

        public Criteria andFnumberEqualTo(String value) {
            addCriterion("fnumber =", value, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberNotEqualTo(String value) {
            addCriterion("fnumber <>", value, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberGreaterThan(String value) {
            addCriterion("fnumber >", value, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberGreaterThanOrEqualTo(String value) {
            addCriterion("fnumber >=", value, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberLessThan(String value) {
            addCriterion("fnumber <", value, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberLessThanOrEqualTo(String value) {
            addCriterion("fnumber <=", value, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberLike(String value) {
            addCriterion("fnumber like", value, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberNotLike(String value) {
            addCriterion("fnumber not like", value, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberIn(List<String> values) {
            addCriterion("fnumber in", values, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberNotIn(List<String> values) {
            addCriterion("fnumber not in", values, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberBetween(String value1, String value2) {
            addCriterion("fnumber between", value1, value2, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberNotBetween(String value1, String value2) {
            addCriterion("fnumber not between", value1, value2, "fnumber");
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