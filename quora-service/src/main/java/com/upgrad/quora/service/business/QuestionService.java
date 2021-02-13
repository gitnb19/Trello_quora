package com.upgrad.quora.service.business;

import com.upgrad.quora.service.dao.QuestionDao;
import com.upgrad.quora.service.dao.UserAuthDao;
import com.upgrad.quora.service.dao.UserDao;
import com.upgrad.quora.service.entity.QuestionEntity;
import com.upgrad.quora.service.entity.UserAuthEntity;
import com.upgrad.quora.service.entity.UserEntity;
import com.upgrad.quora.service.exception.AuthorizationFailedException;
import com.upgrad.quora.service.exception.InvalidQuestionException;
import com.upgrad.quora.service.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class QuestionService {

  @Autowired private UserAuthDao userAuthDao;

  @Autowired private UserDao userDao;

  @Autowired private QuestionDao questionDao;

  /**
   * Creates question in the DB if the accessToken is valid.
   *
   * @param accessToken accessToken of the user for valid authentication.
   * @throws AuthorizationFailedException ATHR-001 - if user token is not present in DB. ATHR-002 if
   *     the user has already signed out.
   */
  @Transactional(propagation = Propagation.REQUIRED)
  public QuestionEntity createQuestion(QuestionEntity questionEntity, final String accessToken)
      throws AuthorizationFailedException {
	  return null;
  }

  /**
   * Gets all the questions in the DB.
   *
   * @param accessToken accessToken of the user for valid authentication.
   * @return List of QuestionEntity
   * @throws AuthorizationFailedException ATHR-001 - if user token is not present in DB. ATHR-002 if
   *     the user has already signed out.
   */
  public List<QuestionEntity> getAllQuestions(final String accessToken)
      throws AuthorizationFailedException {
	  return null;
  }

  /**
   * * Edit the question
   *
   * @param accessToken accessToken of the user for valid authentication.
   * @param questionId id of the question to be edited.
   * @param content new content for the existing question.
   * @return QuestionEntity
   * @throws AuthorizationFailedException ATHR-001 - if user token is not present in DB. ATHR-002 if
   *     the user has already signed out.
   * @throws InvalidQuestionException if the question with id doesn't exist.
   */
  @Transactional(propagation = Propagation.REQUIRED)
  public QuestionEntity editQuestion(
      final String accessToken, final String questionId, final String content)
      throws AuthorizationFailedException, InvalidQuestionException {
	  return null;
  }

  /**
   * * Delete the question
   *
   * @param accessToken accessToken of the user for valid authentication.
   * @param questionId id of the question to be edited.
   * @return QuestionEntity
   * @throws AuthorizationFailedException ATHR-001 - if user token is not present in DB. ATHR-002 if
   *     the user has already signed out.
   * @throws InvalidQuestionException if the question with id doesn't exist.
   */
  @Transactional(propagation = Propagation.REQUIRED)
  public QuestionEntity deleteQuestion(final String accessToken, final String questionId)
      throws AuthorizationFailedException, InvalidQuestionException {
	  return null;
  }

  /**
   * Gets all the questions posted by a specific user.
   *
   * @param userId userId of the user whose posted questions have to be retrieved
   * @param accessToken accessToken of the user for valid authentication.
   * @return List of QuestionEntity
   * @throws AuthorizationFailedException ATHR-001 - if user token is not present in DB. ATHR-002 if
   *     the user has already signed out.
   */
  public List<QuestionEntity> getAllQuestionsByUser(final String userId, final String accessToken)
      throws AuthorizationFailedException, UserNotFoundException {
	  return null;
  }
}
