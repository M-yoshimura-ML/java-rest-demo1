package com.masa.fullstack.backend.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("Cound not find the user with id:" + id);
    }
}
