package com.smo.cloud.monitor;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: MrADiao
 * @Date: 2022-12-05 10:50
 * @Description: 程序配置
 */
@Configuration
public class ApplicationConfig {

  /**
   * MQTT发布是否启用(wave&mp Topic)，不包含structed Topic
   */
//    @Value("${mqttConfig.isEnable:false}")
//    private boolean isMqttEnable;
//    @Value("${mqttConfig.brokerUrl}")
//    private String brokerUrl;
//    @Value("${mqttConfig.username}")
//    private String username;
//    @Value("${mqttConfig.password}")
//    private String password;
//    @Value("${mqttConfig.qos}")
//    private Integer qos;

  /**
   * Client发送至Server是否启用
   */
  @Value("${clientConfig.isEnable:false}")
  private boolean isClientEnable;
  @Value("${clientConfig.host:127.0.0.1}")
  private String clientHost;
  @Value("${clientConfig.port:10101}")
  private Integer clientPort;
  /**
   * 心电
   */
  @Value("${waveConfig.ecgSampleRate}")
  private Integer ecgSampleRate;
  @Value("${waveConfig.ecgPointSize}")
  private Integer ecgPointSize;
  @Value("${waveConfig.ecgLeadType}")
  private Integer ecgLeadType;
  @Value("${waveConfig.ecgResolution}")
  private Float ecgResolution;
  @Value("${waveConfig.ecgBaseline}")
  private Float ecgBaseline;
  //    @Value("${waveConfig.ecgLead}")
//  private EcgLead ecgLead;
  @Value("#{'${waveConfig.ecgLeads}'.split(',')}")
  private List<String> ecgLeads;
  @Value("${waveConfig.ecgSize}")
  private Integer ecgSize;

  /**
   * 呼吸
   **/
  @Value("${waveConfig.respSampleRate}")
  private Integer respSampleRate;
  @Value("${waveConfig.respPointSize}")
  private Integer respPointSize;
  @Value("${waveConfig.respResolution}")
  private Float respResolution;
  @Value("${waveConfig.respBaseline}")
  private Float respBaseline;

  /**
   * 脉搏容积波，血氧
   */
  @Value("${waveConfig.plethSampleRate}")
  private Integer plethSampleRate;
  @Value("${waveConfig.plethPointSize}")
  private Integer plethPointSize;
  @Value("${waveConfig.plethResolution}")
  private Float plethResolution;
  @Value("${waveConfig.plethBaseline}")
  private Float plethBaseline;
  /**
   * 有创血压
   */
  @Value("${waveConfig.ibpSampleRate}")
  private Integer ibpSampleRate;
  @Value("${waveConfig.ibpPointSize}")
  private Integer ibpPointSize;
  @Value("${waveConfig.ibpResolution}")
  private Float ibpResolution;
  @Value("${waveConfig.ibpBaseline}")
  private Float ibpBaseline;
  /**
   * 呼吸末二氧化碳
   */
  @Value("${waveConfig.co2SampleRate}")
  private Integer co2SampleRate;
  @Value("${waveConfig.co2PointSize}")
  private Integer co2PointSize;
  @Value("${waveConfig.co2Resolution}")
  private Float co2Resolution;
  @Value("${waveConfig.co2Baseline}")
  private Float co2Baseline;

  /**
   * Paw
   */
  @Value("${waveConfig.pawSampleRate:50}")
  private Integer pawSampleRate;
  @Value("${waveConfig.pawPointSize:2}")
  private Integer pawPointSize;
  @Value("${waveConfig.pawResolution:0.01}")
  private Float pawResolution;
  @Value("${waveConfig.pawBaseline:0}")
  private Float pawBaseline;

  /**
   * Flow
   */
  @Value("${waveConfig.flowSampleRate:50}")
  private Integer flowSampleRate;
  @Value("${waveConfig.flowPointSize:2}")
  private Integer flowPointSize;
  @Value("${waveConfig.flowResolution:0.1}")
  private Float flowResolution;
  @Value("${waveConfig.flowBaseline:0}")
  private Float flowBaseline;

  /**
   * Volume
   */
  @Value("${waveConfig.volumeSampleRate:50}")
  private Integer volumeSampleRate;
  @Value("${waveConfig.volumePointSize:2}")
  private Integer volumePointSize;
  @Value("${waveConfig.volumeResolution:0.1}")
  private Float volumeResolution;
  @Value("${waveConfig.volumeBaseline:0}")
  private Float volumeBaseline;

  /**
   * PES
   */
  @Value("${waveConfig.pesSampleRate:50}")
  private Integer pesSampleRate;
  @Value("${waveConfig.pesPointSize:2}")
  private Integer pesPointSize;
  @Value("${waveConfig.pesResolution:0.01}")
  private Float pesResolution;
  @Value("${waveConfig.pesBaseline:0}")
  private Float pesBaseline;

