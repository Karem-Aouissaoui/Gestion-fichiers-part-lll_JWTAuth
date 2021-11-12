package com.karem.fichiers.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Type {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idType;
	private String nomType;
	
	@JsonIgnore
	@OneToMany(mappedBy = "type",fetch = FetchType.LAZY)
	private List<Fichier> fichiers;
	
	public Type(String nom) {
		this.nomType = nom;
	}

	@Override
	public String toString() {
		return "Type [idType=" + idType + ", nomType=" + nomType +  "]";
		
	}

	
}
