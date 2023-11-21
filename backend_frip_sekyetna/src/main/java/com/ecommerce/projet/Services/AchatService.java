package com.ecommerce.projet.Services;

import com.ecommerce.projet.Beans.CommandeRq;
import com.ecommerce.projet.Entity.Achat;

import java.util.List;
import java.util.Optional;

public interface AchatService {
    Achat ajouterachat (Achat achat );
    List<Achat>ListAchat();
   // List<Achat>getAchatsValides();
    Optional<Achat>getAchatById(Long id);
    //List <Achat>ListProduitByClient(Long id);
    void supprimerAchat(Long id);
  //  void validerAchats(List<Long> achatIds);
}
