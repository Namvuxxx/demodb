package com.example.demo.controller;

import com.example.demo.entity.Car;
import com.example.demo.entity.Person;
import com.example.demo.repository.CarRepository;
import com.example.demo.repository.Personrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("")
public class PersonController {
    @Autowired
    private Personrepository personrepository;
    @Autowired
    private CarRepository carRepository;

    @GetMapping("/person")
    public ResponseEntity getAll(){
        return ResponseEntity.ok(personrepository.findAll());
    }
    @PostMapping("/person")
    public ResponseEntity create(@RequestBody Person person){
        return ResponseEntity.ok(personrepository.saveAndFlush(person));
    }
    @GetMapping("/Car")
    public ResponseEntity getAllCar(){
        return ResponseEntity.ok(carRepository.findAll());
    }
    @PostMapping("/Car")
    public ResponseEntity createCar(@RequestBody Car car){
        return ResponseEntity.ok(carRepository.saveAndFlush(car));
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity deletePerson(@PathVariable long id) {
        personrepository.deleteById(id);
        return ResponseEntity.ok(personrepository.findAll());
    }

}
