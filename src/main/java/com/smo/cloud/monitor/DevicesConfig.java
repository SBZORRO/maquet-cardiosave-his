package com.smo.cloud.monitor;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.smo.framework.commons.tool.validate.an.NotNull;

/**
 * @Author xuejiaqi
 * @Date 2023-09-14
 */
@TableName("device_config")
public class DevicesConfig {

    /**
     * 数据记录标识
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;
    /**
     * 产品实例标识
     */
    @TableField("INST_CODE")
    @NotNull
    private String instCode;
    /**
     * ECG采样率
     */
    @TableField("ECG_SAMPLE_RATE")
    private Integer ecgSampleRate;
    /**
     * ECG字节长度
     */
    @TableField("ECG_POINT_SIZE")
    private Integer ecgPointSize;
    /**
     * ECG精度
     */
    @TableField("ECG_RESOLUTION")
    private Double ecgResolution;
    /**
     * ECG基线
     */
    @TableField("ECG_BASELINE")
    private Double ecgBaseline;
    /**
     * RESP采样率
     */
    @TableField("RESP_SAMPLE_RATE")
    private Integer respSampleRate;
    /**
     * RESP字节长度
     */
    @TableField("RESP_POINT_SIZE")
    private Integer respPointSize;
    /**
     * RESP精度
     */
    @TableField("RESP_RESOLUTION")
    private Double respResolution;
    /**
     * RESP基线
     */
    @TableField("RESP_BASELINE")
    private Double respBaseline;
    /**
     * Pleth采样率
     */
    @TableField("PLETH_SAMPLE_RATE")
    private Integer plethSampleRate;
    /**
     * Pleth字节长度
     */
    @TableField("PLETH_POINT_SIZE")
    private Integer plethPointSize;
    /**
     * Pleth精度
     */
    @TableField("PLETH_RESOLUTION")
    private Double plethResolution;
    /**
     * Pleth基线
     */
    @TableField("PLETH_BASELINE")
    private Double plethBaseline;
    /**
     * IBP采样率
     */
    @TableField("IBP_SAMPLE_RATE")
    private Integer ibpSampleRate;
    /**
     *IBP字节长度
     */
    @TableField("IBP_POINT_SIZE")
    private Integer ibpPointSize;
    /**
     * IBP精度
     */
    @TableField("IBP_RESOLUTION")
    private Double ibpResolution;
    /**
     * IBP基线
     */
    @TableField("IBP_BASELINE")
    private Double ibpBaseline;
    /**
     * CO2采样率
     */
    @TableField("CO2_SAMPLE_RATE")
    private Integer co2SampleRate;
    /**
     * CO2字节长度
     */
    @TableField("CO2_POINT_SIZE")
    private Integer co2PointSize;
    /**
     * CO2精度
     */
    @TableField("CO2_RESOLUTION")
    private Double co2Resolution;
    /**
     * CO2基线
     */
    @TableField("CO2_BASELINE")
    private Double co2Baseline;
    /**
     * PAW采样率
     */
    @TableField("PAW_SAMPLE_RATE")
    private Integer pawSampleRate;
    /**
     * PAW字节长度
     */
    @TableField("PAW_POINT_SIZE")
    private Integer pawPointSize;
    /**
     * PAW精度
     */
    @TableField("PAW_RESOLUTION")
    private Double pawResolution;
    @TableField("PAW_BASELINE")
    private Double pawBaseline;
    /**
     * FLOW采样率
     */
    @TableField("FLOW_SAMPLE_RATE")
    private Integer flowSampleRate;
    /**
     * FLOW字节长度
     */
    @TableField("FLOW_POINT_SIZE")
    private Integer flowPointSize;
    /**
     * FLOW精度
     */
    @TableField("FLOW_RESOLUTION")
    private Double flowResolution;
    @TableField("FLOW_BASELINE")
    private Double flowBaseline;
    /**
     * VOLUME采样率
     */
    @TableField("VOLUME_SAMPLE_RATE")
    private Integer volumeSampleRate;
    /**
     * VOLUME字节长度
     */
    @TableField("VOLUME_POINT_SIZE")
    private Integer volumePointSize;
    /**
     * VOLUME精度
     */
    @TableField("VOLUME_RESOLUTION")
    private Double volumeResolution;
    @TableField("VOLUME_BASELINE")
    private Double volumeBaseline;
    /**
     * 食道压采样率
     */
    @TableField("PES_SAMPLE_RATE")
    private Integer pesSampleRate;
    /**
     * 食道压字节长度
     */
    @TableField("PES_POINT_SIZE")
    private Integer pesPointSize;
    /**
     * 食道压精度
     */
    @TableField("PES_RESOLUTION")
    private Double pesResolution;
    @TableField("PES_BASELINE")
    private Double pesBaseline;
    /**
     * 跨肺压采样率
     */
    @TableField("PTP_SAMPLE_RATE")
    private Integer ptpSampleRate;
    /**
     * 跨肺压字节长度
     */
    @TableField("PTP_POINT_SIZE")
    private Integer ptpPointSize;
    /**
     * 跨肺压精度
     */
    @TableField("PTP_RESOLUTION")
    private Double ptpResolution;
    @TableField("PTP_BASELINE")
    private Double ptpBaseline;

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

