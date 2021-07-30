package com.billcom.api.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.billcom.api.beans.Client;

@Repository
public interface ClientRepositoryJPA extends JpaRepository<Client, Long> {
	
}
