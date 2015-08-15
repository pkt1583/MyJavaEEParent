package com.myee.try2;

import com.myee.model.RequestQueue;
import com.myee.try1.PatientConsultationRequest;

/**
 * Created  on 8/14/2015.
 */
public interface QueuePublisher {
	 RequestQueue publish(PatientConsultationRequest patientConsultationRequest);
}
