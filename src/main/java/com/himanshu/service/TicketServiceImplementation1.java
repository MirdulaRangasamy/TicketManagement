package com.himanshu.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.himanshu.dao.TicketDao;
import com.himanshu.entity.Ticket;



public class TicketServiceImplementation1 implements TicketService {
	@Autowired
	private TicketDao tdao;
	
	@Override
	public String addTicket(Ticket t) {
		return tdao.addTicket(t);
	}

	@Override
	public Ticket viewTicket(int tno) {
		return tdao.viewTicket(tno);
	}

	@Override
	public ArrayList<Ticket> viewAllTickets() {
		return tdao.viewAllTickets();
	}

	@Override
	public String updateTicket(Ticket t) {
		return tdao.updateTicket(t);
	}

	@Override
	public String deleteTicket(int tno) {
		return tdao.deleteTicket(tno);
	}
}
