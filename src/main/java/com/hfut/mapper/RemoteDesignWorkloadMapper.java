package com.hfut.mapper;

import com.hfut.entity.RemoteDesignWorkload;
import com.hfut.entity.RemoteDesignWorkloadExample;
import com.hfut.entity.RemoteDesignWorkloadKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RemoteDesignWorkloadMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table remote_design
     *
     * @mbggenerated Thu Oct 26 13:57:14 CST 2017
     */
    int countByExample(RemoteDesignWorkloadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table remote_design
     *
     * @mbggenerated Thu Oct 26 13:57:14 CST 2017
     */
    int deleteByExample(RemoteDesignWorkloadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table remote_design
     *
     * @mbggenerated Thu Oct 26 13:57:14 CST 2017
     */
    int deleteByPrimaryKey(RemoteDesignWorkloadKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table remote_design
     *
     * @mbggenerated Thu Oct 26 13:57:14 CST 2017
     */
    int insert(RemoteDesignWorkload record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table remote_design
     *
     * @mbggenerated Thu Oct 26 13:57:14 CST 2017
     */
    int insertSelective(RemoteDesignWorkload record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table remote_design
     *
     * @mbggenerated Thu Oct 26 13:57:14 CST 2017
     */
    List<RemoteDesignWorkload> selectByExample(RemoteDesignWorkloadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table remote_design
     *
     * @mbggenerated Thu Oct 26 13:57:14 CST 2017
     */
    RemoteDesignWorkload selectByPrimaryKey(RemoteDesignWorkloadKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table remote_design
     *
     * @mbggenerated Thu Oct 26 13:57:14 CST 2017
     */
    int updateByExampleSelective(@Param("record") RemoteDesignWorkload record, @Param("example") RemoteDesignWorkloadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table remote_design
     *
     * @mbggenerated Thu Oct 26 13:57:14 CST 2017
     */
    int updateByExample(@Param("record") RemoteDesignWorkload record, @Param("example") RemoteDesignWorkloadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table remote_design
     *
     * @mbggenerated Thu Oct 26 13:57:14 CST 2017
     */
    int updateByPrimaryKeySelective(RemoteDesignWorkload record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table remote_design
     *
     * @mbggenerated Thu Oct 26 13:57:14 CST 2017
     */
    int updateByPrimaryKey(RemoteDesignWorkload record);
}