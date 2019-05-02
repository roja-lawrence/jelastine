package com.cg.tms.dto;

public class TicketCategory {

	private String tickeCategoryId;
	private String categoryName;
	
	
	public TicketCategory(String tickeCategoryId, String categoryName) {
		super();
		this.tickeCategoryId = tickeCategoryId;
		this.categoryName = categoryName;
	}
	
	public String getTickeCategoryId() {
		return tickeCategoryId;
	}
	public void setTickeCategoryId(String tickeCategoryId) {
		this.tickeCategoryId = tickeCategoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	@Override
	public String toString() {
		return "TicketCategory [tickeCategoryId=" + tickeCategoryId + ", categoryName=" + categoryName + "]";
	}
	
	
	
}
