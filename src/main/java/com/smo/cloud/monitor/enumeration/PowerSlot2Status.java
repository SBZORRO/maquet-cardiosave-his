package com.smo.cloud.monitor.enumeration;

/**
_*_Hello_world!
_*/
public enum PowerSlot2Status {

  Slot_is_empty,
  Bulk_Jr_in_slot_is_being_used_to_power_unit,
  Bulk_Jr_is_present_and_available_but_not_used_to_power_unit,
  Battery_in_slot_is_being_used_to_power_unit,
  Battery_in_slot_is_not_being_used_or_charging,
  Battery_in_slot_is_currently_being_charged,
  Bulk_Jr_is_present_in_slot_but_not_currently_available_to_power_unit,
  Battery_is_present_in_slot_but_not_currently_available_to_power_unit,

}
