package com.smo.cloud.monitor;


import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>多参数数值-来自多参数监护仪</p>
 *
 * @author ZhuBin
 * @version 2.5
 * @date Created in 15:06 2020/12/22
 */
public class MultiParameter {
  
  /**
   * 默认有效数据状态
   */
  private static final String DEFAULT_VALID_STATUS = "1";
  
  /** 业务流水号，发送直播数据时填充 */
  private String serviceCode;

  /** 数据时间 */
  private Date createDate;
  /** 心率,兼容V1.0,暂时保留 */
  @Deprecated
  private Integer avgHr;
  /** 心率 */
  private Integer hr;
  /** 血氧饱和度 */
  private Integer spo2;
  /** 呼吸 */
  private Integer resp;
  /** 脉率 */
  private Integer pulseRate;
  /** 体温 */
  private Double temperature;
  private Double temperature2;
  private Double temperatureDifference;

  /** 舒张压 */
  private Integer diastolicPressure;
  /** 收缩压 */
  private Integer systolicPressure;
  /** 平均压 */
  private Integer avgPressure;
  /**
   * 血压模块的脉率
   */
  private Integer nibpPulseRate;
  /** 最近一次血压测量值 */
  private Integer prevDiastolicPressure;
  private Integer prevSystolicPressure;
  private Integer prevAvgPressure;
  private Integer prevNibpPulseRate;
  /** 最近一次血压测时间 */
  private Date preCreateTime;
  /**
   * mews 评分
   */
  private Integer mews;
  /**
   * 有创血压信息
   * ibp1-XX
   * ibp2-xx
   */
  private Map<String, String> ibpInfo = new HashMap<>();
  /**
   * 有创血压：动脉压-收缩压
   */
  private Integer ibpArtSys;
  /**
   * 有创血压：动脉压-舒张压
   */
  private Integer ibpArtDia;
  /**
   * 有创血压：动脉压-平均压
   */
  private Integer ibpArtMean;

  /**
   * 有创血压：收缩压
   */
  private Integer ibpFtartSys;
  /**
   * 有创血压：舒张压
   */
  private Integer ibpFtartDia;
  /**
   * 有创血压：平均压
   */
  private Integer ibpFtartMean;
  /**
   * 有创血压：肺动脉压-收缩压
   */
  private Integer ibpPaSys;
  /**
   * 有创血压：肺动脉压-舒张压
   */
  private Integer ibpPaDia;
  /**
   * 有创血压：肺动脉压-平均压
   */
  private Integer ibpPaMean;
  /**
   * 有创血压：主动脉血压-收缩压
   */
  private Integer ibpAoSys;
  /**
   * 有创血压：主动脉血压-舒张压
   */
  private Integer ibpAoDia;
  /**
   * 有创血压：主动脉血压-平均压
   */
  private Integer ibpAoMean;
  /**
   * 有创血压：脐动脉血压-收缩压
   */
  private Integer ibpUapSys;
  /**
   * 有创血压：脐动脉血压-舒张压
   */
  private Integer ibpUapDia;
  /**
   * 有创血压：脐动脉血压-平均压
   */
  private Integer ibpUapMean;
  /**
   * 有创血压：肱动脉血压-收缩压
   */
  private Integer ibpBapSys;
  /**
   * 有创血压：肱动脉血压-舒张压
   */
  private Integer ibpBapDia;
  /**
   * 有创血压：肱动脉血压-平均压
   */
  private Integer ibpBapMean;
  /**
   * 有创血压：股动脉血压-收缩压
   */
  private Integer ibpFapSys;
  /**
   * 有创血压：股动脉血压-舒张压
   */
  private Integer ibpFapDia;
  /**
   * 有创血压：股动脉血压-平均压
   */
  private Integer ibpFapMean;
  /**
   * 有创血压：左心室血压-收缩压
   */
  private Integer ibpLvSys;
  /**
   * 有创血压：左心室血压-舒张压
   */
  private Integer ibpLvDia;
  /**
   * 有创血压：左心室血压-平均压
   */
  private Integer ibpLvMean;
  /**
   * 有创血压：脐静脉血压-平均压
   */
  private Integer ibpUvpMean;
  /**
   * 有创血压：中心静脉-平均压
   */
  private Float ibpCvpMean;
  /**
   * 有创血压：右房压-平均压
   */
  private Integer ibpRapMean;
  /**
   * 有创血压：左房压-平均压
   */
  private Integer ibpLapMean;
  /**
   * 有创血压：颅内压-平均压
   */
  private Integer ibpIcpMean;
  /**
   * 有创血压：扩展压1（预留）-收缩压
   */
  private Integer ibpP1Sys;
  /**
   * 有创血压：扩展压1-舒张压
   */
  private Integer ibpP1Dia;
  /**
   * 有创血压：扩展压1-平均压
   */
  private Integer ibpP1Mean;
  /**
   * 有创血压：扩展压2-收缩压
   */
  private Integer ibpP2Sys;
  /**
   * 有创血压：扩展压2-舒张压
   */
  private Integer ibpP2Dia;
  /**
   * 有创血压：扩展压2-平均压
   */
  private Integer ibpP2Mean;
  /**
   * 有创血压：扩展压3-收缩压
   */
  private Integer ibpP3Sys;
  /**
   * 有创血压：扩展压3-舒张压
   */
  private Integer ibpP3Dia;
  /**
   * 有创血压：扩展压3-平均压
   */
  private Integer ibpP3Mean;
  /**
   * 有创血压：扩展压4-收缩压
   */
  private Integer ibpP4Sys;
  /**
   * 有创血压：扩展压4-舒张压
   */
  private Integer ibpP4Dia;
  /**
   * 有创血压：扩展压4-平均压
   */
  private Integer ibpP4Mean;
  /**
   * 有创血压：大脑灌注压
   */
  private Integer ibpCppMean;

