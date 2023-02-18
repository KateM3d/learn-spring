package com.learnspring.learnspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class FirstController {
    enum DayName {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}

    @GetMapping("/weekday")
    public String weekday(@RequestParam(value = "day", defaultValue = "Monday") String day) {
        return switch (DayName.valueOf(day.toUpperCase())) {
            case MONDAY -> String.format("C'est %s!", "Lundi");
            case TUESDAY -> String.format("C'est %s!", "Mardi");
            case WEDNESDAY -> String.format("C'est %s!", "Mercredi");
            case THURSDAY -> String.format("C'est %s!", "Jeudi");
            case FRIDAY -> String.format("C'est %s!", "Vendredi");
            case SATURDAY -> String.format("C'est %s!", "Samedi");
            case SUNDAY -> String.format("C'est %s!", "Dimanche");
        };
    }
}
