package com.badri.logging;

import com.badri.logging.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    public static void main(String[] args) {
        UserService service = new UserService();

        service.createUser("Badri");
        service.deleteUser("Alex");
        service.failUser("ErrorUser");
    }
}