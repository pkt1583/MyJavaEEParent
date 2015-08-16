package com.myee.dao;

import com.myee.model.patientInformation.PatientInformation;

import javax.ejb.Stateless;

/**
 * Created by pankaj on 8/16/15.
 */

public interface PatientDao {
    PatientInformation getPatientInformation();

    PatientInformation getFirstPatientInformationFromQueue();
}
