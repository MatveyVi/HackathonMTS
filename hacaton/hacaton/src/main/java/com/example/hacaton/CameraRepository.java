package com.example.hacaton;

import com.example.hacaton.Camera;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CameraRepository extends MongoRepository<Camera, String> {
    // Можно добавить кастомные запросы, например, поиск по имени    List<Camera> findByCameraName(String name);
}