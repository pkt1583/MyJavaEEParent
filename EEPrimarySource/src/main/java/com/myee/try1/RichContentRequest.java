package com.myee.try1;

import com.myee.model.patientInformation.PatientRichContent;

import java.util.ArrayList;
import java.util.List;

/**
 * Created  on 8/14/2015.
 */
public class RichContentRequest implements Request {

	List<PatientRichContent> patientRichContents=new ArrayList<>();

	public void setPatientRichContents(List<PatientRichContent> patientRichContents){
		this.patientRichContents=patientRichContents;
	}

	public PatientRichContent addPatientRichContent(PatientRichContent patientPatientRichContent){
		this.patientRichContents.add(patientPatientRichContent);
		return patientPatientRichContent;
	}

	@Override
	public RequestIterator getDetails() {
		return null;
	}

	//Inner RichContent Iterator
}
