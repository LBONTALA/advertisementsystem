package co.in.firstproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.in.firstproject.entity.User;
import co.in.firstproject.repository.UserRepository;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public Optional<User> getUserById(Long userId) {
		return userRepository.findById(userId);
	}

	@Override
	public User createUser(User user) {
		return userRepository.save(user);

	}

	@Override
	public User updateUser(Long id, User updatedUser) {
		return userRepository.findById(id).map(user -> {
			user.setUsername(updatedUser.getUsername());
			user.setPassword(updatedUser.getPassword());
			user.setEmail(updatedUser.getEmail());
			user.setAddress(updatedUser.getAddress());
			user.setContactNumber(updatedUser.getContactNumber());
			return userRepository.save(user);
		}).orElseThrow(() -> new RuntimeException("User not found"));
	}

	@Override
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}

}
