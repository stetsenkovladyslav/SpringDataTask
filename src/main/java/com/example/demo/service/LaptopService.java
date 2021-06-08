package com.example.demo.service;

import com.example.demo.entity.Laptop;
import com.example.demo.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {
    private final LaptopRepository laptopRepository;

    @Autowired
    public LaptopService(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    public void saveAllLaptops(List<Laptop> laptops) {
        laptopRepository.saveAll(laptops);
    }

    public List<Laptop> findAllLaptops() {
        return laptopRepository.findAll();
    }

    public List<Laptop> findAllLaptopsSortedByProducer(Sort.Direction direction) {
        return laptopRepository.findAll(Sort.by(direction, "producer"));
    }

    public List<Laptop> findAllLaptopsByMemorySizeAfter(int memorySize) {
        return laptopRepository.findAllByMemorySizeIsGreaterThanEqual(memorySize);
    }

    public List<Laptop> findAllLaptopsByUsed(boolean isUsed) {
        return laptopRepository.findAllByUsedIs(isUsed);
    }
}