package com.himanshu.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.himanshu.dao.TicketRepo;
import com.himanshu.entity.Ticket;




@Service
@Primary
public class TicketServiceImplementation2 implements TicketService{
	@Autowired
	TicketRepo trepo;

	@Override
	public String addTicket(Ticket t) {
		trepo.save(t);
		return "Ticket Added Successfully";
	}

	@Override
	public Ticket viewTicket(int tno) {
		return trepo.findById(tno).orElse(null);
	}

	@Override
	public ArrayList<Ticket> viewAllTickets() {
		return (ArrayList<Ticket>) trepo.findAll();
	}

	@Override
	public String updateTicket(Ticket t) {
		Ticket t1 = trepo.findById(t.getTno()).orElse(null);
		if(t1 != null)
		{
			trepo.delete(t1);
		}
		trepo.save(t);
		return "Ticket updated successfully..";
	}

	@Override
	public String deleteTicket(int tno) {
		Ticket t1 = trepo.findById(tno).orElse(null);
		if(t1 != null)
		{
			trepo.delete(t1);
			return "Ticket deleted Successfully..";
		}
		return "Ticket not found";
	}

}