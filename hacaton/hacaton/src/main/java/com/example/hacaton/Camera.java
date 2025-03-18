package com.example.hacaton;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "cameras") // Имя коллекции в MongoDB
public class Camera {
    @Id
    private Long id;  // Уникальный идентификатор
    private String cameraName;
    private Integer quantity;
}