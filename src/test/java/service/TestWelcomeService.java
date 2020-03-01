package service;

import static org.mockito.Mockito.mock;

import org.mockito.Mockito;
import org.testng.Assert;
import org.testng.annotations.Test;
import spring.service.WelcomeService;

public class TestWelcomeService {

	@Test
	public void testWelcomingAUser() {
		WelcomeService welcomeService = mock(WelcomeService.class);
		Mockito.when(welcomeService.getGreetUserMessage(""))
				.thenReturn("Welcome Mocked User :)");

		Assert.assertEquals(welcomeService.getGreetUserMessage(""), "Welcome Mocked User :)",
				"[FAIL] - Mock Response");
	}
}
