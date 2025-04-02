package com.smo.cloud.monitor;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.smo.cloud.monitor.common.service.config.alibaba.lmq.LmqAsyncSmoClient;
import com.smo.cloud.monitor.jiuzhou.receive.client.contants.constant.DataHandlerConsts;
import com.smo.cloud.monitor.jiuzhou.receive.client.transmit.TransmitClient;
import com.smo.cloud.monitor.model.metadata.EcgInfo;
import com.smo.cloud.monitor.model.metadata.IbpInfo;
import com.smo.cloud.monitor.model.metadata.MultiParameter;
import com.smo.cloud.monitor.model.metadata.OtsStructuredData;

/**
 * Hello world!
 */
public class App {

  public static final int[] offset = {
      0, 4, 8, 12, 16, 216, 416, 616, 641, 666, 716, 741, 766, 770, 771,
      775, 779, 783, 787, 788, 792, 793, 794, 795, 796, 798,
      802, 806, 808, 809, 813, 814, 816, 818, 820, 822, 824, 826, 828, 830,
      832, 836, 838, 840, 841, 842, 844, 846, 848,
      849, 853, 857, 858, 859, 861, 863, 867, 871, 872, 873, 874, 876, 878,
      882, 886, };
  public static final int[] size = {
      4, 4, 4, 4, 2 * 100, 2 * 100, 2 * 100, 1 * 25, 1 * 25, 2 * 25, 1 * 25,
      1 * 25, 4, 1, 4,
      4, 4, 4, 1, 4, 1, 1, 1, 1, 2, 4,
      4, 2, 1, 4, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 4, 2, 2, 1, 1, 2, 2, 2, 1,
      4, 4, 1, 1, 2, 2, 4, 4, 1, 1, 1, 2, 2, 4,
      4, 1
  };

  public static final int[] sign = { 806, 846, 861 };
  public static final int[] signi = { 27, 47, 54 };

  public static void main(String[] args)
      throws NoSuchFieldException, IllegalAccessException {
    String cmd = "0000000c0001367f67e362eb80000000fe71ffaf009e00fe000dfea4fd22fc6cfc6bfcaffcdbfcdffc7dfc51fc5efc66fc58fc53fc4afc47fc69fc6dfc8bfc90fc8afc96fcabfcaefca3fcb7fccefce8fcedfceefcf5fcfcfd16fd17fd11fd14fd20fd2cfd35fd3afd49fd50fd53fd48fd4bfd19fd12fd00fcf0fcf4fcf6fcfefd09fd1ffd51fd71fdaafdcefdf8fe0dfe3efe58fe6dfe94fea8fe98fe97fea4fe78fe8bfe97fe83fe5efe5dfe69fe76fe7afe7ffe70fe76fe7bfe80fe70fe9ffeaafeb3fea4feb4febbfecefedafee3ff09ff30ff34ff4614d3149b14691439140913cf1381132212c41272122911ea11b01173113110f510c510a1108610731067106310671076109210bc10f1112d116e11af11ec1228126f12d2135c140b14d515ad168a17691845191b19e51a981b2f1ba61bfa1c2d1c441c461c371c1c1bf31bb81b661b001a7e19dc1923186c17d0175c170c16d01697165b161f15eb15c615ae15a215a315ab15ad15a715a3159e15921589158c15a115d01620168616f8176c17de184a18b0191a198d19f61a3a1a471a1c19c8196a191a18e118bf1ea61e991e9f1eb21ecf1ef11f121f391f6e1fb62008205c20af2100214f219c21e7222e227122ac22dc2300231d233823542373239523bb23e7241824492477249924ad24b724bc24bf24c024c124c124c124c124c024be24bd24bb24b924b724b524b324b124b024ae24ad24ab24a924a824a624a424a324a124a0249f249e249d24af2552279a2c27320f37973bc93eb140a141db428d42df42fa42fc42f342e242c7429d425941ea414040563f403e203d103c183b383a6e39b63911387d37f93784371c36c000000000000000000000000000000101010101010101010101010101000000000000000000000000000000010101010101010ff5ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000005000000010000000b0000000200000000010100000100110000000000000002000000000000000100670038ffffffff005100602e620050000900000001000000000000005f00000000010000000400000000015c0cf1000000000001000000010101010050ffff002800780000000100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000";

//    for (int i = cmd.charAt(616*2); i < cmd.length(); i ++) {
//      System.out.print(cmd.charAt(i));
//    }
    System.out.println();
    byte[] cmdba = HexByteUtil.cmdToByteNoSep(cmd);

    System.out.println();

    parseCmd(cmdba);
  }

