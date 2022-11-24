package com.mostafa.citoyens.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Citoyen {	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idCitoyen;
	private String nomCitoyen;
	private Double prixCitoyen;
	private Date dateCreation;
	
	@ManyToOne
	private Nationalite nationalite;

	public Citoyen() {
		super();
	}
	
	
	public Citoyen(String nomCitoyen, Double prixCitoyen, Date dateCreation) {
		super();
		this.nomCitoyen = nomCitoyen;
		this.prixCitoyen = prixCitoyen;
		this.dateCreation = dateCreation;
	}


	public Long getIdCitoyen() {
		return idCitoyen;
	}
	public void setIdCitoyen(Long idCitoyen) {
		this.idCitoyen = idCitoyen;
	}
	public String getNomCitoyen() {
		return nomCitoyen;
	}
	public void setNomCitoyen(String nomCitoyen) {
		this.nomCitoyen = nomCitoyen;
	}
	public Double getPrixCitoyen() {
		return prixCitoyen;
	}
	public void setPrixCitoyen(Double prixCitoyen) {
		this.prixCitoyen = prixCitoyen;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}


	@Override
	public String toString() {
		return "Citoyen [idCitoyen=" + idCitoyen + ", nomCitoyen=" + nomCitoyen + ", prixCitoyen=" + prixCitoyen
				+ ", dateCreation=" + dateCreation + "]";
	}


	public Nationalite getNationalite() {
		return nationalite;
	}


	public void setNationalite(Nationalite nationalite) {
		this.nationalite = nationalite;
	}
	
	

}
