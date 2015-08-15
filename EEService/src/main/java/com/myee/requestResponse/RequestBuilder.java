package com.myee.requestResponse;

import com.myee.model.patientInformation.PatientHistory;
import com.myee.model.patientInformation.PatientPrescription;
import com.myee.model.patientInformation.PatientRichContent;

import java.util.List;

/**
 * Created  on 8/11/2015.
 */
public interface RequestBuilder<T> {
	public RequestBuilder setRichContent(List<PatientRichContent> patientRichContent);

	public RequestBuilder setPatientHistory(List<PatientHistory> patientHistory);

	public RequestBuilder setPrescriptions(List<PatientPrescription> patientPrescriptionList);

	public T create();
}
