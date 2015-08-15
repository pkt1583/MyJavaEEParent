package com.myee.model;

import com.myee.try1.PatientConsultationRequest;
import com.myee.try2.QueuePublisher;
import com.myee.try2.QueueResponseTracker;

import java.util.ArrayList;
import java.util.List;

/**
 * Created  on 8/14/2015.
 */
//This could be entity bean
public class RequestQueue {

	QueuePublisher queuePublisher;
	QueueResponseTracker queueResponseTracker;

	private List<Consultant>  consultants=new ArrayList<>();

	public RequestAcknowledgement publishInformation(PatientConsultationRequest patientConsultationRequest){
	  RequestQueue requestQueue=queuePublisher.publish(patientConsultationRequest);
	//	queueResponseTracker.waitForRespose(requestQueue);
		return null;
	}

}
