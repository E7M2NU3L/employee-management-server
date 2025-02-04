package com.etrack.ems.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etrack.ems.entities.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Integer> {
    Optional<UserModel> findbyEmail(String email);
}
