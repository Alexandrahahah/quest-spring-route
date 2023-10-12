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
            return "jodie Whittaker";
        } else if (number >= 1 && number <= 12) {
            return "status 303";
        }
        return "error 404. Il n'y a pas de numéro de docteur correspondant à votre recherche";
    }




}

