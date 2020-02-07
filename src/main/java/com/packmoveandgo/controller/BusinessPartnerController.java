package com.packmoveandgo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.packmoveandgo.model.Branch;
import com.packmoveandgo.model.BusinessPartner;
import com.packmoveandgo.service.PackMoveAndGoService;

@Controller
public class BusinessPartnerController {

	private static final Logger logger = Logger.getLogger(BusinessPartnerController.class);
	
	private static final String BRANCH_LIST = "branchList";
	private static final String ADD_AGENT_URL = "/addAgent";
	private static final String ADD_AGENT = "addAgent";
	@Autowired
	private PackMoveAndGoService packMoveAndGoService;

	@ModelAttribute(BRANCH_LIST)
	 public List<Branch> getBranchListOptions(){
	 return packMoveAndGoService.getBranchList();
	}
	
	
	@GetMapping(ADD_AGENT_URL)
	public String addAgent(Model model) {
		logger.info("addServices called .......!!!");
		return ADD_AGENT;
	}

	@PostMapping(ADD_AGENT_URL)
	public String addAgentAction(@ModelAttribute(ADD_AGENT) @Valid BusinessPartner partner ,
			Model model,HttpServletRequest httpServletRequest) {
		logger.info("addAgentAction called .......!!!");

		logger.info("Add Agent "+partner.toString());

		int id=	packMoveAndGoService.addAgent(partner);

		if (id>0) {
			logger.info("register "+id);
			model.addAttribute("message", "Agent has been registered successfully "
					+ "Please Note down Generated Agent Id "+id+" \nAgent Name "+partner.getAgent_name());
			return ADD_AGENT;
		}else {
			model.addAttribute("message", "Opps! Some thing went worng .........!!!!!!");
			return ADD_AGENT;
		}


	}

}
