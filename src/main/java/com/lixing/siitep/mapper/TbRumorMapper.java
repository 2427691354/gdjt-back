package com.lixing.siitep.mapper;

import com.lixing.siitep.entity.TbRumor;
import com.lixing.siitep.entity.TbRumorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbRumorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_rumor
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
    long countByExample(TbRumorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_rumor
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
    int deleteByExample(TbRumorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_rumor
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_rumor
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
    int insert(TbRumor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_rumor
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
    int insertSelective(TbRumor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_rumor
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
    List<TbRumor> selectByExample(TbRumorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_rumor
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
    TbRumor selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_rumor
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
    int updateByExampleSelective(@Param("record") TbRumor record, @Param("example") TbRumorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_rumor
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
    int updateByExample(@Param("record") TbRumor record, @Param("example") TbRumorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_rumor
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
    int updateByPrimaryKeySelective(TbRumor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_rumor
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
    int updateByPrimaryKey(TbRumor record);
    List<TbRumor> selectRumortitle();
}