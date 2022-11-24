package com.mostafa.citoyens.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomProd", types = { Citoyen.class })
public interface CitoyenProjection {
	public String getNomCitoyen();

}
