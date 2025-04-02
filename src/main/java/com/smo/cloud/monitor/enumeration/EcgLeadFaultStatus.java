package com.smo.cloud.monitor.enumeration;

/**
*Helloworld!
*/
public enum EcgLeadFaultStatus {

// ECG lead fault status
  Right_arm_electrode_faulted,
  Left_arm_electrode_faulted,
  Left_leg_electrode_faulted,
  Right_and_left_arm_electrode_faulted,
  Right_arm_and_left_leg_electrode_faulted,
  Left_arm_and_left_leg_electrode_faulted,
  Unable_to_pin_point_the_faulted_electrodes,
  Chest_lead_faulted,
  Right_leg_electrode_faulted,
  Chest_lead_and_right_leg_electrode_faulted,
  ECG_cable_disconnected,
  All_electrodes_are_connected_or_external_ECG_is_the_selected_ECG_source,
}
