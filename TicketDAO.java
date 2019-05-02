package com.cg.tms.dao;

import java.util.*;

import com.cg.tms.dto.*;

public interface TicketDAO {

	Map <String, TicketBean> tickets=new HashMap<String,TicketBean>();
	boolean raiseNewTicket(TicketBean ticketbean);
	List<TicketCategory>listTicketCategory();
	
}
