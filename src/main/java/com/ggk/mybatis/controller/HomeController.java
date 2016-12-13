package com.ggk.mybatis.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ggk.mybatis.domain.User;
import com.ggk.mybatis.service.UserService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private UserService userService;

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		LOGGER.info("In Home method.....");
		System.out.println(userService.getUserById(1));

		LOGGER.info("In Insert method.....");
		User u = new User();
		u.setEmailId("Test1234");
		u.setFirstName("Test1234");
		u.setLastName("TEST1234");
		u.setPassword("TEST1234");
		u.setUserId(1234);
		
		userService.insertUser(u);

		return "home";
	}

}
