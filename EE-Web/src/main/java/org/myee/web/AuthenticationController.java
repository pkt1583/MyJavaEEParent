package org.myee.web;

import com.myee.annotation.LoggedInUser;
import com.myee.model.AuthenticationInformation;
import com.myee.service.AuthenticationService;
import com.myee.web.model.Credentials;
import com.myee.web.model.UserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by pankaj on 16-05-2015.
 */
@Named("authenticationController")
@SessionScoped
public class AuthenticationController implements Serializable {
	protected final Logger logger = LoggerFactory.getLogger(getClass());

	@Inject
	Credentials credentials;

	@Inject
	AuthenticationService authenticationService;

	private UserInfo userInfo;

	public String authenticate() {
		logger.debug("Got request to Authenticate " + userInfo);
		AuthenticationInformation authenticationInformation = new AuthenticationInformation();
		authenticationInformation.setUserName(credentials.getUsername());
		authenticationInformation.setPassword(credentials.getPassword());
		if (authenticationService.authenticate(authenticationInformation)) {
			userInfo = new UserInfo();
			userInfo.setUserId(credentials.getUsername());
			userInfo.setPassword(credentials.getPassword());
		}
		return authenticationInformation.getGetNextPage();
	}

	@Produces
	@LoggedInUser
	public UserInfo getUserInfo() {
		if (userInfo != null) {
			return userInfo;
		} else {
			throw new RuntimeException("User not found");
		}
	}
}
