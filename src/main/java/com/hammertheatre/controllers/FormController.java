package com.hammertheatre.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hammertheatre.models.FormResponse;
import com.hammertheatre.models.FormResponseDao;

@Controller
public class FormController {

	@Autowired
	private FormResponseDao dao;

	// GET is an HTTP method that requests data from a specified resource
	@RequestMapping(value = "/form", method = RequestMethod.GET)
	// By adding parameters to this mapping, Spring will automatically 'wire' it
	// in so there is nothing we have to do to furthermore
	ModelAndView getHome(ModelAndView modelAndView,
			@ModelAttribute("formResponse") FormResponse fr) {
		// Set a view name for this ModelAndView, to be resolved by the
		// DispatcherServlet via a ViewResolver. Will override any pre-existing
		// view name or View.
		modelAndView.setViewName("Form");
		return modelAndView;
	}

	// POST is an HTTP method that submits data to be processed to a specified
	// resource
	@RequestMapping(value = "/form", method = RequestMethod.POST)
	ModelAndView postHome(ModelAndView modelAndView,
			@ModelAttribute("formResponse") FormResponse fr) {
		dao.save(fr);
		modelAndView.setViewName("redirect:/view-tickets");
		return modelAndView;
	}

	@ModelAttribute("marketingAreas")
	public List<String> getMarketingArea() {
		List<String> mAreas = new ArrayList<String>();
		mAreas.add("WEB");
		mAreas.add("GRAPHIC_DESIGN");
		mAreas.add("MEDIA");
		mAreas.add("EDITORIAL");
		mAreas.add("DIGITAL_MARKETING");
		return mAreas;
	}
}
