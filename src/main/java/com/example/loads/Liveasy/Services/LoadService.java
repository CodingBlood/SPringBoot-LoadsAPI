package com.example.loads.Liveasy.Services;

import com.example.loads.Liveasy.entities.Loads;

import java.util.List;
import java.util.Optional;

public interface LoadService {
    void delCourse(long parseLong);
    Loads putLoads(Long loadID,Loads l);
    Optional<Loads> getLoads(Long loadID);
    List<Loads> getShippersLoads(Long shipperID);
    List<Loads> getLoads();
    String postload(Loads load);
}