  /**
   * PTP
   */
  @Value("${waveConfig.ptpSampleRate:50}")
  private Integer ptpSampleRate;
  @Value("${waveConfig.ptpPointSize:2}")
  private Integer ptpPointSize;
  @Value("${waveConfig.ptpResolution:0.01}")
  private Float ptpResolution;
  @Value("${waveConfig.ptpBaseline:0}")
  private Float ptpBaseline;

//    public boolean isMqttEnable() {
//        return isMqttEnable;
//    }
//
//    public void setMqttEnable(boolean mqttEnable) {
//        isMqttEnable = mqttEnable;
//    }
//
//    public String getBrokerUrl() {
//        return brokerUrl;
//    }
//
//    public void setBrokerUrl(String brokerUrl) {
//        this.brokerUrl = brokerUrl;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public Integer getQos() {
//        return qos;
//    }
//
//    public void setQos(Integer qos) {
//        this.qos = qos;
//    }

  public boolean isClientEnable() {
    return isClientEnable;
  }

  public void setClientEnable(boolean clientEnable) {
    isClientEnable = clientEnable;
  }

  public String getClientHost() {
    return clientHost;
  }

  public void setClientHost(String clientHost) {
    this.clientHost = clientHost;
  }

  public Integer getClientPort() {
    return clientPort;
  }

  public void setClientPort(Integer clientPort) {
    this.clientPort = clientPort;
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

  public Integer getEcgLeadType() {
    return ecgLeadType;
  }

  public void setEcgLeadType(Integer ecgLeadType) {
    this.ecgLeadType = ecgLeadType;
  }

  public Float getEcgResolution() {
    return ecgResolution;
  }

  public void setEcgResolution(Float ecgResolution) {
    this.ecgResolution = ecgResolution;
  }

  public Float getEcgBaseline() {
    return ecgBaseline;
  }

  public void setEcgBaseline(Float ecgBaseline) {
    this.ecgBaseline = ecgBaseline;
  }

//  public EcgLead getEcgLead() {
//    return ecgLead;
//  }
//
//  public void setEcgLead(EcgLead ecgLead) {
//    this.ecgLead = ecgLead;
//  }

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

  public Float getRespResolution() {
    return respResolution;
  }

  public void setRespResolution(Float respResolution) {
    this.respResolution = respResolution;
  }

  public Float getRespBaseline() {
    return respBaseline;
  }

  public void setRespBaseline(Float respBaseline) {
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

  public Float getPlethResolution() {
    return plethResolution;
  }

  public void setPlethResolution(Float plethResolution) {
    this.plethResolution = plethResolution;
  }

  public Float getPlethBaseline() {
    return plethBaseline;
  }

  public void setPlethBaseline(Float plethBaseline) {
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

  public Float getIbpResolution() {
    return ibpResolution;
  }

  public void setIbpResolution(Float ibpResolution) {
    this.ibpResolution = ibpResolution;
  }

  public Float getIbpBaseline() {
    return ibpBaseline;
  }

  public void setIbpBaseline(Float ibpBaseline) {
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

  public Float getCo2Resolution() {
    return co2Resolution;
  }

  public void setCo2Resolution(Float co2Resolution) {
    this.co2Resolution = co2Resolution;
  }

  public Float getCo2Baseline() {
    return co2Baseline;
  }

  public void setCo2Baseline(Float co2Baseline) {
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

  public Float getPawResolution() {
    return pawResolution;
  }

  public void setPawResolution(Float pawResolution) {
    this.pawResolution = pawResolution;
  }

  public Float getPawBaseline() {
    return pawBaseline;
  }

  public void setPawBaseline(Float pawBaseline) {
    this.pawBaseline = pawBaseline;
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

  public Float getFlowResolution() {
    return flowResolution;
  }

  public void setFlowResolution(Float flowResolution) {
    this.flowResolution = flowResolution;
  }

  public Float getFlowBaseline() {
    return flowBaseline;
  }

  public void setFlowBaseline(Float flowBaseline) {
    this.flowBaseline = flowBaseline;
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

  public Float getVolumeResolution() {
    return volumeResolution;
  }

  public void setVolumeResolution(Float volumeResolution) {
    this.volumeResolution = volumeResolution;
  }

  public Float getVolumeBaseline() {
    return volumeBaseline;
  }

  public void setVolumeBaseline(Float volumeBaseline) {
    this.volumeBaseline = volumeBaseline;
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

  public Float getPesResolution() {
    return pesResolution;
  }

  public void setPesResolution(Float pesResolution) {
    this.pesResolution = pesResolution;
  }

  public Float getPesBaseline() {
    return pesBaseline;
  }

  public void setPesBaseline(Float pesBaseline) {
    this.pesBaseline = pesBaseline;
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

  public Float getPtpResolution() {
    return ptpResolution;
  }

  public void setPtpResolution(Float ptpResolution) {
    this.ptpResolution = ptpResolution;
  }

  public Float getPtpBaseline() {
    return ptpBaseline;
  }

  public void setPtpBaseline(Float ptpBaseline) {
    this.ptpBaseline = ptpBaseline;
  }

  public Integer getEcgSize() {
    return ecgSize;
  }

  public void setEcgSize(Integer ecgSize) {
    this.ecgSize = ecgSize;
  }

  public List<String> getEcgLeads() {
    return ecgLeads;
  }

  public void setEcgLeads(List<String> ecgLeads) {
    this.ecgLeads = ecgLeads;
  }
}
