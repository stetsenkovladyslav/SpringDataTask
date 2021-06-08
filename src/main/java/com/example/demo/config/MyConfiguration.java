package com.example.demo.config;

import com.example.demo.entity.Laptop;
import com.example.demo.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.util.List;

@Configuration
public class MyConfiguration {
    private final LaptopService laptopService;

    @Autowired
    public MyConfiguration(LaptopService laptopService) {
        this.laptopService = laptopService;
    }

    @Bean
    public void fillLaptopDatabase() {
        List<Laptop> laptops = List.of(
                new Laptop("Sony Vaio", "China", "Intel-core-i3", 16,
                        true, "steel", BigDecimal.valueOf(500), 2020),
                new Laptop("Acer", "China", "Intel-core-i5", 32,
                        false, "steel", BigDecimal.valueOf(600), 2019),
                new Laptop("MacBook Pro", "USA", "Apple-M1", 32,
                        false, "steel", BigDecimal.valueOf(750), 2020),
                new Laptop("Dell", "China", "Intel-core-i7", 64,
                        true, "steel", BigDecimal.valueOf(1000), 2019),
                new Laptop("Dell", "China", "Intel-core-i7", 64,
                        true, "plastic", BigDecimal.valueOf(950), 2019),
                new Laptop("Ascer Aspire 5", "USA", "Apple-M1", 8,
                        false, "steel", BigDecimal.valueOf(400), 2020),
                new Laptop("Apple MacBook Air", "China", "Intel-core-i3", 16,
                        true, "steel", BigDecimal.valueOf(500), 2020),
                new Laptop("Lenovo", "China", "AMD-Dual-core A4", 8,
                        false, "plastic", BigDecimal.valueOf(350), 2019),
                new Laptop("HP", "Taiwan", "AMD Ryzen 7", 16,
                        false, "steel", BigDecimal.valueOf(700), 2021),
                new Laptop("Acer Nitro", "Taiwan", "Intel-core-i5", 32,
                        false, "steel", BigDecimal.valueOf(800), 2020),
                new Laptop("Lenovo Idea Pad", "China", "AMD Ryzen 5", 16,
                        true, "steel", BigDecimal.valueOf(550), 2019),
                new Laptop("Asus VivoBook", "China", "Intel core-i5", 8,
                        false, "steel", BigDecimal.valueOf(400), 2020),
                new Laptop("Lenovo Idea Pad", "China", "AMD Ryzen 5", 16,
                        true, "steel", BigDecimal.valueOf(600), 2019),
                new Laptop("MacBook Pro", "USA", "Apple-M1", 32,
                        false, "steel", BigDecimal.valueOf(1300), 2020),
                new Laptop("Acer Nitro", "Taiwan", "Intel core-i5", 32,
                        false, "steel", BigDecimal.valueOf(700), 2020),
                new Laptop("Lenovo Idea Pad", "China", "AMD Ryzen 5", 16,
                        true, "steel", BigDecimal.valueOf(650), 2019),
                new Laptop("Asus VivoBook", "China", "Intel core-i5", 8,
                        false, "steel", BigDecimal.valueOf(400), 2019),
                new Laptop("Lenovo Idea Pad", "China", "AMD Ryzen 5", 16,
                        false, "steel", BigDecimal.valueOf(500), 2020),
                new Laptop("Asus VivoBook", "China", "Intel core-i5", 8,
                        false, "steel", BigDecimal.valueOf(500), 2021),
                new Laptop("MacBook Pro", "USA", "Apple-M1", 32,
                        true, "steel", BigDecimal.valueOf(1000), 2020)
        );
        laptopService.saveAllLaptops(laptops);
    }
}