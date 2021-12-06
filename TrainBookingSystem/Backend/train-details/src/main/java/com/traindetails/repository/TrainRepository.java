package com.traindetails.repository;

import com.traindetails.models.Train;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TrainRepository extends MongoRepository<Train, Integer> {

    public Train findByTrainNo(int no);



}
