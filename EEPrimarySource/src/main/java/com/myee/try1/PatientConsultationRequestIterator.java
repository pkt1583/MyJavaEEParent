package com.myee.try1;

/**
 * Created  on 8/14/2015.
 */
public class PatientConsultationRequestIterator<T> implements RequestIterator {

	public void add(T object){

	}

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public PatientInformationProcessor next() {
		return null;
	}

	@Override
	public void remove() {

	}
}