  public static void parseCmd(byte[] a)
      throws NoSuchFieldException, IllegalAccessException {

    int[] res = HexByteUtil.assembleByteBe(a, size);

    Field field = new Field();

    FieldEnum[] fields = FieldEnum.values();
    for (int i = 12; i < fields.length; i++) {
      FieldEnum e = fields[i];
      e.sf.set(e, field, e.name(), res[e.ordinal()]);
    }

    // unsigned int
    field.protocolVersion = HexByteUtil.toU4int(a, 0, 4);
    field.pumpID = HexByteUtil.toU4int(a, 4, 4);
    field.timeStampSeconds = HexByteUtil.toU4int(a, 8, 4);
    field.timeStampSecondsFraction = HexByteUtil.toU4int(a, 12, 4);

    field.ecgWaveformArray = HexByteUtil
        .assembleByteBeToFixed(a, 16, 200, 2, 4.0f);
    field.apWaveformArray = HexByteUtil
        .assembleByteBeToFixed(a, 216, 200, 2, 64.0f);
    field.balloonWaveformArray = HexByteUtil
        .assembleByteBeToFixed(a, 416, 200, 2, 16.0f);

    field.ecgTriggerMarkerInterval = HexByteUtil.assembleByteBe(a, 616, 25, 1);
    field.apInflationInterval = HexByteUtil.assembleByteBe(a, 641, 25, 1);
    field.pressureThresholdBeatToBeat = HexByteUtil
        .assembleByteBe(a, 666, 50, 2);
    field.skinPacerDetected = HexByteUtil.assembleByteBe(a, 716, 25, 1);
    field.externalPacerDetected = HexByteUtil.assembleByteBe(a, 741, 25, 1);

    // unsigned short
    field.minutesInStandby = field.minutesInStandby & 0xffff;
    field.batteryTimeRemaining = field.batteryTimeRemaining & 0xffff;
    field.externalHeliumTankPressure = field.externalHeliumTankPressure
        & 0xffff;

    Gson GSON = new Gson();
    JsonObject jo = new JsonObject();
    System.out.println(GSON.toJson(field));

    
    

  }

  public static final DateTimeFormatter sm_dtf = DateTimeFormatter
      .ofPattern("yyyyMMddHHmmss");

  private final LmqAsyncSmoClient lmqAsyncSmoClient;
  private final ApplicationConfig ac;

  @Autowired
  public App(ApplicationConfig ac,
      LmqAsyncSmoClient lmqAsyncSmoClient) {
    this.ac = ac;
    this.lmqAsyncSmoClient = lmqAsyncSmoClient;
  }

  OtsStructuredData initMew(OtsStructuredData mew, Field field) {
    MultiParameter mp = new MultiParameter();
    mew.setData(mp);

    EcgInfo info = new EcgInfo();
    info.setLeadConfig(ac.getEcgLeads());
    info.setPointSize(ac.getEcgPointSize());
    info.setSignBit(true);
    info.setPatchStatus(false);
    info.setResolution(ac.getEcgResolution());
    info.setSampleRate(ac.getEcgSampleRate());
    mew.setEcgInfo(info);

    IbpInfo ibp = new IbpInfo();
    ibp.setPointSize(ac.getIbpPointSize());
    ibp.setSampleRate(ac.getIbpSampleRate());
    ibp.setSignBit(true);
    ibp.setPatchStatus(false);
    ibp.setResolution(ac.getIbpResolution());
    ibp.setWaveCode("AP");
    mp.getIbpInfo().put("ibp1", "AP");

    IbpInfo ibp2 = new IbpInfo();
    ibp2.setPointSize(ac.getIbpPointSize());
    ibp2.setSampleRate(ac.getIbpSampleRate());
    ibp2.setSignBit(true);
    ibp2.setPatchStatus(false);
    ibp2.setResolution(ac.getIbpResolution());
    ibp2.setWaveCode("BALLON");
    mp.getIbpInfo().put("ibp2", "BALLON");


    mp.setCreateDate(
        new Date(field.timeStampSeconds * 1000
            + (field.timeStampSecondsFraction == 0 ? 500 : 0)));

    LocalDateTime ldt = LocalDateTime
        .ofInstant(mp.getCreateDate().toInstant(), ZoneId.of("+8"));
    System.out.println(ldt.format(sm_dtf));

    mew.setInstCode(Long.toHexString(field.pumpID));
    mew.setExtInstCode(Long.toHexString(field.pumpID));
    

    return mew;
  }

}
