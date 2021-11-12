package com.karem.fichiers.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.karem.fichiers.entities.Fichier;
import com.karem.fichiers.service.FichierService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class FichierRESTController {
	@Autowired
	FichierService fichierService;
	
	@RequestMapping(value="/all",method = RequestMethod.GET)
	public List<Fichier> getAllFichiers() {
		return fichierService.getAllFichiers();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Fichier getFichierById(@PathVariable("id") Long id) {
		return fichierService.getFichier(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Fichier createFichier(@RequestBody Fichier fichier) {
		return fichierService.saveFichier(fichier);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Fichier updateFichier(@RequestBody Fichier fichier) {
		return fichierService.updateFichier(fichier);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteFichier(@PathVariable("id") Long id){
		fichierService.deleteFichierById(id);
	}
	
	@RequestMapping(value="/fctype/{idType}",method = RequestMethod.GET)
	public List<Fichier> getFichiersByTypeId(@PathVariable("idType") Long idType) {
		return fichierService.findByTypeIdType(idType);
	}
}
