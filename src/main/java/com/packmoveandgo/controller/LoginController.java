package com.packmoveandgo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.packmoveandgo.model.Login;
import com.packmoveandgo.service.PackMoveAndGoService;

@Controller
public class LoginController {
	
	private static final String DASHBOARD_URL = "/dashboard";
	private static final String DASHBOARD = "dashboard";
	private static final String LOGIN = "login";
	private static final String LOGIN_URL = "/login";
	private static final Logger logger = Logger.getLogger(LoginController.class);
	
	@Autowired
	private PackMoveAndGoService packMoveAndGoService;
	
	@GetMapping(LOGIN_URL)
	public String login() {
		logger.info("login called .......!!!");
		return LOGIN;
	}
	
	@PostMapping(LOGIN_URL)
	public String loginAction(@ModelAttribute(LOGIN) @Valid Login login,Model model,HttpServletRequest httpServletRequest) {
		logger.info("login  called .......!!!");
		boolean isUserExist= packMoveAndGoService.userLogin(login);
		if (isUserExist) {
			HttpSession httpSession= httpServletRequest.getSession();
			httpSession.setAttribute("userId", login.getCust_id());
			httpSession.setAttribute("userType", login.getCust_type());
			model.addAttribute("message", "Your are successfully login as "+login.getCust_type());
			return DASHBOARD;
		} else {
			model.addAttribute("message", "Please enter valid use id and Password and User type");
			return LOGIN;
		}
	
	}
	
	@GetMapping(DASHBOARD_URL)
	public String dashboard(Model model,HttpServletRequest httpServletRequest) {
		logger.info("dashboard called .......!!!USer Id :"+httpServletRequest.getSession().getAttribute("userId"));
		logger.info("dashboard called .......!!!USerType :"+httpServletRequest.getSession().getAttribute("userType"));
		return DASHBOARD;
	}

	

}
