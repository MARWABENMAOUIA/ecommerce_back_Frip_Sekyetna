package com.ecommerce.projet.Repository;

import com.ecommerce.projet.Entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
}
