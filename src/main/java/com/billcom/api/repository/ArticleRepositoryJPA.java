package com.billcom.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.billcom.api.beans.Article;
@Repository
public interface ArticleRepositoryJPA extends JpaRepository<Article, Long> {


}



