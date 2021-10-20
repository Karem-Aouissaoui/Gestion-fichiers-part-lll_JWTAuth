package com.karem.fichiers.service;

import java.util.List;

import com.karem.fichiers.entities.Fichier;
import com.karem.fichiers.entities.Type;

public interface FichierService {
	Fichier saveFichier(Fichier f);
	Fichier updateFichier(Fichier f);
	void deleteFichier(Fichier f);
	void deleteFichierById(Long id);
	Fichier getFichier(Long id);
	List<Fichier> getAllFichiers();
	List<Fichier> findByNomFichier(String nom);
	List<Fichier> findByNomFichierContains(String nom);
	List<Fichier> findByNomTaille (String nom, Double taille);
	List<Fichier> findByType (Type type);
	List<Fichier> findByTypeIdType(Long id);
	List<Fichier> findByOrderByNomFichierAsc();
	List<Fichier> trierFichiersNomsTaille();
}
