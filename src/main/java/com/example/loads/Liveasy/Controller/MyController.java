package com.example.loads.Liveasy.Controller;


import com.example.loads.Liveasy.Services.LoadService;
import com.example.loads.Liveasy.entities.Loads;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MyController {
    @Autowired
    private LoadService loadService;
    @PostMapping("/load")
    public String postCourse(@RequestBody Loads load)
    {
        return this.loadService.postload(load);

    }

    @GetMapping("/loads")
    public List<Loads> getLoads() {
        return this.loadService.getLoads();
    }

    @GetMapping("/load")
    @ResponseBody
    public List<Loads> getShippersLoads(@RequestParam Long shipperID) {
        return this.loadService.getShippersLoads(shipperID);
    }

    @GetMapping("/load/{loadID}")
    public Optional<Loads> getLoads(@PathVariable Long loadID) {
        return this.loadService.getLoads(loadID);
    }

    @PutMapping("/load/{loadID}")
    public Loads putLoads(@PathVariable Long loadID,@RequestBody Loads l) {
        return this.loadService.putLoads(loadID,l);
    }

    @DeleteMapping("/load/{loadID}")
    public ResponseEntity<HttpStatus> deleteLoads(@PathVariable String loadID) {
        try{
            this.loadService.delCourse(Long.parseLong(loadID));
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}