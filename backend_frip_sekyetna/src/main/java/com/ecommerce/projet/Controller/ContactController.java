package com.ecommerce.projet.Controller;

import com.ecommerce.projet.Entity.Admin;
import com.ecommerce.projet.Entity.Contact;
import com.ecommerce.projet.Repository.ContactRepository;
import com.ecommerce.projet.Services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@CrossOrigin("*")
@RequestMapping(value ="/contact")
public class ContactController {
    @Autowired
    private ContactRepository contactRepository;
    @Autowired
    ContactService contactService;
    @RequestMapping(method = RequestMethod.POST )

    public Contact ajoutContact(@RequestBody Contact contact){
        return contactService.ajouterContact(contact);
    }


    /////////////////////////////
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    //RequestBody:tekhdh vrb tabaathhom lel contrl kn sar c bon snn erreur
    public void supprimerContact(@PathVariable("id") long id) {
        contactService.supprimerContact(id);
    }

///////////////
@RequestMapping(method = RequestMethod.GET )
//RequestBody:tekhdh vrb tabaathhom lel contrl kn sar c bon snn erreur
public List<Contact> afficherContact(){
    return contactService.afficherContact();

}
}