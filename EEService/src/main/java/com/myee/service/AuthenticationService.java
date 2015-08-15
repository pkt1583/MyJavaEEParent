package com.myee.service;

import auth.model.UserdetailsEntity;
import com.myee.dao.UserDao;
import com.myee.model.AuthenticationInformation;

import javax.ejb.EJB;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by pankaj on 01-02-2015.
 */
@Named(value = "authenticationService")

public class AuthenticationService implements Serializable {

	@EJB
	private UserDao<UserdetailsEntity> userDao;

	public boolean authenticate(AuthenticationInformation authenticationInformation) {
		UserdetailsEntity userdetailsEntity = userDao.findByUserId(authenticationInformation.getUserName());
		if (authenticationInformation.getPassword().equals(userdetailsEntity.getUserPassword())) {
			authenticationInformation.setGetNextPage("success");
			return true;
		}
		return false;
	}
}
