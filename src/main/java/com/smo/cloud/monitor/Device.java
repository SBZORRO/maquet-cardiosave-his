package com.smo.cloud.monitor;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * @Author: MrADiao
 * @Date: 2022-12-07 10:11
 * @Description:
 */
@TableName("devices")
public class Device {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField("instCode")
    private String instCode;
    @TableField("extInstCode")
    private String extInstCode;

    public Device() {
    }

    public Device(String instCode, String extInstCode) {
        this.instCode = instCode;
        this.extInstCode = extInstCode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInstCode() {
        return instCode;
    }

    public void setInstCode(String instCode) {
        this.instCode = instCode;
    }

    public String getExtInstCode() {
        return extInstCode;
    }

    public void setExtInstCode(String extInstCode) {
        this.extInstCode = extInstCode;
    }

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", instCode='" + instCode + '\'' +
                ", extInstCode='" + extInstCode + '\'' +
                '}';
    }
}
