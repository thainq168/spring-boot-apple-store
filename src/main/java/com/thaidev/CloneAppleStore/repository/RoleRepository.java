package com.thaidev.CloneAppleStore.repository;

import com.thaidev.CloneAppleStore.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

}