  /**
   * 有创血压：PiCCO 法测量的
   * 动脉收缩压
   */
  private Integer ibpPartSys;
  /**
   * 有创血压：PiCCO 法测量的
   * 动脉舒张压
   */
  private Integer ibpPartDia;
  /**
   * 有创血压：PiCCO 法测量的
   * 动脉平均压
   */
  private Integer ibpPartMean;
  /**
   * 有创血压：PiCCO 法测量的
   */
  private Integer ibpPcvpSys;
  /**
   * 有创血压：PiCCO 法测量的
   */
  private Integer ibpPcvpDia;
  /**
   * 有创血压：PiCCO 法测量的
   */
  private Integer ibpPcvpMean;

  /**
   * 血流灌注指数 pi
   */
  private Float perfusionIndex;
  /**
   * 呼吸末，简称 Et
   */
  private Integer co2EndTidal;
  /**
   * 吸入二氧化碳，简称 Fi
   */
  private Integer co2FractionOfInspired;
  /**
   * 气道呼吸率，简称 awRR
   */
  private Integer co2AirwayRespiratoryRate;
  /**
   * 脉压
   */
  private Integer pp;
  /**
   * 收缩压变异率
   */
  private Double spv;
  /**
   * 脉压变异率
   */
  private Double ppv;
  /**
   * 压力上升速率
   */
  private Double vP;
  /**
   * 心排量
   */
  private Double co;
  private Double coo;
  /**
   * 心脏指数
   */
  private Double ci;
  private Double cci;
  /**
   * 每搏排出量
   */
  private Double sv;
  private Double si;
  /**
   * 每搏排出量变异率
   */
  private Double svv;
  /**
   * 血温
   */
  private Double bloodTemperature;
  /**
   * 胸腔内血容积
   */
  private Double itbv;
  private Double itbvi;
  /**
   * 全心舒张末容积
   */
  private Double gedv;
  private Double gedvi;
  /**
   * 体循环阻力
   */
  private Double svr;
  /**
   * 肺循环阻力
   */
  private Double pvr;
  private Double evlw;
  private Double evlwi;
  private Double cfi;
  private Double pvpi;
  private Double gef;
  private Double dPmax;
  private Double bldTemp;
  
