package com.myee.try1;

import com.myee.try2.QueueResolver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created  on 8/14/2015.
 */
public  class PatientConsultationRequest implements Request {

	List<Request> patientConsultationRequests =new ArrayList<>();

	public void addPatientInformation(Request patientConsultationRequest){
		patientConsultationRequests.add(patientConsultationRequest);
	}

	@Override
	public RequestIterator getDetails() {
	PatientConsultationRequestIterator patientConsultationRequestIterator=new PatientConsultationRequestIterator();
		for(Request patientConsultationRequest : patientConsultationRequests){
			patientConsultationRequestIterator.add(patientConsultationRequest.getDetails());
		}
		return patientConsultationRequestIterator;
	}


	public QueueResolver getRequestQueueResolver() {
		return null;
	}
}
