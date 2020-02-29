package spring.controller;

import org.springframework.web.servlet.ModelAndView;

public class BaseController {

	public ModelAndView getModelAndViewForPage(String pageName) {
		return new ModelAndView(pageName);
	}

//	public Object getRedirectView(String resourceAfterAutomationSubPath) {
//		RedirectView redirectView = new RedirectView("/automation/" + resourceAfterAutomationSubPath);
//		return redirectView;
//	}
}
