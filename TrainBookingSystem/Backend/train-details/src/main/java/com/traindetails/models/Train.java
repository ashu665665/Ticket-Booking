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
@Document(collection="train-detail")
public class Train {

    @Transient
    public static final String SEQUENCE_TRAIN = "train_sequence";

    //train no and from and to
    @Id
    private int id;
    private int trainNo;
    private String src_station;
    private String des_station;

    //ticket type count
    private int class1AC_ticket_count;
    private int class2AC_ticket_count;
    private int class3AC_ticket_count;

    //ticket type price
    private int class2AC_ticket_price;
    private int class3AC_ticket_price;
    private int class1AC_ticket_price;

    //dep and arr time
    private String dep_date_time;            //Have to give string like HH:MM
    private String arr_date_time;




}
