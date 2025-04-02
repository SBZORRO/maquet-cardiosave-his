package com.smo.cloud.monitor;

import java.util.Date;


/**
 * OTS存储的多参数据对象（结构化数据）
 *
 * @author ZhuBin
 * @version 2.5
 * @since 2020/12/22
 */
public class OtsStructuredData {

    /**
     * 布尔常量
     */
    public static final int YES = 1;
    /**
     * 布尔常量
     */
    public static final int NO = 0;


    /**
     * 设备唯一Id
     */
    private String prodInstId;
    /**
     * 设备外部编码
     */
    private String extInstCode;
    /**
     * 设备内部编码
     */
    private String instCode;

    /**
     * 平台业务流水号
     */
    private String serviceCode;
    /**
     * 数据采集时间(服务器时间)，格式yyyyMMddHHmmss
     */
    private String dataTime;
    /**
     * 是否技术报警 0：否，1：是
     */
    private int isTechnical = NO;
    /**
     * 是否设备生理报警，0：否，1：是
     */
    private int isPhysical = NO;
    /**
     * 是否阈值报警，0：否，1：是
     */
    private int isThreshold = NO;
    /**
     * 是否包含血压数据
     */
    private int isBp = NO;
    /**
     * 设备记录的采集时间，格式yyyyMMddHHmmss
     */
    private String deviceDataTime;
    /**
     * 多参数数据
     */
    private MultiParameter data;
    /**
     * 心电参数
     */
    private EcgInfo ecgInfo;
    /**
     * 心电波形数据
     */
    private byte[] ecg;
    /**
     * 呼吸波形数据
     */
    private byte[] resp;
    /**
     * 呼吸参数
     */
    private RespInfo respInfo;
    /**
     * 血氧波形数据
     */
    private byte[] pleth;
    /**
     * 血氧参数
     */
    private PlethInfo plethInfo;
    /**
     * 有创血压波形1数据
     */
    private byte[] ibp1;
    /**
     * 有创血压波形1参数
     */
    private IbpInfo ibp1Info;
    /**
     * 有创血压波形2
     */
    private byte[] ibp2;
    /**
     * 有创血压波形2参数
     */
    private IbpInfo ibp2Info;
    /**
     * 呼气末二氧化碳波形参数
     */
    private Co2Info co2Info;
    /**
     * 二氧化碳波形
     */
    private byte[] co2;

    /**
     * 床位
     */
    private String bedNo;

    public OtsStructuredData() {
    }

