package fr.elysium.guilde.website.business.service.acl;

import java.util.List;

import fr.elysium.guilde.website.persistence.entity.acl.User;

/**
 * <b>UserService</b> is the interface for User business logic
 * 
 * @author Meidi
 * 
 */
public interface UserService {

  /**
   * Save a user in the database if the email doesn't already exists
   * 
   * @param user
   * @return
   */
  User subscribe(User user);

  /**
   * Check if a User email already exists
   * 
   * @param mail : the mail to check
   * @return true if the User exists and False if he isn't
   */
  boolean emailExist(String mail);

  /**
   * Find a User by mail
   * 
   * @param mail : user's mail
   * @return a User
   */
  User find(String mail);

  /**
   * Update an existing User
   * 
   * @param user : the User to update
   */
  void update(User user);

  /**
   * Find an existing User by unique ID
   * 
   * @param idUser : user unique ID
   * @return a User
   */
  User find(long idUser);

  /**
   * List all of the users
   * 
   * @return
   */
  List<User> list();

  /**
   * Check if the user can signin. If it doesn't, return the error message. If it does, return empty
   * String.
   * 
   * @param password : the user's password to check
   * @param user : the user to check
   * @return a string
   */
  String canSignin(String password, User user);

}
