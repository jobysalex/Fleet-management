package com.fleet.management.repositories;

import com.fleet.management.models.Trajectory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface TrajectoryRepository extends JpaRepository<Trajectory, Integer> {
    Page<Trajectory> findByTaxiIdAndDateBetweenOrderByDateDesc(Integer taxiId, LocalDateTime startDate, LocalDateTime endDate, Pageable pageable);

}
