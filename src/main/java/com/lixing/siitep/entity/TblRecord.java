package com.lixing.siitep.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class TblRecord {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_record.create_time
     *
     * @mbg.generated Mon Feb 24 10:58:52 CST 2020
     */

    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_record.table_name
     *
     * @mbg.generated Mon Feb 24 10:58:52 CST 2020
     */
    private String tableName;

}