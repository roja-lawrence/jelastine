package com.cg.tms.service;

import java.util.*;

import com.cg.tms.dao.*;
import com.cg.tms.dto.*;

public class TicketServiceImpl implements TicketService{
	TicketDAOImpl ticketDao=new TicketDAOImpl();
	
	public boolean raiseNewTicket(TicketBean ticketBean) {
		
		return ticketDao.raiseNewTicket(ticketBean);
	}

	public String getTicketCategory(int ticketCategoryIndex){
		if(ticketCategoryIndex==1) 
			return "tc001";
		if(ticketCategoryIndex==2) 
			return "tc002";
		if(ticketCategoryIndex==3) 
			return "tc003";
		return null;
	}
	public List<TicketCategory> listTicketCategory() {
		
		return ticketDao.listTicketCategory();
	}

}
