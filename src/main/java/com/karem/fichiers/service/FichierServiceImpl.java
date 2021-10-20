package com.karem.fichiers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karem.fichiers.entities.Fichier;
import com.karem.fichiers.entities.Type;
import com.karem.fichiers.repos.FichierRepository;

@Service
public class FichierServiceImpl implements FichierService {

	@Autowired
	private FichierRepository fichierRepository;
	
	@Override
	public Fichier saveFichier(Fichier f) {
		return fichierRepository.save(f) ;
	}

	@Override
	public Fichier updateFichier(Fichier f) {
		return fichierRepository.save(f);
	}

	@Override
	public void deleteFichier(Fichier f) {
		fichierRepository.delete(f);
		
	}

	@Override
	public void deleteFichierById(Long id) {
		fichierRepository.deleteById(id);
		
	}

	@Override
	public Fichier getFichier(Long id) {
		return fichierRepository.findById(id).get();
	}

	@Override
	public List<Fichier> getAllFichiers() {
		return fichierRepository.findAll();
	}

	@Override
	public List<Fichier> findByNomFichier(String nom) {
		return fichierRepository.findByNomFichier(nom);
	}

	@Override
	public List<Fichier> findByNomFichierContains(String nom) {
		return fichierRepository.findByNomFichierContains(nom);
	}

	@Override
	public List<Fichier> findByNomTaille(String nom, Double taille) {
		return fichierRepository.findByNomTaille(nom, taille);
	}

	@Override
	public List<Fichier> findByType(Type type) {
		return fichierRepository.findByType(type);
	}

	@Override
	public List<Fichier> findByTypeIdType(Long id) {
		return fichierRepository.findByTypeIdType(id);
	}

	@Override
	public List<Fichier> findByOrderByNomFichierAsc() {
		return fichierRepository.findByOrderByNomFichierAsc();
	}

	@Override
	public List<Fichier> trierFichiersNomsTaille() {
		return fichierRepository.trierFichiersNomsTaille();
	}

}
