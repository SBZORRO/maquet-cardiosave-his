package com.smo.cloud.monitor.enumeration;

/**
 * Hello world!
 */
public enum PneumaticMode {

//  Current Pneumatic/Assist mode
  Vent, // Initial mode and pneumatics failure mode
  Standby, // The pump is ready to enter the assist mode
  Assist, // The pump is assisting or is in pseudo standby
  Fill_Assist, // The system is in fill mode and if successful will then transition to assist
  Fill_Standby, // The system is in fill mode and if successful will then transition to standby
  FOS_Cal, // The system is performing the partial inflation for FOS Calibration

}
