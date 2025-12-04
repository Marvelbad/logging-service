package com.badri.logging.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class UserService {
    private static final Logger log = LoggerFactory.getLogger(UserService.class);

    public void createUser(String userName) {
        log.info("Создаем пользователя: {}", userName);
    }

    public void deleteUser(String userName) {
        log.warn("Удаляем пользователя: {}", userName);
    }

    public void failUser(String userName) {
        log.error("Падает пользователь: {}", userName);
        throw new RuntimeException("Имитация ошибки");
    }
}
