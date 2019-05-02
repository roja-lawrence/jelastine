package com.cg.tms.dao;

import java.util.*;

import com.cg.tms.dto.TicketBean;
import com.cg.tms.dto.TicketCategory;
import com.cg.tms.util.Util;

public class TicketDAOImpl implements TicketDAO {
	
	List<TicketCategory> listTicketCategory=new ArrayList<TicketCategory>();
	
	
	public boolean raiseNewTicket(TicketBean ticketBean) {
		tickets.put(String.valueOf(ticketBean.getTicketNo()),ticketBean);
		Map<String, String> categories=Util.getTicketCategoryEntries();
		TicketCategory tc;
		
		/*
	 	Creating TicketCategory object and adding it to list for the given ticket
		 */
		
		tc=new TicketCategory(ticketBean.getTicketCategoryId(),categories.get(ticketBean.getTicketCategoryId()));
		listTicketCategory.add(tc);
		
		return true;
	}

	public List<TicketCategory> listTicketCategory() {
		
		return listTicketCategory;
	}

}
