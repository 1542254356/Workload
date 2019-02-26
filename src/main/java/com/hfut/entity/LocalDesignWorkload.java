package com.hfut.entity;

public class LocalDesignWorkload extends LocalDesignWorkloadKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column local_design.grades
     *
     * @mbggenerated Fri Oct 27 21:03:30 CST 2017
     */
    private String grades;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column local_design.people
     *
     * @mbggenerated Fri Oct 27 21:03:30 CST 2017
     */
    private Integer people;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column local_design.weeks
     *
     * @mbggenerated Fri Oct 27 21:03:30 CST 2017
     */
    private Integer weeks;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column local_design.workload
     *
     * @mbggenerated Fri Oct 27 21:03:30 CST 2017
     */
    private Float workload;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column local_design.note
     *
     * @mbggenerated Fri Oct 27 21:03:30 CST 2017
     */
    private String note;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column local_design.grades
     *
     * @return the value of local_design.grades
     *
     * @mbggenerated Fri Oct 27 21:03:30 CST 2017
     */
    public String getGrades() {
        return grades;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column local_design.grades
     *
     * @param grades the value for local_design.grades
     *
     * @mbggenerated Fri Oct 27 21:03:30 CST 2017
     */
    public void setGrades(String grades) {
        this.grades = grades == null ? null : grades.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column local_design.people
     *
     * @return the value of local_design.people
     *
     * @mbggenerated Fri Oct 27 21:03:30 CST 2017
     */
    public Integer getPeople() {
        return people;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column local_design.people
     *
     * @param people the value for local_design.people
     *
     * @mbggenerated Fri Oct 27 21:03:30 CST 2017
     */
    public void setPeople(Integer people) {
        this.people = people;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column local_design.weeks
     *
     * @return the value of local_design.weeks
     *
     * @mbggenerated Fri Oct 27 21:03:30 CST 2017
     */
    public Integer getWeeks() {
        return weeks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column local_design.weeks
     *
     * @param weeks the value for local_design.weeks
     *
     * @mbggenerated Fri Oct 27 21:03:30 CST 2017
     */
    public void setWeeks(Integer weeks) {
        this.weeks = weeks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column local_design.workload
     *
     * @return the value of local_design.workload
     *
     * @mbggenerated Fri Oct 27 21:03:30 CST 2017
     */
    public Float getWorkload() {
        return workload;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column local_design.workload
     *
     * @param workload the value for local_design.workload
     *
     * @mbggenerated Fri Oct 27 21:03:30 CST 2017
     */
    public void setWorkload(Float workload) {
        this.workload = workload;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column local_design.note
     *
     * @return the value of local_design.note
     *
     * @mbggenerated Fri Oct 27 21:03:30 CST 2017
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column local_design.note
     *
     * @param note the value for local_design.note
     *
     * @mbggenerated Fri Oct 27 21:03:30 CST 2017
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}