package com.traindetails.repository;

import com.traindetails.models.Station;
import com.traindetails.models.Train;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StationRepository extends MongoRepository<Station, Integer> {

    public Station findByStationName(String name);

}
