package com.myee.try1;

import com.myee.model.patientInformation.PatientPrescription;

import java.util.ArrayList;
import java.util.List;

/**
 * Created  on 8/14/2015.
 */
public class PrescriptionRequest implements Request {

	List<PatientPrescription> patientPrescriptions=new ArrayList<>();

	public void setPatientPrescriptions(List<PatientPrescription> patientPrescriptions){
		this.patientPrescriptions=patientPrescriptions;
	}

	public PatientPrescription addPrescription(PatientPrescription patientPrescription){
		this.patientPrescriptions.add(patientPrescription);
		return patientPrescription;
	}

	@Override
	public RequestIterator getDetails() {
		return null;
	}

	//Inner RichContent Iterator
}
