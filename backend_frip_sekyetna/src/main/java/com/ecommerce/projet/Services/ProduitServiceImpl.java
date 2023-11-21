package com.ecommerce.projet.Services;
import com.ecommerce.projet.Entity.Produit;
import com.ecommerce.projet.Repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProduitServiceImpl implements ProduitService {
    @Autowired
    ProduitRepository produitRepository;

    @Override
    public Produit ajouterProduit(Produit produit) {

        System.out.println("Produit reçu pour stockage côté serveur: " + produit.toString());

        return produitRepository.save(produit);
    }
    @Override
    public Produit modifierProduit(Produit produit) {
    return produitRepository.save(produit);

    }

    @Override
    public void supprimerProduit(Long id) {
        produitRepository.deleteById(id);
    }

    @Override
    public List<Produit> afficherProduit() {
        return produitRepository.findAll();
    }

    @Override
    public Optional<Produit> afficherProduitById(Long id) {
        return produitRepository.findById(id);

    }
}
