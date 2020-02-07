package com.packmoveandgo.controller;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.packmoveandgo.model.CustomerRegister;
import com.packmoveandgo.model.Login;
import com.packmoveandgo.service.PackMoveAndGoService;
import com.packmoveandgo.util.PackeMoveAndGoUtils;

@Controller
public class RegisterController {
	
	private static final Logger logger = Logger.getLogger(RegisterController.class);

	@Autowired
	private PackMoveAndGoService packMoveAndGoService;
	
	
	@GetMapping("/register")
	public String register() {
		logger.info("register called .......!!!");
		return "register";
	}
	@PostMapping("/register")
	public String customerRegister(@ModelAttribute("customerRegister") @Valid CustomerRegister customerRegister,Model model) {
		logger.info("register called .......!!!");
		
		
	int id=	packMoveAndGoService.CustomerRegister(customerRegister);
	
	if (id>0) {
		Login login=new Login();
		login.setCust_id(id);
		login.setCust_type(customerRegister.getCust_type());
		String password=PackeMoveAndGoUtils.generatePassword();
		login.setPassword(password);
		
		long lId=packMoveAndGoService.saveLoginInformation(login);
		logger.info("lId "+lId);
		if (lId>0) {
			logger.info("register "+id);
			model.addAttribute("message", "Your are register and generated id is"+id+" and Password is "+password);
			return "login";	
		}else {
			model.addAttribute("message", "Opps! Some thing went worng .........!!!!!!");
			return "index";
		}
		
	}else {
		logger.info("register "+id);
		model.addAttribute("message", "Your are not register please try agin");
		return "register";
	}
		
	}
	
}
