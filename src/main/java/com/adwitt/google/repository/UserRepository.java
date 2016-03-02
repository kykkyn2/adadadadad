package com.adwitt.google.repository;

import com.adwitt.google.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by PJH on 2016-03-02.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findOneByName(String name);
}
