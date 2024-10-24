package com.example.proj.tutorial_03.model.databaseSequence;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "database_sequence_tut3")
public class DatabaseSequence {

    @Id
    private String id;

    private String seq;
}
