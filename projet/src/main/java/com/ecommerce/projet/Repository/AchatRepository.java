package com.ecommerce.projet.Repository;

import com.ecommerce.projet.Entity.Achat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AchatRepository extends JpaRepository<Achat,Long> {
  //  List<Achat> findByClientId(Long id);
   // List<Achat> findByValide(boolean valide);
}
