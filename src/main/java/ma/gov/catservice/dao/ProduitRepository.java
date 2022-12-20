package ma.gov.catservice.dao;

import ma.gov.catservice.entities.Produit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
@CrossOrigin("")
@RepositoryRestResource
public interface ProduitRepository extends JpaRepository<Produit,Long> {
    @RestResource(path="/byDesignation")
    public List<Produit> findByDesignationContains(String des);

    @RestResource(path="/byDesignationPage")
    public Page<Produit> findByDesignationContains(String des, Pageable pageable);
}
