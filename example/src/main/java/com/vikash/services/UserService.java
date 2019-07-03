package com.vikash.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vikash.modal.User;
import com.vikash.repository.UserRepository;

@Service
@Transactional
public class UserService {
	@Autowired
	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository=userRepository;
	}
	//saveMyUser() 
	public void saveMyUser(User user ) {
		userRepository.save(user);
	}
	//showAllUsers()
	public List<User> showAllUsers(){
		List<User> users = new ArrayList<User>();
		for(User user : userRepository.findAll()) {
			users.add(user);
		}
		return users;
	}
	//deleteMyUser()
	public void deleteMyUser(int id) {
		userRepository.delete(id);
	}
	//editUser()
	public User editUser(int id) {
		return userRepository.findOne(id);
	}
	
	public User findByUsernameAndPassword(String username, String password) {
		return userRepository.findByUsernameAndPassword(username, password);
	}
	
	}

	