  // PiCCO 法测量的动脉脉率
  private Integer pARTPulseRate;
  private Integer pCVPPulseRate;
  // CCO 连续心排量
  private Double cco;
  // 每搏射血指数
  private Double svi;
  // 心输出功率
  private Double cpo;
  // 心功率指数
  private Double cpi;
  // 左室收缩力指
  private Integer dpmx;
  // 心排量中的心率 Cardiac Output
  private Integer coHr;


  private Integer minHr;
  private Integer maxHr;
  private Integer maxDiastolicPressure;
  private Integer minDiastolicPressure;
  private Integer maxSystolicPressure;
  private Integer minSystolicPressure;
  private Integer maxAvgPressure;
  private Integer minAvgPressure;
  private Integer minSpo2;
  private Integer maxSpo2;
  private Integer minResp;
  private Integer maxResp;
  private Double minTemperature;
  private Double maxTemperature;
  private Integer pain;
  private Integer defecate;
  private Double bloodSugar;
  private Integer health;
  private Double lcw;
  private Double lcwi;
  private Double lvsw;
  private Double lvswi;
  private Double rcw;
  private Double rcwi;
  private Double rvsw;
  private Double rvswi;
  private Double cvp;
  private Double pawp;
  private Double svri;
  private Double pvri;
  private Double bsa;
  
  // 省立院内有的参数, 云平台没有的参数
  private Integer bis;
  private Integer bpHight;
  private Integer bpLow;
  private Integer diastolicPressureCount;
  private Integer systolicPressureCount;
  private Integer avgPressureCount;
  private Integer pulseRateCount;
  private Integer tofRatio;
  private Integer temperatureCount;
  private Integer spo2Count;
  private Integer respCount;
  private Integer avgHrCount;
  private String errorMsg;
 
  /**
   * 呼吸频率分数
   */
  private Integer scoreRr;

  /**
   * 血氧分数
   */
  private Integer scoreSpo2;

  /**
   * 体温分数
   */
  private Integer scoreTemp;

  /**
   * 收缩压分数
   */
  private Integer bpScoreSys;

  /**
   * 心率分数
   */
  private Integer scoreHr;

  /**
   * 意识分数
   */
  private Integer scoreLocAvpu;

  /**
   * 机械通气分数
   */
  private Integer custom1Score;

  /**
   * 心率药分数
   */
  private Integer custom2Score;

  /**
   * 降压、升压药分数
   */
  private Integer custom3Score;

  /**
   * 总分
   */
  private Integer totalScore;

    /**
     * 设备技术报警
     */
    private List<String> technical;
    /**
     * 设备体征报警
     */
    private List<String> physical;
    /**
     * 阈值报警
     */
    private List<String> threshold;
    /**
     * 心律失常报警
     */
    private List<String> arrhythmia;

    /**
     * hr数据状态
     * 数据状态：无效：”0 “、有效：”1“、 疑似："2” （默认为有效）
     */
    private String hrStatus;

    /**
     * spo2 数据状态
     * 数据状态：无效：”0 “、有效：”1“、 疑似："2” （默认为有效）
     */
    private String spo2Status;

    /**
     * resp数据状态
     * 数据状态：无效：”0 “、有效：”1“、 疑似："2” （默认为有效）
     */
    private String respStatus;

    /**
     * 收缩/舒张压数据状态
     * 数据状态：无效：”0 “、有效：”1“、 疑似："2” （默认为有效）
     */
    private String nibpStatus;

    /**
     * 设置ibp1的WaveCode信息
     *
     * @param waveCode IBP波形编码
     */
    public void setIbp1WaveCode(String waveCode) {
        this.ibpInfo.put("ibp1", waveCode);
    }

    /**
     * 设置ibp2的WaveCode信息
     *
     * @param waveCode IBP波形编码
     */
    public void setIbp2WaveCode(String waveCode) {
        this.ibpInfo.put("ibp2", waveCode);
    }

    /**
     * 用{@link MultiParameter#getHr()} 替代
     *
     * @return hr
     */
    @Deprecated
    public Integer getAvgHr() {
        return avgHr;
    }

