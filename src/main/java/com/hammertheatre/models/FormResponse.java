package com.hammertheatre.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// This is the Domain Object for the application
// Also the "form-backing object" for home.jsp

// https://docs.oracle.com/javaee/6/tutorial/doc/bnbqa.html (from JPA)
@Entity
@Table(name="Form_Responses") 
public class FormResponse {
	
	@Id
	@Column(name="ID") 
	@GeneratedValue(strategy=GenerationType.AUTO) // Generates ID using pre-defined JPA strategy 
	private Long id; // Primary key to identify instance of this entity class

	@Column(name = "Requestor_Name")
	private String requestorName;

	@Column(name = "Requestor_Email")
	private String requestorEmail;

	@Column(name = "Marketing_Area")
	private String marketingArea;

	@Column(name = "Ticket_Description")
	private String ticketDescription;

	public FormResponse() {
		
	}
	
	// Constructors 
	public FormResponse(String requestorName, String requestorEmail,
			String marketingArea, String ticketDescription) {
		super();
		this.requestorName = requestorName;
		this.requestorEmail = requestorEmail;
		this.marketingArea = marketingArea;
		this.ticketDescription = ticketDescription;
	}

	// Getter & Setter Methods
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getRequestorName() {
		return requestorName;
	}

	public void setRequestorName(String requestorName) {
		this.requestorName = requestorName;
	}

	public String getRequestorEmail() {
		return requestorEmail;
	}

	public void setRequestorEmail(String requestorEmail) {
		this.requestorEmail = requestorEmail;
	}

	public String getMarketingArea() {
		return marketingArea;
	}

	public void setMarketingArea(String marketingArea) {
		this.marketingArea = marketingArea;
	}

	public String getTicketDescription() {
		return ticketDescription;
	}

	public void setTicketDescription(String ticketDescription) {
		this.ticketDescription = ticketDescription;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((marketingArea == null) ? 0 : marketingArea.hashCode());
		result = prime * result
				+ ((requestorEmail == null) ? 0 : requestorEmail.hashCode());
		result = prime * result
				+ ((requestorName == null) ? 0 : requestorName.hashCode());
		result = prime
				* result
				+ ((ticketDescription == null) ? 0 : ticketDescription
						.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FormResponse other = (FormResponse) obj;
		if (marketingArea == null) {
			if (other.marketingArea != null)
				return false;
		} else if (!marketingArea.equals(other.marketingArea))
			return false;
		if (requestorEmail == null) {
			if (other.requestorEmail != null)
				return false;
		} else if (!requestorEmail.equals(other.requestorEmail))
			return false;
		if (requestorName == null) {
			if (other.requestorName != null)
				return false;
		} else if (!requestorName.equals(other.requestorName))
			return false;
		if (ticketDescription == null) {
			if (other.ticketDescription != null)
				return false;
		} else if (!ticketDescription.equals(other.ticketDescription))
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return "[requestorName=" + requestorName 
				+ ", requestorEmail=" + requestorEmail + ", marketingArea="
				+ marketingArea + ", ticketDescription=" + ticketDescription
				+ "]";
	}
	
	
	
}
