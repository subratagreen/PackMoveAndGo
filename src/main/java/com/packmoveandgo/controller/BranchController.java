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

import com.packmoveandgo.model.Branch;
import com.packmoveandgo.service.PackMoveAndGoService;

@Controller
public class BranchController {
	
	private static final Logger logger = Logger.getLogger(BranchController.class);

	private static final String ADD_BRANCH_URL = "/addBranch";
	private static final String ADD_BRANCH = "addBranch";
	
	@Autowired
	private PackMoveAndGoService packMoveAndGoService;
	
	@GetMapping(ADD_BRANCH_URL)
	public String addBranch() {
		logger.info("addBranch called .......!!!");
		return ADD_BRANCH;
	}	
	
	@PostMapping(ADD_BRANCH_URL)
	public String addBranchAction(@ModelAttribute(ADD_BRANCH) @Valid Branch branch,
			Model model,HttpServletRequest httpServletRequest) {
		logger.info("addBranchAction called .......!!!");
		int id=	packMoveAndGoService.addBranch(branch);
		
		if (id>0) {
				logger.info("register "+id);
				model.addAttribute("message", "Branch has been registered successfully "
						+ "Please Note down Generated Branch Id "+id+" \nBranch Name "+branch.getBranch_name());
				return ADD_BRANCH;	
			}else {
				model.addAttribute("message", "Opps! Some thing went worng .........!!!!!!");
				return ADD_BRANCH;
			}
		
	}	
	
}
