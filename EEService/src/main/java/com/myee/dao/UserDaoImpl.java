package com.myee.dao;

import auth.model.UserdetailsEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

@Stateless
@Local
public class UserDaoImpl implements UserDao<UserdetailsEntity> {

	protected final Logger logger = LoggerFactory.getLogger(getClass());
	@PersistenceContext(unitName = "mysqllocal")
	private EntityManager entityManager;

	@Override
	public UserdetailsEntity findByUserId(String userid) {
		UserdetailsEntity userdetailsEntity = new UserdetailsEntity();
		try {
			Object testObj = entityManager.createNamedQuery("userDetails.findByUserId", UserdetailsEntity.class)
					.setParameter("userid", userid).getSingleResult();
			logger.debug("**********************************************************************************");
			logger.debug(testObj + " loaded from " + testObj.getClass().getClassLoader());
			logger.debug("##########################################################################################");
			userdetailsEntity = (UserdetailsEntity) testObj;
			logger.debug(userdetailsEntity + " loaded from " + userdetailsEntity.getClass().getClassLoader());
			logger.debug("**********************************************************************************");
			//userdetailsEntity = entityManager.createNamedQuery("userDetails.findByUserId", UserdetailsEntity.class).setParameter("userid", userid).getSingleResult();

		} catch (NoResultException nre) {
			logger.error("User [ " + userid + " ] not found in database");
		}
		if (userdetailsEntity == null) {
			userdetailsEntity = new UserdetailsEntity();
		}
		//entityManager.close();
		return userdetailsEntity;

	}
}
