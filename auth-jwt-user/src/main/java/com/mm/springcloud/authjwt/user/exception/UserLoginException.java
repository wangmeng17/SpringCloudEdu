package com.mm.springcloud.authjwt.user.exception;

/**
 * Created by fangzhipeng on 2017/6/1.
 */
public class UserLoginException extends RuntimeException{

    public UserLoginException(String message) {
        super(message);
    }

}
