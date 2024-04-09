package com.projetomongodb.codes.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.projetomongodb.codes.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}
