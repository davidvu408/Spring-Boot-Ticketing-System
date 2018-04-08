package com.hammertheatre.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hammertheatre.models.FormResponse;
import com.hammertheatre.models.FormResponseDao;

@Controller
public class RequestMappingController {

	@Autowired
	private FormResponseDao dao;
	
	@RequestMapping(value="/") 
	String home(ModelAndView modelAndView) {
		return "Home";
	}

	@RequestMapping(value="/view-tickets")
	ModelAndView viewTickets(ModelAndView modelAndView) {
		modelAndView.setViewName("ViewTickets");
		Iterable<FormResponse> frList = dao.findAll();
		modelAndView.getModel().put("ticket_list", frList);
		return modelAndView;
	}
	
	@RequestMapping(value="edit-ticket", method = RequestMethod.GET) 
	ModelAndView getEditTicket(ModelAndView modelAndView, @RequestParam(name="id") Long id) {
		Optional<FormResponse> fr = dao.findById(id);
		modelAndView.getModel().put("editable_formResponse", fr.get());
		modelAndView.setViewName("EditTicket");
		return modelAndView;
	}
	
	@RequestMapping(value="edit-ticket", method = RequestMethod.POST) 
	ModelAndView getEditTicket(ModelAndView modelAndView, @ModelAttribute("editable_formResponse") FormResponse fr) {
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
	
	@RequestMapping(value="delete-ticket", method = RequestMethod.GET) 
	ModelAndView deleteTicket(ModelAndView modelAndView, @RequestParam(name="id") Long id) {
		dao.deleteById(id);
		modelAndView.setViewName("redirect:/view-tickets");
		return modelAndView;
	}
	
}
