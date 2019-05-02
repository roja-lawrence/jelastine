package com.cg.tms.ui;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

import com.cg.tms.dto.TicketBean;
import com.cg.tms.service.TicketServiceImpl;

public class MainUI {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		int ticketCategoryIndex, ticketPriority, choice;
		String category;
		TicketServiceImpl ticketService =new TicketServiceImpl();
		System.out.print("\n===========================\nWelcome to ITIMD Help Desk\n===========================\n\n1. Raise a Ticket\n2. Exit from the system\n\nEnter option: ");
		choice=sc.nextInt();
		String ticketDescription;
		
		switch(choice) {
		case 1:
			System.out.print("\nSelect Ticket Category from below list:\n1:Software Installation\n2:Mailbox creation\n3:Network issues\n\nEnter option:");
			ticketCategoryIndex=sc.nextInt();
			category=ticketService.getTicketCategory(ticketCategoryIndex);
			System.out.print("Enter Priority:(1. low 2. medium 3. high): ");
			ticketPriority=sc.nextInt();
			ticketService.listTicketCategory();
			TicketBean ticket=new TicketBean();
			
			ticket.setTicketNo(String.valueOf(Math.round(Math.random()*1000)));
			ticket.setTicketCategoryId(category);
			ticket.setTicketPriority(String.valueOf(ticketPriority));
			ticket.setItimdComments(String.valueOf(LocalDate.now().getDayOfMonth()+" "+LocalDate.now().getMonth()+" "+LocalDate.now().getYear()+" "+LocalTime.now().getHour()+":"+LocalTime.now().getMinute()));
			System.out.print("Enter Ticket Description: ");
			ticketDescription=sc1.nextLine();
			ticket.setTicketDescription(ticketDescription);
			ticket.setTicketStatus("New");
			
			if(ticketService.raiseNewTicket(ticket)) {
				
				System.out.println("\nTicket number "+ticket.getTicketNo()+" logged successfully at "+ticket.getItimdComments()+".");
				System.out.println(ticketService.listTicketCategory());
			}
			else {
				System.out.println("Problem arised in raising ticket.");
			}
			break;
			
		case 2:
			System.out.println("Exited.");
			System.exit(0);
			
		default:
			System.out.println("Please select valid option.");
		}
		
		sc.close();
		sc1.close();
	}

}
