package com.traindetails.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection="stations")
public class Station {

    @Transient
    public static final String SEQUENCE_STATION = "station_sequence";

    @Id
    private int stationId;
    private String stationName;


}
