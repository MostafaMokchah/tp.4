package com.mostafa.citoyens.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mostafa.citoyens.entities.Nationalite;
import com.mostafa.citoyens.entities.Citoyen;
import com.mostafa.citoyens.repos.CitoyenRepository;


@Service
public class CitoyenServiceImpl implements CitoyenService{

	@Autowired
	CitoyenRepository citoyenRepository;
	
	@Override
	public Citoyen saveCitoyen(Citoyen p) {
		return citoyenRepository.save(p);
	}

	@Override
	public Citoyen updateCitoyen(Citoyen p) {
		return citoyenRepository.save(p);
	}

	@Override
	public void deleteCitoyen(Citoyen p) {
		citoyenRepository.delete(p);
		
	}

	@Override
	public void deleteCitoyenById(Long id) {
		citoyenRepository.deleteById(id);
		
	}

	@Override
	public Citoyen getCitoyen(Long id) {
		return citoyenRepository.findById(id).get();
	}

	@Override
	public List<Citoyen> getAllCitoyens() {
		
		return citoyenRepository.findAll();
	}

	@Override
	public List<Citoyen> findByNomCitoyen(String nom) {
		
		return citoyenRepository.findByNomCitoyen(nom);
	}

	@Override
	public List<Citoyen> findByNomCitoyenContains(String nom) {
		
		return citoyenRepository.findByNomCitoyenContains(nom);
	}

	@Override
	public List<Citoyen> findByNomPrix(String nom, Double prix) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Citoyen> findByNationalite(Nationalite nationalite) {
		
		return citoyenRepository.findByNationalite(nationalite);
	}

	@Override
	public List<Citoyen> findByNationaliteIdCat(Long id) {
	
		return citoyenRepository.findByNationaliteIdCat(id);
	}

	@Override
	public List<Citoyen> findByOrderByNomCitoyenAsc() {
		
		return citoyenRepository.findByOrderByNomCitoyenAsc();
	}

	@Override
	public List<Citoyen> trierCitoyensNomsPrix() {
	
		return citoyenRepository.trierCitoyensNomsPrix();
	}
	
	

}
