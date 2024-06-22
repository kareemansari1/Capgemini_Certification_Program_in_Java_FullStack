package com.spring.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.entity.User;
import com.spring.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userrepository;

	public List<User> getAllUsers() {
		return userrepository.findAll();
	}
	public User addUser(User a) {
        return userrepository.save(a);
    
    }
}
