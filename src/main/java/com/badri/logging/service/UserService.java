package com.badri.logging.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;


public class UserService {
    private final Map<String, String> dataBase = new HashMap<>();

    private static final Logger log = LoggerFactory.getLogger(UserService.class);

    public void createUser(String userName) {
        log.info("Attempt to create user {}", userName);
        if (dataBase.containsKey(userName)) {
            log.warn("User {} already exists", userName);
            return;
        }
        dataBase.put(userName, userName);
        log.info("User {} created", userName);
    }

    public void deleteUser(String userName) {
        log.warn("Deleting user: {}", userName);
    }

    public void failUser(String userName) {
        log.error("Failed user: {}", userName);
        throw new RuntimeException("Exception simulation");
    }
}
