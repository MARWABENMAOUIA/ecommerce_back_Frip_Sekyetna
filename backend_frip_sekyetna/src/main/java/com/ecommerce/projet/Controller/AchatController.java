package com.ecommerce.projet.Controller;

import com.ecommerce.projet.Beans.CommandeRq;
import com.ecommerce.projet.Entity.Achat;
import com.ecommerce.projet.Services.AchatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping(value ="/achat")
public class AchatController {
        @Autowired
        AchatService achatService;

     @RequestMapping(method = RequestMethod.POST)
     public Achat ajouterAchat(@RequestBody Achat achat) {
         return achatService.ajouterachat(achat);
      }




    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Achat> listAllAchats() {
        return achatService.ListAchat();
    }
      // @RequestMapping("Get-All-ByIdClient/{id}")
       //public List<Achat> ListAchatByClient(@PathVariable Long id) {
         //   return achatService.ListProduitByClient(id);
        //}

        @RequestMapping(value = "/{id}", method = RequestMethod.GET)
        public Optional<Achat> GetAchatById(@PathVariable Long id) {
            Optional<Achat> achat = achatService.getAchatById(id);
            return achat;
        }
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE )
//RequestBody:tekhdh vrb tabaathhom lel contrl kn sar c bon snn erreur
    public void supprimerProduit(@PathVariable("id") long id){
        achatService.supprimerAchat(id);
    }

}