package com.example.hacaton;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface CameraRepositoryI extends MongoRepository<Camera, ObjectId> {
    Optional<Camera> findById(ObjectId id);
}