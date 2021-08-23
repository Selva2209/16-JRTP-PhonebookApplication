package com.infinity.service;

import java.util.List;

import com.infinity.entity.Contact;

public interface ContactService {

	public boolean savecontact(Contact contact);
	
	public List<Contact> getAllContact();
	
	Contact getContactByID(Integer cid);
	
	public boolean deleteContactById(Integer cid);
}
