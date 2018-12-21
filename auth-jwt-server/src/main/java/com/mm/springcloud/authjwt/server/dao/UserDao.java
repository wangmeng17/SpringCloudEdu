package com.mm.springcloud.authjwt.server.dao;

import com.mm.springcloud.authjwt.server.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by fangzhipeng on 2017/5/27.
 */

public interface UserDao extends JpaRepository<User, Long> {

	User findByUsername(String username);
}
