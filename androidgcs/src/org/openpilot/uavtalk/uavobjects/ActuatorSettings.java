/**
 ******************************************************************************
 *
 * @file       uavobjecttemplate.cpp
 * @author     The OpenPilot Team, http://www.openpilot.org Copyright (C) 2010.
 * @brief      Template for an uavobject in java
 *             This is a autogenerated file!! Do not modify and expect a result.
 *             Settings for the @ref ActuatorModule that controls the channel assignments for the mixer based on AircraftType
 *
 * @see        The GNU Public License (GPL) Version 3
 *
 *****************************************************************************/
/*
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 * for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */

package org.openpilot.uavtalk.uavobjects;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.openpilot.uavtalk.UAVObjectManager;
import org.openpilot.uavtalk.UAVObject;
import org.openpilot.uavtalk.UAVDataObject;
import org.openpilot.uavtalk.UAVObjectField;

/**
Settings for the @ref ActuatorModule that controls the channel assignments for the mixer based on AircraftType

generated from actuatorsettings.xml
 **/
public class ActuatorSettings extends UAVDataObject {

	public ActuatorSettings() {
		super(OBJID, ISSINGLEINST, ISSETTINGS, NAME);
		
		List<UAVObjectField> fields = new ArrayList<UAVObjectField>();
		

		List<String> ChannelUpdateFreqElemNames = new ArrayList<String>();
		ChannelUpdateFreqElemNames.add("0");
		ChannelUpdateFreqElemNames.add("1");
		ChannelUpdateFreqElemNames.add("2");
		ChannelUpdateFreqElemNames.add("3");
		fields.add( new UAVObjectField("ChannelUpdateFreq", "Hz", UAVObjectField.FieldType.UINT16, ChannelUpdateFreqElemNames, null) );

		List<String> ChannelMaxElemNames = new ArrayList<String>();
		ChannelMaxElemNames.add("0");
		ChannelMaxElemNames.add("1");
		ChannelMaxElemNames.add("2");
		ChannelMaxElemNames.add("3");
		ChannelMaxElemNames.add("4");
		ChannelMaxElemNames.add("5");
		ChannelMaxElemNames.add("6");
		ChannelMaxElemNames.add("7");
		ChannelMaxElemNames.add("8");
		ChannelMaxElemNames.add("9");
		fields.add( new UAVObjectField("ChannelMax", "us", UAVObjectField.FieldType.INT16, ChannelMaxElemNames, null) );

		List<String> ChannelNeutralElemNames = new ArrayList<String>();
		ChannelNeutralElemNames.add("0");
		ChannelNeutralElemNames.add("1");
		ChannelNeutralElemNames.add("2");
		ChannelNeutralElemNames.add("3");
		ChannelNeutralElemNames.add("4");
		ChannelNeutralElemNames.add("5");
		ChannelNeutralElemNames.add("6");
		ChannelNeutralElemNames.add("7");
		ChannelNeutralElemNames.add("8");
		ChannelNeutralElemNames.add("9");
		fields.add( new UAVObjectField("ChannelNeutral", "us", UAVObjectField.FieldType.INT16, ChannelNeutralElemNames, null) );

		List<String> ChannelMinElemNames = new ArrayList<String>();
		ChannelMinElemNames.add("0");
		ChannelMinElemNames.add("1");
		ChannelMinElemNames.add("2");
		ChannelMinElemNames.add("3");
		ChannelMinElemNames.add("4");
		ChannelMinElemNames.add("5");
		ChannelMinElemNames.add("6");
		ChannelMinElemNames.add("7");
		ChannelMinElemNames.add("8");
		ChannelMinElemNames.add("9");
		fields.add( new UAVObjectField("ChannelMin", "us", UAVObjectField.FieldType.INT16, ChannelMinElemNames, null) );

		List<String> FixedWingRoll1ElemNames = new ArrayList<String>();
		FixedWingRoll1ElemNames.add("0");
		List<String> FixedWingRoll1EnumOptions = new ArrayList<String>();
		FixedWingRoll1EnumOptions.add("Channel1");
		FixedWingRoll1EnumOptions.add("Channel2");
		FixedWingRoll1EnumOptions.add("Channel3");
		FixedWingRoll1EnumOptions.add("Channel4");
		FixedWingRoll1EnumOptions.add("Channel5");
		FixedWingRoll1EnumOptions.add("Channel6");
		FixedWingRoll1EnumOptions.add("Channel7");
		FixedWingRoll1EnumOptions.add("Channel8");
		FixedWingRoll1EnumOptions.add("Channel9");
		FixedWingRoll1EnumOptions.add("Channel10");
		FixedWingRoll1EnumOptions.add("None");
		fields.add( new UAVObjectField("FixedWingRoll1", "channel", UAVObjectField.FieldType.ENUM, FixedWingRoll1ElemNames, FixedWingRoll1EnumOptions) );

		List<String> FixedWingRoll2ElemNames = new ArrayList<String>();
		FixedWingRoll2ElemNames.add("0");
		List<String> FixedWingRoll2EnumOptions = new ArrayList<String>();
		FixedWingRoll2EnumOptions.add("Channel1");
		FixedWingRoll2EnumOptions.add("Channel2");
		FixedWingRoll2EnumOptions.add("Channel3");
		FixedWingRoll2EnumOptions.add("Channel4");
		FixedWingRoll2EnumOptions.add("Channel5");
		FixedWingRoll2EnumOptions.add("Channel6");
		FixedWingRoll2EnumOptions.add("Channel7");
		FixedWingRoll2EnumOptions.add("Channel8");
		FixedWingRoll2EnumOptions.add("Channel9");
		FixedWingRoll2EnumOptions.add("Channel10");
		FixedWingRoll2EnumOptions.add("None");
		fields.add( new UAVObjectField("FixedWingRoll2", "channel", UAVObjectField.FieldType.ENUM, FixedWingRoll2ElemNames, FixedWingRoll2EnumOptions) );

		List<String> FixedWingPitch1ElemNames = new ArrayList<String>();
		FixedWingPitch1ElemNames.add("0");
		List<String> FixedWingPitch1EnumOptions = new ArrayList<String>();
		FixedWingPitch1EnumOptions.add("Channel1");
		FixedWingPitch1EnumOptions.add("Channel2");
		FixedWingPitch1EnumOptions.add("Channel3");
		FixedWingPitch1EnumOptions.add("Channel4");
		FixedWingPitch1EnumOptions.add("Channel5");
		FixedWingPitch1EnumOptions.add("Channel6");
		FixedWingPitch1EnumOptions.add("Channel7");
		FixedWingPitch1EnumOptions.add("Channel8");
		FixedWingPitch1EnumOptions.add("Channel9");
		FixedWingPitch1EnumOptions.add("Channel10");
		FixedWingPitch1EnumOptions.add("None");
		fields.add( new UAVObjectField("FixedWingPitch1", "channel", UAVObjectField.FieldType.ENUM, FixedWingPitch1ElemNames, FixedWingPitch1EnumOptions) );

		List<String> FixedWingPitch2ElemNames = new ArrayList<String>();
		FixedWingPitch2ElemNames.add("0");
		List<String> FixedWingPitch2EnumOptions = new ArrayList<String>();
		FixedWingPitch2EnumOptions.add("Channel1");
		FixedWingPitch2EnumOptions.add("Channel2");
		FixedWingPitch2EnumOptions.add("Channel3");
		FixedWingPitch2EnumOptions.add("Channel4");
		FixedWingPitch2EnumOptions.add("Channel5");
		FixedWingPitch2EnumOptions.add("Channel6");
		FixedWingPitch2EnumOptions.add("Channel7");
		FixedWingPitch2EnumOptions.add("Channel8");
		FixedWingPitch2EnumOptions.add("Channel9");
		FixedWingPitch2EnumOptions.add("Channel10");
		FixedWingPitch2EnumOptions.add("None");
		fields.add( new UAVObjectField("FixedWingPitch2", "channel", UAVObjectField.FieldType.ENUM, FixedWingPitch2ElemNames, FixedWingPitch2EnumOptions) );

		List<String> FixedWingYaw1ElemNames = new ArrayList<String>();
		FixedWingYaw1ElemNames.add("0");
		List<String> FixedWingYaw1EnumOptions = new ArrayList<String>();
		FixedWingYaw1EnumOptions.add("Channel1");
		FixedWingYaw1EnumOptions.add("Channel2");
		FixedWingYaw1EnumOptions.add("Channel3");
		FixedWingYaw1EnumOptions.add("Channel4");
		FixedWingYaw1EnumOptions.add("Channel5");
		FixedWingYaw1EnumOptions.add("Channel6");
		FixedWingYaw1EnumOptions.add("Channel7");
		FixedWingYaw1EnumOptions.add("Channel8");
		FixedWingYaw1EnumOptions.add("Channel9");
		FixedWingYaw1EnumOptions.add("Channel10");
		FixedWingYaw1EnumOptions.add("None");
		fields.add( new UAVObjectField("FixedWingYaw1", "channel", UAVObjectField.FieldType.ENUM, FixedWingYaw1ElemNames, FixedWingYaw1EnumOptions) );

		List<String> FixedWingYaw2ElemNames = new ArrayList<String>();
		FixedWingYaw2ElemNames.add("0");
		List<String> FixedWingYaw2EnumOptions = new ArrayList<String>();
		FixedWingYaw2EnumOptions.add("Channel1");
		FixedWingYaw2EnumOptions.add("Channel2");
		FixedWingYaw2EnumOptions.add("Channel3");
		FixedWingYaw2EnumOptions.add("Channel4");
		FixedWingYaw2EnumOptions.add("Channel5");
		FixedWingYaw2EnumOptions.add("Channel6");
		FixedWingYaw2EnumOptions.add("Channel7");
		FixedWingYaw2EnumOptions.add("Channel8");
		FixedWingYaw2EnumOptions.add("Channel9");
		FixedWingYaw2EnumOptions.add("Channel10");
		FixedWingYaw2EnumOptions.add("None");
		fields.add( new UAVObjectField("FixedWingYaw2", "channel", UAVObjectField.FieldType.ENUM, FixedWingYaw2ElemNames, FixedWingYaw2EnumOptions) );

		List<String> FixedWingThrottleElemNames = new ArrayList<String>();
		FixedWingThrottleElemNames.add("0");
		List<String> FixedWingThrottleEnumOptions = new ArrayList<String>();
		FixedWingThrottleEnumOptions.add("Channel1");
		FixedWingThrottleEnumOptions.add("Channel2");
		FixedWingThrottleEnumOptions.add("Channel3");
		FixedWingThrottleEnumOptions.add("Channel4");
		FixedWingThrottleEnumOptions.add("Channel5");
		FixedWingThrottleEnumOptions.add("Channel6");
		FixedWingThrottleEnumOptions.add("Channel7");
		FixedWingThrottleEnumOptions.add("Channel8");
		FixedWingThrottleEnumOptions.add("Channel9");
		FixedWingThrottleEnumOptions.add("Channel10");
		FixedWingThrottleEnumOptions.add("None");
		fields.add( new UAVObjectField("FixedWingThrottle", "channel", UAVObjectField.FieldType.ENUM, FixedWingThrottleElemNames, FixedWingThrottleEnumOptions) );

		List<String> VTOLMotorNElemNames = new ArrayList<String>();
		VTOLMotorNElemNames.add("0");
		List<String> VTOLMotorNEnumOptions = new ArrayList<String>();
		VTOLMotorNEnumOptions.add("Channel1");
		VTOLMotorNEnumOptions.add("Channel2");
		VTOLMotorNEnumOptions.add("Channel3");
		VTOLMotorNEnumOptions.add("Channel4");
		VTOLMotorNEnumOptions.add("Channel5");
		VTOLMotorNEnumOptions.add("Channel6");
		VTOLMotorNEnumOptions.add("Channel7");
		VTOLMotorNEnumOptions.add("Channel8");
		VTOLMotorNEnumOptions.add("Channel9");
		VTOLMotorNEnumOptions.add("Channel10");
		VTOLMotorNEnumOptions.add("None");
		fields.add( new UAVObjectField("VTOLMotorN", "channel", UAVObjectField.FieldType.ENUM, VTOLMotorNElemNames, VTOLMotorNEnumOptions) );

		List<String> VTOLMotorNEElemNames = new ArrayList<String>();
		VTOLMotorNEElemNames.add("0");
		List<String> VTOLMotorNEEnumOptions = new ArrayList<String>();
		VTOLMotorNEEnumOptions.add("Channel1");
		VTOLMotorNEEnumOptions.add("Channel2");
		VTOLMotorNEEnumOptions.add("Channel3");
		VTOLMotorNEEnumOptions.add("Channel4");
		VTOLMotorNEEnumOptions.add("Channel5");
		VTOLMotorNEEnumOptions.add("Channel6");
		VTOLMotorNEEnumOptions.add("Channel7");
		VTOLMotorNEEnumOptions.add("Channel8");
		VTOLMotorNEEnumOptions.add("Channel9");
		VTOLMotorNEEnumOptions.add("Channel10");
		VTOLMotorNEEnumOptions.add("None");
		fields.add( new UAVObjectField("VTOLMotorNE", "channel", UAVObjectField.FieldType.ENUM, VTOLMotorNEElemNames, VTOLMotorNEEnumOptions) );

		List<String> VTOLMotorEElemNames = new ArrayList<String>();
		VTOLMotorEElemNames.add("0");
		List<String> VTOLMotorEEnumOptions = new ArrayList<String>();
		VTOLMotorEEnumOptions.add("Channel1");
		VTOLMotorEEnumOptions.add("Channel2");
		VTOLMotorEEnumOptions.add("Channel3");
		VTOLMotorEEnumOptions.add("Channel4");
		VTOLMotorEEnumOptions.add("Channel5");
		VTOLMotorEEnumOptions.add("Channel6");
		VTOLMotorEEnumOptions.add("Channel7");
		VTOLMotorEEnumOptions.add("Channel8");
		VTOLMotorEEnumOptions.add("Channel9");
		VTOLMotorEEnumOptions.add("Channel10");
		VTOLMotorEEnumOptions.add("None");
		fields.add( new UAVObjectField("VTOLMotorE", "channel", UAVObjectField.FieldType.ENUM, VTOLMotorEElemNames, VTOLMotorEEnumOptions) );

		List<String> VTOLMotorSEElemNames = new ArrayList<String>();
		VTOLMotorSEElemNames.add("0");
		List<String> VTOLMotorSEEnumOptions = new ArrayList<String>();
		VTOLMotorSEEnumOptions.add("Channel1");
		VTOLMotorSEEnumOptions.add("Channel2");
		VTOLMotorSEEnumOptions.add("Channel3");
		VTOLMotorSEEnumOptions.add("Channel4");
		VTOLMotorSEEnumOptions.add("Channel5");
		VTOLMotorSEEnumOptions.add("Channel6");
		VTOLMotorSEEnumOptions.add("Channel7");
		VTOLMotorSEEnumOptions.add("Channel8");
		VTOLMotorSEEnumOptions.add("Channel9");
		VTOLMotorSEEnumOptions.add("Channel10");
		VTOLMotorSEEnumOptions.add("None");
		fields.add( new UAVObjectField("VTOLMotorSE", "channel", UAVObjectField.FieldType.ENUM, VTOLMotorSEElemNames, VTOLMotorSEEnumOptions) );

		List<String> VTOLMotorSElemNames = new ArrayList<String>();
		VTOLMotorSElemNames.add("0");
		List<String> VTOLMotorSEnumOptions = new ArrayList<String>();
		VTOLMotorSEnumOptions.add("Channel1");
		VTOLMotorSEnumOptions.add("Channel2");
		VTOLMotorSEnumOptions.add("Channel3");
		VTOLMotorSEnumOptions.add("Channel4");
		VTOLMotorSEnumOptions.add("Channel5");
		VTOLMotorSEnumOptions.add("Channel6");
		VTOLMotorSEnumOptions.add("Channel7");
		VTOLMotorSEnumOptions.add("Channel8");
		VTOLMotorSEnumOptions.add("Channel9");
		VTOLMotorSEnumOptions.add("Channel10");
		VTOLMotorSEnumOptions.add("None");
		fields.add( new UAVObjectField("VTOLMotorS", "channel", UAVObjectField.FieldType.ENUM, VTOLMotorSElemNames, VTOLMotorSEnumOptions) );

		List<String> VTOLMotorSWElemNames = new ArrayList<String>();
		VTOLMotorSWElemNames.add("0");
		List<String> VTOLMotorSWEnumOptions = new ArrayList<String>();
		VTOLMotorSWEnumOptions.add("Channel1");
		VTOLMotorSWEnumOptions.add("Channel2");
		VTOLMotorSWEnumOptions.add("Channel3");
		VTOLMotorSWEnumOptions.add("Channel4");
		VTOLMotorSWEnumOptions.add("Channel5");
		VTOLMotorSWEnumOptions.add("Channel6");
		VTOLMotorSWEnumOptions.add("Channel7");
		VTOLMotorSWEnumOptions.add("Channel8");
		VTOLMotorSWEnumOptions.add("Channel9");
		VTOLMotorSWEnumOptions.add("Channel10");
		VTOLMotorSWEnumOptions.add("None");
		fields.add( new UAVObjectField("VTOLMotorSW", "channel", UAVObjectField.FieldType.ENUM, VTOLMotorSWElemNames, VTOLMotorSWEnumOptions) );

		List<String> VTOLMotorWElemNames = new ArrayList<String>();
		VTOLMotorWElemNames.add("0");
		List<String> VTOLMotorWEnumOptions = new ArrayList<String>();
		VTOLMotorWEnumOptions.add("Channel1");
		VTOLMotorWEnumOptions.add("Channel2");
		VTOLMotorWEnumOptions.add("Channel3");
		VTOLMotorWEnumOptions.add("Channel4");
		VTOLMotorWEnumOptions.add("Channel5");
		VTOLMotorWEnumOptions.add("Channel6");
		VTOLMotorWEnumOptions.add("Channel7");
		VTOLMotorWEnumOptions.add("Channel8");
		VTOLMotorWEnumOptions.add("Channel9");
		VTOLMotorWEnumOptions.add("Channel10");
		VTOLMotorWEnumOptions.add("None");
		fields.add( new UAVObjectField("VTOLMotorW", "channel", UAVObjectField.FieldType.ENUM, VTOLMotorWElemNames, VTOLMotorWEnumOptions) );

		List<String> VTOLMotorNWElemNames = new ArrayList<String>();
		VTOLMotorNWElemNames.add("0");
		List<String> VTOLMotorNWEnumOptions = new ArrayList<String>();
		VTOLMotorNWEnumOptions.add("Channel1");
		VTOLMotorNWEnumOptions.add("Channel2");
		VTOLMotorNWEnumOptions.add("Channel3");
		VTOLMotorNWEnumOptions.add("Channel4");
		VTOLMotorNWEnumOptions.add("Channel5");
		VTOLMotorNWEnumOptions.add("Channel6");
		VTOLMotorNWEnumOptions.add("Channel7");
		VTOLMotorNWEnumOptions.add("Channel8");
		VTOLMotorNWEnumOptions.add("Channel9");
		VTOLMotorNWEnumOptions.add("Channel10");
		VTOLMotorNWEnumOptions.add("None");
		fields.add( new UAVObjectField("VTOLMotorNW", "channel", UAVObjectField.FieldType.ENUM, VTOLMotorNWElemNames, VTOLMotorNWEnumOptions) );

		List<String> ChannelTypeElemNames = new ArrayList<String>();
		ChannelTypeElemNames.add("0");
		ChannelTypeElemNames.add("1");
		ChannelTypeElemNames.add("2");
		ChannelTypeElemNames.add("3");
		ChannelTypeElemNames.add("4");
		ChannelTypeElemNames.add("5");
		ChannelTypeElemNames.add("6");
		ChannelTypeElemNames.add("7");
		ChannelTypeElemNames.add("8");
		ChannelTypeElemNames.add("9");
		List<String> ChannelTypeEnumOptions = new ArrayList<String>();
		ChannelTypeEnumOptions.add("PWM");
		ChannelTypeEnumOptions.add("MK");
		ChannelTypeEnumOptions.add("ASTEC4");
		ChannelTypeEnumOptions.add("PWM Alarm Buzzer");
		fields.add( new UAVObjectField("ChannelType", "", UAVObjectField.FieldType.ENUM, ChannelTypeElemNames, ChannelTypeEnumOptions) );

		List<String> ChannelAddrElemNames = new ArrayList<String>();
		ChannelAddrElemNames.add("0");
		ChannelAddrElemNames.add("1");
		ChannelAddrElemNames.add("2");
		ChannelAddrElemNames.add("3");
		ChannelAddrElemNames.add("4");
		ChannelAddrElemNames.add("5");
		ChannelAddrElemNames.add("6");
		ChannelAddrElemNames.add("7");
		ChannelAddrElemNames.add("8");
		ChannelAddrElemNames.add("9");
		fields.add( new UAVObjectField("ChannelAddr", "", UAVObjectField.FieldType.UINT8, ChannelAddrElemNames, null) );

		List<String> MotorsSpinWhileArmedElemNames = new ArrayList<String>();
		MotorsSpinWhileArmedElemNames.add("0");
		List<String> MotorsSpinWhileArmedEnumOptions = new ArrayList<String>();
		MotorsSpinWhileArmedEnumOptions.add("FALSE");
		MotorsSpinWhileArmedEnumOptions.add("TRUE");
		fields.add( new UAVObjectField("MotorsSpinWhileArmed", "", UAVObjectField.FieldType.ENUM, MotorsSpinWhileArmedElemNames, MotorsSpinWhileArmedEnumOptions) );


		// Compute the number of bytes for this object
		int numBytes = 0;
		ListIterator<UAVObjectField> li = fields.listIterator();
		while(li.hasNext()) {
			numBytes += li.next().getNumBytes();
		}
		NUMBYTES = numBytes;

		// Initialize object
		initializeFields(fields, ByteBuffer.allocate(NUMBYTES), NUMBYTES);
		// Set the default field values
		setDefaultFieldValues();
		// Set the object description
		setDescription(DESCRIPTION);
	}