    /**
     * 用{@link MultiParameter#setHr(Integer)} 替代
     *
     * @return MultiParameter
     */
    @Deprecated
    public MultiParameter setAvgHr(Integer avgHr) {
        this.avgHr = avgHr;
        this.hr = avgHr;
        this.hrStatus = DEFAULT_VALID_STATUS;
        return this;
    }

    public Integer getHr() {
        return hr;
    }

    public MultiParameter setHr(Integer hr) {
        this.hr = hr;
        this.avgHr = hr;
        this.hrStatus = DEFAULT_VALID_STATUS;
        return this;
    }

    public Integer getSpo2() {
        return spo2;
    }

    public MultiParameter setSpo2(Integer spo2) {
        this.spo2 = spo2;
        this.spo2Status = DEFAULT_VALID_STATUS;
        return this;
    }

    public Integer getResp() {
        return resp;
    }

    public MultiParameter setResp(Integer resp) {
        this.resp = resp;
        this.respStatus = DEFAULT_VALID_STATUS;
        return this;
    }

    public Integer getPulseRate() {
        return pulseRate;
    }

    public MultiParameter setPulseRate(Integer pulseRate) {
        this.pulseRate = pulseRate;
        return this;
    }

    public Double getTemperature() {
        return temperature;
    }

    public MultiParameter setTemperature(Double temperature) {
        this.temperature = temperature;
        return this;
    }

    public Double getBloodTemperature() {
        return bloodTemperature;
    }

    public MultiParameter setBloodTemperature(Double bloodTemperature) {
        this.bloodTemperature = bloodTemperature;
        return this;
    }


    public Double getTemperature2() {
        return temperature2;
    }

    public MultiParameter setTemperature2(Double temperature2) {
        this.temperature2 = temperature2;
        return this;
    }

    public Double getTemperatureDifference() {
        return temperatureDifference;
    }

    public MultiParameter setTemperatureDifference(Double temperatureDifference) {
        this.temperatureDifference = temperatureDifference;
        return this;
    }

    public Integer getDiastolicPressure() {
        return diastolicPressure;
    }

    public MultiParameter setDiastolicPressure(Integer diastolicPressure) {
        this.diastolicPressure = diastolicPressure;
        return this;
    }

    public Integer getSystolicPressure() {
        return systolicPressure;
    }

    public MultiParameter setSystolicPressure(Integer systolicPressure) {
        this.systolicPressure = systolicPressure;
        return this;
    }

    public Integer getAvgPressure() {
        return avgPressure;
    }

    public MultiParameter setAvgPressure(Integer avgPressure) {
        this.avgPressure = avgPressure;
        this.nibpStatus = DEFAULT_VALID_STATUS;
        return this;
    }

    public Integer getNibpPulseRate() {
        return nibpPulseRate;
    }

    public void setNibpPulseRate(Integer nibpPulseRate) {
        this.nibpPulseRate = nibpPulseRate;
    }

    public Integer getPrevDiastolicPressure() {
        return prevDiastolicPressure;
    }

    public MultiParameter setPrevDiastolicPressure(Integer prevDiastolicPressure) {
        this.prevDiastolicPressure = prevDiastolicPressure;
        return this;
    }

    public Integer getPrevSystolicPressure() {
        return prevSystolicPressure;
    }

    public MultiParameter setPrevSystolicPressure(Integer prevSystolicPressure) {
        this.prevSystolicPressure = prevSystolicPressure;
        return this;
    }

    public Integer getPrevAvgPressure() {
        return prevAvgPressure;
    }

    public MultiParameter setPrevAvgPressure(Integer prevAvgPressure) {
        this.prevAvgPressure = prevAvgPressure;
        return this;
    }

    public Integer getPrevNibpPulseRate() {
        return prevNibpPulseRate;
    }

    public MultiParameter setPrevNibpPulseRate(Integer prevNibpPulseRate) {
        this.prevNibpPulseRate = prevNibpPulseRate;
        return this;
    }

    public Date getPreCreateTime() {
        return preCreateTime;
    }

    public MultiParameter setPreCreateTime(Date preCreateTime) {
        this.preCreateTime = preCreateTime;
        return this;
    }

    public Map<String, String> getIbpInfo() {
        return ibpInfo;
    }

