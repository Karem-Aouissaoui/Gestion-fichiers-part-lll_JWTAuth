package com.karem.fichiers;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.karem.fichiers.entities.Fichier;
import com.karem.fichiers.entities.Type;
import com.karem.fichiers.repos.FichierRepository;
import com.karem.fichiers.repos.TypeRepository;

@SpringBootTest
class FichiersApplicationTests {

	@Autowired
	private FichierRepository fichierRepository;
	@Autowired
	private TypeRepository typeRepository;
	
	/*
	@Test
	public void testCreateType() {
		Type t = new Type("bin");
		typeRepository.save(t);
	}//done
	
	@Test
	public void testCreateFichier() {
		Type type = new Type();
		type.setIdType(1L);
		Fichier fc = new Fichier(null,"new test",new Date(),new Date(),16.205,type);
		fichierRepository.save(fc);
	}//done
	
	@Test
	public void testFindFichier() {
		Fichier f = fichierRepository.findById(4L).get();
		System.out.println(f);
	}//done

	@Test 
	public void testUpdateFichier() {
		Fichier f = fichierRepository.findById(1L).get();
		f.setNomFichier("testValidé");
		fichierRepository.save(f);
	}//done 
	
	@Test 
	public void testDeleteFichier() {
		fichierRepository.deleteById(5L);
	}
	*/
	@Test
	public void testListerTousFichiers() {
		List<Fichier> fichiers = fichierRepository.findAll();
		for (Fichier f : fichiers)
			System.out.println(f);
	}//done
	/*
	@Test
	public void testFindByNomFichier() {
		List<Fichier> fichiers = fichierRepository.findByNomFichier("myfile");
		for(Fichier f : fichiers)
			System.out.println(f);
	}//done
	
	@Test
	//en utilisant @Query
	public void testFindByNom() {
		List<Fichier> fichiers = fichierRepository.findByNom("f%");
		for (Fichier f:fichiers)
			System.out.println(f);
	}//done
	
	@Test
	public void testFindByNomFichierContains() {
		List<Fichier> fichiers = fichierRepository.findByNomFichierContains("f");
		for(Fichier f : fichiers)
			System.out.println(f);
	}//done
	
	@Test
	public void testFindByNomTaille() {
		List<Fichier> fichiers = fichierRepository.findByNomTaille("",10.0);
		for (Fichier f:fichiers)
			System.out.println(f);
	}//done

	@Test
	public void testFindByType() {
		Type type = new Type();
		type.setIdType(1L);
		List<Fichier> fichiers = fichierRepository.findByType(type);
		for (Fichier f : fichiers)
			System.out.println(f);
		
	}//done
	
	@Test
	public void findByTypeIdType() {
		List<Fichier> fichiers = fichierRepository.findByTypeIdType(4L);
		for (Fichier f : fichiers)
			System.out.println(f);
	}//done
	
	@Test 
	public void testFindByOrderByNomFichierAsc() {
		List<Fichier> fichiers = fichierRepository.findByOrderByNomFichierAsc();
				for (Fichier f : fichiers)
					System.out.println(f);
	}//done
	
	@Test
	public void testTrierFichiersNomsTaille() {
		List<Fichier> fichiers = fichierRepository.trierFichiersNomsTaille();
		for (Fichier f : fichiers)
			System.out.println(f);
	}//done
	*/
}
