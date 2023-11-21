package com.ecommerce.projet.Repository;

import com.ecommerce.projet.Entity.Admin;
import com.ecommerce.projet.Entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact,Long> {
}
