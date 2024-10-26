package org.example.tp_thymleaf.repository;

import org.example.tp_thymleaf.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
