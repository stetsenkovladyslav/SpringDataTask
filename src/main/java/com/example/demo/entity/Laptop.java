package com.example.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Component
@Entity
@Data
@NoArgsConstructor
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String model;
    private String producer;
    private String processor;
    private int memorySize;
    private boolean used;
    private String frameType;
    private BigDecimal price;
    private int releaseYear;

    public Laptop(String model,
                  String producer,
                  String processor,
                  int memorySize,
                  boolean used,
                  String frameType,
                  BigDecimal price,
                  int releaseYear) {
        this.model = model;
        this.producer = producer;
        this.processor = processor;
        this.memorySize = memorySize;
        this.used = used;
        this.frameType = frameType;
        this.price = price;
        this.releaseYear = releaseYear;
    }
}
