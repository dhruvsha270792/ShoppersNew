package com.nexusdevs.shopper.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

//import com.nexusdevs.shopper.db.MongoDBManager;
import com.nexusdevs.shopper.dto.User;

@Service
public class DAOService {
	
	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);
	
//	@Autowired
//	private MongoDBManager mongoDBManager;
	
	public User createUser(User user) {
		return user;
	}
	
	public String getUserDetail(String emailId) {
		return toString();
	}
}
