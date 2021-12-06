package com.traindetails.controllers;

import com.traindetails.models.Search;
import com.traindetails.models.Train;
import com.traindetails.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/search")
@CrossOrigin("*")
public class SearchController {

    @Autowired
    private TrainService trainService;

    @PostMapping("/searchtrain")
    public List<Train> search_train(@RequestBody Search search) {
       return this.trainService.fetchalltrains().stream().filter(train -> train.getSrc_station().equals(search.getSearch_src_station())).filter(train -> train.getDes_station().equals(search.getSearch_des_station())).filter(train -> train.getDep_date_time().substring(0,10).equals(search.getSearch_dep_date())).collect(Collectors.toList());

    }
    @GetMapping("/getalltrains")
    public List<Train> getalltrains(){
        return trainService.fetchalltrains();


    }


}
