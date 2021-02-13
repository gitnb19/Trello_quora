package com.upgrad.quora.service.business;

import com.upgrad.quora.service.dao.UserAuthDao;
import com.upgrad.quora.service.dao.UserDao;
import com.upgrad.quora.service.entity.UserAuthEntity;
import com.upgrad.quora.service.entity.UserEntity;
import com.upgrad.quora.service.exception.AuthenticationFailedException;
import com.upgrad.quora.service.exception.SignOutRestrictedException;
import com.upgrad.quora.service.exception.SignUpRestrictedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.time.ZonedDateTime;
import java.util.UUID;

@Service
public class UserAuthenticationService {

  @Autowired private UserDao userDao;

  @Autowired private UserAuthDao userAuthDao;

  @Autowired private PasswordCryptographyProvider passwordCryptographyProvider;

  /**
   * This method checks if the username and email exist in the DB. if the username or email doesn't
   * exist in the DB.then assign uuid to the user. Assign encrypted password and salt to the user.
   *
   * @throws SignUpRestrictedException SGR-001 if the username exist in the DB , SGR-002 if the
   *     email exist in the DB.
   */
  @Transactional(propagation = Propagation.REQUIRED)
  public UserEntity signup(UserEntity userEntity) throws SignUpRestrictedException {
	  return null;
  }

  /**
   * This method is used for the user to signin.
   *
   * @param username Username of the user who is singing in.
   * @param password Credentials of the user who is singing in
   * @return UserAuthEntity which contains the access-token and other details.
   * @throws AuthenticationFailedException ATH-001 if the username doesn't exist in DB or ATH-002 if
   *     the password is wrong.
   */
  @Transactional(propagation = Propagation.REQUIRED)
  public UserAuthEntity signin(final String username, final String password)
      throws AuthenticationFailedException {
	  return null;
  }

  /**
   * This method is used by user to signout.
   *
   * @param accessToken Access token of the user.
   * @return UserEntity details of the signed out user.
   * @throws SignOutRestrictedException SGR-001 if the access-token is not present in the DB.
   */
  @Transactional(propagation = Propagation.REQUIRED)
  public UserEntity signout(final String accessToken) throws SignOutRestrictedException {
	  return null;
  }

  // checks whether the username exist in the database
  private boolean isUserNameInUse(final String userName) {
    return userDao.getUserByUserName(userName) != null;
  }

  // checks whether the email exist in the database
  private boolean isEmailInUse(final String email) {
    return userDao.getUserByEmail(email) != null;
  }
}
