package com.mostafa.citoyens.service;

import java.util.List;

import com.mostafa.citoyens.entities.Nationalite;
import com.mostafa.citoyens.entities.Citoyen;

public interface CitoyenService {
	Citoyen saveCitoyen(Citoyen p);
	Citoyen updateCitoyen(Citoyen p);
	void deleteCitoyen(Citoyen p);
	void deleteCitoyenById(Long id);
	Citoyen getCitoyen(Long id);
	List<Citoyen> getAllCitoyens();
	List<Citoyen> findByNomCitoyen(String nom);
	List<Citoyen> findByNomCitoyenContains(String nom);
	List<Citoyen> findByNomPrix (String nom, Double prix);
	List<Citoyen> findByNationalite (Nationalite nationalite);
	List<Citoyen> findByNationaliteIdCat(Long id);
	List<Citoyen> findByOrderByNomCitoyenAsc();
	List<Citoyen> trierCitoyensNomsPrix();

}
