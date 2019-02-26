package com.hfut.entity;

import java.util.ArrayList;
import java.util.List;

public class ExprimentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ExprimentExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andTeacherIsNull() {
            addCriterion("teacher is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIsNotNull() {
            addCriterion("teacher is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherEqualTo(String value) {
            addCriterion("teacher =", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotEqualTo(String value) {
            addCriterion("teacher <>", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherGreaterThan(String value) {
            addCriterion("teacher >", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherGreaterThanOrEqualTo(String value) {
            addCriterion("teacher >=", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherLessThan(String value) {
            addCriterion("teacher <", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherLessThanOrEqualTo(String value) {
            addCriterion("teacher <=", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherLike(String value) {
            addCriterion("teacher like", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotLike(String value) {
            addCriterion("teacher not like", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherIn(List<String> values) {
            addCriterion("teacher in", values, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotIn(List<String> values) {
            addCriterion("teacher not in", values, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherBetween(String value1, String value2) {
            addCriterion("teacher between", value1, value2, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotBetween(String value1, String value2) {
            addCriterion("teacher not between", value1, value2, "teacher");
            return (Criteria) this;
        }

        public Criteria andLessonIsNull() {
            addCriterion("lesson is null");
            return (Criteria) this;
        }

        public Criteria andLessonIsNotNull() {
            addCriterion("lesson is not null");
            return (Criteria) this;
        }

        public Criteria andLessonEqualTo(String value) {
            addCriterion("lesson =", value, "lesson");
            return (Criteria) this;
        }

        public Criteria andLessonNotEqualTo(String value) {
            addCriterion("lesson <>", value, "lesson");
            return (Criteria) this;
        }

        public Criteria andLessonGreaterThan(String value) {
            addCriterion("lesson >", value, "lesson");
            return (Criteria) this;
        }

        public Criteria andLessonGreaterThanOrEqualTo(String value) {
            addCriterion("lesson >=", value, "lesson");
            return (Criteria) this;
        }

        public Criteria andLessonLessThan(String value) {
            addCriterion("lesson <", value, "lesson");
            return (Criteria) this;
        }

        public Criteria andLessonLessThanOrEqualTo(String value) {
            addCriterion("lesson <=", value, "lesson");
            return (Criteria) this;
        }

        public Criteria andLessonLike(String value) {
            addCriterion("lesson like", value, "lesson");
            return (Criteria) this;
        }

        public Criteria andLessonNotLike(String value) {
            addCriterion("lesson not like", value, "lesson");
            return (Criteria) this;
        }

        public Criteria andLessonIn(List<String> values) {
            addCriterion("lesson in", values, "lesson");
            return (Criteria) this;
        }

        public Criteria andLessonNotIn(List<String> values) {
            addCriterion("lesson not in", values, "lesson");
            return (Criteria) this;
        }

        public Criteria andLessonBetween(String value1, String value2) {
            addCriterion("lesson between", value1, value2, "lesson");
            return (Criteria) this;
        }

        public Criteria andLessonNotBetween(String value1, String value2) {
            addCriterion("lesson not between", value1, value2, "lesson");
            return (Criteria) this;
        }

        public Criteria andYearsIsNull() {
            addCriterion("years is null");
            return (Criteria) this;
        }

        public Criteria andYearsIsNotNull() {
            addCriterion("years is not null");
            return (Criteria) this;
        }

        public Criteria andYearsEqualTo(Integer value) {
            addCriterion("years =", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsNotEqualTo(Integer value) {
            addCriterion("years <>", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsGreaterThan(Integer value) {
            addCriterion("years >", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsGreaterThanOrEqualTo(Integer value) {
            addCriterion("years >=", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsLessThan(Integer value) {
            addCriterion("years <", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsLessThanOrEqualTo(Integer value) {
            addCriterion("years <=", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsIn(List<Integer> values) {
            addCriterion("years in", values, "years");
            return (Criteria) this;
        }

        public Criteria andYearsNotIn(List<Integer> values) {
            addCriterion("years not in", values, "years");
            return (Criteria) this;
        }

        public Criteria andYearsBetween(Integer value1, Integer value2) {
            addCriterion("years between", value1, value2, "years");
            return (Criteria) this;
        }

        public Criteria andYearsNotBetween(Integer value1, Integer value2) {
            addCriterion("years not between", value1, value2, "years");
            return (Criteria) this;
        }

        public Criteria andTeachClassIsNull() {
            addCriterion("teach_class is null");
            return (Criteria) this;
        }

        public Criteria andTeachClassIsNotNull() {
            addCriterion("teach_class is not null");
            return (Criteria) this;
        }

        public Criteria andTeachClassEqualTo(Integer value) {
            addCriterion("teach_class =", value, "teachClass");
            return (Criteria) this;
        }

        public Criteria andTeachClassNotEqualTo(Integer value) {
            addCriterion("teach_class <>", value, "teachClass");
            return (Criteria) this;
        }

        public Criteria andTeachClassGreaterThan(Integer value) {
            addCriterion("teach_class >", value, "teachClass");
            return (Criteria) this;
        }

        public Criteria andTeachClassGreaterThanOrEqualTo(Integer value) {
            addCriterion("teach_class >=", value, "teachClass");
            return (Criteria) this;
        }

        public Criteria andTeachClassLessThan(Integer value) {
            addCriterion("teach_class <", value, "teachClass");
            return (Criteria) this;
        }

        public Criteria andTeachClassLessThanOrEqualTo(Integer value) {
            addCriterion("teach_class <=", value, "teachClass");
            return (Criteria) this;
        }

        public Criteria andTeachClassIn(List<Integer> values) {
            addCriterion("teach_class in", values, "teachClass");
            return (Criteria) this;
        }

        public Criteria andTeachClassNotIn(List<Integer> values) {
            addCriterion("teach_class not in", values, "teachClass");
            return (Criteria) this;
        }

        public Criteria andTeachClassBetween(Integer value1, Integer value2) {
            addCriterion("teach_class between", value1, value2, "teachClass");
            return (Criteria) this;
        }

        public Criteria andTeachClassNotBetween(Integer value1, Integer value2) {
            addCriterion("teach_class not between", value1, value2, "teachClass");
            return (Criteria) this;
        }

        public Criteria andGradesIsNull() {
            addCriterion("grades is null");
            return (Criteria) this;
        }

        public Criteria andGradesIsNotNull() {
            addCriterion("grades is not null");
            return (Criteria) this;
        }

        public Criteria andGradesEqualTo(String value) {
            addCriterion("grades =", value, "grades");
            return (Criteria) this;
        }

        public Criteria andGradesNotEqualTo(String value) {
            addCriterion("grades <>", value, "grades");
            return (Criteria) this;
        }

        public Criteria andGradesGreaterThan(String value) {
            addCriterion("grades >", value, "grades");
            return (Criteria) this;
        }

        public Criteria andGradesGreaterThanOrEqualTo(String value) {
            addCriterion("grades >=", value, "grades");
            return (Criteria) this;
        }

        public Criteria andGradesLessThan(String value) {
            addCriterion("grades <", value, "grades");
            return (Criteria) this;
        }

        public Criteria andGradesLessThanOrEqualTo(String value) {
            addCriterion("grades <=", value, "grades");
            return (Criteria) this;
        }

        public Criteria andGradesLike(String value) {
            addCriterion("grades like", value, "grades");
            return (Criteria) this;
        }

        public Criteria andGradesNotLike(String value) {
            addCriterion("grades not like", value, "grades");
            return (Criteria) this;
        }

        public Criteria andGradesIn(List<String> values) {
            addCriterion("grades in", values, "grades");
            return (Criteria) this;
        }

        public Criteria andGradesNotIn(List<String> values) {
            addCriterion("grades not in", values, "grades");
            return (Criteria) this;
        }

        public Criteria andGradesBetween(String value1, String value2) {
            addCriterion("grades between", value1, value2, "grades");
            return (Criteria) this;
        }

        public Criteria andGradesNotBetween(String value1, String value2) {
            addCriterion("grades not between", value1, value2, "grades");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andPeroidIsNull() {
            addCriterion("peroid is null");
            return (Criteria) this;
        }

        public Criteria andPeroidIsNotNull() {
            addCriterion("peroid is not null");
            return (Criteria) this;
        }

        public Criteria andPeroidEqualTo(Float value) {
            addCriterion("peroid =", value, "peroid");
            return (Criteria) this;
        }

        public Criteria andPeroidNotEqualTo(Float value) {
            addCriterion("peroid <>", value, "peroid");
            return (Criteria) this;
        }

        public Criteria andPeroidGreaterThan(Float value) {
            addCriterion("peroid >", value, "peroid");
            return (Criteria) this;
        }

        public Criteria andPeroidGreaterThanOrEqualTo(Float value) {
            addCriterion("peroid >=", value, "peroid");
            return (Criteria) this;
        }

        public Criteria andPeroidLessThan(Float value) {
            addCriterion("peroid <", value, "peroid");
            return (Criteria) this;
        }

        public Criteria andPeroidLessThanOrEqualTo(Float value) {
            addCriterion("peroid <=", value, "peroid");
            return (Criteria) this;
        }

        public Criteria andPeroidIn(List<Float> values) {
            addCriterion("peroid in", values, "peroid");
            return (Criteria) this;
        }

        public Criteria andPeroidNotIn(List<Float> values) {
            addCriterion("peroid not in", values, "peroid");
            return (Criteria) this;
        }

        public Criteria andPeroidBetween(Float value1, Float value2) {
            addCriterion("peroid between", value1, value2, "peroid");
            return (Criteria) this;
        }

        public Criteria andPeroidNotBetween(Float value1, Float value2) {
            addCriterion("peroid not between", value1, value2, "peroid");
            return (Criteria) this;
        }

        public Criteria andPeopleIsNull() {
            addCriterion("people is null");
            return (Criteria) this;
        }

        public Criteria andPeopleIsNotNull() {
            addCriterion("people is not null");
            return (Criteria) this;
        }

        public Criteria andPeopleEqualTo(Integer value) {
            addCriterion("people =", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotEqualTo(Integer value) {
            addCriterion("people <>", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleGreaterThan(Integer value) {
            addCriterion("people >", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("people >=", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleLessThan(Integer value) {
            addCriterion("people <", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleLessThanOrEqualTo(Integer value) {
            addCriterion("people <=", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleIn(List<Integer> values) {
            addCriterion("people in", values, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotIn(List<Integer> values) {
            addCriterion("people not in", values, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleBetween(Integer value1, Integer value2) {
            addCriterion("people between", value1, value2, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("people not between", value1, value2, "people");
            return (Criteria) this;
        }

        public Criteria andCreditIsNull() {
            addCriterion("credit is null");
            return (Criteria) this;
        }

        public Criteria andCreditIsNotNull() {
            addCriterion("credit is not null");
            return (Criteria) this;
        }

        public Criteria andCreditEqualTo(Float value) {
            addCriterion("credit =", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotEqualTo(Float value) {
            addCriterion("credit <>", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThan(Float value) {
            addCriterion("credit >", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThanOrEqualTo(Float value) {
            addCriterion("credit >=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThan(Float value) {
            addCriterion("credit <", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThanOrEqualTo(Float value) {
            addCriterion("credit <=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditIn(List<Float> values) {
            addCriterion("credit in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotIn(List<Float> values) {
            addCriterion("credit not in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditBetween(Float value1, Float value2) {
            addCriterion("credit between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotBetween(Float value1, Float value2) {
            addCriterion("credit not between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andCoefficientIsNull() {
            addCriterion("coefficient is null");
            return (Criteria) this;
        }

        public Criteria andCoefficientIsNotNull() {
            addCriterion("coefficient is not null");
            return (Criteria) this;
        }

        public Criteria andCoefficientEqualTo(Float value) {
            addCriterion("coefficient =", value, "coefficient");
            return (Criteria) this;
        }

        public Criteria andCoefficientNotEqualTo(Float value) {
            addCriterion("coefficient <>", value, "coefficient");
            return (Criteria) this;
        }

        public Criteria andCoefficientGreaterThan(Float value) {
            addCriterion("coefficient >", value, "coefficient");
            return (Criteria) this;
        }

        public Criteria andCoefficientGreaterThanOrEqualTo(Float value) {
            addCriterion("coefficient >=", value, "coefficient");
            return (Criteria) this;
        }

        public Criteria andCoefficientLessThan(Float value) {
            addCriterion("coefficient <", value, "coefficient");
            return (Criteria) this;
        }

        public Criteria andCoefficientLessThanOrEqualTo(Float value) {
            addCriterion("coefficient <=", value, "coefficient");
            return (Criteria) this;
        }

        public Criteria andCoefficientIn(List<Float> values) {
            addCriterion("coefficient in", values, "coefficient");
            return (Criteria) this;
        }

        public Criteria andCoefficientNotIn(List<Float> values) {
            addCriterion("coefficient not in", values, "coefficient");
            return (Criteria) this;
        }

        public Criteria andCoefficientBetween(Float value1, Float value2) {
            addCriterion("coefficient between", value1, value2, "coefficient");
            return (Criteria) this;
        }

        public Criteria andCoefficientNotBetween(Float value1, Float value2) {
            addCriterion("coefficient not between", value1, value2, "coefficient");
            return (Criteria) this;
        }

        public Criteria andWorkloadIsNull() {
            addCriterion("workload is null");
            return (Criteria) this;
        }

        public Criteria andWorkloadIsNotNull() {
            addCriterion("workload is not null");
            return (Criteria) this;
        }

        public Criteria andWorkloadEqualTo(Float value) {
            addCriterion("workload =", value, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadNotEqualTo(Float value) {
            addCriterion("workload <>", value, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadGreaterThan(Float value) {
            addCriterion("workload >", value, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadGreaterThanOrEqualTo(Float value) {
            addCriterion("workload >=", value, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadLessThan(Float value) {
            addCriterion("workload <", value, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadLessThanOrEqualTo(Float value) {
            addCriterion("workload <=", value, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadIn(List<Float> values) {
            addCriterion("workload in", values, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadNotIn(List<Float> values) {
            addCriterion("workload not in", values, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadBetween(Float value1, Float value2) {
            addCriterion("workload between", value1, value2, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadNotBetween(Float value1, Float value2) {
            addCriterion("workload not between", value1, value2, "workload");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
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