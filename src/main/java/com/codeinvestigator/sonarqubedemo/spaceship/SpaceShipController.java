package com.codeinvestigator.sonarqubedemo.spaceship;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpaceShipController {

    @GetMapping("/ship")
    public String statusOfSpaceShip() {
        String mystatus = "Fine we are floating in space";
        String destination = "Mars";
        return mystatus;
    }
}
