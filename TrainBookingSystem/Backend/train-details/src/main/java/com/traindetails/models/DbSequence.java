package com.traindetails.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="db_train_sequence")
public class DbSequence {

    @Id
    private String id;
    private int seq;
}
