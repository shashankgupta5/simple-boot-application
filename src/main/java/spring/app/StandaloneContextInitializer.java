package spring.app;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StandaloneContextInitializer {

	static {
		logger.info("Initializing Boot Application :)");
		logger.info("Done Initialization");
	}
}
