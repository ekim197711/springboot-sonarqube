package com.codeinvestigator.sonarqubedemo.spaceship;

import org.springframework.web.bind.annotation.*;

@RestController
public class SpaceShipController {
    AdvancedStatus status = AdvancedStatus.builder()
            .crew(10l)
            .nameOfShip("not set")
            .temperature(20)
            .pressure(100).build();

    @GetMapping("/ship")
    public String statusOfSpaceShip(@RequestParam String name) {
        return "Fine we are floating in space, " + name;
    }

    @PostMapping("/ship/status")
    public String setStatus(@RequestBody AdvancedStatus status) {
        this.status = status;
        return "Status has been set";
    }

    @GetMapping("/ship/status")
    public AdvancedStatus getStatus() {
        return status;
    }

}
