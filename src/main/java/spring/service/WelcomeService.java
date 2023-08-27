package spring.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class WelcomeService {

	public String getGreetUserMessage(String userName) {
		if (StringUtils.isBlank(userName)) {
			logger.error("Found an invalid name, adding default");
			return String.format("Welcome UNSET :)");
		}
		return String.format("Welcome %s :)", userName);
	}
}
