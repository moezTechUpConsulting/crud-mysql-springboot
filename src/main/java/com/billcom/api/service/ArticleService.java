package com.billcom.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billcom.api.beans.Article;
import com.billcom.api.repository.ArticleRepositoryJPA;

@Service
public class ArticleService {
	@Autowired
	private ArticleRepositoryJPA repo;
	
	public List<Article> listAll() {
		return repo.findAll();
	}
	
	public void save(Article Article) {
		repo.save(Article);
	}
	
	public Article get(long id) {
		return repo.findById(id).get();
	}
	
	public void delete(long id) {
		repo.deleteById(id);
	}
}

