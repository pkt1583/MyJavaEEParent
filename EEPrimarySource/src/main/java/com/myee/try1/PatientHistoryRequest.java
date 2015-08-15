package com.myee.try1;

import com.myee.model.patientInformation.PatientHistory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created  on 8/14/2015.
 */
public class PatientHistoryRequest implements Request {

	List<PatientHistory> patientHistories=new ArrayList<>();


	public void setPatientHistory(List<PatientHistory> patientHistories){
		this.patientHistories=patientHistories;
	}

	public PatientHistory addPatientHistory(PatientHistory patientHistory){
		this.patientHistories.add(patientHistory);
		return patientHistory;
	}


	@Override
	public RequestIterator getDetails() {
		return null;
	}

	//Inner RichContent Iterator
}
