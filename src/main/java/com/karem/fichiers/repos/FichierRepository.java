package com.karem.fichiers.repos;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.karem.fichiers.entities.Fichier;
import com.karem.fichiers.entities.Type;

@RepositoryRestResource(path = "rest")
public interface FichierRepository extends JpaRepository<Fichier, Long> {
	List<Fichier> findByNomFichier(String nom);
	List<Fichier> findByNomFichierContains(String nom);
	
	@Query("select f from Fichier f where f.nomFichier like %?1")
	List<Fichier> findByNom (@Param("nomFichier") String nom) ;
	
	@Query("select f from Fichier f where f.nomFichier like %?1 and f.taille > ?2")
	List<Fichier> findByNomTaille (@Param("nomFichier") String nom, @Param("taille") Double taille);
	
	@Query("select f from Fichier f where f.type = ?1")
	List<Fichier> findByType (@Param("type") Type type) ;
	
	List<Fichier> findByTypeIdType(Long id);
	
	List<Fichier> findByOrderByNomFichierAsc();
	
	@Query("select f from Fichier f order by f.nomFichier ASC, f.taille DESC")
	List<Fichier> trierFichiersNomsTaille ();
	
}
