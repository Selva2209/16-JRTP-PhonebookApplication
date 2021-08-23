package com.infinity.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infinity.entity.Contact;

public interface repository extends JpaRepository<Contact, Serializable>{

}
