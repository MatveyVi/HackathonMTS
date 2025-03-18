package com.example.hacaton;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/users")
public class CameraController {
    private final CameraRepository cameraRepository;

    public CameraController(CameraRepository cameraRepository) {
        this.cameraRepository = cameraRepository;
    }

    @GetMapping("/getCamera")
    public Optional<Camera> getCamera() {
        return cameraRepository.findById("67d99d37f32a763532219368"); // Получаем всех пользователей
    }

    @GetMapping("/{name}")
    public List<Camera> getCamerasByName(@PathVariable String name) {
        return cameraRepository.findByCameraName(name);
    }


}