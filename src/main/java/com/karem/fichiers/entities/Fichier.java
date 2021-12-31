package com.karem.fichiers.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Fichier {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFichier;
	private String nomFichier;
	private Date dateCreation;
	private Date dateModification;
	private Double taille;
	@ManyToOne
	private Type type;
}
