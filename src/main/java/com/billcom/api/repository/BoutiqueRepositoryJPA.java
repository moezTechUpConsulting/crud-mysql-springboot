package com.billcom.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.billcom.api.beans.Boutique;

@Repository
public interface  BoutiqueRepositoryJPA extends JpaRepository<Boutique, Long> {
	
}
