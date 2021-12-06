package com.traindetails.service;

import com.traindetails.models.Station;

import com.traindetails.repository.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StationServiceImpl implements StationService {

    @Autowired
    private StationRepository stationRepository;

    @Override
    public Station addstation(Station station) throws Exception {
        Station local = this.stationRepository.findByStationName(station.getStationName());
        if(local != null){
            System.out.println("Station already present");
            throw new Exception("Station already present");
        }

        //adding the train
        local = this.stationRepository.save(station);
        return local;
    }

    @Override
    public Station fetchBystation_Name(String station_name) {
        return stationRepository.findByStationName(station_name);
    }

    @Override
    public List<Station> fetchALLStation() {
        return this.stationRepository.findAll();

    }
}
