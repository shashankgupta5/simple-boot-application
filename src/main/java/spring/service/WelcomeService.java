package spring.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

	public String getGreetUserMessage(String userName) {
		return String.format("Welcome %s :)", userName);
	}
}
