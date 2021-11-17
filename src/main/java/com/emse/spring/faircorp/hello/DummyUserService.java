package com.emse.spring.faircorp.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DummyUserService implements UserService {

    @Autowired
    private GreetingService greetingService;

    @Override
    public void greetAll() {
        String[] list = {"Elodie", "Charles"};
        for (String name : list) {
            greetingService.greet(name);
        }
    }
}
