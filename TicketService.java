package com.cg.tms.service;

import java.util.List;

import com.cg.tms.dto.*;

public interface TicketService {

	boolean raiseNewTicket(TicketBean ticketBean);
	List<TicketCategory>listTicketCategory();
	
}
