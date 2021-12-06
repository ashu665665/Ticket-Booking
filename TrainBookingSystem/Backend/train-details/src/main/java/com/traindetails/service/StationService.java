package com.traindetails.service;

import com.traindetails.models.Station;

import java.util.Arrays;
import java.util.List;

public interface StationService {
    public Station addstation(Station station) throws Exception;
    public Station fetchBystation_Name(String station_name);
    public List<Station> fetchALLStation();
}
