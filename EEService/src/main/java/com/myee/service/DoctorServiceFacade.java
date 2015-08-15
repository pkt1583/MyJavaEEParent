package com.myee.service;

import com.myee.model.RequestAcknowledgement;
import com.myee.requestResponse.ConsultationRequestBuilder;
import com.myee.try1.PatientConsultationRequest;

import javax.ejb.Stateless;

/**
 * Created  on 8/11/2015.
 */
@Stateless
public class DoctorServiceFacade {


	public DoctorServiceFacade() {
	}

	public RequestAcknowledgement placeRequest(ConsultationRequestBuilder consultationRequestBuilder) {
		PatientConsultationRequest patientConsultationRequest=consultationRequestBuilder.create();
		RequestAcknowledgement requestAcknowledgement=patientConsultationRequest.getRequestQueueResolver().resolve().publishInformation(patientConsultationRequest);
		return requestAcknowledgement;
	}


}
