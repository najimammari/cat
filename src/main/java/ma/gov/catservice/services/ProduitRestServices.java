package ma.gov.catservice.services;

import ma.gov.catservice.dao.ProduitRepository;
import ma.gov.catservice.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProduitRestServices {
    @Autowired
    private ProduitRepository produitRepository;

    @GetMapping(value = "/listProduits")
    public List<Produit> listProduits(){
        return produitRepository.findAll();
    }

    @GetMapping(value = "/listProduits/{id}")
    public Produit produits(@PathVariable(name = "id") Long id){
        return produitRepository.findById(id).get();
    }
}
