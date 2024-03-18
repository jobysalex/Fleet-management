package com.fleet.management.services;

import com.fleet.management.models.Taxi;
import com.fleet.management.repositories.TaxiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


@Service
public class TaxiService {
    private final TaxiRepository taxiRepository;
    @Autowired
    public TaxiService(TaxiRepository taxiRepository) {
        this.taxiRepository = taxiRepository;
    }

    public Page<Taxi> getAll(int page, int size){
        Pageable pageNumber = PageRequest.of(page, size);

        return taxiRepository.findAll(pageNumber);
    }

    public Taxi saveTaxi(Taxi taxi){
        return taxiRepository.save(taxi);
    }
}
