/**
 ******************************************************************************
 *
 * @file       uavobjecttemplate.cpp
 * @author     The OpenPilot Team, http://www.openpilot.org Copyright (C) 2010.
 * @brief      Template for an uavobject in java
 *             This is a autogenerated file!! Do not modify and expect a result.
 *             Contains major flight status information for other modules.
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
Contains major flight status information for other modules.

generated from flightstatus.xml
 **/
public class FlightStatus extends UAVDataObject {

	public FlightStatus() {
		super(OBJID, ISSINGLEINST, ISSETTINGS, NAME);
		
		List<UAVObjectField> fields = new ArrayList<UAVObjectField>();
		

		List<String> ArmedElemNames = new ArrayList<String>();
		ArmedElemNames.add("0");
		List<String> ArmedEnumOptions = new ArrayList<String>();
		ArmedEnumOptions.add("Disarmed");
		ArmedEnumOptions.add("Arming");
		ArmedEnumOptions.add("Armed");
		fields.add( new UAVObjectField("Armed", "", UAVObjectField.FieldType.ENUM, ArmedElemNames, ArmedEnumOptions) );

		List<String> FlightModeElemNames = new ArrayList<String>();
		FlightModeElemNames.add("0");
		List<String> FlightModeEnumOptions = new ArrayList<String>();
		FlightModeEnumOptions.add("Manual");
		FlightModeEnumOptions.add("Stabilized1");
		FlightModeEnumOptions.add("Stabilized2");
		FlightModeEnumOptions.add("Stabilized3");
		FlightModeEnumOptions.add("VelocityControl");
		FlightModeEnumOptions.add("PositionHold");
		fields.add( new UAVObjectField("FlightMode", "", UAVObjectField.FieldType.ENUM, FlightModeElemNames, FlightModeEnumOptions) );


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
		metadata.gcsTelemetryAcked = UAVObject.Acked.FALSE;
		metadata.gcsTelemetryUpdateMode = UAVObject.UpdateMode.UPDATEMODE_MANUAL;
		metadata.gcsTelemetryUpdatePeriod = 0;

		metadata.flightAccess = UAVObject.AccessMode.ACCESS_READWRITE;
		metadata.flightTelemetryAcked = UAVObject.Acked.FALSE;
		metadata.flightTelemetryUpdateMode = UAVObject.UpdateMode.UPDATEMODE_ONCHANGE;
		metadata.flightTelemetryUpdatePeriod = 5000;

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
		getField("Armed").setValue("Disarmed");

	}

	/**
	 * Create a clone of this object, a new instance ID must be specified.
	 * Do not use this function directly to create new instances, the
	 * UAVObjectManager should be used instead.
	 */
	public UAVDataObject clone(int instID) {
		// TODO: Need to get specific instance to clone
		try {
			FlightStatus obj = new FlightStatus();
			obj.initialize(instID, this.getMetaObject());
			return obj;
		} catch  (Exception e) {
			return null;
		}
	}

	/**
	 * Static function to retrieve an instance of the object.
	 */
	public FlightStatus GetInstance(UAVObjectManager objMngr, int instID)
	{
	    return (FlightStatus)(objMngr.getObject(FlightStatus.OBJID, instID));
	}

	// Constants
	protected static final int OBJID = 0x743DB13C;
	protected static final String NAME = "FlightStatus";
	protected static String DESCRIPTION = "Contains major flight status information for other modules.";
	protected static final boolean ISSINGLEINST = 1 == 1;
	protected static final boolean ISSETTINGS = 0 == 1;
	protected static int NUMBYTES = 0;


}