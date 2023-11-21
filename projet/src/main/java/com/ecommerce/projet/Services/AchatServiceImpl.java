package com.ecommerce.projet.Services;

import com.ecommerce.projet.Beans.CommandeRq;
import com.ecommerce.projet.Entity.Achat;
import com.ecommerce.projet.Entity.Admin;
import com.ecommerce.projet.Entity.Produit;
import com.ecommerce.projet.Repository.AchatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AchatServiceImpl implements AchatService {

    @Autowired
    ProduitService produitService;

    @Autowired
    AchatRepository achatRepository;
    @Override
    public Achat ajouterachat(Achat achat) {
        return achatRepository.save(achat);
    }
   /** @Override
    public Achat ajouterachat(CommandeRq commandeRq) {
        Optional<Produit>produit=produitService.afficherProduitById(commandeRq.getIdProduit());
        if (produit.isPresent()){
            Achat achat =new Achat();
            achat.setProduit(produit.get());

            return achatRepository.save(achat);

        }
        else {
            return null ;
        }

    }

   // @Override
    //public List<Achat> ListProduitByClient(Long id) {
       // return achatRepository.findByClientId(id);
    //}



   // @Override

   public void validerAchats(List<Long> achatIds) {
        for (Long achatId : achatIds) {
            Optional<Achat> achat = achatRepository.findById(achatId);
            if (achat.isPresent()) {
                Achat achatToUpdate = achat.get();
                achatToUpdate.setValide(true);
                achatRepository.save(achatToUpdate);
            }
        }
    }




    @Override
    public List<Achat> getAchatsValides() {

        return achatRepository.findByValide(true); // Supposons que vous avez un repository nommé achatRepository
    }**/
    @Override
    public List<Achat> ListAchat() {
        return achatRepository.findAll();
    }

    @Override
    public Optional<Achat> getAchatById(Long id) {
        return achatRepository.findById(id);
    }

   // @Override
    //public List<Achat> ListProduitByClient(Long id) {
        //return achatRepository.findByClientId(id);
   // }
    @Override
    public void supprimerAchat(Long id) {
    achatRepository.deleteById(id);
   }


}