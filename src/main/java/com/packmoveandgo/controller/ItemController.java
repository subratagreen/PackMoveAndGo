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

import com.packmoveandgo.model.Item;
import com.packmoveandgo.model.Rate;
import com.packmoveandgo.model.Services;
import com.packmoveandgo.request.model.ItemDetail;
import com.packmoveandgo.service.PackMoveAndGoService;

@Controller
public class ItemController {

	private static final String ADD_ITEM = "addItem";
	private static final String ADD_ITEM_URL = "/addItem";
	private static final String SERVICE_LIST = "serviceList";
	private static final Logger logger = Logger.getLogger(ItemController.class);
	
	@Autowired
	private PackMoveAndGoService packMoveAndGoService;
	
	@ModelAttribute(SERVICE_LIST)
	public List<Services> getServiceListOptions(){
		return packMoveAndGoService.getServiceList();
	}

	@GetMapping(ADD_ITEM_URL)
	public String addItem() {
		logger.info("addBranch called .......!!!");
		return ADD_ITEM;
	}	
	
	@PostMapping(ADD_ITEM_URL)
	public String addItemAction(@ModelAttribute(ADD_ITEM) @Valid ItemDetail itemDetail,
			Model model,HttpServletRequest httpServletRequest) {
		logger.info("addItemAction called .......!!!");
		
		Item item=new Item();
		item.setItem_name(itemDetail.getItem_name());
		item.setItem_type(itemDetail.getItem_type());
		
		int id=	packMoveAndGoService.addItem(item);
		
		if (id>0) {
				logger.info("register "+id);
				Services services=packMoveAndGoService.getServiceDetailByServiceId(itemDetail.getService_id());
				logger.info("Service Details by Service id "+services.toString());
				Rate rate=new Rate();
				rate.setCharge_per_km(services.getCharge_per_km());
				rate.setItem_id(item.getItem_id());
				rate.setService_type(services.getService_type());
				
				int rateId=	packMoveAndGoService.addRate(rate);

				if (rateId>0) {
					
					model.addAttribute("message", "Item has been added successfully Item Name "+item.getItem_name());
					return ADD_ITEM;	
					
				}else {
					
					model.addAttribute("message", "Opps! Some thing went worng .........!!!!!!");
					return ADD_ITEM;
				}
				
			}else {
				model.addAttribute("message", "Opps! Some thing went worng .........!!!!!!");
				return ADD_ITEM;
			}
		
	}	
	
}
