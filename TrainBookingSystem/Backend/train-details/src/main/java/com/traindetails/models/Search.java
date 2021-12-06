package com.traindetails.models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Search {
    private String search_src_station;
    private String search_des_station;
    private String search_dep_date;
}
