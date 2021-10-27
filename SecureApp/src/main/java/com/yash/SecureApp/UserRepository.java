package com.yash.SecureApp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByUsername(String username);
	
}
