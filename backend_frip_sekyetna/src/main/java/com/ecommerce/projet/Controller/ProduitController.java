package com.ecommerce.projet.Controller;

import com.ecommerce.projet.Entity.Produit;
import com.ecommerce.projet.Repository.ProduitRepository;
import com.ecommerce.projet.Services.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.List;


@RestController
@CrossOrigin("*")
@RequestMapping(value = "/produit")
public class ProduitController {
    @Autowired
    private ProduitRepository produitRepository;

    @Autowired
    ProduitService produitService;
    @RequestMapping(method = RequestMethod.POST)
    public Produit ajoutProduit(@RequestBody Produit produit) {
        System.out.println("Produit reçu côté serveur: " + produit.toString());
        return produitService.ajouterProduit(produit);
    }


    /////////////////////////////
    @RequestMapping(value = "/{id}" ,method = RequestMethod.PUT)
    public Produit modifierProduit(@PathVariable("id")Long id, @RequestBody Produit produit){


        Produit newProduit = produitService.modifierProduit(produit);
        return newProduit;
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE )
//RequestBody:tekhdh vrb tabaathhom lel contrl kn sar c bon snn erreur
    public void supprimerProduit(@PathVariable("id") long id){
        produitService.supprimerProduit(id);

    }
    @RequestMapping(method = RequestMethod.GET )
//RequestBody:tekhdh vrb tabaathhom lel contrl kn sar c bon snn erreur
    public List<Produit> afficherProduit(){
        return produitService.afficherProduit();

    }
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Produit> getProduitById(@PathVariable("id") Long id) {
        Optional<Produit> produit = produitService.afficherProduitById(id);
        return produit.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }


///////////////

}
