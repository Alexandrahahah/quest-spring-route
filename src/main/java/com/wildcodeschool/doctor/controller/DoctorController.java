package com.wildcodeschool.doctor.controller;

import com.wildcodeschool.doctor.model.Doctor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {

    @GetMapping("/doctor/{number}")
    @ResponseBody
    public String Doctor (@PathVariable int number) {
        if (number == 13){
            return new Doctor (number, "Jodie Whittaker");
            return ResponseEntity.ok(doctor);
        } else if (number >= 1 && number <= 12) {
            throw new ResponseStatusException(HttpStatus.SEE_OTHER, "Redirects don't link to the requested resource");
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "le numéro que vous avez écrit ne correspond pas à un docteur ");
    }




}

