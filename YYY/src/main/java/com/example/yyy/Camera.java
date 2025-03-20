package com.example.yyy;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(collection = "cameras") // Имя коллекции в MongoDB
public class Camera {
    @Id
    private Long    id;  // Уникальный идентификатор
    private String CameraName;
    @Field("quantity")
    private Integer quantity;

}