    public MultiParameter setIbpInfo(Map<String, String> ibpInfo) {
        this.ibpInfo = ibpInfo;
        return this;
    }

    public Integer getIbpArtSys() {
        return ibpArtSys;
    }

    public MultiParameter setIbpArtSys(Integer ibpArtSys) {
        this.ibpArtSys = ibpArtSys;
        return this;
    }

    public Integer getIbpArtDia() {
        return ibpArtDia;
    }

    public MultiParameter setIbpArtDia(Integer ibpArtDia) {
        this.ibpArtDia = ibpArtDia;
        return this;
    }

    public Integer getIbpArtMean() {
        return ibpArtMean;
    }

    public MultiParameter setIbpArtMean(Integer ibpArtMean) {
        this.ibpArtMean = ibpArtMean;
        return this;
    }

    public MultiParameter setIbpFtartSys(Integer ibpFtartSys) {
        this.ibpFtartSys = ibpFtartSys;
        return this;
    }

    public MultiParameter setIbpFtartMean(Integer ibpFtartMean) {
        this.ibpFtartMean = ibpFtartMean;
        return this;
    }

    public MultiParameter setIbpFtartDia(Integer ibpFtartDia) {
        this.ibpFtartDia = ibpFtartDia;
        return this;
    }

    public Integer getIbpFtartSys() {
        return ibpFtartSys;
    }

    public Integer getIbpFtartDia() {
        return ibpFtartDia;
    }

    public Integer getIbpFtartMean() {
        return ibpFtartMean;
    }

    public Integer getIbpPartSys() {
        return ibpPartSys;
    }

    public MultiParameter setIbpPartSys(Integer ibpPartSys) {
        this.ibpPartSys = ibpPartSys;
        return this;
    }

    public Integer getIbpPartDia() {
        return ibpPartDia;
    }

    public MultiParameter setIbpPartDia(Integer ibpPartDia) {
        this.ibpPartDia = ibpPartDia;
        return this;
    }

    public Integer getIbpPartMean() {
        return ibpPartMean;
    }

    public MultiParameter setIbpPartMean(Integer ibpPartMean) {
        this.ibpPartMean = ibpPartMean;
        return this;
    }


    public Integer getIbpPaSys() {
        return ibpPaSys;
    }

    public MultiParameter setIbpPaSys(Integer ibpPaSys) {
        this.ibpPaSys = ibpPaSys;
        return this;
    }

    public Integer getIbpPaDia() {
        return ibpPaDia;
    }

    public MultiParameter setIbpPaDia(Integer ibpPaDia) {
        this.ibpPaDia = ibpPaDia;
        return this;
    }

    public Integer getIbpPaMean() {
        return ibpPaMean;
    }

    public MultiParameter setIbpPaMean(Integer ibpPaMean) {
        this.ibpPaMean = ibpPaMean;
        return this;
    }

    public Integer getIbpAoSys() {
        return ibpAoSys;
    }

    public MultiParameter setIbpAoSys(Integer ibpAoSys) {
        this.ibpAoSys = ibpAoSys;
        return this;
    }

    public Integer getIbpAoDia() {
        return ibpAoDia;
    }

    public MultiParameter setIbpAoDia(Integer ibpAoDia) {
        this.ibpAoDia = ibpAoDia;
        return this;
    }

    public Integer getIbpAoMean() {
        return ibpAoMean;
    }

    public MultiParameter setIbpAoMean(Integer ibpAoMean) {
        this.ibpAoMean = ibpAoMean;
        return this;
    }

    public Integer getIbpUapSys() {
        return ibpUapSys;
    }

    public MultiParameter setIbpUapSys(Integer ibpUapSys) {
        this.ibpUapSys = ibpUapSys;
        return this;
    }

    public Integer getIbpUapDia() {
        return ibpUapDia;
    }

    public MultiParameter setIbpUapDia(Integer ibpUapDia) {
        this.ibpUapDia = ibpUapDia;
        return this;
    }

    public Integer getIbpUapMean() {
        return ibpUapMean;
    }

    public MultiParameter setIbpUapMean(Integer ibpUapMean) {
        this.ibpUapMean = ibpUapMean;
        return this;
    }

