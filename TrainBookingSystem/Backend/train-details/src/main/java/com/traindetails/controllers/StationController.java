package com.traindetails.controllers;

import com.traindetails.models.Station;
import com.traindetails.service.SequenceGeneratorService;
import com.traindetails.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static com.traindetails.models.Station.SEQUENCE_STATION;


@RestController
@RequestMapping("/train/station")
@CrossOrigin("*")
public class StationController {

    @Autowired
    private SequenceGeneratorService service;

    @Autowired
    private StationService stationService;

    //Adding Station
    @PostMapping("/addstation")
    public Station addstation(@RequestBody Station station) throws Exception {
        station.setStationId(service.getSequenceNumber(SEQUENCE_STATION));
        return this.stationService.addstation(station);
    }

    //fetch station by name
    @GetMapping("/getstation")
    public Station getstation(@RequestParam String name){
        return this.stationService.fetchBystation_Name(name);
    }

    @GetMapping("/getallstation")
    public List<Station> getallstation(){
        return this.stationService.fetchALLStation();
    }

    @GetMapping("/allstation")
    public ArrayList<String> allstation(){
        List list = this.stationService.fetchALLStation();
        ArrayList<String> arr = new ArrayList<>();
        for (Object s: list) {
            int a = s.toString().indexOf("e=");
            int b = s.toString().indexOf(")");
            arr.add(s.toString().substring(a+2,b));
        }
        return arr;
    }

}
