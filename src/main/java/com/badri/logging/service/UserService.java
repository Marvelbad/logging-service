package com.badri.logging.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class UserService {
    private static final Logger log = LoggerFactory.getLogger(UserService.class);

    public void createUser(String userName) {
        log.info("Create user: {}", userName);
    }

    public void deleteUser(String userName) {
        log.warn("Deleting user: {}", userName);
    }

    public void failUser(String userName) {
        log.error("Failed user: {}", userName);
        throw new RuntimeException("Exception simulation");
    }
}
