package com.ecommerce.projet.Services;

import com.ecommerce.projet.Entity.Admin;
import com.ecommerce.projet.Entity.Contact;

import java.util.List;
import java.util.Optional;

public interface ContactService {
    Contact ajouterContact(Contact contact);

    void supprimerContact(Long id);
    List<Contact>afficherContact();


}
