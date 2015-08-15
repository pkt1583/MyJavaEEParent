package com.myee.requestResponse;

import com.myee.model.patientInformation.PatientHistory;
import com.myee.model.patientInformation.PatientPrescription;
import com.myee.model.patientInformation.PatientRichContent;
import com.myee.try1.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created  on 8/12/2015.
 */
public class ConsultationRequestBuilder implements RequestBuilder<PatientConsultationRequest> {

	List<PatientRichContent> patientRichContents = new ArrayList<>();
	List<PatientHistory> patientHistories = new ArrayList<>();
	List<PatientPrescription> patientPrescriptions = new ArrayList<>();

	@Override
	public RequestBuilder setRichContent(List<PatientRichContent> patientRichContent) {
		this.patientRichContents = patientRichContent;
		return this;
	}

	@Override
	public RequestBuilder setPatientHistory(List<PatientHistory> patientHistory) {
		this.patientHistories = patientHistory;
		return this;
	}

	@Override
	public RequestBuilder setPrescriptions(List<PatientPrescription> patientPrescriptionList) {
		this.patientPrescriptions = patientPrescriptionList;
		return this;
	}

	@Override
	public PatientConsultationRequest create() {
		PatientHistoryRequest patientHistoryRequest = new PatientHistoryRequest();
		patientHistoryRequest.setPatientHistory(patientHistories);

		RichContentRequest richContentRequest = new RichContentRequest();
		richContentRequest.setPatientRichContents(patientRichContents);

		PrescriptionRequest prescriptionRequest = new PrescriptionRequest();
		prescriptionRequest.setPatientPrescriptions(patientPrescriptions);

		PatientConsultationRequest patientConsultationRequest = new PatientConsultationRequest();
		patientConsultationRequest.addPatientInformation(patientHistoryRequest);
		patientConsultationRequest.addPatientInformation(richContentRequest);
		patientConsultationRequest.addPatientInformation(prescriptionRequest);
		return patientConsultationRequest;
	}
}
