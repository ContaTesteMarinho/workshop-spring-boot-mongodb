package com.feliphe.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.feliphe.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
