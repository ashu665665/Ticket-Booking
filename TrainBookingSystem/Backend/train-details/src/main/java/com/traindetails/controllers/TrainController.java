package com.traindetails.controllers;

import com.traindetails.models.Station;
import com.traindetails.models.Train;
import com.traindetails.service.SequenceGeneratorService;
import com.traindetails.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.traindetails.models.Train.SEQUENCE_TRAIN;

@RestController
@RequestMapping("/train")
@CrossOrigin("*")
public class TrainController {

    @Autowired
    private TrainService trainService;

    @Autowired
    private SequenceGeneratorService service;

    //Adding train
    @PostMapping("/addtrain")
    public Train addtrain(@RequestBody Train train) throws Exception {
        train.setId(service.getSequenceNumber(SEQUENCE_TRAIN));
        return this.trainService.addtrain(train);
    }

    @GetMapping("/gettrain")
    public Train gettrain(@RequestParam int train_no){
        return trainService.fetchBytrainNo(train_no);
    }






}
