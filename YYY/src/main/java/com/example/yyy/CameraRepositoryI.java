package com.example.yyy;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface CameraRepositoryI extends MongoRepository<Camera, ObjectId> {
    Optional<Camera> findById(ObjectId id);
}