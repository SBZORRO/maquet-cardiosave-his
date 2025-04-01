package com.smo.cloud.monitor;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;

/**
 * Hello world!
 */
public enum FieldEnum {

//protocolVersion(0, int.class, 0, 4, 4, 0, ""),
  protocolVersion(),
  pumpID(),
  timeStampSeconds(),
  timeStampSecondsFraction(),
  ecgWaveformArray(),
  apWaveformArray(),
  balloonWaveformArray(),
  ecgTriggerMarkerInterval(),
  apInflationInterval(),
  pressureThresholdBeatToBeat(),
  skinPacerDetected(),
  externalPacerDetected(),
  triggerSourceSelection(),
  pacerAV(),
  ecgCableType(),
  ecgLeadSelection(),
  ecgLeadFaultStatus(),
  ecgLeadWireMode(),
  extECGCableConnected(),
  apSourceSelection(),
  apTransConnected(),
  apFosConnected(),
  apExtConnected(),
  pressureThresholdMode(),
  pressureThresholdModeValue(),
  operationMode(),
  pneumaticMode(),
  minutesInStandby(),
  apFosCalibrated(),
  apTransducerZeroStatus(),
  consoleModeEnabled(),
  assistedSystolicPressure(),
  assistedDiastolicPressure(),
  unassistedSystolicPressure(),
  unassistedDiastolicPressure(),
  meanPressure(),
  augmentedPressure(),
  atmosphericPressure(),
  heartRate(),
  iabAugLevel(),
  iabFrequencySelection(),
  inflationSliderValue(),
  deflationSliderValue(),
  rWaveDeflateActive(),
  autoRWaveDeflateActive(),
  battery1RSOC(),
  battery2RSOC(),
  batteryTimeRemaining(),
  onACMains(),
  powerSlot1Status(),
  powerSlot2Status(),
  internalHeliumTankCalibration(),
  externalHeliumTankCalibration(),
  internalHeliumTankPressure(),
  externalHeliumTankPressure(),
  skinPacerThreshold(),
  externalPacerThreshold(),
  rTracEnabled(),
  gasLossAlarmsEnabled(),
  catheterAlarmsEnabled(),
  internalRate(),
  augAlarmValue(),
  bpUpperLowerWindowRange(),
  ecgScaleSize(),
  alarmArray();

//  int offset;
  Class type = int.class;
//  int signed;
//  int size;
//  int length;
//  int sr;
//  String doc;
  SetField sf = FieldEnum::setf;

  public interface SetField<T>{
    void set(FieldEnum e,Field field, String name, T value);
  }
//  private FieldEnum(Class type, SetField sf) {
//    this.type = type;
//    this.sf = sf;
//  }

  public <T> void setf(Field field, String name, T value) {
    VarHandle nameHandle = null;
    try {
      nameHandle = MethodHandles.lookup()
          .findVarHandle(Field.class, name, type);
    } catch (NoSuchFieldException | IllegalAccessException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    nameHandle.set(field, value);
  }

}