    public Integer getIbpBapSys() {
        return ibpBapSys;
    }

    public MultiParameter setIbpBapSys(Integer ibpBapSys) {
        this.ibpBapSys = ibpBapSys;
        return this;
    }

    public Integer getIbpBapDia() {
        return ibpBapDia;
    }

    public MultiParameter setIbpBapDia(Integer ibpBapDia) {
        this.ibpBapDia = ibpBapDia;
        return this;
    }

    public Integer getIbpBapMean() {
        return ibpBapMean;
    }

    public MultiParameter setIbpBapMean(Integer ibpBapMean) {
        this.ibpBapMean = ibpBapMean;
        return this;
    }

    public Integer getIbpFapSys() {
        return ibpFapSys;
    }

    public MultiParameter setIbpFapSys(Integer ibpFapSys) {
        this.ibpFapSys = ibpFapSys;
        return this;
    }

    public Integer getIbpFapDia() {
        return ibpFapDia;
    }

    public MultiParameter setIbpFapDia(Integer ibpFapDia) {
        this.ibpFapDia = ibpFapDia;
        return this;
    }

    public Integer getIbpFapMean() {
        return ibpFapMean;
    }

    public MultiParameter setIbpFapMean(Integer ibpFapMean) {
        this.ibpFapMean = ibpFapMean;
        return this;
    }

    public Integer getIbpLvSys() {
        return ibpLvSys;
    }

    public MultiParameter setIbpLvSys(Integer ibpLvSys) {
        this.ibpLvSys = ibpLvSys;
        return this;
    }

    public Integer getIbpLvDia() {
        return ibpLvDia;
    }

    public MultiParameter setIbpLvDia(Integer ibpLvDia) {
        this.ibpLvDia = ibpLvDia;
        return this;
    }

    public Integer getIbpLvMean() {
        return ibpLvMean;
    }

    public MultiParameter setIbpLvMean(Integer ibpLvMean) {
        this.ibpLvMean = ibpLvMean;
        return this;
    }

    public Integer getIbpUvpMean() {
        return ibpUvpMean;
    }

    public MultiParameter setIbpUvpMean(Integer ibpUvpMean) {
        this.ibpUvpMean = ibpUvpMean;
        return this;
    }

    public Float getIbpCvpMean() {
        return ibpCvpMean;
    }

    public MultiParameter setIbpCvpMean(Float ibpCvpMean) {
        this.ibpCvpMean = ibpCvpMean;
        return this;
    }

    public Integer getIbpRapMean() {
        return ibpRapMean;
    }

    public MultiParameter setIbpRapMean(Integer ibpRapMean) {
        this.ibpRapMean = ibpRapMean;
        return this;
    }

    public Integer getIbpLapMean() {
        return ibpLapMean;
    }

    public MultiParameter setIbpLapMean(Integer ibpLapMean) {
        this.ibpLapMean = ibpLapMean;
        return this;
    }

    public Integer getIbpIcpMean() {
        return ibpIcpMean;
    }

    public MultiParameter setIbpIcpMean(Integer ibpIcpMean) {
        this.ibpIcpMean = ibpIcpMean;
        return this;
    }

    public Integer getIbpP1Sys() {
        return ibpP1Sys;
    }

    public MultiParameter setIbpP1Sys(Integer ibpP1Sys) {
        this.ibpP1Sys = ibpP1Sys;
        return this;
    }

    public Integer getIbpP1Dia() {
        return ibpP1Dia;
    }

    public MultiParameter setIbpP1Dia(Integer ibpP1Dia) {
        this.ibpP1Dia = ibpP1Dia;
        return this;
    }

    public Integer getIbpP1Mean() {
        return ibpP1Mean;
    }

    public MultiParameter setIbpP1Mean(Integer ibpP1Mean) {
        this.ibpP1Mean = ibpP1Mean;
        return this;
    }

    public Integer getIbpP2Sys() {
        return ibpP2Sys;
    }

    public MultiParameter setIbpP2Sys(Integer ibpP2Sys) {
        this.ibpP2Sys = ibpP2Sys;
        return this;
    }

