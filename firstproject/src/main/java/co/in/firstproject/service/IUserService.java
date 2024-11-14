package co.in.firstproject.service;

import java.util.List;
import java.util.Optional;

import co.in.firstproject.entity.User;

public interface IUserService {
	
	  List<User> getAllUsers();
	  Optional<User> getUserById(Long id);
	  User createUser(User user);
	  User updateUser(Long id, User updatedUser);
	  void deleteUser(Long id);

}
