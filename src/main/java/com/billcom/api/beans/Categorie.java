package com.billcom.api.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "categorie", uniqueConstraints = { @UniqueConstraint(columnNames = "idCategorie") })
public class Categorie {
	@Id
	@GeneratedValue
	private Long idCategorie;

	private String codeCategorie;

	private String Designation;

	@OneToMany(mappedBy = "categorie")
	private List<Article> article;

	public Categorie() {

	}

	public Categorie(Long idCategorie, String codeCategorie, String designation,
			List<com.billcom.api.beans.Article> article) {
		super();
		this.idCategorie = idCategorie;
		this.codeCategorie = codeCategorie;
		Designation = designation;
		this.article = article;
	}

	public Long getidCategorie() {
		return idCategorie;
	}

	public void setidCategorie(Long idCategorie) {
		this.idCategorie = idCategorie;
	}

	public String getCodeCategorie() {
		return codeCategorie;
	}

	public void setCodeCategorie(String codeCategorie) {
		this.codeCategorie = codeCategorie;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public List<Article> getArticle() {
		return article;
	}

	public void setArticle(List<Article> article) {
		this.article = article;
	}

}
