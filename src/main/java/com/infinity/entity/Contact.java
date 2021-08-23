package com.infinity.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="TBL_CONTACTS")
@Data
public class Contact {

	@Id
	@GeneratedValue
	@Column (name="CONTACTID")
	private Integer contactID;
	
	@Column (name="CONTACT_NAME")
	private String contactname;
	
	@Column (name="CONTACT_EMAIL")
	private String contactemail;
	
	@Column (name="CONTACT_PHONENO")
	private Long contactphone;
	
	@Column (name="ACTIVE_SWITCH")
	private Character activeswitch;
	
	@Column (name="CREATED_DATE")
	private LocalDate Createddate;
	
	@Column (name="UPDATED_DATE")
	private LocalDate Updateddate;
}
