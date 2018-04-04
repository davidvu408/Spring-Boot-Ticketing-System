package com.hammertheatre.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hammertheatre.models.FormResponse;
import com.hammertheatre.models.FormResponseDaoService;

@Controller
public class APIController {
	
	@Autowired
	private FormResponseDaoService sDao;
	

	@RequestMapping(value = "/api")
	ModelAndView API(ModelAndView modelAndView,
			@RequestParam(name = "limit", required = false) Integer limit,
			@RequestParam(name = "cat", required = false) String category){
		if(limit != null && category != null) {
			System.out.println(limit.intValue());
			System.out.println(category);
			List<FormResponse> limitedList = sDao.findAllUpToAndIncludeOnly(limit.intValue(), category);
			modelAndView.getModel().put("apiList", limitedList);
			modelAndView.setViewName("API-Display");
			
		} else if(limit != null) {
			List<FormResponse> limitedList = sDao.findAllUpTo(limit.intValue());
			modelAndView.getModel().put("apiList", limitedList);
			modelAndView.setViewName("API-Display");
		} else if (category != null) {
			List<FormResponse> categorizedList = sDao.findByMarketingArea(category);
			modelAndView.getModel().put("apiList", categorizedList);
			modelAndView.setViewName("API-Display");
		} else {
			modelAndView.setViewName("API");
		}
		return modelAndView;
	}

}
