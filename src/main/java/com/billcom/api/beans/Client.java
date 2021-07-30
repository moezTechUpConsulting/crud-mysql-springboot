package com.billcom.api.beans;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table (name="client")
public class Client {


	
@Id
@GeneratedValue
private int client_id;
private String client_nom;
private String client_région;
private String client_télephone;

@Enumerated(EnumType.STRING)
private ClientCategorie client_categorie;

private int pointCumulé;

public Client() {
	
}

public Client(int client_id, String client_nom, String client_région, String client_télephone,
		ClientCategorie client_categorie, int pointCumulé) {
	super();
	this.client_id = client_id;
	this.client_nom = client_nom;
	this.client_région = client_région;
	this.client_télephone = client_télephone;
	this.client_categorie = client_categorie;
	this.pointCumulé = pointCumulé;
}

public int getClient_id() {
	return client_id;
}

public void setClient_id(int client_id) {
	this.client_id = client_id;
}

public String getClient_nom() {
	return client_nom;
}

public void setClient_nom(String client_nom) {
	this.client_nom = client_nom;
}

public String getClient_région() {
	return client_région;
}

public void setClient_région(String client_région) {
	this.client_région = client_région;
}

public String getClient_télephone() {
	return client_télephone;
}

public void setClient_télephone(String client_télephone) {
	this.client_télephone = client_télephone;
}

public ClientCategorie getClient_categorie() {
	return client_categorie;
}

public void setClient_categorie(ClientCategorie client_categorie) {
	this.client_categorie = client_categorie;
}

public int getPointCumulé() {
	return pointCumulé;
}

public void setPointCumulé(int pointCumulé) {
	this.pointCumulé = pointCumulé;
}






}
