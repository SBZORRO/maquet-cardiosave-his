package com.smo.cloud.monitor;

/**
 * Hello world!
 */
public class Field {
  long protocolVersion;
  long pumpID;
  long timeStampSeconds;
  long timeStampSecondsFraction;
  float[] ecgWaveformArray = new float[100];
  float[] apWaveformArray = new float[100];
  float[] balloonWaveformArray = new float[100];
  int[] ecgTriggerMarkerInterval = new int[25];
  int[] apInflationInterval = new int[25];
  int[] pressureThresholdBeatToBeat = new int[25];
  int[] skinPacerDetected = new int[25];
  int[] externalPacerDetected = new int[25];
  int triggerSourceSelection;
  int pacerAV;
  int ecgCableType;
  int ecgLeadSelection;
  int ecgLeadFaultStatus;
  int ecgLeadWireMode;
  int extECGCableConnected;
  int apSourceSelection;
  int apTransConnected;
  int apFosConnected;
  int apExtConnected;
  int pressureThresholdMode;
  int pressureThresholdModeValue;
  int operationMode;
  int pneumaticMode;
  int minutesInStandby;
  int apFosCalibrated;
  int apTransducerZeroStatus;
  int consoleModeEnabled;
  int assistedSystolicPressure;
  int assistedDiastolicPressure;
  int unassistedSystolicPressure;
  int unassistedDiastolicPressure;
  int meanPressure;
  int augmentedPressure;
  int atmosphericPressure;
  int heartRate;
  int iabAugLevel;
  int iabFrequencySelection;
  int inflationSliderValue;
  int deflationSliderValue;
  int rWaveDeflateActive;
  int autoRWaveDeflateActive;
  int battery1RSOC;
  int battery2RSOC;
  int batteryTimeRemaining;
  int onACMains;
  int powerSlot1Status;
  int powerSlot2Status;
  int internalHeliumTankCalibration;
  int externalHeliumTankCalibration;
  int internalHeliumTankPressure;
  int externalHeliumTankPressure;
  int skinPacerThreshold;
  int externalPacerThreshold;
  int rTracEnabled;
  int gasLossAlarmsEnabled;
  int catheterAlarmsEnabled;
  int internalRate;
  int augAlarmValue;
  int bpUpperLowerWindowRange;
  int ecgScaleSize;
  int alarmArray;

  public void set(Field field, String name, Object value)
      throws NoSuchFieldException, IllegalAccessException {
//    VarHandle nameHandle = MethodHandles.lookup()
//        .findVarHandle(Field.class, name, type);
//    nameHandle.set(field, type.cast(value));
  }

}