    public Integer getIbpP2Dia() {
        return ibpP2Dia;
    }

    public MultiParameter setIbpP2Dia(Integer ibpP2Dia) {
        this.ibpP2Dia = ibpP2Dia;
        return this;
    }

    public Integer getIbpP2Mean() {
        return ibpP2Mean;
    }

    public MultiParameter setIbpP2Mean(Integer ibpP2Mean) {
        this.ibpP2Mean = ibpP2Mean;
        return this;
    }

    public Integer getIbpP3Sys() {
        return ibpP3Sys;
    }

    public MultiParameter setIbpP3Sys(Integer ibpP3Sys) {
        this.ibpP3Sys = ibpP3Sys;
        return this;
    }

    public Integer getIbpP3Dia() {
        return ibpP3Dia;
    }

    public MultiParameter setIbpP3Dia(Integer ibpP3Dia) {
        this.ibpP3Dia = ibpP3Dia;
        return this;
    }

    public Integer getIbpP3Mean() {
        return ibpP3Mean;
    }

    public MultiParameter setIbpP3Mean(Integer ibpP3Mean) {
        this.ibpP3Mean = ibpP3Mean;
        return this;
    }

    public Integer getIbpP4Sys() {
        return ibpP4Sys;
    }

    public MultiParameter setIbpP4Sys(Integer ibpP4Sys) {
        this.ibpP4Sys = ibpP4Sys;
        return this;
    }

    public Integer getIbpP4Dia() {
        return ibpP4Dia;
    }

    public MultiParameter setIbpP4Dia(Integer ibpP4Dia) {
        this.ibpP4Dia = ibpP4Dia;
        return this;
    }

    public Integer getIbpP4Mean() {
        return ibpP4Mean;
    }

    public MultiParameter setIbpP4Mean(Integer ibpP4Mean) {
        this.ibpP4Mean = ibpP4Mean;
        return this;
    }

    public Float getPerfusionIndex() {
        return perfusionIndex;
    }

    public MultiParameter setPerfusionIndex(Float perfusionIndex) {
        this.perfusionIndex = perfusionIndex;
        return this;
    }

    public Integer getCo2EndTidal() {
        return co2EndTidal;
    }

    public MultiParameter setCo2EndTidal(Integer co2EndTidal) {
        this.co2EndTidal = co2EndTidal;
        return this;
    }

    public Integer getCo2FractionOfInspired() {
        return co2FractionOfInspired;
    }

    public MultiParameter setCo2FractionOfInspired(Integer co2FractionOfInspired) {
        this.co2FractionOfInspired = co2FractionOfInspired;
        return this;
    }

    public Integer getCo2AirwayRespiratoryRate() {
        return co2AirwayRespiratoryRate;
    }

    public MultiParameter setCo2AirwayRespiratoryRate(Integer co2AirwayRespiratoryRate) {
        this.co2AirwayRespiratoryRate = co2AirwayRespiratoryRate;
        return this;
    }

    public Integer getPp() {
        return pp;
    }

    public MultiParameter setPp(Integer pp) {
        this.pp = pp;
        return this;
    }

    public Double getSpv() {
        return spv;
    }

    public MultiParameter setSpv(Double spv) {
        this.spv = spv;
        return this;
    }

    public Double getPpv() {
        return ppv;
    }

    public MultiParameter setPpv(Double ppv) {
        this.ppv = ppv;
        return this;
    }

    public Double getvP() {
        return vP;
    }

    public MultiParameter setvP(Double vP) {
        this.vP = vP;
        return this;
    }

    public Double getCo() {
        return co;
    }

    public MultiParameter setCo(Double co) {
        this.co = co;
        return this;
    }

    public Double getCi() {
        return ci;
    }

    public MultiParameter setCi(Double ci) {
        this.ci = ci;
        return this;
    }

    public Double getSv() {
        return sv;
    }

    public MultiParameter setSv(Double sv) {
        this.sv = sv;
        return this;
    }

    public Double getSvv() {
        return svv;
    }

    public MultiParameter setSvv(Double svv) {
        this.svv = svv;
        return this;
    }

