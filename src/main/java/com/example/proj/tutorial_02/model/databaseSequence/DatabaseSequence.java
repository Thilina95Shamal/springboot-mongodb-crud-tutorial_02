package com.example.proj.tutorial_02.model.databaseSequence;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/** NOTE: */
// For the autoincrement we need another collection {string value and an id {to increment the collections accordingly }}
// This is where we store auto-incremented sequence
@Data
@AllArgsConstructor
@NoArgsConstructor
// This can be applied for different Models (Student, Todos, Etc..)
@Document(collection = "database_sequence")
public class DatabaseSequence {

    @Id
    private String id;

    private long seq;
}

