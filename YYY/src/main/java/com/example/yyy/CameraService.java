package com.example.yyy;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CameraService {

private final CameraRepositoryI cameraRepositoryI;

    public CameraService(CameraRepositoryI cameraRepositoryI) {
        this.cameraRepositoryI = cameraRepositoryI;
    }
//
//    public Optional<Camera> findById(String id) {
//        return cameraRepositoryI.findById(id);
//    }

    public Optional<Camera> findById(String id) {
        try {
            ObjectId objectId = new ObjectId(id);
            return cameraRepositoryI.findById(objectId);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid ID format: " + id);
            return Optional.empty();
        }
    }
 public List<Camera> findAll() {
        return cameraRepositoryI.findAll();
 }
}
