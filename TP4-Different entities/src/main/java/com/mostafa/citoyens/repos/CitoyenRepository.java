package com.mostafa.citoyens.repos;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.mostafa.citoyens.entities.Nationalite;
import com.mostafa.citoyens.entities.Citoyen;

@RepositoryRestResource(path = "rest")
public interface CitoyenRepository extends JpaRepository<Citoyen, Long> {
	
	List<Citoyen> findByNomCitoyen(String nom);
	List<Citoyen> findByNomCitoyenContains(String nom);
	
	/*@Query("select p from Citoyen p where p.nomCitoyen like %?1 and p.prixCitoyen > ?2")
	List<Citoyen> findByNomPrix (String nom, Double prix);*/
	
	@Query("select p from Citoyen p where p.nomCitoyen like %:nom and p.prixCitoyen > :prix")
	List<Citoyen> findByNomPrix (@Param("nom") String nom,@Param("prix") Double prix);

	@Query("select p from Citoyen p where p.categorie = ?1")
	List<Citoyen> findByNationalite (Nationalite categorie);
	
	List<Citoyen> findByNationaliteIdCat(Long id);
	
	List<Citoyen> findByOrderByNomCitoyenAsc();
	
	@Query("select p from Citoyen p order by p.nomCitoyen ASC, p.prixCitoyen DESC")
	List<Citoyen> trierCitoyensNomsPrix ();

}
