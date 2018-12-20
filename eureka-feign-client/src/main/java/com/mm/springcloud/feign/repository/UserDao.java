package com.mm.springcloud.feign.repository;

import com.mm.springcloud.feign.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {

	User findByUsername(String username);
}
