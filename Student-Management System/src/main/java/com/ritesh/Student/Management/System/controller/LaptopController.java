package com.ritesh.Student.Management.System.controller;

import com.ritesh.Student.Management.System.model.Laptop;
import com.ritesh.Student.Management.System.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class LaptopController {

    @Autowired
    LaptopService laptopService;

    @PostMapping("laptop")
    String addLaptop(@RequestBody Laptop laptop){
        return laptopService.addLaptop(laptop);
    }

    @DeleteMapping("laptop/{id}")
    String deleteLaptopById(@PathVariable Long id){
        return laptopService.deleteLaptopById(id);
    }

    @GetMapping("laptops")
    Iterable<Laptop> getAllLaptop(){

        return laptopService.getAllLaptop();
    }

    @GetMapping("laptop/{id}")
    Optional<Laptop> getLaptopById(@PathVariable Long id){
        return laptopService.getLaptopById(id);
    }
}
