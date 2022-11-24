package com.mostafa.citoyens.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mostafa.citoyens.entities.Citoyen;
import com.mostafa.citoyens.service.CitoyenService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class CitoyenRESTController {
	
	@Autowired
	CitoyenService citoyenService;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Citoyen> getAllCitoyens()
	{
		return citoyenService.getAllCitoyens();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Citoyen getCitoyenById(@PathVariable("id") Long id) {
		return citoyenService.getCitoyen(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Citoyen createCitoyen(@RequestBody Citoyen citoyen) {
			return citoyenService.saveCitoyen(citoyen);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Citoyen updateCitoyen(@RequestBody Citoyen citoyen) {
		return citoyenService.updateCitoyen(citoyen);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteCitoyen(@PathVariable("id") Long id)
	{
			citoyenService.deleteCitoyenById(id);
	}
	
	@RequestMapping(value="/prodscat/{idCat}",method = RequestMethod.GET)
	public List<Citoyen> getCitoyensByCatId(@PathVariable("idCat") Long idCat) {
		return citoyenService.findByNationaliteIdCat(idCat);
	}

	
	
	


}
