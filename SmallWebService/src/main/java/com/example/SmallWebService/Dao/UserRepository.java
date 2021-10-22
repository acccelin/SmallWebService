package com.example.SmallWebService.Dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SmallWebService.UserAccount;

public interface UserRepository extends JpaRepository<UserAccount, Long> {

    UserAccount findByUserName(String userName);

    Optional<UserAccount> getByUserName(String userName);
}
