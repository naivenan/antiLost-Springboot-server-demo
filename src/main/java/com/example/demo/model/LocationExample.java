package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class LocationExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table cAuth..location
	 * @mbg.generated
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table cAuth..location
	 * @mbg.generated
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table cAuth..location
	 * @mbg.generated
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cAuth..location
	 * @mbg.generated
	 */
	public LocationExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cAuth..location
	 * @mbg.generated
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cAuth..location
	 * @mbg.generated
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cAuth..location
	 * @mbg.generated
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cAuth..location
	 * @mbg.generated
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cAuth..location
	 * @mbg.generated
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cAuth..location
	 * @mbg.generated
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cAuth..location
	 * @mbg.generated
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cAuth..location
	 * @mbg.generated
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cAuth..location
	 * @mbg.generated
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cAuth..location
	 * @mbg.generated
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table cAuth..location
	 * @mbg.generated
	 */
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

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andUidIsNull() {
			addCriterion("`uid` is null");
			return (Criteria) this;
		}

		public Criteria andUidIsNotNull() {
			addCriterion("`uid` is not null");
			return (Criteria) this;
		}

		public Criteria andUidEqualTo(Integer value) {
			addCriterion("`uid` =", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidNotEqualTo(Integer value) {
			addCriterion("`uid` <>", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidGreaterThan(Integer value) {
			addCriterion("`uid` >", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidGreaterThanOrEqualTo(Integer value) {
			addCriterion("`uid` >=", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidLessThan(Integer value) {
			addCriterion("`uid` <", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidLessThanOrEqualTo(Integer value) {
			addCriterion("`uid` <=", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidIn(List<Integer> values) {
			addCriterion("`uid` in", values, "uid");
			return (Criteria) this;
		}

		public Criteria andUidNotIn(List<Integer> values) {
			addCriterion("`uid` not in", values, "uid");
			return (Criteria) this;
		}

		public Criteria andUidBetween(Integer value1, Integer value2) {
			addCriterion("`uid` between", value1, value2, "uid");
			return (Criteria) this;
		}

		public Criteria andUidNotBetween(Integer value1, Integer value2) {
			addCriterion("`uid` not between", value1, value2, "uid");
			return (Criteria) this;
		}

		public Criteria andLatIsNull() {
			addCriterion("lat is null");
			return (Criteria) this;
		}

		public Criteria andLatIsNotNull() {
			addCriterion("lat is not null");
			return (Criteria) this;
		}

		public Criteria andLatEqualTo(Double value) {
			addCriterion("lat =", value, "lat");
			return (Criteria) this;
		}

		public Criteria andLatNotEqualTo(Double value) {
			addCriterion("lat <>", value, "lat");
			return (Criteria) this;
		}

		public Criteria andLatGreaterThan(Double value) {
			addCriterion("lat >", value, "lat");
			return (Criteria) this;
		}

		public Criteria andLatGreaterThanOrEqualTo(Double value) {
			addCriterion("lat >=", value, "lat");
			return (Criteria) this;
		}

		public Criteria andLatLessThan(Double value) {
			addCriterion("lat <", value, "lat");
			return (Criteria) this;
		}

		public Criteria andLatLessThanOrEqualTo(Double value) {
			addCriterion("lat <=", value, "lat");
			return (Criteria) this;
		}

		public Criteria andLatIn(List<Double> values) {
			addCriterion("lat in", values, "lat");
			return (Criteria) this;
		}

		public Criteria andLatNotIn(List<Double> values) {
			addCriterion("lat not in", values, "lat");
			return (Criteria) this;
		}

		public Criteria andLatBetween(Double value1, Double value2) {
			addCriterion("lat between", value1, value2, "lat");
			return (Criteria) this;
		}

		public Criteria andLatNotBetween(Double value1, Double value2) {
			addCriterion("lat not between", value1, value2, "lat");
			return (Criteria) this;
		}

		public Criteria andLngIsNull() {
			addCriterion("lng is null");
			return (Criteria) this;
		}

		public Criteria andLngIsNotNull() {
			addCriterion("lng is not null");
			return (Criteria) this;
		}

		public Criteria andLngEqualTo(Double value) {
			addCriterion("lng =", value, "lng");
			return (Criteria) this;
		}

		public Criteria andLngNotEqualTo(Double value) {
			addCriterion("lng <>", value, "lng");
			return (Criteria) this;
		}

		public Criteria andLngGreaterThan(Double value) {
			addCriterion("lng >", value, "lng");
			return (Criteria) this;
		}

		public Criteria andLngGreaterThanOrEqualTo(Double value) {
			addCriterion("lng >=", value, "lng");
			return (Criteria) this;
		}

		public Criteria andLngLessThan(Double value) {
			addCriterion("lng <", value, "lng");
			return (Criteria) this;
		}

		public Criteria andLngLessThanOrEqualTo(Double value) {
			addCriterion("lng <=", value, "lng");
			return (Criteria) this;
		}

		public Criteria andLngIn(List<Double> values) {
			addCriterion("lng in", values, "lng");
			return (Criteria) this;
		}

		public Criteria andLngNotIn(List<Double> values) {
			addCriterion("lng not in", values, "lng");
			return (Criteria) this;
		}

		public Criteria andLngBetween(Double value1, Double value2) {
			addCriterion("lng between", value1, value2, "lng");
			return (Criteria) this;
		}

		public Criteria andLngNotBetween(Double value1, Double value2) {
			addCriterion("lng not between", value1, value2, "lng");
			return (Criteria) this;
		}

		public Criteria andAddrIsNull() {
			addCriterion("addr is null");
			return (Criteria) this;
		}

		public Criteria andAddrIsNotNull() {
			addCriterion("addr is not null");
			return (Criteria) this;
		}

		public Criteria andAddrEqualTo(String value) {
			addCriterion("addr =", value, "addr");
			return (Criteria) this;
		}

		public Criteria andAddrNotEqualTo(String value) {
			addCriterion("addr <>", value, "addr");
			return (Criteria) this;
		}

		public Criteria andAddrGreaterThan(String value) {
			addCriterion("addr >", value, "addr");
			return (Criteria) this;
		}

		public Criteria andAddrGreaterThanOrEqualTo(String value) {
			addCriterion("addr >=", value, "addr");
			return (Criteria) this;
		}

		public Criteria andAddrLessThan(String value) {
			addCriterion("addr <", value, "addr");
			return (Criteria) this;
		}

		public Criteria andAddrLessThanOrEqualTo(String value) {
			addCriterion("addr <=", value, "addr");
			return (Criteria) this;
		}

		public Criteria andAddrLike(String value) {
			addCriterion("addr like", value, "addr");
			return (Criteria) this;
		}

		public Criteria andAddrNotLike(String value) {
			addCriterion("addr not like", value, "addr");
			return (Criteria) this;
		}

		public Criteria andAddrIn(List<String> values) {
			addCriterion("addr in", values, "addr");
			return (Criteria) this;
		}

		public Criteria andAddrNotIn(List<String> values) {
			addCriterion("addr not in", values, "addr");
			return (Criteria) this;
		}

		public Criteria andAddrBetween(String value1, String value2) {
			addCriterion("addr between", value1, value2, "addr");
			return (Criteria) this;
		}

		public Criteria andAddrNotBetween(String value1, String value2) {
			addCriterion("addr not between", value1, value2, "addr");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table cAuth..location
	 * @mbg.generated
	 */
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cAuth..location
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}