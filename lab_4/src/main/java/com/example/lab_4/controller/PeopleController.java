package com.example.lab_4.controller;

import com.example.lab_4.entity.PeopleEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PeopleController {

    @GetMapping("/api/v1/getPeople")
    public PeopleEntity getPeople() {
        PeopleEntity people = new PeopleEntity();
        people.setAge(20);
        people.setName("Константин");
        people.setGender("М");
        people.setPhone("88005553535");
        people.setAddress("Санкт-Петербург");
        return people;
    }

    @PostMapping("/api/v1/newPeople")
    public void newPeople(@RequestBody PeopleEntity people) {
        System.out.println(people.getName());
        System.out.println(people.getAge());
    }
}
