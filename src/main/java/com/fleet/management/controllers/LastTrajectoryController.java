package com.fleet.management.controllers;

import com.fleet.management.models.LastTrajectory;
import com.fleet.management.services.LastTrajectoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/last-trajectories")
public class LastTrajectoryController {

    private final LastTrajectoryService lastTrajectoryService;
    @Autowired
    public LastTrajectoryController(LastTrajectoryService lastTrajectoryService){
        this.lastTrajectoryService = lastTrajectoryService;
    }

    @GetMapping("/for-each-taxi")
    public Page<LastTrajectory> getLastTrajectory(
            @RequestParam(defaultValue = "0") int pageNumber,
            @RequestParam(defaultValue = "10") int quantitySize) {
        return lastTrajectoryService.getLastTrajectory(pageNumber,quantitySize);
    }

}