    public OtsStructuredData(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * 构造函数，设置主键，设置data的创建时间，判断包含的报警类型<br/>
     * 构造函数需要先设置data,因为ibp波形设置时需要同步设置data里面的ibpInfo
     *
     * @param data        多参数数值
     * @param dateTime    OTS主键
     * @param serviceCode OTS主键
     */
    public OtsStructuredData(MultiParameter data, Date dateTime, String serviceCode) {
        this.serviceCode = serviceCode;
        this.dataTime = DateConverter.getDefaultFormateTimeString(dateTime);
        this.data = data;
        this.data.setCreateDate(dateTime);
        if (data.getPhysical() != null && data.getPhysical().size() > 0) {
            this.isPhysical = YES;
        }
        if (data.getTechnical() != null && data.getTechnical().size() > 0) {
            this.isTechnical = YES;
        }
        if (data.getThreshold() != null && data.getThreshold().size() > 0) {
            this.isThreshold = YES;
        }
    }
    /**
     * 构造函数，设置主键，设置data的创建时间，判断包含的报警类型<br/> 构造函数需要先设置data,因为ibp波形设置时需要同步设置data里面的ibpInfo
     *
     * @param data        多参数数值
     * @param dateTime    OTS主键
     * @param extInstCode 设备外部编码
     */
    public OtsStructuredData(MultiParameter data, Date dateTime, String extInstCode, String instCode) {
        this.dataTime = DateConverter.getDefaultFormateTimeString(dateTime);
        this.data = data;
        this.extInstCode = extInstCode;
        this.instCode = instCode;
        this.data.setCreateDate(dateTime);
        if (data.getPhysical() != null && data.getPhysical().size() > 0) {
            this.isPhysical = YES;
        }
        if (data.getTechnical() != null && data.getTechnical().size() > 0) {
            this.isTechnical = YES;
        }
        if (data.getThreshold() != null && data.getThreshold().size() > 0) {
            this.isThreshold = YES;
        }
    }

    public Co2Info getCo2Info() {
        return co2Info;
    }

    public void setCo2Info(Co2Info co2Info) {
        this.co2Info = co2Info;
    }

    public byte[] getCo2() {
        return co2;
    }

    public void setCo2(byte[] co2) {
        this.co2 = co2;
    }

    public byte[] getIbp1() {
        return ibp1;
    }

    public void setIbp1(byte[] ibp1) {
        this.ibp1 = ibp1;
    }

    public IbpInfo getIbp1Info() {
        return ibp1Info;
    }

    /**
     * 设置IBP1波形配置信息及data字段中的ibpInfo的ibp1
     *
     * @param ibp1Info IBP1配置
     */
    public void setIbp1Info(IbpInfo ibp1Info) {
        this.ibp1Info = ibp1Info;
        if (ibp1Info.getWaveCode() != null) {
            this.data.setIbp1WaveCode(ibp1Info.getWaveCode());
        }
    }

    public byte[] getIbp2() {
        return ibp2;
    }

    public void setIbp2(byte[] ibp2) {
        this.ibp2 = ibp2;
    }

    public IbpInfo getIbp2Info() {
        return ibp2Info;
    }

    /**
     * 设置IBP2波形配置信息及data字段中的ibpInfo的ibp2
     *
     * @param ibp2Info IBP2配置
     */
    public void setIbp2Info(IbpInfo ibp2Info) {
        this.ibp2Info = ibp2Info;
        if (ibp2Info.getWaveCode() != null) {
            this.data.setIbp2WaveCode(ibp2Info.getWaveCode());
        }
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public String getDataTime() {
        return dataTime;
    }

    public void setDataTime(String dataTime) {
        this.dataTime = dataTime;
    }

    public int getIsTechnical() {
        return isTechnical;
    }

    public int getIsPhysical() {
        return isPhysical;
    }

    public int getIsThreshold() {
        return isThreshold;
    }

    public MultiParameter getData() {
        return data;
    }

    public byte[] getEcg() {
        return ecg;
    }

    public void setEcg(byte[] ecg) {
        this.ecg = ecg;
    }

    public EcgInfo getEcgInfo() {
        return ecgInfo;
    }

    public void setEcgInfo(EcgInfo ecgInfo) {
        this.ecgInfo = ecgInfo;
    }

    public byte[] getResp() {
        return resp;
    }

    public void setResp(byte[] resp) {
        this.resp = resp;
    }

    public RespInfo getRespInfo() {
        return respInfo;
    }

    public void setRespInfo(RespInfo respInfo) {
        this.respInfo = respInfo;
    }

    public byte[] getPleth() {
        return pleth;
    }

    public void setPleth(byte[] pleth) {
        this.pleth = pleth;
    }

    public PlethInfo getPlethInfo() {
        return plethInfo;
    }

    public void setPlethInfo(PlethInfo plethInfo) {
        this.plethInfo = plethInfo;
    }

    public int getIsBp() {
        return isBp;
    }

    public void setIsBp(int isBp) {
        this.isBp = isBp;
    }

    public String getDeviceDataTime() {
        return deviceDataTime;
    }

    public void setDeviceDataTime(String deviceDataTime) {
        this.deviceDataTime = deviceDataTime;
    }

    public String getBedNo() {
        return bedNo;
    }

    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }

    public void setData(MultiParameter data) {
        this.data = data;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getProdInstId() {
        return prodInstId;
    }

    public void setProdInstId(String prodInstId) {
        this.prodInstId = prodInstId;
    }

    public String getExtInstCode() {
        return extInstCode;
    }

    public void setExtInstCode(String extInstCode) {
        this.extInstCode = extInstCode;
    }

    public String getInstCode() {
        return instCode;
    }

    public void setInstCode(String instCode) {
        this.instCode = instCode;
    }
}
