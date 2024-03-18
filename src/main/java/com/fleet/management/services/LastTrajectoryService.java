package com.fleet.management.services;

import com.fleet.management.models.LastTrajectory;
import com.fleet.management.repositories.LastTrajectoryRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.PageImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LastTrajectoryService {
    @Autowired
    private LastTrajectoryRepository lastTrajectoryRepository;

    public Page<LastTrajectory> getLastTrajectory(int pageNumber, int quantitySize) {
        Pageable page = PageRequest.of(pageNumber, quantitySize);

        List<LastTrajectory> trajectory = lastTrajectoryRepository.findLastTrajectory(page);
        return new PageImpl<>(trajectory, page, trajectory.size());
    }
}