	/**
	 * Create a Metadata object filled with default values for this object
	 * @return Metadata object with default values
	 */
	public Metadata getDefaultMetadata() {
		UAVObject.Metadata metadata = new UAVObject.Metadata();
		metadata.gcsAccess = UAVObject.AccessMode.ACCESS_READWRITE;
		metadata.gcsTelemetryAcked = UAVObject.Acked.TRUE;
		metadata.gcsTelemetryUpdateMode = UAVObject.UpdateMode.UPDATEMODE_ONCHANGE;
		metadata.gcsTelemetryUpdatePeriod = 0;

		metadata.flightAccess = UAVObject.AccessMode.ACCESS_READWRITE;
		metadata.flightTelemetryAcked = UAVObject.Acked.TRUE;
		metadata.flightTelemetryUpdateMode = UAVObject.UpdateMode.UPDATEMODE_ONCHANGE;
		metadata.flightTelemetryUpdatePeriod = 0;

		metadata.loggingUpdateMode = UAVObject.UpdateMode.UPDATEMODE_NEVER;
		metadata.loggingUpdatePeriod = 0;
		return metadata;
	}

	/**
	 * Initialize object fields with the default values.
	 * If a default value is not specified the object fields
	 * will be initialized to zero.
	 */
	public void setDefaultFieldValues()
	{
		getField("ChannelUpdateFreq").setValue(50,0);
		getField("ChannelUpdateFreq").setValue(50,1);
		getField("ChannelUpdateFreq").setValue(50,2);
		getField("ChannelUpdateFreq").setValue(50,3);
		getField("ChannelMax").setValue(1000,0);
		getField("ChannelMax").setValue(1000,1);
		getField("ChannelMax").setValue(1000,2);
		getField("ChannelMax").setValue(1000,3);
		getField("ChannelMax").setValue(1000,4);
		getField("ChannelMax").setValue(1000,5);
		getField("ChannelMax").setValue(1000,6);
		getField("ChannelMax").setValue(1000,7);
		getField("ChannelMax").setValue(1000,8);
		getField("ChannelMax").setValue(1000,9);
		getField("ChannelNeutral").setValue(1000,0);
		getField("ChannelNeutral").setValue(1000,1);
		getField("ChannelNeutral").setValue(1000,2);
		getField("ChannelNeutral").setValue(1000,3);
		getField("ChannelNeutral").setValue(1000,4);
		getField("ChannelNeutral").setValue(1000,5);
		getField("ChannelNeutral").setValue(1000,6);
		getField("ChannelNeutral").setValue(1000,7);
		getField("ChannelNeutral").setValue(1000,8);
		getField("ChannelNeutral").setValue(1000,9);
		getField("ChannelMin").setValue(1000,0);
		getField("ChannelMin").setValue(1000,1);
		getField("ChannelMin").setValue(1000,2);
		getField("ChannelMin").setValue(1000,3);
		getField("ChannelMin").setValue(1000,4);
		getField("ChannelMin").setValue(1000,5);
		getField("ChannelMin").setValue(1000,6);
		getField("ChannelMin").setValue(1000,7);
		getField("ChannelMin").setValue(1000,8);
		getField("ChannelMin").setValue(1000,9);
		getField("FixedWingRoll1").setValue("None");
		getField("FixedWingRoll2").setValue("None");
		getField("FixedWingPitch1").setValue("None");
		getField("FixedWingPitch2").setValue("None");
		getField("FixedWingYaw1").setValue("None");
		getField("FixedWingYaw2").setValue("None");
		getField("FixedWingThrottle").setValue("None");
		getField("VTOLMotorN").setValue("None");
		getField("VTOLMotorNE").setValue("None");
		getField("VTOLMotorE").setValue("None");
		getField("VTOLMotorSE").setValue("None");
		getField("VTOLMotorS").setValue("None");
		getField("VTOLMotorSW").setValue("None");
		getField("VTOLMotorW").setValue("None");
		getField("VTOLMotorNW").setValue("None");
		getField("ChannelType").setValue("PWM",0);
		getField("ChannelType").setValue("PWM",1);
		getField("ChannelType").setValue("PWM",2);
		getField("ChannelType").setValue("PWM",3);
		getField("ChannelType").setValue("PWM",4);
		getField("ChannelType").setValue("PWM",5);
		getField("ChannelType").setValue("PWM",6);
		getField("ChannelType").setValue("PWM",7);
		getField("ChannelType").setValue("PWM",8);
		getField("ChannelType").setValue("PWM",9);
		getField("ChannelAddr").setValue(0,0);
		getField("ChannelAddr").setValue(1,1);
		getField("ChannelAddr").setValue(2,2);
		getField("ChannelAddr").setValue(3,3);
		getField("ChannelAddr").setValue(4,4);
		getField("ChannelAddr").setValue(5,5);
		getField("ChannelAddr").setValue(6,6);
		getField("ChannelAddr").setValue(7,7);
		getField("ChannelAddr").setValue(8,8);
		getField("ChannelAddr").setValue(9,9);
		getField("MotorsSpinWhileArmed").setValue("FALSE");

	}

	/**
	 * Create a clone of this object, a new instance ID must be specified.
	 * Do not use this function directly to create new instances, the
	 * UAVObjectManager should be used instead.
	 */
	public UAVDataObject clone(int instID) {
		// TODO: Need to get specific instance to clone
		try {
			ActuatorSettings obj = new ActuatorSettings();
			obj.initialize(instID, this.getMetaObject());
			return obj;
		} catch  (Exception e) {
			return null;
		}
	}

	/**
	 * Static function to retrieve an instance of the object.
	 */
	public ActuatorSettings GetInstance(UAVObjectManager objMngr, int instID)
	{
	    return (ActuatorSettings)(objMngr.getObject(ActuatorSettings.OBJID, instID));
	}

	// Constants
	protected static final int OBJID = 0xF2875746;
	protected static final String NAME = "ActuatorSettings";
	protected static String DESCRIPTION = "Settings for the @ref ActuatorModule that controls the channel assignments for the mixer based on AircraftType";
	protected static final boolean ISSINGLEINST = 1 == 1;
	protected static final boolean ISSETTINGS = 1 == 1;
	protected static int NUMBYTES = 0;


}