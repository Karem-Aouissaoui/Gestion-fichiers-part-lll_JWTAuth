package com.karem.fichiers.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomFichier", types = { Fichier.class })
public interface FichierProjection {
	public String getNomFichier();
}
