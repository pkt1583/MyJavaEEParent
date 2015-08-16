package com.myee.dao;

import com.myee.model.patientInformation.PatientInformation;

import javax.ejb.Stateless;

/**
 * Created by pankaj on 8/16/15.
 */
@Stateless
public class PatientDaoImpl implements PatientDao {
    @Override
    public PatientInformation getPatientInformation() {
        return null;
    }

    @Override
    public PatientInformation getFirstPatientInformationFromQueue() {
        return null;
    }
}
