package com.thaidev.CloneAppleStore.service.impl;

import com.thaidev.CloneAppleStore.model.Role;
import com.thaidev.CloneAppleStore.repository.RoleRepository;
import com.thaidev.CloneAppleStore.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleRepository roleRepository;

    public List<Role> getAllRole() {
        return roleRepository.findAll();
    }

    public Optional<Role> findRoleById(int id){
        return roleRepository.findById(id);
    }

}