    public Integer getEcgSampleRate() {
        return ecgSampleRate;
    }

    public void setEcgSampleRate(Integer ecgSampleRate) {
        this.ecgSampleRate = ecgSampleRate;
    }

    public Integer getEcgPointSize() {
        return ecgPointSize;
    }

    public void setEcgPointSize(Integer ecgPointSize) {
        this.ecgPointSize = ecgPointSize;
    }

    public Double getEcgResolution() {
        return ecgResolution;
    }

    public void setEcgResolution(Double ecgResolution) {
        this.ecgResolution = ecgResolution;
    }

    public Double getEcgBaseline() {
        return ecgBaseline;
    }

    public void setEcgBaseline(Double ecgBaseline) {
        this.ecgBaseline = ecgBaseline;
    }

    public Integer getRespSampleRate() {
        return respSampleRate;
    }

    public void setRespSampleRate(Integer respSampleRate) {
        this.respSampleRate = respSampleRate;
    }

    public Integer getRespPointSize() {
        return respPointSize;
    }

    public void setRespPointSize(Integer respPointSize) {
        this.respPointSize = respPointSize;
    }

    public Double getRespResolution() {
        return respResolution;
    }

    public void setRespResolution(Double respResolution) {
        this.respResolution = respResolution;
    }

    public Double getRespBaseline() {
        return respBaseline;
    }

    public void setRespBaseline(Double respBaseline) {
        this.respBaseline = respBaseline;
    }

    public Integer getPlethSampleRate() {
        return plethSampleRate;
    }

    public void setPlethSampleRate(Integer plethSampleRate) {
        this.plethSampleRate = plethSampleRate;
    }

    public Integer getPlethPointSize() {
        return plethPointSize;
    }

    public void setPlethPointSize(Integer plethPointSize) {
        this.plethPointSize = plethPointSize;
    }

    public Double getPlethResolution() {
        return plethResolution;
    }

    public void setPlethResolution(Double plethResolution) {
        this.plethResolution = plethResolution;
    }

    public Double getPlethBaseline() {
        return plethBaseline;
    }

    public void setPlethBaseline(Double plethBaseline) {
        this.plethBaseline = plethBaseline;
    }

    public Integer getIbpSampleRate() {
        return ibpSampleRate;
    }

    public void setIbpSampleRate(Integer ibpSampleRate) {
        this.ibpSampleRate = ibpSampleRate;
    }

    public Integer getIbpPointSize() {
        return ibpPointSize;
    }

    public void setIbpPointSize(Integer ibpPointSize) {
        this.ibpPointSize = ibpPointSize;
    }

    public Double getIbpResolution() {
        return ibpResolution;
    }

    public void setIbpResolution(Double ibpResolution) {
        this.ibpResolution = ibpResolution;
    }

    public Double getIbpBaseline() {
        return ibpBaseline;
    }

    public void setIbpBaseline(Double ibpBaseline) {
        this.ibpBaseline = ibpBaseline;
    }

    public Integer getCo2SampleRate() {
        return co2SampleRate;
    }

    public void setCo2SampleRate(Integer co2SampleRate) {
        this.co2SampleRate = co2SampleRate;
    }

    public Integer getCo2PointSize() {
        return co2PointSize;
    }

