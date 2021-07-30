package com.billcom.api.beans;


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "article", uniqueConstraints = { @UniqueConstraint(columnNames = "idArticle") })
public class Article {

	@Id
	@GeneratedValue
	private long idArticle;
	
	private String codeArticle;

	private String designation;

	private BigDecimal prixUnitaireHT;

	private BigDecimal prixTVA;

	private BigDecimal prixUnitaireTTC;
	

	private String photos;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(	name = "article_boutique", 
				joinColumns = @JoinColumn(name = "idArticle"), 
				inverseJoinColumns = @JoinColumn(name = "boutique_id"))
	private Set<Boutique> boutiques = new HashSet<>();

	@ManyToOne
	@JoinColumn(name = "idCategorie")
	private Categorie categorie;

	public Article() {
		
	}
	public Article(Long idArticle, String codeArticle, String designation, BigDecimal prixUnitaireHT,
			BigDecimal prixTVA, BigDecimal prixUnitaireTTC, String photos, Categorie categorie) {
		super();
		this.idArticle = idArticle;
		this.codeArticle = codeArticle;
		this.designation = designation;
		this.prixUnitaireHT = prixUnitaireHT;
		this.prixTVA = prixTVA;
		this.prixUnitaireTTC = prixUnitaireTTC;
		this.photos = photos;
		this.categorie = categorie;
	}

	public Article(long l, String string, String string2, BigDecimal d, BigDecimal e, BigDecimal f, String string3) {
		
	}
	public Long getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(Long idArticle) {
		this.idArticle = idArticle;
	}

	public String getCodeArticle() {
		return codeArticle;
	}

	public void setCodeArticle(String codeArticle) {
		this.codeArticle = codeArticle;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public BigDecimal getPrixUnitaireHT() {
		return prixUnitaireHT;
	}

	public void setPrixUnitaireHT(BigDecimal prixUnitaireHT) {
		this.prixUnitaireHT = prixUnitaireHT;
	}

	public BigDecimal getPrixTVA() {
		return prixTVA;
	}

	public void setPrixTVA(BigDecimal prixTVA) {
		this.prixTVA = prixTVA;
	}

	public BigDecimal getPrixUnitaireTTC() {
		return prixUnitaireTTC;
	}

	public void setPrixUnitaireTTC(BigDecimal prixUnitaireTTC) {
		this.prixUnitaireTTC = prixUnitaireTTC;
	}

	public String getPhotos() {
		return photos;
	}

	public void setPhotos(String photos) {
		this.photos = photos;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}


}
