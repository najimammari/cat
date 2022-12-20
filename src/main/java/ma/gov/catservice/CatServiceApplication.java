package ma.gov.catservice;

import ma.gov.catservice.dao.ProduitRepository;
import ma.gov.catservice.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class CatServiceApplication implements CommandLineRunner {

    @Autowired
    private ProduitRepository produitRepository;
    @Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;
    public static void main(String[] args) {
        SpringApplication.run(CatServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repositoryRestConfiguration.exposeIdsFor(Produit.class);
//        produitRepository.save(new Produit(null,"Ordinateur LX 45",2657,10));
//        produitRepository.save(new Produit(null,"Imprimante HP",3764,20));
//        produitRepository.save(new Produit(null,"Smart phone sumsung S9",9000,16));

        produitRepository.findAll().forEach(System.out::println);
    }
}
