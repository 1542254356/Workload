package com.hfut.entity;

public class LNetWorkload extends LNetWorkloadKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column local_net.answer
     *
     * @mbggenerated Sat Oct 28 13:53:52 CST 2017
     */
    private Integer answer;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column local_net.workload
     *
     * @mbggenerated Sat Oct 28 13:53:52 CST 2017
     */
    private Float workload;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column local_net.note
     *
     * @mbggenerated Sat Oct 28 13:53:52 CST 2017
     */
    private String note;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column local_net.answer
     *
     * @return the value of local_net.answer
     *
     * @mbggenerated Sat Oct 28 13:53:52 CST 2017
     */
    public Integer getAnswer() {
        return answer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column local_net.answer
     *
     * @param answer the value for local_net.answer
     *
     * @mbggenerated Sat Oct 28 13:53:52 CST 2017
     */
    public void setAnswer(Integer answer) {
        this.answer = answer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column local_net.workload
     *
     * @return the value of local_net.workload
     *
     * @mbggenerated Sat Oct 28 13:53:52 CST 2017
     */
    public Float getWorkload() {
        return workload;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column local_net.workload
     *
     * @param workload the value for local_net.workload
     *
     * @mbggenerated Sat Oct 28 13:53:52 CST 2017
     */
    public void setWorkload(Float workload) {
        this.workload = workload;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column local_net.note
     *
     * @return the value of local_net.note
     *
     * @mbggenerated Sat Oct 28 13:53:52 CST 2017
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column local_net.note
     *
     * @param note the value for local_net.note
     *
     * @mbggenerated Sat Oct 28 13:53:52 CST 2017
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}