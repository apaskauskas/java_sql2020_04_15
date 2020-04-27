package com.kcs.student.app.controller;

import com.kcs.student.app.dto.Pet;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/myExample")
public class MyFirstController {

    @GetMapping("/sayHi")
    public String sayHi() {
        return "Hello";
    }

    @GetMapping("/sayHi/{myName}")
    public String sayHi(@PathVariable("myName") String name) {
        return "Hello " + name;
    }
    @GetMapping("/pets")
    public List<Pet> getPets(){
        return List.of(new Pet("Pukis", 25, "Cat"),
                        new Pet("Batonas", 15, "Dot"));

    }
    @PostMapping("/pets/save")
    public Pet savePet(@RequestBody Pet pet){
        pet.setName(pet.getName() + "_new");
        return pet;
    }
}
