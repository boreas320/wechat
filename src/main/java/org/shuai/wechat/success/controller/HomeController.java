package org.shuai.wechat.success.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	private static Logger logger=Logger.getLogger(HomeController.class);
	@RequestMapping(value = "home", method = RequestMethod.GET)
	public ModelAndView home(HttpServletRequest request,HttpServletResponse response) {
		logger.error(request.getRemoteHost());
		return new ModelAndView("home");

	}

	
}
