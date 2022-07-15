package com.himanshu.dao;

import org.springframework.data.repository.CrudRepository;

import com.himanshu.entity.Ticket;





public interface TicketRepo  extends CrudRepository<Ticket,Integer>{

}