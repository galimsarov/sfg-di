package egalimsarov.springframework.di.controllers;

import egalimsarov.springframework.di.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
