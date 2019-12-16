package com.danhy989.SpringSecurity.repository;

import com.danhy989.SpringSecurity.model.DAOUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<DAOUser,Integer> {
    DAOUser findByUsername(String username);
}
