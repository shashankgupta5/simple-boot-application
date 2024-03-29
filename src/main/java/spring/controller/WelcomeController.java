package spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import spring.service.WelcomeService;

@RestController
public class WelcomeController {

    @Autowired
    private WelcomeService welcomeService;

    @GetMapping(value = {"/welcome"})
    public String welcome(@RequestParam("userName") String userName) {
        return welcomeService.getGreetUserMessage(userName);
    }

    @GetMapping(value = {"/status", "/health"})
    public String healthCheck() {
        return "Application is running :)";
    }
}
