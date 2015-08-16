package com.myee.service;

import com.myee.model.RequestAcknowledgement;
import com.myee.requestResponse.ConsultationRequestBuilder;
import com.myee.try1.PatientConsultationRequest;

import javax.ejb.Stateless;
import javax.inject.Named;

/**
 * Created  on 8/11/2015.
 */
@Named
public class DoctorServiceFacade {


	public DoctorServiceFacade() {
	}

	public RequestAcknowledgement placeRequest(ConsultationRequestBuilder consultationRequestBuilder) {
		PatientConsultationRequest patientConsultationRequest=consultationRequestBuilder.create();
		RequestAcknowledgement requestAcknowledgement=patientConsultationRequest.getRequestQueueResolver().resolve().publishInformation(patientConsultationRequest);
		return requestAcknowledgement;
	}

	public void getResponse(RequestAcknowledgement requestAcknowledgement){
        //return null;
    }


}
