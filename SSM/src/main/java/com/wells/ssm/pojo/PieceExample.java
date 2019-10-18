package com.wells.ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class PieceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PieceExample() {
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

        public Criteria andFattackIsNull() {
            addCriterion("fattack is null");
            return (Criteria) this;
        }

        public Criteria andFattackIsNotNull() {
            addCriterion("fattack is not null");
            return (Criteria) this;
        }

        public Criteria andFattackEqualTo(Integer value) {
            addCriterion("fattack =", value, "fattack");
            return (Criteria) this;
        }

        public Criteria andFattackNotEqualTo(Integer value) {
            addCriterion("fattack <>", value, "fattack");
            return (Criteria) this;
        }

        public Criteria andFattackGreaterThan(Integer value) {
            addCriterion("fattack >", value, "fattack");
            return (Criteria) this;
        }

        public Criteria andFattackGreaterThanOrEqualTo(Integer value) {
            addCriterion("fattack >=", value, "fattack");
            return (Criteria) this;
        }

        public Criteria andFattackLessThan(Integer value) {
            addCriterion("fattack <", value, "fattack");
            return (Criteria) this;
        }

        public Criteria andFattackLessThanOrEqualTo(Integer value) {
            addCriterion("fattack <=", value, "fattack");
            return (Criteria) this;
        }

        public Criteria andFattackIn(List<Integer> values) {
            addCriterion("fattack in", values, "fattack");
            return (Criteria) this;
        }

        public Criteria andFattackNotIn(List<Integer> values) {
            addCriterion("fattack not in", values, "fattack");
            return (Criteria) this;
        }

        public Criteria andFattackBetween(Integer value1, Integer value2) {
            addCriterion("fattack between", value1, value2, "fattack");
            return (Criteria) this;
        }

        public Criteria andFattackNotBetween(Integer value1, Integer value2) {
            addCriterion("fattack not between", value1, value2, "fattack");
            return (Criteria) this;
        }

        public Criteria andFmagicIsNull() {
            addCriterion("fmagic is null");
            return (Criteria) this;
        }

        public Criteria andFmagicIsNotNull() {
            addCriterion("fmagic is not null");
            return (Criteria) this;
        }

        public Criteria andFmagicEqualTo(Integer value) {
            addCriterion("fmagic =", value, "fmagic");
            return (Criteria) this;
        }

        public Criteria andFmagicNotEqualTo(Integer value) {
            addCriterion("fmagic <>", value, "fmagic");
            return (Criteria) this;
        }

        public Criteria andFmagicGreaterThan(Integer value) {
            addCriterion("fmagic >", value, "fmagic");
            return (Criteria) this;
        }

        public Criteria andFmagicGreaterThanOrEqualTo(Integer value) {
            addCriterion("fmagic >=", value, "fmagic");
            return (Criteria) this;
        }

        public Criteria andFmagicLessThan(Integer value) {
            addCriterion("fmagic <", value, "fmagic");
            return (Criteria) this;
        }

        public Criteria andFmagicLessThanOrEqualTo(Integer value) {
            addCriterion("fmagic <=", value, "fmagic");
            return (Criteria) this;
        }

        public Criteria andFmagicIn(List<Integer> values) {
            addCriterion("fmagic in", values, "fmagic");
            return (Criteria) this;
        }

        public Criteria andFmagicNotIn(List<Integer> values) {
            addCriterion("fmagic not in", values, "fmagic");
            return (Criteria) this;
        }

        public Criteria andFmagicBetween(Integer value1, Integer value2) {
            addCriterion("fmagic between", value1, value2, "fmagic");
            return (Criteria) this;
        }

        public Criteria andFmagicNotBetween(Integer value1, Integer value2) {
            addCriterion("fmagic not between", value1, value2, "fmagic");
            return (Criteria) this;
        }

        public Criteria andFarmorIsNull() {
            addCriterion("farmor is null");
            return (Criteria) this;
        }

        public Criteria andFarmorIsNotNull() {
            addCriterion("farmor is not null");
            return (Criteria) this;
        }

        public Criteria andFarmorEqualTo(Integer value) {
            addCriterion("farmor =", value, "farmor");
            return (Criteria) this;
        }

        public Criteria andFarmorNotEqualTo(Integer value) {
            addCriterion("farmor <>", value, "farmor");
            return (Criteria) this;
        }

        public Criteria andFarmorGreaterThan(Integer value) {
            addCriterion("farmor >", value, "farmor");
            return (Criteria) this;
        }

        public Criteria andFarmorGreaterThanOrEqualTo(Integer value) {
            addCriterion("farmor >=", value, "farmor");
            return (Criteria) this;
        }

        public Criteria andFarmorLessThan(Integer value) {
            addCriterion("farmor <", value, "farmor");
            return (Criteria) this;
        }

        public Criteria andFarmorLessThanOrEqualTo(Integer value) {
            addCriterion("farmor <=", value, "farmor");
            return (Criteria) this;
        }

        public Criteria andFarmorIn(List<Integer> values) {
            addCriterion("farmor in", values, "farmor");
            return (Criteria) this;
        }

        public Criteria andFarmorNotIn(List<Integer> values) {
            addCriterion("farmor not in", values, "farmor");
            return (Criteria) this;
        }

        public Criteria andFarmorBetween(Integer value1, Integer value2) {
            addCriterion("farmor between", value1, value2, "farmor");
            return (Criteria) this;
        }

        public Criteria andFarmorNotBetween(Integer value1, Integer value2) {
            addCriterion("farmor not between", value1, value2, "farmor");
            return (Criteria) this;
        }

        public Criteria andFresistanceIsNull() {
            addCriterion("fresistance is null");
            return (Criteria) this;
        }

        public Criteria andFresistanceIsNotNull() {
            addCriterion("fresistance is not null");
            return (Criteria) this;
        }

        public Criteria andFresistanceEqualTo(Integer value) {
            addCriterion("fresistance =", value, "fresistance");
            return (Criteria) this;
        }

        public Criteria andFresistanceNotEqualTo(Integer value) {
            addCriterion("fresistance <>", value, "fresistance");
            return (Criteria) this;
        }

        public Criteria andFresistanceGreaterThan(Integer value) {
            addCriterion("fresistance >", value, "fresistance");
            return (Criteria) this;
        }

        public Criteria andFresistanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("fresistance >=", value, "fresistance");
            return (Criteria) this;
        }

        public Criteria andFresistanceLessThan(Integer value) {
            addCriterion("fresistance <", value, "fresistance");
            return (Criteria) this;
        }

        public Criteria andFresistanceLessThanOrEqualTo(Integer value) {
            addCriterion("fresistance <=", value, "fresistance");
            return (Criteria) this;
        }

        public Criteria andFresistanceIn(List<Integer> values) {
            addCriterion("fresistance in", values, "fresistance");
            return (Criteria) this;
        }

        public Criteria andFresistanceNotIn(List<Integer> values) {
            addCriterion("fresistance not in", values, "fresistance");
            return (Criteria) this;
        }

        public Criteria andFresistanceBetween(Integer value1, Integer value2) {
            addCriterion("fresistance between", value1, value2, "fresistance");
            return (Criteria) this;
        }

        public Criteria andFresistanceNotBetween(Integer value1, Integer value2) {
            addCriterion("fresistance not between", value1, value2, "fresistance");
            return (Criteria) this;
        }

        public Criteria andFattackDistanceIsNull() {
            addCriterion("fattack_distance is null");
            return (Criteria) this;
        }

        public Criteria andFattackDistanceIsNotNull() {
            addCriterion("fattack_distance is not null");
            return (Criteria) this;
        }

        public Criteria andFattackDistanceEqualTo(Integer value) {
            addCriterion("fattack_distance =", value, "fattackDistance");
            return (Criteria) this;
        }

        public Criteria andFattackDistanceNotEqualTo(Integer value) {
            addCriterion("fattack_distance <>", value, "fattackDistance");
            return (Criteria) this;
        }

        public Criteria andFattackDistanceGreaterThan(Integer value) {
            addCriterion("fattack_distance >", value, "fattackDistance");
            return (Criteria) this;
        }

        public Criteria andFattackDistanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("fattack_distance >=", value, "fattackDistance");
            return (Criteria) this;
        }

        public Criteria andFattackDistanceLessThan(Integer value) {
            addCriterion("fattack_distance <", value, "fattackDistance");
            return (Criteria) this;
        }

        public Criteria andFattackDistanceLessThanOrEqualTo(Integer value) {
            addCriterion("fattack_distance <=", value, "fattackDistance");
            return (Criteria) this;
        }

        public Criteria andFattackDistanceIn(List<Integer> values) {
            addCriterion("fattack_distance in", values, "fattackDistance");
            return (Criteria) this;
        }

        public Criteria andFattackDistanceNotIn(List<Integer> values) {
            addCriterion("fattack_distance not in", values, "fattackDistance");
            return (Criteria) this;
        }

        public Criteria andFattackDistanceBetween(Integer value1, Integer value2) {
            addCriterion("fattack_distance between", value1, value2, "fattackDistance");
            return (Criteria) this;
        }

        public Criteria andFattackDistanceNotBetween(Integer value1, Integer value2) {
            addCriterion("fattack_distance not between", value1, value2, "fattackDistance");
            return (Criteria) this;
        }

        public Criteria andFcritIsNull() {
            addCriterion("fcrit is null");
            return (Criteria) this;
        }

        public Criteria andFcritIsNotNull() {
            addCriterion("fcrit is not null");
            return (Criteria) this;
        }

        public Criteria andFcritEqualTo(Integer value) {
            addCriterion("fcrit =", value, "fcrit");
            return (Criteria) this;
        }

        public Criteria andFcritNotEqualTo(Integer value) {
            addCriterion("fcrit <>", value, "fcrit");
            return (Criteria) this;
        }

        public Criteria andFcritGreaterThan(Integer value) {
            addCriterion("fcrit >", value, "fcrit");
            return (Criteria) this;
        }

        public Criteria andFcritGreaterThanOrEqualTo(Integer value) {
            addCriterion("fcrit >=", value, "fcrit");
            return (Criteria) this;
        }

        public Criteria andFcritLessThan(Integer value) {
            addCriterion("fcrit <", value, "fcrit");
            return (Criteria) this;
        }

        public Criteria andFcritLessThanOrEqualTo(Integer value) {
            addCriterion("fcrit <=", value, "fcrit");
            return (Criteria) this;
        }

        public Criteria andFcritIn(List<Integer> values) {
            addCriterion("fcrit in", values, "fcrit");
            return (Criteria) this;
        }

        public Criteria andFcritNotIn(List<Integer> values) {
            addCriterion("fcrit not in", values, "fcrit");
            return (Criteria) this;
        }

        public Criteria andFcritBetween(Integer value1, Integer value2) {
            addCriterion("fcrit between", value1, value2, "fcrit");
            return (Criteria) this;
        }

        public Criteria andFcritNotBetween(Integer value1, Integer value2) {
            addCriterion("fcrit not between", value1, value2, "fcrit");
            return (Criteria) this;
        }

        public Criteria andFattackSpeedIsNull() {
            addCriterion("fattack_speed is null");
            return (Criteria) this;
        }

        public Criteria andFattackSpeedIsNotNull() {
            addCriterion("fattack_speed is not null");
            return (Criteria) this;
        }

        public Criteria andFattackSpeedEqualTo(Float value) {
            addCriterion("fattack_speed =", value, "fattackSpeed");
            return (Criteria) this;
        }

        public Criteria andFattackSpeedNotEqualTo(Float value) {
            addCriterion("fattack_speed <>", value, "fattackSpeed");
            return (Criteria) this;
        }

        public Criteria andFattackSpeedGreaterThan(Float value) {
            addCriterion("fattack_speed >", value, "fattackSpeed");
            return (Criteria) this;
        }

        public Criteria andFattackSpeedGreaterThanOrEqualTo(Float value) {
            addCriterion("fattack_speed >=", value, "fattackSpeed");
            return (Criteria) this;
        }

        public Criteria andFattackSpeedLessThan(Float value) {
            addCriterion("fattack_speed <", value, "fattackSpeed");
            return (Criteria) this;
        }

        public Criteria andFattackSpeedLessThanOrEqualTo(Float value) {
            addCriterion("fattack_speed <=", value, "fattackSpeed");
            return (Criteria) this;
        }

        public Criteria andFattackSpeedIn(List<Float> values) {
            addCriterion("fattack_speed in", values, "fattackSpeed");
            return (Criteria) this;
        }

        public Criteria andFattackSpeedNotIn(List<Float> values) {
            addCriterion("fattack_speed not in", values, "fattackSpeed");
            return (Criteria) this;
        }

        public Criteria andFattackSpeedBetween(Float value1, Float value2) {
            addCriterion("fattack_speed between", value1, value2, "fattackSpeed");
            return (Criteria) this;
        }

        public Criteria andFattackSpeedNotBetween(Float value1, Float value2) {
            addCriterion("fattack_speed not between", value1, value2, "fattackSpeed");
            return (Criteria) this;
        }

        public Criteria andFskillsIsNull() {
            addCriterion("fskills is null");
            return (Criteria) this;
        }

        public Criteria andFskillsIsNotNull() {
            addCriterion("fskills is not null");
            return (Criteria) this;
        }

        public Criteria andFskillsEqualTo(Integer value) {
            addCriterion("fskills =", value, "fskills");
            return (Criteria) this;
        }

        public Criteria andFskillsNotEqualTo(Integer value) {
            addCriterion("fskills <>", value, "fskills");
            return (Criteria) this;
        }

        public Criteria andFskillsGreaterThan(Integer value) {
            addCriterion("fskills >", value, "fskills");
            return (Criteria) this;
        }

        public Criteria andFskillsGreaterThanOrEqualTo(Integer value) {
            addCriterion("fskills >=", value, "fskills");
            return (Criteria) this;
        }

        public Criteria andFskillsLessThan(Integer value) {
            addCriterion("fskills <", value, "fskills");
            return (Criteria) this;
        }

        public Criteria andFskillsLessThanOrEqualTo(Integer value) {
            addCriterion("fskills <=", value, "fskills");
            return (Criteria) this;
        }

        public Criteria andFskillsIn(List<Integer> values) {
            addCriterion("fskills in", values, "fskills");
            return (Criteria) this;
        }

        public Criteria andFskillsNotIn(List<Integer> values) {
            addCriterion("fskills not in", values, "fskills");
            return (Criteria) this;
        }

        public Criteria andFskillsBetween(Integer value1, Integer value2) {
            addCriterion("fskills between", value1, value2, "fskills");
            return (Criteria) this;
        }

        public Criteria andFskillsNotBetween(Integer value1, Integer value2) {
            addCriterion("fskills not between", value1, value2, "fskills");
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