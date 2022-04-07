package com.example.loads.Liveasy.Services;

import com.example.loads.Liveasy.Dao.LoadDao;
import com.example.loads.Liveasy.entities.Loads;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class LoadServiceImpl implements LoadService{

    @Autowired
    private LoadDao loadDao;

    @Override
    public void delCourse(long parseLong) {
        loadDao.delete(loadDao.getOne(parseLong));
    }

    @Override
    public Loads putLoads(Long loadID,Loads l) {
        loadDao.save(l);
        return l;
    }

    @Override
    public Optional<Loads> getLoads(Long loadID) {
        return loadDao.findById(loadID);
    }

    @Override
    public List<Loads> getShippersLoads(Long shipperID) {
        List<Loads> c;
        c=new ArrayList<>();
        for(Loads a : loadDao.findAll()){
            if(a.getShipperID().equals(shipperID)){
                c.add(a);
            }
        }
        return c;
    }

    @Override
    public List<Loads> getLoads() {
        return loadDao.findAll();
    }

    @Override
    public String postload(Loads load) {
        loadDao.save(load);
        return "Success";
    }
}
