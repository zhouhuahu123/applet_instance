package com.applet.api.entity;

import com.applet.api.util.page.Page;
import java.util.ArrayList;
import java.util.List;

public class ElementDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public ElementDetailsExample() {
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

        public Criteria andElementIdIsNull() {
            addCriterion("element_id is null");
            return (Criteria) this;
        }

        public Criteria andElementIdIsNotNull() {
            addCriterion("element_id is not null");
            return (Criteria) this;
        }

        public Criteria andElementIdEqualTo(Integer value) {
            addCriterion("element_id =", value, "elementId");
            return (Criteria) this;
        }

        public Criteria andElementIdNotEqualTo(Integer value) {
            addCriterion("element_id <>", value, "elementId");
            return (Criteria) this;
        }

        public Criteria andElementIdGreaterThan(Integer value) {
            addCriterion("element_id >", value, "elementId");
            return (Criteria) this;
        }

        public Criteria andElementIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("element_id >=", value, "elementId");
            return (Criteria) this;
        }

        public Criteria andElementIdLessThan(Integer value) {
            addCriterion("element_id <", value, "elementId");
            return (Criteria) this;
        }

        public Criteria andElementIdLessThanOrEqualTo(Integer value) {
            addCriterion("element_id <=", value, "elementId");
            return (Criteria) this;
        }

        public Criteria andElementIdIn(List<Integer> values) {
            addCriterion("element_id in", values, "elementId");
            return (Criteria) this;
        }

        public Criteria andElementIdNotIn(List<Integer> values) {
            addCriterion("element_id not in", values, "elementId");
            return (Criteria) this;
        }

        public Criteria andElementIdBetween(Integer value1, Integer value2) {
            addCriterion("element_id between", value1, value2, "elementId");
            return (Criteria) this;
        }

        public Criteria andElementIdNotBetween(Integer value1, Integer value2) {
            addCriterion("element_id not between", value1, value2, "elementId");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("size is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("size is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(String value) {
            addCriterion("size =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(String value) {
            addCriterion("size <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(String value) {
            addCriterion("size >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(String value) {
            addCriterion("size >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(String value) {
            addCriterion("size <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(String value) {
            addCriterion("size <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLike(String value) {
            addCriterion("size like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotLike(String value) {
            addCriterion("size not like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<String> values) {
            addCriterion("size in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<String> values) {
            addCriterion("size not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(String value1, String value2) {
            addCriterion("size between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(String value1, String value2) {
            addCriterion("size not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andMailPriceIsNull() {
            addCriterion("mail_price is null");
            return (Criteria) this;
        }

        public Criteria andMailPriceIsNotNull() {
            addCriterion("mail_price is not null");
            return (Criteria) this;
        }

        public Criteria andMailPriceEqualTo(Double value) {
            addCriterion("mail_price =", value, "mailPrice");
            return (Criteria) this;
        }

        public Criteria andMailPriceNotEqualTo(Double value) {
            addCriterion("mail_price <>", value, "mailPrice");
            return (Criteria) this;
        }

        public Criteria andMailPriceGreaterThan(Double value) {
            addCriterion("mail_price >", value, "mailPrice");
            return (Criteria) this;
        }

        public Criteria andMailPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("mail_price >=", value, "mailPrice");
            return (Criteria) this;
        }

        public Criteria andMailPriceLessThan(Double value) {
            addCriterion("mail_price <", value, "mailPrice");
            return (Criteria) this;
        }

        public Criteria andMailPriceLessThanOrEqualTo(Double value) {
            addCriterion("mail_price <=", value, "mailPrice");
            return (Criteria) this;
        }

        public Criteria andMailPriceIn(List<Double> values) {
            addCriterion("mail_price in", values, "mailPrice");
            return (Criteria) this;
        }

        public Criteria andMailPriceNotIn(List<Double> values) {
            addCriterion("mail_price not in", values, "mailPrice");
            return (Criteria) this;
        }

        public Criteria andMailPriceBetween(Double value1, Double value2) {
            addCriterion("mail_price between", value1, value2, "mailPrice");
            return (Criteria) this;
        }

        public Criteria andMailPriceNotBetween(Double value1, Double value2) {
            addCriterion("mail_price not between", value1, value2, "mailPrice");
            return (Criteria) this;
        }

        public Criteria andImgUrl1IsNull() {
            addCriterion("img_url1 is null");
            return (Criteria) this;
        }

        public Criteria andImgUrl1IsNotNull() {
            addCriterion("img_url1 is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrl1EqualTo(String value) {
            addCriterion("img_url1 =", value, "imgUrl1");
            return (Criteria) this;
        }

        public Criteria andImgUrl1NotEqualTo(String value) {
            addCriterion("img_url1 <>", value, "imgUrl1");
            return (Criteria) this;
        }

        public Criteria andImgUrl1GreaterThan(String value) {
            addCriterion("img_url1 >", value, "imgUrl1");
            return (Criteria) this;
        }

        public Criteria andImgUrl1GreaterThanOrEqualTo(String value) {
            addCriterion("img_url1 >=", value, "imgUrl1");
            return (Criteria) this;
        }

        public Criteria andImgUrl1LessThan(String value) {
            addCriterion("img_url1 <", value, "imgUrl1");
            return (Criteria) this;
        }

        public Criteria andImgUrl1LessThanOrEqualTo(String value) {
            addCriterion("img_url1 <=", value, "imgUrl1");
            return (Criteria) this;
        }

        public Criteria andImgUrl1Like(String value) {
            addCriterion("img_url1 like", value, "imgUrl1");
            return (Criteria) this;
        }

        public Criteria andImgUrl1NotLike(String value) {
            addCriterion("img_url1 not like", value, "imgUrl1");
            return (Criteria) this;
        }

        public Criteria andImgUrl1In(List<String> values) {
            addCriterion("img_url1 in", values, "imgUrl1");
            return (Criteria) this;
        }

        public Criteria andImgUrl1NotIn(List<String> values) {
            addCriterion("img_url1 not in", values, "imgUrl1");
            return (Criteria) this;
        }

        public Criteria andImgUrl1Between(String value1, String value2) {
            addCriterion("img_url1 between", value1, value2, "imgUrl1");
            return (Criteria) this;
        }

        public Criteria andImgUrl1NotBetween(String value1, String value2) {
            addCriterion("img_url1 not between", value1, value2, "imgUrl1");
            return (Criteria) this;
        }

        public Criteria andDescribe1IsNull() {
            addCriterion("describe1 is null");
            return (Criteria) this;
        }

        public Criteria andDescribe1IsNotNull() {
            addCriterion("describe1 is not null");
            return (Criteria) this;
        }

        public Criteria andDescribe1EqualTo(String value) {
            addCriterion("describe1 =", value, "describe1");
            return (Criteria) this;
        }

        public Criteria andDescribe1NotEqualTo(String value) {
            addCriterion("describe1 <>", value, "describe1");
            return (Criteria) this;
        }

        public Criteria andDescribe1GreaterThan(String value) {
            addCriterion("describe1 >", value, "describe1");
            return (Criteria) this;
        }

        public Criteria andDescribe1GreaterThanOrEqualTo(String value) {
            addCriterion("describe1 >=", value, "describe1");
            return (Criteria) this;
        }

        public Criteria andDescribe1LessThan(String value) {
            addCriterion("describe1 <", value, "describe1");
            return (Criteria) this;
        }

        public Criteria andDescribe1LessThanOrEqualTo(String value) {
            addCriterion("describe1 <=", value, "describe1");
            return (Criteria) this;
        }

        public Criteria andDescribe1Like(String value) {
            addCriterion("describe1 like", value, "describe1");
            return (Criteria) this;
        }

        public Criteria andDescribe1NotLike(String value) {
            addCriterion("describe1 not like", value, "describe1");
            return (Criteria) this;
        }

        public Criteria andDescribe1In(List<String> values) {
            addCriterion("describe1 in", values, "describe1");
            return (Criteria) this;
        }

        public Criteria andDescribe1NotIn(List<String> values) {
            addCriterion("describe1 not in", values, "describe1");
            return (Criteria) this;
        }

        public Criteria andDescribe1Between(String value1, String value2) {
            addCriterion("describe1 between", value1, value2, "describe1");
            return (Criteria) this;
        }

        public Criteria andDescribe1NotBetween(String value1, String value2) {
            addCriterion("describe1 not between", value1, value2, "describe1");
            return (Criteria) this;
        }

        public Criteria andImgUrl2IsNull() {
            addCriterion("img_url2 is null");
            return (Criteria) this;
        }

        public Criteria andImgUrl2IsNotNull() {
            addCriterion("img_url2 is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrl2EqualTo(String value) {
            addCriterion("img_url2 =", value, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andImgUrl2NotEqualTo(String value) {
            addCriterion("img_url2 <>", value, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andImgUrl2GreaterThan(String value) {
            addCriterion("img_url2 >", value, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andImgUrl2GreaterThanOrEqualTo(String value) {
            addCriterion("img_url2 >=", value, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andImgUrl2LessThan(String value) {
            addCriterion("img_url2 <", value, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andImgUrl2LessThanOrEqualTo(String value) {
            addCriterion("img_url2 <=", value, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andImgUrl2Like(String value) {
            addCriterion("img_url2 like", value, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andImgUrl2NotLike(String value) {
            addCriterion("img_url2 not like", value, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andImgUrl2In(List<String> values) {
            addCriterion("img_url2 in", values, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andImgUrl2NotIn(List<String> values) {
            addCriterion("img_url2 not in", values, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andImgUrl2Between(String value1, String value2) {
            addCriterion("img_url2 between", value1, value2, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andImgUrl2NotBetween(String value1, String value2) {
            addCriterion("img_url2 not between", value1, value2, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andDescribe2IsNull() {
            addCriterion("describe2 is null");
            return (Criteria) this;
        }

        public Criteria andDescribe2IsNotNull() {
            addCriterion("describe2 is not null");
            return (Criteria) this;
        }

        public Criteria andDescribe2EqualTo(String value) {
            addCriterion("describe2 =", value, "describe2");
            return (Criteria) this;
        }

        public Criteria andDescribe2NotEqualTo(String value) {
            addCriterion("describe2 <>", value, "describe2");
            return (Criteria) this;
        }

        public Criteria andDescribe2GreaterThan(String value) {
            addCriterion("describe2 >", value, "describe2");
            return (Criteria) this;
        }

        public Criteria andDescribe2GreaterThanOrEqualTo(String value) {
            addCriterion("describe2 >=", value, "describe2");
            return (Criteria) this;
        }

        public Criteria andDescribe2LessThan(String value) {
            addCriterion("describe2 <", value, "describe2");
            return (Criteria) this;
        }

        public Criteria andDescribe2LessThanOrEqualTo(String value) {
            addCriterion("describe2 <=", value, "describe2");
            return (Criteria) this;
        }

        public Criteria andDescribe2Like(String value) {
            addCriterion("describe2 like", value, "describe2");
            return (Criteria) this;
        }

        public Criteria andDescribe2NotLike(String value) {
            addCriterion("describe2 not like", value, "describe2");
            return (Criteria) this;
        }

        public Criteria andDescribe2In(List<String> values) {
            addCriterion("describe2 in", values, "describe2");
            return (Criteria) this;
        }

        public Criteria andDescribe2NotIn(List<String> values) {
            addCriterion("describe2 not in", values, "describe2");
            return (Criteria) this;
        }

        public Criteria andDescribe2Between(String value1, String value2) {
            addCriterion("describe2 between", value1, value2, "describe2");
            return (Criteria) this;
        }

        public Criteria andDescribe2NotBetween(String value1, String value2) {
            addCriterion("describe2 not between", value1, value2, "describe2");
            return (Criteria) this;
        }

        public Criteria andImgUrl3IsNull() {
            addCriterion("img_url3 is null");
            return (Criteria) this;
        }

        public Criteria andImgUrl3IsNotNull() {
            addCriterion("img_url3 is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrl3EqualTo(String value) {
            addCriterion("img_url3 =", value, "imgUrl3");
            return (Criteria) this;
        }

        public Criteria andImgUrl3NotEqualTo(String value) {
            addCriterion("img_url3 <>", value, "imgUrl3");
            return (Criteria) this;
        }

        public Criteria andImgUrl3GreaterThan(String value) {
            addCriterion("img_url3 >", value, "imgUrl3");
            return (Criteria) this;
        }

        public Criteria andImgUrl3GreaterThanOrEqualTo(String value) {
            addCriterion("img_url3 >=", value, "imgUrl3");
            return (Criteria) this;
        }

        public Criteria andImgUrl3LessThan(String value) {
            addCriterion("img_url3 <", value, "imgUrl3");
            return (Criteria) this;
        }

        public Criteria andImgUrl3LessThanOrEqualTo(String value) {
            addCriterion("img_url3 <=", value, "imgUrl3");
            return (Criteria) this;
        }

        public Criteria andImgUrl3Like(String value) {
            addCriterion("img_url3 like", value, "imgUrl3");
            return (Criteria) this;
        }

        public Criteria andImgUrl3NotLike(String value) {
            addCriterion("img_url3 not like", value, "imgUrl3");
            return (Criteria) this;
        }

        public Criteria andImgUrl3In(List<String> values) {
            addCriterion("img_url3 in", values, "imgUrl3");
            return (Criteria) this;
        }

        public Criteria andImgUrl3NotIn(List<String> values) {
            addCriterion("img_url3 not in", values, "imgUrl3");
            return (Criteria) this;
        }

        public Criteria andImgUrl3Between(String value1, String value2) {
            addCriterion("img_url3 between", value1, value2, "imgUrl3");
            return (Criteria) this;
        }

        public Criteria andImgUrl3NotBetween(String value1, String value2) {
            addCriterion("img_url3 not between", value1, value2, "imgUrl3");
            return (Criteria) this;
        }

        public Criteria andDescribe3IsNull() {
            addCriterion("describe3 is null");
            return (Criteria) this;
        }

        public Criteria andDescribe3IsNotNull() {
            addCriterion("describe3 is not null");
            return (Criteria) this;
        }

        public Criteria andDescribe3EqualTo(String value) {
            addCriterion("describe3 =", value, "describe3");
            return (Criteria) this;
        }

        public Criteria andDescribe3NotEqualTo(String value) {
            addCriterion("describe3 <>", value, "describe3");
            return (Criteria) this;
        }

        public Criteria andDescribe3GreaterThan(String value) {
            addCriterion("describe3 >", value, "describe3");
            return (Criteria) this;
        }

        public Criteria andDescribe3GreaterThanOrEqualTo(String value) {
            addCriterion("describe3 >=", value, "describe3");
            return (Criteria) this;
        }

        public Criteria andDescribe3LessThan(String value) {
            addCriterion("describe3 <", value, "describe3");
            return (Criteria) this;
        }

        public Criteria andDescribe3LessThanOrEqualTo(String value) {
            addCriterion("describe3 <=", value, "describe3");
            return (Criteria) this;
        }

        public Criteria andDescribe3Like(String value) {
            addCriterion("describe3 like", value, "describe3");
            return (Criteria) this;
        }

        public Criteria andDescribe3NotLike(String value) {
            addCriterion("describe3 not like", value, "describe3");
            return (Criteria) this;
        }

        public Criteria andDescribe3In(List<String> values) {
            addCriterion("describe3 in", values, "describe3");
            return (Criteria) this;
        }

        public Criteria andDescribe3NotIn(List<String> values) {
            addCriterion("describe3 not in", values, "describe3");
            return (Criteria) this;
        }

        public Criteria andDescribe3Between(String value1, String value2) {
            addCriterion("describe3 between", value1, value2, "describe3");
            return (Criteria) this;
        }

        public Criteria andDescribe3NotBetween(String value1, String value2) {
            addCriterion("describe3 not between", value1, value2, "describe3");
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