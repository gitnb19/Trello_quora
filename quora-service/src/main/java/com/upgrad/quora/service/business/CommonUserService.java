package com.upgrad.quora.service.business;

import com.upgrad.quora.service.dao.UserAuthDao;
import com.upgrad.quora.service.dao.UserDao;
import com.upgrad.quora.service.entity.UserAuthEntity;
import com.upgrad.quora.service.entity.UserEntity;
import com.upgrad.quora.service.exception.AuthorizationFailedException;
import com.upgrad.quora.service.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonUserService {

  @Autowired UserAuthDao userAuthDao;

  @Autowired UserDao userDao;

  /**
   * This method checks if the access token exist in the DB and it is not logged out.
   *
   * @param accessToken token to be validated.
   * @throws AuthorizationFailedException ATHR-001 if the token doesn't exit in the DB , ATHR-002 if
   *     the user has already logged out using the token.
   */
  public void checkIfTokenIsValid(String accessToken) throws AuthorizationFailedException {}

  /**
   * This methods gets the user details based on the userId passed.
   *
   * @param userId Id of the user whose information is to be fetched.
   * @return
   * @throws UserNotFoundException USR-001 if the user with given id doesn't exist in DB.
   */
  public UserEntity getUserById(final String userId) throws UserNotFoundException {
	  return null;
  }
}
