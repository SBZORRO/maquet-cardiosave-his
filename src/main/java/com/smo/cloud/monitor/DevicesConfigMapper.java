package com.smo.cloud.monitor;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Update;

/**
 * @Author xuejiaqi
 * @Date 2023-09-14
 */
public interface DevicesConfigMapper extends BaseMapper<DevicesConfig> {

    @Update("update device_config set  where instCode = #{devicesConfig}")
    void update(DevicesConfig devicesConfig);
}
