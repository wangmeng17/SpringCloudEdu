package com.springcloud.oauth2.server.repository;

import com.springcloud.oauth2.server.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {

	User findByUsername(String username);
}