    public void setCo2PointSize(Integer co2PointSize) {
        this.co2PointSize = co2PointSize;
    }

    public Double getCo2Resolution() {
        return co2Resolution;
    }

    public void setCo2Resolution(Double co2Resolution) {
        this.co2Resolution = co2Resolution;
    }

    public Double getCo2Baseline() {
        return co2Baseline;
    }

    public void setCo2Baseline(Double co2Baseline) {
        this.co2Baseline = co2Baseline;
    }

    public Integer getPawSampleRate() {
        return pawSampleRate;
    }

    public void setPawSampleRate(Integer pawSampleRate) {
        this.pawSampleRate = pawSampleRate;
    }

    public Integer getPawPointSize() {
        return pawPointSize;
    }

    public void setPawPointSize(Integer pawPointSize) {
        this.pawPointSize = pawPointSize;
    }

    public Double getPawResolution() {
        return pawResolution;
    }

    public void setPawResolution(Double pawResolution) {
        this.pawResolution = pawResolution;
    }

    public Integer getFlowSampleRate() {
        return flowSampleRate;
    }

    public void setFlowSampleRate(Integer flowSampleRate) {
        this.flowSampleRate = flowSampleRate;
    }

    public Integer getFlowPointSize() {
        return flowPointSize;
    }

    public void setFlowPointSize(Integer flowPointSize) {
        this.flowPointSize = flowPointSize;
    }

    public Double getFlowResolution() {
        return flowResolution;
    }

    public void setFlowResolution(Double flowResolution) {
        this.flowResolution = flowResolution;
    }

    public Integer getVolumeSampleRate() {
        return volumeSampleRate;
    }

    public void setVolumeSampleRate(Integer volumeSampleRate) {
        this.volumeSampleRate = volumeSampleRate;
    }

    public Integer getVolumePointSize() {
        return volumePointSize;
    }

    public void setVolumePointSize(Integer volumePointSize) {
        this.volumePointSize = volumePointSize;
    }

    public Double getVolumeResolution() {
        return volumeResolution;
    }

    public void setVolumeResolution(Double volumeResolution) {
        this.volumeResolution = volumeResolution;
    }

    public Integer getPesSampleRate() {
        return pesSampleRate;
    }

    public void setPesSampleRate(Integer pesSampleRate) {
        this.pesSampleRate = pesSampleRate;
    }

    public Integer getPesPointSize() {
        return pesPointSize;
    }

    public void setPesPointSize(Integer pesPointSize) {
        this.pesPointSize = pesPointSize;
    }

    public Double getPesResolution() {
        return pesResolution;
    }

    public void setPesResolution(Double pesResolution) {
        this.pesResolution = pesResolution;
    }

    public Integer getPtpSampleRate() {
        return ptpSampleRate;
    }

    public void setPtpSampleRate(Integer ptpSampleRate) {
        this.ptpSampleRate = ptpSampleRate;
    }

    public Integer getPtpPointSize() {
        return ptpPointSize;
    }

    public void setPtpPointSize(Integer ptpPointSize) {
        this.ptpPointSize = ptpPointSize;
    }

    public Double getPtpResolution() {
        return ptpResolution;
    }

    public void setPtpResolution(Double ptpResolution) {
        this.ptpResolution = ptpResolution;
    }

    public Double getPawBaseline() {
        return pawBaseline;
    }

    public void setPawBaseline(Double pawBaseline) {
        this.pawBaseline = pawBaseline;
    }

    public Double getFlowBaseline() {
        return flowBaseline;
    }

    public void setFlowBaseline(Double flowBaseline) {
        this.flowBaseline = flowBaseline;
    }

    public Double getVolumeBaseline() {
        return volumeBaseline;
    }

    public void setVolumeBaseline(Double volumeBaseline) {
        this.volumeBaseline = volumeBaseline;
    }

    public Double getPesBaseline() {
        return pesBaseline;
    }

    public void setPesBaseline(Double pesBaseline) {
        this.pesBaseline = pesBaseline;
    }

    public Double getPtpBaseline() {
        return ptpBaseline;
    }

    public void setPtpBaseline(Double ptpBaseline) {
        this.ptpBaseline = ptpBaseline;
    }
}
