package com.example.proj.tutorial_02.service.sequenceGeneratorService;

import com.example.proj.tutorial_02.model.databaseSequence.DatabaseSequence;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.Objects;

import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

// Note: This class is use for auto-increment in MongoDB, most likely to until.general package
@Service
public class SequenceGeneratorService {
    // Note, Method :
    // findAndModify ---> find a document and modify it.
    // query(where("_id").is(seqName) : ---> find the document where id matches the seqName
    // new Update().inc("seq",1) ---> This update the seq field by one in database_sequence
    // !Objects.isNull(counter) ? counter.getSeq() : 1 ---> so if the document is null it returns 1 or else the incremented Seq Number

    // This is an in-built class so can use this {if you use atlas cloud then this should be configured @Config}
    private final MongoOperations mongoOperations;

    public SequenceGeneratorService(MongoOperations mongoOperations) {
        this.mongoOperations = mongoOperations;
    }

    public long generateSequence(String seqName) {
        DatabaseSequence counter = mongoOperations.findAndModify(query(where("_id").is(seqName)),
                new Update().inc("seq",1), options().returnNew(true).upsert(true),
                DatabaseSequence.class);
        return !Objects.isNull(counter) ? counter.getSeq() : 1;
    }
}
