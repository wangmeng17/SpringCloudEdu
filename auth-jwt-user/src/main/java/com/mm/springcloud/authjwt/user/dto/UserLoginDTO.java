package com.mm.springcloud.authjwt.user.dto;

import com.mm.springcloud.authjwt.user.entity.JWT;
import com.mm.springcloud.authjwt.user.entity.User;

/**
 * Created by fangzhipeng on 2017/5/27.
 */
public class UserLoginDTO {

    private JWT jwt;

    private User user;

    public JWT getJwt() {
        return jwt;
    }

    public void setJwt(JWT jwt) {
        this.jwt = jwt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
