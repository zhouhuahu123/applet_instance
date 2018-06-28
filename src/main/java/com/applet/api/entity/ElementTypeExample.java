package com.applet.api.entity;

import com.applet.api.util.page.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ElementTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public ElementTypeExample() {
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

    public void setPage(Page page) {
        this.page=page;
    }

    public Page getPage() {
        return page;
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

        public Criteria andTemplatePageIdIsNull() {
            addCriterion("template_page_id is null");
            return (Criteria) this;
        }

        public Criteria andTemplatePageIdIsNotNull() {
            addCriterion("template_page_id is not null");
            return (Criteria) this;
        }

        public Criteria andTemplatePageIdEqualTo(Integer value) {
            addCriterion("template_page_id =", value, "templatePageId");
            return (Criteria) this;
        }

        public Criteria andTemplatePageIdNotEqualTo(Integer value) {
            addCriterion("template_page_id <>", value, "templatePageId");
            return (Criteria) this;
        }

        public Criteria andTemplatePageIdGreaterThan(Integer value) {
            addCriterion("template_page_id >", value, "templatePageId");
            return (Criteria) this;
        }

        public Criteria andTemplatePageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("template_page_id >=", value, "templatePageId");
            return (Criteria) this;
        }

        public Criteria andTemplatePageIdLessThan(Integer value) {
            addCriterion("template_page_id <", value, "templatePageId");
            return (Criteria) this;
        }

        public Criteria andTemplatePageIdLessThanOrEqualTo(Integer value) {
            addCriterion("template_page_id <=", value, "templatePageId");
            return (Criteria) this;
        }

        public Criteria andTemplatePageIdIn(List<Integer> values) {
            addCriterion("template_page_id in", values, "templatePageId");
            return (Criteria) this;
        }

        public Criteria andTemplatePageIdNotIn(List<Integer> values) {
            addCriterion("template_page_id not in", values, "templatePageId");
            return (Criteria) this;
        }

        public Criteria andTemplatePageIdBetween(Integer value1, Integer value2) {
            addCriterion("template_page_id between", value1, value2, "templatePageId");
            return (Criteria) this;
        }

        public Criteria andTemplatePageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("template_page_id not between", value1, value2, "templatePageId");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNull() {
            addCriterion("type_name is null");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNotNull() {
            addCriterion("type_name is not null");
            return (Criteria) this;
        }

        public Criteria andTypeNameEqualTo(String value) {
            addCriterion("type_name =", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotEqualTo(String value) {
            addCriterion("type_name <>", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThan(String value) {
            addCriterion("type_name >", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("type_name >=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThan(String value) {
            addCriterion("type_name <", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThanOrEqualTo(String value) {
            addCriterion("type_name <=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLike(String value) {
            addCriterion("type_name like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotLike(String value) {
            addCriterion("type_name not like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameIn(List<String> values) {
            addCriterion("type_name in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotIn(List<String> values) {
            addCriterion("type_name not in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameBetween(String value1, String value2) {
            addCriterion("type_name between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotBetween(String value1, String value2) {
            addCriterion("type_name not between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andElementTypeIsNull() {
            addCriterion("element_type is null");
            return (Criteria) this;
        }

        public Criteria andElementTypeIsNotNull() {
            addCriterion("element_type is not null");
            return (Criteria) this;
        }

        public Criteria andElementTypeEqualTo(String value) {
            addCriterion("element_type =", value, "elementType");
            return (Criteria) this;
        }

        public Criteria andElementTypeNotEqualTo(String value) {
            addCriterion("element_type <>", value, "elementType");
            return (Criteria) this;
        }

        public Criteria andElementTypeGreaterThan(String value) {
            addCriterion("element_type >", value, "elementType");
            return (Criteria) this;
        }

        public Criteria andElementTypeGreaterThanOrEqualTo(String value) {
            addCriterion("element_type >=", value, "elementType");
            return (Criteria) this;
        }

        public Criteria andElementTypeLessThan(String value) {
            addCriterion("element_type <", value, "elementType");
            return (Criteria) this;
        }

        public Criteria andElementTypeLessThanOrEqualTo(String value) {
            addCriterion("element_type <=", value, "elementType");
            return (Criteria) this;
        }

        public Criteria andElementTypeLike(String value) {
            addCriterion("element_type like", value, "elementType");
            return (Criteria) this;
        }

        public Criteria andElementTypeNotLike(String value) {
            addCriterion("element_type not like", value, "elementType");
            return (Criteria) this;
        }

        public Criteria andElementTypeIn(List<String> values) {
            addCriterion("element_type in", values, "elementType");
            return (Criteria) this;
        }

        public Criteria andElementTypeNotIn(List<String> values) {
            addCriterion("element_type not in", values, "elementType");
            return (Criteria) this;
        }

        public Criteria andElementTypeBetween(String value1, String value2) {
            addCriterion("element_type between", value1, value2, "elementType");
            return (Criteria) this;
        }

        public Criteria andElementTypeNotBetween(String value1, String value2) {
            addCriterion("element_type not between", value1, value2, "elementType");
            return (Criteria) this;
        }

        public Criteria andElementAmountIsNull() {
            addCriterion("element_amount is null");
            return (Criteria) this;
        }

        public Criteria andElementAmountIsNotNull() {
            addCriterion("element_amount is not null");
            return (Criteria) this;
        }

        public Criteria andElementAmountEqualTo(Integer value) {
            addCriterion("element_amount =", value, "elementAmount");
            return (Criteria) this;
        }

        public Criteria andElementAmountNotEqualTo(Integer value) {
            addCriterion("element_amount <>", value, "elementAmount");
            return (Criteria) this;
        }

        public Criteria andElementAmountGreaterThan(Integer value) {
            addCriterion("element_amount >", value, "elementAmount");
            return (Criteria) this;
        }

        public Criteria andElementAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("element_amount >=", value, "elementAmount");
            return (Criteria) this;
        }

        public Criteria andElementAmountLessThan(Integer value) {
            addCriterion("element_amount <", value, "elementAmount");
            return (Criteria) this;
        }

        public Criteria andElementAmountLessThanOrEqualTo(Integer value) {
            addCriterion("element_amount <=", value, "elementAmount");
            return (Criteria) this;
        }

        public Criteria andElementAmountIn(List<Integer> values) {
            addCriterion("element_amount in", values, "elementAmount");
            return (Criteria) this;
        }

        public Criteria andElementAmountNotIn(List<Integer> values) {
            addCriterion("element_amount not in", values, "elementAmount");
            return (Criteria) this;
        }

        public Criteria andElementAmountBetween(Integer value1, Integer value2) {
            addCriterion("element_amount between", value1, value2, "elementAmount");
            return (Criteria) this;
        }

        public Criteria andElementAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("element_amount not between", value1, value2, "elementAmount");
            return (Criteria) this;
        }

        public Criteria andCareateTimeIsNull() {
            addCriterion("careate_time is null");
            return (Criteria) this;
        }

        public Criteria andCareateTimeIsNotNull() {
            addCriterion("careate_time is not null");
            return (Criteria) this;
        }

        public Criteria andCareateTimeEqualTo(Date value) {
            addCriterion("careate_time =", value, "careateTime");
            return (Criteria) this;
        }

        public Criteria andCareateTimeNotEqualTo(Date value) {
            addCriterion("careate_time <>", value, "careateTime");
            return (Criteria) this;
        }

        public Criteria andCareateTimeGreaterThan(Date value) {
            addCriterion("careate_time >", value, "careateTime");
            return (Criteria) this;
        }

        public Criteria andCareateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("careate_time >=", value, "careateTime");
            return (Criteria) this;
        }

        public Criteria andCareateTimeLessThan(Date value) {
            addCriterion("careate_time <", value, "careateTime");
            return (Criteria) this;
        }

        public Criteria andCareateTimeLessThanOrEqualTo(Date value) {
            addCriterion("careate_time <=", value, "careateTime");
            return (Criteria) this;
        }

        public Criteria andCareateTimeIn(List<Date> values) {
            addCriterion("careate_time in", values, "careateTime");
            return (Criteria) this;
        }

        public Criteria andCareateTimeNotIn(List<Date> values) {
            addCriterion("careate_time not in", values, "careateTime");
            return (Criteria) this;
        }

        public Criteria andCareateTimeBetween(Date value1, Date value2) {
            addCriterion("careate_time between", value1, value2, "careateTime");
            return (Criteria) this;
        }

        public Criteria andCareateTimeNotBetween(Date value1, Date value2) {
            addCriterion("careate_time not between", value1, value2, "careateTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status not between", value1, value2, "status");
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