    public Double getItbv() {
        return itbv;
    }

    public MultiParameter setItbv(Double itbv) {
        this.itbv = itbv;
        return this;
    }

    public Double getGedv() {
        return gedv;
    }

    public MultiParameter setGedv(Double gedv) {
        this.gedv = gedv;
        return this;
    }

    public Double getSvr() {
        return svr;
    }

    public MultiParameter setSvr(Double svr) {
        this.svr = svr;
        return this;
    }

    public Double getPvr() {
        return pvr;
    }

    public MultiParameter setPvr(Double pvr) {
        this.pvr = pvr;
        return this;
    }

    public Double getCoo() {
        return coo;
    }

    public MultiParameter setCoo(Double coo) {
        this.coo = coo;
        return this;
    }

    public Double getCci() {
        return cci;
    }

    public MultiParameter setCci(Double cci) {
        this.cci = cci;
        return this;
    }

    public Double getSi() {
        return si;
    }

    public MultiParameter setSi(Double si) {
        this.si = si;
        return this;
    }

    public Double getItbvi() {
        return itbvi;
    }

    public MultiParameter setItbvi(Double itbvi) {
        this.itbvi = itbvi;
        return this;
    }

    public Double getGedvi() {
        return gedvi;
    }

    public MultiParameter setGedvi(Double gedvi) {
        this.gedvi = gedvi;
        return this;
    }

    public Double getEvlw() {
        return evlw;
    }

    public MultiParameter setEvlw(Double evlw) {
        this.evlw = evlw;
        return this;
    }

    public Double getEvlwi() {
        return evlwi;
    }

    public MultiParameter setEvlwi(Double evlwi) {
        this.evlwi = evlwi;
        return this;
    }

    public Double getCfi() {
        return cfi;
    }

    public MultiParameter setCfi(Double cfi) {
        this.cfi = cfi;
        return this;
    }

    public Double getPvpi() {
        return pvpi;
    }

    public MultiParameter setPvpi(Double pvpi) {
        this.pvpi = pvpi;
        return this;
    }

    public Double getGef() {
        return gef;
    }

    public MultiParameter setGef(Double gef) {
        this.gef = gef;
        return this;
    }

    public Double getdPmax() {
        return dPmax;
    }

    public MultiParameter setdPmax(Double dPmax) {
        this.dPmax = dPmax;
        return this;
    }

    public Double getBldTemp() {
        return bldTemp;
    }

    public MultiParameter setBldTemp(Double bldTemp) {
        this.bldTemp = bldTemp;
        return this;
    }

    public List<String> getTechnical() {
        return technical;
    }

    public MultiParameter setTechnical(List<String> technical) {
        this.technical = technical;
        return this;
    }

    public List<String> getPhysical() {
        return physical;
    }

    public MultiParameter setPhysical(List<String> physical) {
        this.physical = physical;
        return this;
    }

    public List<String> getThreshold() {
        return threshold;
    }

    public MultiParameter setThreshold(List<String> threshold) {
        this.threshold = threshold;
        return this;
    }

    public List<String> getArrhythmia() {
        return arrhythmia;
    }

    public MultiParameter setArrhythmia(List<String> arrhythmia) {
        this.arrhythmia = arrhythmia;
        return this;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public MultiParameter setCreateDate(Date createDate) {
        this.createDate = createDate;
        return this;
    }

    public String getHrStatus() {
        return hrStatus;
    }

    public void setHrStatus(String hrStatus) {
        this.hrStatus = hrStatus;
    }

    public String getSpo2Status() {
        return spo2Status;
    }

    public void setSpo2Status(String spo2Status) {
        this.spo2Status = spo2Status;
    }

    public String getRespStatus() {
        return respStatus;
    }

    public void setRespStatus(String respStatus) {
        this.respStatus = respStatus;
    }

    public String getNibpStatus() {
        return nibpStatus;
    }

    public void setNibpStatus(String nibpStatus) {
        this.nibpStatus = nibpStatus;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public Integer getMews() {
        return mews;
    }

    public void setMews(Integer mews) {
        this.mews = mews;
    }
}

