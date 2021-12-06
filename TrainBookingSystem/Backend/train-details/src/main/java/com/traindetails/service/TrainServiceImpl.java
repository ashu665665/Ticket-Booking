package com.traindetails.service;

import com.traindetails.models.Train;
import com.traindetails.repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainServiceImpl implements TrainService{

    @Autowired
    private TrainRepository trainRepository;

    @Override
    public Train addtrain(Train train) throws Exception {
        Train local = this.trainRepository.findByTrainNo(train.getTrainNo());
        if(local != null){
            System.out.println("Train already present");
            throw new Exception("Train already present");
        }
        //also add condition of from to can't be same

        //adding the train
        local = this.trainRepository.save(train);
        return local;
    }

    @Override
    public Train fetchBytrainNo(int train_no) {
        return trainRepository.findByTrainNo(train_no);
    }


    @Override
    public List<Train> fetchalltrains() {
        return trainRepository.findAll();
    }
}
