package com.billcom.api.beans;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "boutique")

public class Boutique {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int boutique_id;
	private String boutique_name;
	private String boutique_region;
	private String boutique_telephone;

	public Boutique() {

	}

	public Boutique(int boutique_id, String boutique_name, String boutique_region, String boutique_telephone) {
		super();
		this.boutique_id = boutique_id;
		this.boutique_name = boutique_name;
		this.boutique_region = boutique_region;
		this.boutique_telephone = boutique_telephone;
	}

	public int getBoutique_id() {
		return boutique_id;
	}

	public void setBoutique_id(int boutique_id) {
		this.boutique_id = boutique_id;
	}

	public String getBoutique_name() {
		return boutique_name;
	}

	public void setBoutique_name(String boutique_name) {
		this.boutique_name = boutique_name;
	}

	public String getBoutique_region() {
		return boutique_region;
	}

	public void setBoutique_region(String boutique_region) {
		this.boutique_region = boutique_region;
	}

	public String getBoutique_telephone() {
		return boutique_telephone;
	}

	public void setBoutique_telephone(String boutique_telephone) {
		this.boutique_telephone = boutique_telephone;
	}

}
