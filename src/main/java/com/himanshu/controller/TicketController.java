package com.himanshu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.himanshu.entity.Ticket;
import com.himanshu.service.TicketService;



@Controller
public class TicketController {
	@Autowired
	private TicketService tservice;
	
	@RequestMapping("homeTicket")
	public String getTicketHome()
	{
		return "ticketHome.jsp";
	}
	
	@RequestMapping("addTicket")
	@ResponseBody
	public String addTicket(Ticket t)
	{
		return tservice.addTicket(t);
	}
	
	@RequestMapping("viewTicket")
	public ModelAndView viewTicket(int tno)
	{
		ModelAndView mvc = new ModelAndView();
		mvc.setViewName("displayTicket.jsp");
		mvc.addObject("mode", "single");
		
		Ticket t = tservice.viewTicket(tno);
		if(t != null)
		{
				mvc.addObject("flag", true);
				mvc.addObject("result",t);
				return mvc;
		}
		
		mvc.addObject("flag", false);
		mvc.addObject("result", "Ticket not found...");
		return mvc;
	}
	
	@RequestMapping("viewAllTicket")
	public ModelAndView viewAllTickets()
	{
		ModelAndView mvc = new ModelAndView();
		mvc.setViewName("displayTicket.jsp");
		mvc.addObject("mode", "list");
		mvc.addObject("result",tservice.viewAllTickets());
		return mvc;
	}
	
	@RequestMapping("updateTicket")
	@ResponseBody
	public String updateTicket(Ticket t)
	{	
		return tservice.updateTicket(t);	
	}
	
	@RequestMapping("deleteTicket")
	@ResponseBody
	public String deleteTicket(int tno)
	{
		return tservice.deleteTicket(tno);
	}
	

}
