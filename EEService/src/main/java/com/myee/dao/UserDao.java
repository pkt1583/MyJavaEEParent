package com.myee.dao;

public interface UserDao<T> {
	T findByUserId(String userid);
}
