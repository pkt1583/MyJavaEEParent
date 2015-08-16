package com.myee.service;

import com.myee.dao.PatientDao;
import com.myee.model.patientInformation.PatientInformation;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Named;

/**
 * Created by pankaj on 8/16/15.
 */
@Named("ConsultantService")
public class ConsultantServiceBean {


    @EJB
    private PatientDao patientDao;
    public ConsultantServiceBean() {
    }

    public PatientInformation getPatientInformation(){
        return patientDao.getFirstPatientInformationFromQueue();
    }
}
