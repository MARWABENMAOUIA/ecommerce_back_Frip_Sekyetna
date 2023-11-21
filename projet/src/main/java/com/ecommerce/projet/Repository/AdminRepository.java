package com.ecommerce.projet.Repository;

import com.ecommerce.projet.Entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin,Long> {
Admin findAdminByEmail(String email);
}
