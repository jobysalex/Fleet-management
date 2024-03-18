package com.fleet.management.controllers;

import com.fleet.management.models.Trajectory;
import com.fleet.management.services.TrajectoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/trajectories")
public class TrajectoryController {
    private final TrajectoryService trajectoryService;

    @Autowired
    public TrajectoryController(TrajectoryService trajectoryService){
        this.trajectoryService = trajectoryService;
    }

    @GetMapping("/by-taxi")
    public Page<Trajectory>getTrajectory(
            @RequestParam Integer taxiId,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate startDate,
            @RequestParam(defaultValue = "0") int pageNumber,
            @RequestParam(defaultValue = "10") int quantitySize) {
            LocalDateTime startDateTime = startDate.atStartOfDay();
            LocalDateTime endDateTime = startDateTime.plusDays(1).minusSeconds(1);

            return trajectoryService.getTrajectory(taxiId, startDateTime, pageNumber, quantitySize);
        }

}
