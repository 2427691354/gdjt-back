package com.lixing.siitep.mapper;

import com.lixing.siitep.entity.TbDayrpt;
import com.lixing.siitep.entity.TbDayrptExample;
import java.util.List;
import java.util.Map;

import com.lixing.siitep.entity.TblRecord;
import org.apache.ibatis.annotations.Param;

public interface TbDayrptMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_dayrpt
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
    long countByExample(TbDayrptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_dayrpt
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
    int deleteByExample(TbDayrptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_dayrpt
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_dayrpt
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
    int insert(TbDayrpt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_dayrpt
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
    int insertSelective(TbDayrpt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_dayrpt
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
    List<TbDayrpt> selectByExample(TbDayrptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_dayrpt
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
    TbDayrpt selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_dayrpt
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
    int updateByExampleSelective(@Param("record") TbDayrpt record, @Param("example") TbDayrptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_dayrpt
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
    int updateByExample(@Param("record") TbDayrpt record, @Param("example") TbDayrptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_dayrpt
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
    int updateByPrimaryKeySelective(TbDayrpt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_dayrpt
     *
     * @mbg.generated Mon Feb 24 09:59:27 CST 2020
     */
    int updateByPrimaryKey(TbDayrpt record);

    // 宏观统计 总人数、隔离人数、发烧人数
    Map<String,Object> sum(TbDayrptExample example);
   //统计各省物理分布人数
    List<TbDayrpt> StuInProvince(String day);
    //统计各省发烧人数分布
    List<TbDayrpt> StuHotInProvince(String day);
    //统计各省隔离人数分布
    List<TbDayrpt> StuIsolatedInProvince(String day);
    //重点关注学生
    List<TbDayrpt> FocusStu(String day);
    //体温等级比例
    List<TbDayrpt> getTemperatureGradeRatio(String day);
    //最后创建表时间
    String NewTime(TbDayrptExample example);
    //




}