package com.badri.logging;

import com.badri.logging.service.UserService;
import org.slf4j.MDC;

import java.util.UUID;

public class App {
    public static void main(String[] args) {

        MDC.put("requestId", UUID.randomUUID().toString());

        UserService service = new UserService();

        service.createUser("Badri");
        service.deleteUser("Alex");
        service.failUser("ErrorUser");

        MDC.clear();
    }
}