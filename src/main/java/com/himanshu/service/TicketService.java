package com.himanshu.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.himanshu.entity.Ticket;

@Service

public interface TicketService {
	String addTicket(Ticket t);
	Ticket viewTicket(int tno);
	ArrayList<Ticket> viewAllTickets();
	String updateTicket(Ticket t);
	String deleteTicket(int tno);

}