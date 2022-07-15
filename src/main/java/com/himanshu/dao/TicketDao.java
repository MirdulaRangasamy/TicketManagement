package com.himanshu.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.himanshu.entity.Ticket;




@Repository

public class TicketDao {
	private ArrayList<Ticket> tlist = new ArrayList<Ticket>();

	public String addTicket(Ticket t) {
		tlist.add(t);
		return "Ticket added successfully...";
	}


	public Ticket viewTicket(int tno) {
		for(Ticket t:tlist)
		{
			if(t.getTno() == tno)
			{
				return t;
			}
		}
		return null;
	}


	public ArrayList<Ticket> viewAllTickets() {
		return tlist;
	}


	public String updateTicket(Ticket t) {
		for(Ticket t1:tlist)
		{
			if(t1.getTno() == t.getTno())
			{
				t1.setName(t.getName());
				t1.setAge(t.getAge());
				t1.setGender(t.getGender());
				t1.setNationality(t.getNationality());
				t1.setMobile(t.getMobile());
				t1.setFrom(t.getFrom());
				t1.setTo(t.getTo());
				t1.setDate(t.getDate());
				return "Ticket updated successfully...";
			}
		}
		tlist.add(t);
		return "Ticket added successfully...";
	}


	public String deleteTicket(int tno) {
		for(int i=0; i<tlist.size(); i++)
		{
			if(tlist.get(i).getTno() == tno)
			{
				tlist.remove(tlist.get(i));
				return "Ticket deleted Succssefully";
			}
		}
		return "Ticket not found";

	}

}
