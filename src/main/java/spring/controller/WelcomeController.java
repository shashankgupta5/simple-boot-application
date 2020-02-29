package spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.service.WelcomeService;

@RestController
public class WelcomeController extends BaseController {

	private WelcomeService welcomeService;

	@Autowired
	public WelcomeController(WelcomeService welcomeService) {
		this.welcomeService = welcomeService;
	}

	@GetMapping(value = {"/welcome", "/"})
	public String welcome() {
		return welcomeService.getGreetUserMessage();
	}

	@GetMapping(value = {"/status", "/health"})
	public String healthCheck() {
		return "Application is running :)";
	}
}
