package com.projetomongodb.codes.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.projetomongodb.codes.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
