package com.ecommerce.projet.Services;

import com.ecommerce.projet.Entity.Admin;
import com.ecommerce.projet.Entity.Produit;

import java.util.List;
import java.util.Optional;

public interface ProduitService {
    Produit ajouterProduit(Produit produit);
    Produit modifierProduit(Produit produit);

    void supprimerProduit(Long id);
    List<Produit> afficherProduit();
    Optional<Produit> afficherProduitById(Long id);
}
