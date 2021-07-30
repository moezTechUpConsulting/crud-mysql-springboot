package com.billcom.api.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.billcom.api.beans.Categorie;

@Repository
public interface CategorieRepositoryJPA extends JpaRepository<Categorie, Long> {
	
}
