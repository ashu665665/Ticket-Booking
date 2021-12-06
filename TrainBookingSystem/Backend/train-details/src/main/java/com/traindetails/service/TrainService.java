package com.traindetails.service;

import com.traindetails.models.Train;

import java.util.List;

public interface TrainService {
    public Train addtrain(Train train) throws Exception;//Return type is Train for testing only, in future have to change.
    public Train fetchBytrainNo(int train_no);
    public List<Train> fetchalltrains();

}
