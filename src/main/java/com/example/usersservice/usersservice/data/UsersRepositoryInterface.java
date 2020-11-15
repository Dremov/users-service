package com.example.usersservice.usersservice.data;

import org.springframework.data.repository.CrudRepository;

public interface UsersRepositoryInterface extends CrudRepository<UserEntity, Long> {
    UserEntity findByEmail(String email);
}
