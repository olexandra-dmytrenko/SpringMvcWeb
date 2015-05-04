package com.springapp.mvc;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by olexandra on 03.05.15.
 * Define a Spring repository for the user entity.
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
