package spring.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

	public String getGreetUserMessage() {
		return "Welcome User :)";
	}
}
