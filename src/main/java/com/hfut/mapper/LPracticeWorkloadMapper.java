package com.hfut.mapper;

import com.hfut.entity.LPracticeWorkload;
import com.hfut.entity.LPracticeWorkloadExample;
import com.hfut.entity.LPracticeWorkloadKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LPracticeWorkloadMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table local_practice
     *
     * @mbggenerated Sat Oct 28 20:32:23 CST 2017
     */
    int countByExample(LPracticeWorkloadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table local_practice
     *
     * @mbggenerated Sat Oct 28 20:32:23 CST 2017
     */
    int deleteByExample(LPracticeWorkloadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table local_practice
     *
     * @mbggenerated Sat Oct 28 20:32:23 CST 2017
     */
    int deleteByPrimaryKey(LPracticeWorkloadKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table local_practice
     *
     * @mbggenerated Sat Oct 28 20:32:23 CST 2017
     */
    int insert(LPracticeWorkload record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table local_practice
     *
     * @mbggenerated Sat Oct 28 20:32:23 CST 2017
     */
    int insertSelective(LPracticeWorkload record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table local_practice
     *
     * @mbggenerated Sat Oct 28 20:32:23 CST 2017
     */
    List<LPracticeWorkload> selectByExample(LPracticeWorkloadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table local_practice
     *
     * @mbggenerated Sat Oct 28 20:32:23 CST 2017
     */
    LPracticeWorkload selectByPrimaryKey(LPracticeWorkloadKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table local_practice
     *
     * @mbggenerated Sat Oct 28 20:32:23 CST 2017
     */
    int updateByExampleSelective(@Param("record") LPracticeWorkload record, @Param("example") LPracticeWorkloadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table local_practice
     *
     * @mbggenerated Sat Oct 28 20:32:23 CST 2017
     */
    int updateByExample(@Param("record") LPracticeWorkload record, @Param("example") LPracticeWorkloadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table local_practice
     *
     * @mbggenerated Sat Oct 28 20:32:23 CST 2017
     */
    int updateByPrimaryKeySelective(LPracticeWorkload record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table local_practice
     *
     * @mbggenerated Sat Oct 28 20:32:23 CST 2017
     */
    int updateByPrimaryKey(LPracticeWorkload record);
}