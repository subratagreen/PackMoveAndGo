package com.packmoveandgo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.packmoveandgo.model.Services;
import com.packmoveandgo.service.PackMoveAndGoService;

@Controller
public class ServicesController {

	private static final Logger logger = Logger.getLogger(ServicesController.class);

	@Autowired
	private PackMoveAndGoService packMoveAndGoService;

	@GetMapping("/addServices")
	public String addServices() {
		logger.info("addServices called .......!!!");
		return "addServices";
	}

	@PostMapping("/addServices")
	public String addServicesAction(@ModelAttribute("addServices") @Valid Services services ,
			Model model,HttpServletRequest httpServletRequest) {
		logger.info("addServicesAction called .......!!!");
		logger.info("addServicesAction "+services.toString());
		int id=	packMoveAndGoService.addServices(services);
		if (id>0) {
			logger.info("services "+id);
			model.addAttribute("message", "Services has been registered successfully "
					+ "Please Note down Generated Branch Id "+id+" \nBranch Name "+services.getService_name());
			return "addServices";	
		}else {
			model.addAttribute("message", "Opps! Some thing went worng .........!!!!!!");
			return "addServices";
		}
	}

}
